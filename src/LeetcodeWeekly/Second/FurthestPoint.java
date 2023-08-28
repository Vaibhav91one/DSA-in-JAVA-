package LeetcodeWeekly.Second;

public class FurthestPoint {
    public static void main(String[] args){
        String moves =  "_______";
        System.out.println(furthestDistanceFromOrigin(moves));
    }

    public static  int furthestDistanceFromOrigin(String moves) {
          int maxL = 0;
          int maxR = 0;

          for(int i = 0; i < moves.length(); i++){
              if(moves.charAt(i) == 'L'){
                  maxL += -1;
                  maxR += -1;
              }

              if(moves.charAt(i) == 'R'){
                  maxL += 1;
                  maxR += 1;
              }

              if(moves.charAt(i) == '_'){
                  maxL += -1;
                  maxR += 1;
              }
          }

          return Math.max(Math.abs(maxL), Math.abs(maxR));
    }
}
