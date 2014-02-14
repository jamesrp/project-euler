package ProjectEuler;

public class Runner {

    private static int problem = 1;

    public static void main(String[] args) {
        switch(problem) {
            case 1:
                Problem1 problem1 = new Problem1();
                System.out.println(Integer.toString(problem1.solution(3,5,1000)));
                break;
        }
    }
}
