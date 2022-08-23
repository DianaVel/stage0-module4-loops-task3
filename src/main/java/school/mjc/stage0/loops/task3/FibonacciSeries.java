package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int temp ;
        int prev = 0;
        int curr = 1;

        if(lastFibonacci != 0){
            System.out.println(prev);
            for (int i=1; i<lastFibonacci; i++){
                System.out.println(curr);
                temp = curr;
                curr = prev+curr;
                prev = temp;
            }
        }
    }
}