package ProjectEuler;

public class Problem2 {

    public int solution(int max){
        int prev, total, curr;
        total = 0;
        prev = 0;
        curr = 1;
        while(curr < max){
            if(curr%2 == 0) {
                total += curr;
            }
            curr = curr + prev;
            prev = curr - prev;
        }
        return total;
    }
}
