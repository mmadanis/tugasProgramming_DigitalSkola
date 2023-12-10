import java.util.Scanner;

class Segitiga {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    System.out.print("Input tinggi segitiga: ");

    int tinggi = scanner.nextInt();
    int tinggi_2 = tinggi;

    for (int i = 1; i <= tinggi * 2; i++) {
        if (i <= tinggi){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        } else {
            for (int j = tinggi_2; j >= 1; j--) {
                System.out.print("* ");
            }
            tinggi_2 -= 1;
        }
        System.out.println();
    }
    scanner.close();
  }
}