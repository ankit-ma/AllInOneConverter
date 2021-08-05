package Application;

import javafx.css.CssParser;

import java.util.Arrays;

public class NumberConvert {
    public static String decToBin(String s){
        int num,counter =0;
     try{
          num = Integer.parseInt(s);
     }
     catch (NumberFormatException nfe){
         String err = "use correct input";
         return err;
     }
        int binaryVal[] = new int[32];
        // convert logic
        while (num > 0) {
            binaryVal[counter++] = (num % 2);
            num = num / 2;
        }


        String str = Arrays.toString(binaryVal).replaceAll("\\s+","");
        String sp=str.replaceAll(",+","");
        String fi=sp.substring(1,counter+1);
        StringBuilder fina = new StringBuilder(fi);
        return fina.reverse().toString();
    }
    public static String decToOctal(String s){
        int num,counter =0;
        try{
            num = Integer.parseInt(s);
        }
        catch (NumberFormatException nfe){
            String err = "use correct input";
            return err;
        }
        int binaryVal[] = new int[32];
        // convert logic
        while (num > 0) {
            binaryVal[counter++] = (num % 8);
            num = num / 8;
        }


        String str = Arrays.toString(binaryVal).replaceAll("\\s+","");
        String sp=str.replaceAll(",+","");
        String fi=sp.substring(1,counter+1);
        StringBuilder fina = new StringBuilder(fi);
        return fina.reverse().toString();

    }

}
