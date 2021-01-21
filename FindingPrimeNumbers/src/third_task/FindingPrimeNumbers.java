package third_task;

public class FindingPrimeNumbers {

    public static void main(String[] args){
        for(int i = 2; i <= 100; i++){
            boolean wasPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    wasPrime = false;
                    break;
                }
            }
            if(wasPrime) {
                System.out.println(i);
            }
        }

    }
}
