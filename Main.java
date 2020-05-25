import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static String timeConversion(String s) {
        int n=s.length();
        String zone=s.substring(n-2);
        String res;
        String s1[]=s.split(zone);
        String temp=s1[0];
        String time[]=temp.split(":");  
              
        if(zone.equals("PM")){
        int temp2=Integer.parseInt(time[0]);
        if(temp2!=12)
        {
        temp2=temp2+12;
        time[0]=String.valueOf(temp2);
        }
            res=time[0]+":"+time[1]+":"+time[2];
        }
        else{
            if(time[0].equals("12")){
                time[0]="00";
            }
            res=time[0]+":"+time[1]+":"+time[2];
        }
        return res;
       
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
