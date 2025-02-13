import java.util.Scanner;

public class Perulangan27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIM: ");
        String nim = input.next();
        
        String duaDigit = nim.substring(nim.length() - 2);
        int n = Integer.parseInt(duaDigit);
        
        if (n < 10) {
            n += 10;
        }
        
        System.out.println("=====================");
        System.out.println("n : " + n);
        
        int i = 1;
        while (i <= n) {
            if (i != 6 && i != 10) {
                if (i % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }
            }
            i++;
        }
        
    }
}

