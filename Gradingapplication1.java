/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradingapplication1;

/**
 *
 * @author morua
 */
import java.util.Scanner;

public class Gradingapplication1 {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter subject name");
        
        String subject=input.nextLine();
        
        System.out.println("enter marks opptained");
        
        double marks=input.nextDouble();
        
        System.out.println("enter total marks for the test");
        
        double totalmarks=input.nextDouble();
        
        double percentage=marks/totalmarks*100;
        
        if(percentage>=80&&percentage<=100){
            System.out.print("level 7 qaoutstanding achievement"+subject);
            
        }else if(percentage>=70&&percentage<=79){
            System.out.println("level 6 meritorious achievement "+subject);
            
        }else if(percentage>=60&&percentage<69){
            System.out.println("level 5 substantial achievement "+subject);
            
        }else if(percentage>=50&&percentage<=59){
            System.out.println("level 4 moderate achievement "+subject);
            
        }else if(percentage>=40&&percentage<=49){
            System.out.println("level 3 Adequate achievement "+subject);
            
        }else if(percentage>=30&&percentage<=39){
            System.out.print("level 2 Elementary achievement "+subject);
        }
                else{
            System.out.println("level 1 fail "+subject);
            
        }
        

        
        
        
        
    }
}
