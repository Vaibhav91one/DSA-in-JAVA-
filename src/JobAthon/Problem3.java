package JobAthon;

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args){
        int n = 4;
        int geeksTown[] = {3, 0, 1, 9};
        int m = 11;
        int journey[] = {1, 3, 0, 1, 9, 1, 7, 3, 0, 1, 9};
        int q = 4;
        int[][] queries = {
                {0, 3},
                {1, 5},
                {1, 10},
                {7, 9}
};
        System.out.println(Arrays.toString(geeksJourney(geeksTown, n, journey, m, queries, q)));
    }

    public static int[] geeksJourney(int geeksTown[], int n, int journey[], int m, int queries[][], int q){
        // Code Here.
        int[] answers = new int[q]; // array to store the answers
        for (int i = 0; i < q; i++) { // loop through the queries
            int l = queries[i][0]; // get the value of l
            int r = queries[i][1]; // get the value of r
            answers[i] = howManyTimesHappy(geeksTown, journey, l, r); // call the method and store the result
        }
        return answers; // return the array of answers
    }

    public static int howManyTimesHappy(int[] geeksTown, int[] journey, int l, int r) {
        // assuming l and r are valid indices in the journey array
        int count = 0; // number of times Geek feels happy
        int i = l; // pointer for the journey array
        int j = 0; // pointer for the geeksTown array
        int n = geeksTown.length; // length of the geeksTown array
        while (i <= r) { // loop through the journey array from l to r
            if (journey[i] == geeksTown[j]) { // if the heights match
                j++; // increment j
                if (j == n) { // if j reaches the end of the geeksTown array
                    count++; // increment count
                    j = 0; // reset j
                }
            } else { // if the heights don't match
                j = 0; // reset j
            }
            i++; // increment i
        }
        return count; // return the answer
    }

}

//class Solution
//{
//    public:
//    vector<int> geeksJourney(vector<int>& geeksTown, int n, vector<int>& journey, int m, vector<vector<int>>& queries, int q)
//    {
//        // code here
//        vector<int> result;
//        vector<pair<int, int>> subarrayIndices;
//
//        for (int i = 0; i <= m - n; ++i) {
//            bool match = true;
//            for (int j = 0; j < n; ++j) {
//                if (geeksTown[j] != journey[i + j]) {
//                    match = false;
//                    break;
//                }
//            }
//            if (match) {
//                subarrayIndices.push_back(make_pair(i, i + n - 1));
//            }
//        }
//
//        for (int i = 0; i < q; ++i) {
//            int left = queries[i][0];
//            int right = queries[i][1];
//            int count = 0;
//
//            for (const auto& indices : subarrayIndices) {
//                if (indices.first >= left && indices.second <= right) {
//                    ++count;
//                }
//            }
//
//            result.push_back(count);
//        }
//
//        return result;
//    }
//};

