package JavaProjects.TP1.Exercice1;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        int[] array = {4,1,2,1,2};

        //This problem can be solved using xor.
        for(int i=0; i<array.length; i++){
            result ^= array[i];
        }
        System.out.println(result);

    }
}
