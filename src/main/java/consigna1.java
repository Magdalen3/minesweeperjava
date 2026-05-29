import java.util.Scanner;

public class consigna1 {

    public static void sumatoria(int x){
        int j = 0;
        for (int i=0; i<=x; i++){
            j= j+i;
            System.out.println(i);

        };
        System.out.println(j);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sumatoria(x);
    }
}
