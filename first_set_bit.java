import java.util.*;

public class first_set_bit {

    public static int solution(int num){
        int i=0;
        while(num!=0){
            if(num%2==1){
                return i+1;
            }
            num/=2;
            i++;
        }
        return 0;
    }
    public static void main(String[] args) {
        int num = 7567560;
        System.out.println(solution(num));
        
    }
}
