// Figure out how to handle address and phone

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String name;
        String address;
        // int phone;
        String major; 

        
        System.out.print("Enter your name: ");
        name = keyboard.nextLine();

        System.out.print("Enter your address: ");
        address = keyboard.nextLine();

        System.out.print("Enter your major: ");
        major = keyboard.nextLine();

        // System.out.print("Enter your phone number: ");
        // phone = keyboard.nextInt();
        

        System.out.println("Here is what we gathered.");

        System.out.println(name);
        System.out.println(address);
        // System.out.println(phone);
        System.out.println(major);
    }
}