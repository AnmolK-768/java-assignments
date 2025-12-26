package Assignment3;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the participant details");
        String str = sc.nextLine();
        
        String[] strArr = str.split(":");
        
        ParticipantInfo cl = null;
        
        if(strArr[0].equalsIgnoreCase("attendee")){
            cl = new Attendee(strArr[1], strArr[2], strArr[3], Long.parseLong(strArr[4]), Double.parseDouble(strArr[5]));
            //((Attendee)c1).setWalletBalance(Double.parseDouble(strArr[5]));
            double ans =((Attendee)cl).calculateBuyingCost(Integer.parseInt(strArr[6]), Integer.parseInt(strArr[7]));
            if(ans == -1) System.out.println("Not enough funds to buy the ticket!");
            else{
                System.out.printf("Calculated ticket buying cost is %.1f%n",ans);
            }
        }
        else{
            cl = new Organizer(strArr[1], strArr[2], strArr[3], Long.parseLong(strArr[4]), Integer.parseInt(strArr[5]));
            double ans = ((Organizer)cl).calculateSellingRevenue(Integer.parseInt(strArr[6]), Integer.parseInt(strArr[7]));
            if(ans == -1) System.out.println("Not enough tickets to sell!");
            else{
                System.out.printf("Calculated ticket buying cost is %.1f%n",ans);
            }
        }
    }
}
