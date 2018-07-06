package Assignment1;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;
// Custom Exceptions in Java
class InvalidLengthException extends Exception{
     int s;
     InvalidLengthException(int s){
         this.s = s;
     }
     public String toString(){
         return ((s) + " is less than zero. Invalid input");
     }
}
public class Problem3 {
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Find area of a square, enter the side length");
            int side = sc.nextInt();
            if(side<0){
                throw new InvalidLengthException(side);
            }
            else{
                System.out.println("Area is" + (side*side));
            }
        }
        catch (InvalidLengthException e){
            System.out.println(e);
        }
    }
}
