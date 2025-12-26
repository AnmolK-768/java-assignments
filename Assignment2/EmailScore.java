package Assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmailScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of emails");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the spam scores");
        String str = sc.nextLine();

        String[] strArr = str.split(" ");

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<strArr.length;i++){
            int a = Integer.parseInt(strArr[i]);
            if(a<0){
                System.out.println("Negative scores are not allowed");
                return;
            }
            else if(a<=5) a=0;
            else if(a>=50) a+=10;
            else a-=5;

            if(map.containsKey(a)){
                map.computeIfPresent(a, (key, value)-> value+1);
            }
            else{
                map.put(a,1);
            }
        }

        int sum = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                sum+=entry.getKey();
            } 
        }
        if(sum==0) System.out.println("No unique scores found after modification");
        else System.out.println(sum);
    }
}
 