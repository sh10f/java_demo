import java.util.Random;
import java.util.Scanner;

public class bit_divide {
    public static void main(String[] args) {


        Random r = new Random();
        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int x;

        do{
            x = sc.nextInt();
            if(x > num)
                System.out.println("猜大了");
            else if(x < num)
                System.out.println("猜小了");
            else
                System.out.println("good");
        }while (x != num + 3);
    }

}

