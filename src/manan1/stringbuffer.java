package manan1;
import java.util.Random;
import java.util.Arrays;
import java.text.DecimalFormat;
public class stringbuffer {
    public static void main(String[] args) {
        // constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        // constructor 2
        StringBuffer sb2 = new StringBuffer("Manan Malik");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        sb.append("WeMakeDevs");
        sb.append("is nice!");
        // sb.insert(2,"Rahul");
        sb.replace(1,5,"Malik");
        sb.delete(1,5);
        // sb.reverse();
        String str = sb.toString();
        System.out.println(str);
        // removing white spaces
        System.out.println(str.replaceAll("\\s",""));
        Random random = new Random();
        System.out.println(random.nextFloat());
        System.out.println((char)(97+1));

        // split
        String arr = "Kunal,Apoorv,Rahul,Snehal";
        String[] nums = arr.split(",");
        System.out.println(Arrays.toString(nums));

        // rounding off
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(7.2));
    }
}
