package f3.Time_Complexity;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pair_sum {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNums;
        strNums = br.readLine().split("\\s");


        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] arr = takeInput();
            int num = Integer.parseInt(br.readLine().trim());
            System.out.println(Pair_sum.pairSum(arr, num));

            t -= 1;
        }
    }
    public static int pairSum(int[] arr, int num) {
        Arrays.sort(arr);
        int startIndex =0;
        int endIndex =arr.length-1;

        int numPair=0;

        while(startIndex < endIndex){
            if(arr[startIndex]+arr[endIndex]<num){
                startIndex++;
            }
            else if (arr[startIndex]+arr[endIndex]>num){
                endIndex--;
            }
            else{
                int elementAtStart=arr[startIndex];
                int elementAtEnd=arr[endIndex];
                if(elementAtStart==elementAtEnd){
                    int totalElementsFromStartToEnd=(endIndex - startIndex)+1;
                    numPair +=(totalElementsFromStartToEnd*(totalElementsFromStartToEnd-1)/2);
                    return numPair;
                }
                int tempStartIndex=startIndex+1;
                int tempEndIndex=endIndex-1;
                while (tempStartIndex<=tempEndIndex && arr[tempStartIndex]==elementAtStart){
                    tempStartIndex+=1;
                }
                while (tempEndIndex>= tempStartIndex && arr[tempEndIndex]==elementAtEnd){
                    tempEndIndex-=1;
                }
                int totalElementsFromStart=(tempStartIndex-startIndex);
                int totalElementsFromEnd=(endIndex-tempEndIndex);
                numPair+=(totalElementsFromStart*totalElementsFromEnd);

                startIndex=tempStartIndex;
                endIndex=tempEndIndex;
            }
        }
        return numPair;
    }
}
