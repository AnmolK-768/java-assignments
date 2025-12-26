package Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lab test details to be added");
        int num = Integer.parseInt(sc.nextLine());

        LabTestInfo l = new LabTestInfo();
        System.out.println("Enter lab test details(testName:cost)");
        for(int i=0;i<num;i++){
            String str = sc.nextLine();
            l.addTestDetails(str);
        }
        System.out.println("Enter the minimum cost");
        int min = sc.nextInt();

        System.out.println("Enter the maximim cost");
        int max = sc.nextInt();

        System.out.printf("Tests with cost between %d and %d INR%n",min,max);

        ArrayList<String> arr = l.getTestsWithinGivenCostRange(min,max);

        if(arr.size() == 0){
            System.out.println("No Test found within the specified cost range");
            return;
        }

        for(String i: arr){
            System.out.println(i);
        }
    }
}
