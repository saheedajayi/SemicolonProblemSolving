package problemSolvingJava.levelTwo;
/*

 */

public class QuestionFour {
    public static int findFirstUnique(int[] arr){
        int length = arr.length - 1;
        int firstUnique = 0;

        for (int i = 0; i < length ; i++) {
            for(int j = 0; j<length; j++){
                if(arr[i] != arr[j]){
                    firstUnique = arr[i];
                }
            }
        }
        return firstUnique;

    }

    public static void main(String[] args) {
        System.out.println(findFirstUnique(new int[]{9,2,3,2,6,6}));
        System.out.println(findFirstUnique(new int[]{4,5,1,2,0,4}));
    }
}
