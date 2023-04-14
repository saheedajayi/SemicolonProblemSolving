package problemSolvingJava.levelOne;
//Given the string “Mississippi”, find the number of occurrences of character ’s’ and character ‘i’.

public class QuestionFive {
    public static int divisibleByThree() {
        int sumOfDivisibles = 0;
        for(int i = 1; i <= 30; i++){
            if(i%3==0){
                sumOfDivisibles += i;
            }
        }
        return sumOfDivisibles;
    }

    public static void main(String[] args) {
        System.out.println(divisibleByThree());
    }
}

