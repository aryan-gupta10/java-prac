package interviewQuestions.sortingAlgos;

import java.util.Arrays;

public class BubbleSortDemo
{
    public static void main(String[] args)
    {
        int[] numArray = {6,2,5,10,4,12,1};

        bubbleSort(numArray);
    }

    private static void bubbleSort(int[] numArray)
    {
        int temp;
        for (int i=0; i<numArray.length-1; i++)
        {
            boolean isSwapped = false;
            for (int j=0; j<numArray.length-1-i;j++)
            {
                if(numArray[j] > numArray[j+1])
                {
                    temp = numArray[j];
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = temp;

                    isSwapped = true;
                }
            }

            if(!isSwapped)
            {
                System.out.println("No swapping done");
                break;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(numArray));
    }

}
