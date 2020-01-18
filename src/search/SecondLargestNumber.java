package search;

import java.util.List;


public class SecondLargestNumber {

    public static Integer findSecondLargestNumber(List<Integer> list) {

        int largestNumber = 0;
        int secondLargestNumber = 0;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = num;
            } else if (num > secondLargestNumber) {
                secondLargestNumber = num;
            }

        }


        return secondLargestNumber;

    }

}
