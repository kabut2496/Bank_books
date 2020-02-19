/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_books;
import javax.swing.*;
import java.util.Scanner;
/**
 *
 * @author Karl Butler
 */
public class Bank_books {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);

//variables
        String  total,prTotal,withdrawl_or_deposit,wTax,wTith,wDNT,taxOrTithOrDNT,wValue;
        double tax,tith,DNT,total2,prTotal2,newTotal,newDNT,newTax,newTith,wValue2,spending,newSpending;

//whether it is a withdrawl or deposit        
        withdrawl_or_deposit=JOptionPane.showInputDialog("if this is a withdrawl enter A if this is a deposit enter B");
        switch(withdrawl_or_deposit){
            case ("A"):case("a"):
            
            total=JOptionPane.showInputDialog("enter the total amount in your bank acount");
            total2= Integer.parseInt(total);
                
            wValue=JOptionPane.showInputDialog("enter how much money you are withdrawing");
            wValue2= Integer.parseInt(wValue);
                
            taxOrTithOrDNT=JOptionPane.showInputDialog("Enter A for tith Enter B for DNT Enter C for Taxes enter D for savings");
           switch (taxOrTithOrDNT){
               case("A"): case("a"):
                   newTotal=total2*0.1;
                   tith=newTotal-wValue2;
                   System.out.println("your have "+tith+"$ left for tith");
               break;
               
               case("B"):case("b"):
                   newTotal=total2*0.5;
                   DNT=newTotal-wValue2;
                   System.out.println("your have "+DNT+"$ left for savings");
               break;
               
               case("C"): case("c"):
                   newTotal=total2*0.15;
                   tax=newTotal-wValue2;
                   System.out.println("your have "+tax+"$ left for bills");
              break;
              
               case("D"): case("d"):
                   newTotal=total2*0.25;
                   spending=newTotal-wValue2;
                   System.out.println("your have "+spending+"$ left to spend");   
               break;
           }
            break;
                
            case("B"):case("b"):
                
//getting the amount deposeted
          total=JOptionPane.showInputDialog("enter the total amount you are depositing");
          total2= Integer.parseInt(total);
          
//geting curent acount ballence
          prTotal=JOptionPane.showInputDialog("enter your acount balence");
          prTotal2=Integer.parseInt(prTotal);
          
//doing some maths
          tith=total2*0.1;
          DNT=total2*0.5;
          tax=total2*0.15;
          spending=total2*0.25;
          
          newTotal=prTotal2+total2;
          newTith=newTotal*0.1;
          newDNT=newTotal*0.5;
          newTax=newTotal*0.15;
          newSpending=newTotal*0.25;
          
//out puts
          System.out.println("your tith is "+tith+"$");
          System.out.println("your Savings is "+DNT+"$");
          System.out.println("your tax is "+tax+"$");
          System.out.println("your new total is "+newTotal+"$");
          System.out.println("you have "+spending+"$ in spending money from this deposit");
          System.out.println("");
          System.out.println("your total tith is "+newTith+"$");
          System.out.println("your total Savings is "+newDNT+"$");
          System.out.println("you have "+newTax+"$ for tax's");
          System.out.println("you have "+newSpending+"$ in spending money");
        break;
        }
    
    }
 
}
