package Assignment1;

import java.util.ArrayList;

public class LabTestInfo {
    private ArrayList<String> list;

    public LabTestInfo(){
        list = new ArrayList<>();
    }

    public void addTestDetails(String testDetails){
        String[] sp = testDetails.split(":");
        list.add(sp[0]);
        list.add(sp[1]);
    }

    public ArrayList<String> getTestsWithinGivenCostRange(int minimumCost, int maximumCost){
        int size = list.size();
        ArrayList<String> ans = new ArrayList<String>();
        for(int i=1;i<size;i+=2){
            int com = Integer.parseInt(list.get(i));
            if(com >= minimumCost && com <= maximumCost ){
                ans.add(list.get(i-1));
            }
        }
        return ans;

    }
}
