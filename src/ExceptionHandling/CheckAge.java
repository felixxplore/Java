package ExceptionHandling;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a age:");
        int age=sc.nextInt();
        try{
        if(age<18){
            throw new InvalidAgeException();
        }
            System.out.println("your age is valid.");
        }catch(InvalidAgeException e){
            e.printStackTrace();
        }

        System.out.println("Successfully");

    }
}
