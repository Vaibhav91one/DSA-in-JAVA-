package Queue;

public class FirstCircularTour {
    public static void main(String[] args){
        int N = 4;
        int[] Petrol = {4 ,6 ,7 ,4};
        int[] Distance = {6 ,5 ,3 ,5};
        System.out.println(tour(Petrol, Distance));
    }

    static int tour(int petrol[], int distance[])
    {
        int n = petrol.length;
        int curr_petrol = 0;
        int sum = 0;
        int start = 0;

        for(int i = 0; i < n; i++){
            sum += petrol[i] - distance[i];
            curr_petrol += petrol[i] - distance[i];

            if(curr_petrol < 0){
                start = i+1;
                curr_petrol = 0;
            }
        }
        return sum >= 0 ? (start) : -1;
    }

    static int tourleet(int gas[], int cost[])
    {
        int n = gas.length;
        int curr_petrol = 0;
        int sum = 0;
        int start = 0;

        for(int i = 0; i < n; i++){
            sum += gas[i] - cost[i];
            curr_petrol += gas[i] - cost[i];

            if(curr_petrol < 0){
                start = i+1;
                curr_petrol = 0;
            }
        }

        return sum >= 0 ? (start) : -1;
    }
}
