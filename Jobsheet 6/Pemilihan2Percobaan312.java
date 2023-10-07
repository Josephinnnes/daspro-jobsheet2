import java.util.Scanner;
public class Pemilihan2Percobaan312{
    public static void main (String[] args) {
        Scanner input12 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("Masukkan Kategori : ");
        kategori = 12.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan : ");
        penghasilan = 12.nextint();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
            pajak = 0.1;
            else if (penghasilan <= 3000000)
            pajak = 0.15;
            else
            pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih);
        }
    }
}
