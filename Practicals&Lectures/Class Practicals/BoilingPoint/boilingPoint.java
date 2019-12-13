import java.util.Scanner;
/**
 * Write a description of class boilingPoint here.
 * 
 * @author David Fulton
 * @version (11/10/2015)
 */
public class boilingPoint
{
    public static void main (String[] args)
    {
        double temp;
        double alt = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println ("What's the current altitude?");
        alt = scan.nextFloat();
        System.out.println("Altitude is " + alt + "metres");
 
        System.out.println ("What's the current temperature?");
        temp = scan.nextInt();
        System.out.println("Temperature is " + temp + "degrees celsius");

        temp = temp-alt*0.0333;//computes temperature drop of 1 celsius for every 300metres
        if (temp >= 1 && temp < 100) 
            System.out.println ("water is liquid");
        
        // end if
         if (temp >=100){

            System.out.println ("water is gas");

        }    //end if
         if (temp <=0){
            System.out.println ("water is solid/ice");

            System.out.println ("end");

            //end if
        }
    }          
} 

       
