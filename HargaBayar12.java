import java.util.Scanner;
public class HargaBayar12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int harga, jumlah;
        double dis, total, bayar, jmlDis, merk, jmlHalaman;
        System.out.println("Masukkan harga barang yang dibeli: ");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah barang yang dibeli: ");
        jumlah=input.nextInt();
        input.nextLine();
        System.out.println("Masukkan merk buku yang dibeli: ");
        merk=input.nextDouble();
        System.out.println("Masukkan jumlah halaman yang dibeli: ");
        jmlHalaman=input.nextInt();
        System.out.println("Masukkan jumlah diskon: ");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah "+jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah "+bayar);
    }
}
