package GFGPOTD;

public class EmptyString {
    public static void main(String[] args){
        String s = "gegeekek";
        System.out.println(makeStringEmptyThird(s));
    }

    static int makeStringEmpty(String s) {
        String g = "geek";
        if(!s.contains(g)){
            return -1;
        }

        int count = 0;
        while(s.length() != 0){
            if(s.contains(g)){
                s = s.replaceFirst("geek", "");
                count++;
            }
            else{
                return -1;
            }
        }
        return count;
    }

    static int makeStringEmptySecond(String s) {
        int count = 0;
        int index = s.indexOf("geek");

        if(index == -1){
            return -1;
        }

        while (index != -1) {
            s = s.substring(0, index) + s.substring(index + "geek".length());
            count++;
            index = s.indexOf("geek");
        }

        if(s.length() != 0){
            return -1;
        }

        return count;
    }

    static int makeStringEmptyThird(String s) {
        StringBuilder str = new StringBuilder(s);
        int count = 0;
        int index = str.indexOf("geek");


        if(index == -1){
            return -1;
        }

        while (index != -1) {
            str.delete(index, index + "geek".length());
            System.out.println(str);
            count++;
            index = str.indexOf("geek");
        }

        if(str.length() != 0){
            return -1;
        }

        return count;
    }
}
