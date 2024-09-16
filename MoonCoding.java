
import java.util.*;
public class MoonCoding{
    public static void main(String[]args){
        int moonD = 380000;
        int rocketS = 10;
        int timeM = (((moonD)/(rocketS))/60)/60;
        System.out.println(timeM);

        int Hspeed = 2000;
        int Vspeed = 3000;
        double pyth = (Hspeed*(Hspeed))+ (Vspeed*(Vspeed));
        pyth = Math.sqrt(pyth);
        System.out.println("The speed change needed is "+pyth);

        double sVol = (4*3.14*(1731000*1731000))*0.001;
        double regolith = (sVol*3000)/1000;
        double water = regolith/4;
        System.out.println("The surface volume is "+ sVol);
        System.out.println("There is "+regolith+" metric tons of regolith in the surface volume.");
        System.out.println(water);



    }



}