package search;

public class ShiftArrayLeft {

   public static int[] rotLeft(int[] inputArray, int n) {
        int temp;

        for (int i = 0; i < n; i++)
        {
            temp = inputArray[0];

            for (int j = 0; j < inputArray.length-1; j++)
            {
                inputArray[j] = inputArray[j+1];
            }

            inputArray[inputArray.length - 1] = temp;
        }
        return inputArray;
    }
}
