package Strings;

public class Rotated {
    public static void main(String[] args){
        String a = "abbdbf";
        String b = "bfabbdb";
        System.out.println(isRotated(a,b));
    }

    public static boolean isRotated(String str1, String str2)
    {
        //if length are different then return
        if(str1.length()!=str2.length()){
            return false;
        }
        // if the strings of length 1 and 2 then rotation will result in same string
        if(str1.length()<=1 || str2.length()==2){
            if(str1.equals(str2)){
                return true;
            }
            else{
                return false;
            }
        }
        //checking for left rotation (anticlockwise in some places)
        //Since by two places so if left rotation the first two will be shifted to the end so we take character from 2 to end and add the first two characters to the end
        String clockwise=str1.substring(2)+str1.substring(0,2);
        System.out.println(clockwise);
        //checking for Right rotation (clockwise in some places)
        //Since by two places so if right rotation the last 2 characters will be shifted to the end so we take character from last 2 character and add the first n-2 characters to the end.
        String anticlockwise=str1.substring(str1.length()-2)+str1.substring(0,str1.length()-2);
        System.out.println(anticlockwise);
        if(clockwise.equals(str2)|| anticlockwise.equals(str2)){
            return true;
        }
        return false;
    }
}
