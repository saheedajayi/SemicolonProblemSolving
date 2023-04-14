package problemSolvingJava.levelOne;

public class QuestionOne {
    public static int secondLargestInput(int... b){
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

    public static void main(String[] args) {
        System.out.println(secondLargestInput(1, 2, 3, 4, 5, 6));
    }


}
