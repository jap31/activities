package try3.hello.src.chapter10_exercise16;

import java.util.ArrayList;
import java.util.*;
public class Inventory {

    
    public static void main(String args[]){

        boolean loop=false;
        Scanner scan = new Scanner(System.in);
        int num_choice, prod_item, stocknum=1000;
        Choices cho = new Choices();
        ArrayList<Product> prods =new ArrayList<Product>();

        
        while(!loop){
            cho.newline();
            cho.user_choices();     
            num_choice=cho.userinputvalidation("Enter your choice: ");
            cho.newline();
            switch(num_choice){
                case 1:

                    String prod_name=cho.inputs("Please enter the name of the product: ");
                    prod_item=cho.userinputvalidation("Please input the number of stock:");
                    if(prod_item>0) {
                        prods.add(new Product(prod_name, stocknum, prod_item)); 
                        stocknum++;
                        System.out.println("Added!!!!");
                    }else System.out.println("You enter an invalid number!!!!");
                    cho.scan2();
                    break;

                case 2:
                System.out.println(" ================================= "); 
                System.out.format("%s %10s %23s","|","Name","|\n"); 
                System.out.println("|=================================|");   
                for(int x=0; x<prods.size(); x++){
                    System.out.format("%1s %s %s %s %-10s %17s","|","[",(x+1),"]",prods.get(x).getName(),"|\n");  
                }
                System.out.println(" ================================= "); 
                    prod_item=cho.userinputvalidation("Please choose the number of the product:");
                    prods.get(prod_item-1).setdiscontinuing();
                    cho.scan2();
                    break;

                case 3:
                System.out.println("|===========================================================|");
                System.out.format("%s %15s %20s %20s %s","|","Name","Stock","Quantity","|\n");  
                System.out.println("|===========================================================|");
                    for(int x=0; x<prods.size(); x++){
                        System.out.format("%s %15s %20s %20s %s","|",prods.get(x).getName(),prods.get(x).getStock(),prods.get(x).getquantity(),"|\n");
                    }
                System.out.println("|===========================================================|");
                cho.scan2();
                    break;
                
                case 4:
                    System.out.println("Thank you!!!!");
                    loop=true;
                        break;    
                default:
                System.out.println("Invalid input!!!!");
            }
            
        }


        scan.close();
    }
    




}
