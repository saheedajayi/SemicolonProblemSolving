package problemSolving.levelOne;

public class QuestionOne {
    public int secondLargestInput(int... b){
        int largest = 0;
        int secondLargest = 0;
        for(int i : b){
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            }

            if (i < largest){
                if (i > secondLargest){
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }

}
