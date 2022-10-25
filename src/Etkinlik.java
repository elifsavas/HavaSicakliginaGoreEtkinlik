import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava Sıcaklığı Giriniz:");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz!");
        } else if (heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz!");
        } else if (heat>25) {
            System.out.println("Yüzebilirsiniz!");
        }
        if (heat >= 10 && heat < 25) {
            System.out.println("Pikniğe gidebilirsiniz!");
        }
    }
}
