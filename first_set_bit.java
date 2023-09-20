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
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(solution(num));
        
    }
}
