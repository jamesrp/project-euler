package ProjectEuler;

public class Problem1 {

    public int solution(int n1, int n2, int max) {
        int total = 0;
        for(int i = 0;i < max; i++){
            if(i%n1 == 0 || i%n2 == 0){
                total += i;
            }
        }
        return total;
    }
}
