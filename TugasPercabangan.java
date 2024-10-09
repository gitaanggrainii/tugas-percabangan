import java.util.Scanner;

public class TugasPercabangan{
    public static void main(String[] args){
        int lamaKerja, jumlahJamKerja;
        double totalGaji;
        

        Scanner scanner = new Scanner(System.in);
        lamaKerja       = scanner.nextInt();
        jumlahJamKerja  = scanner.nextInt();

        /* 
public class TugasPercabangan{
    public static void main(String[] args) {
        int GAJI_POKOK = 5000000;
        int UANG_LEMBUR_PER_JAM = 50000;
        int masaKerja, jamKerja, jamLembur;
        double tambahan, totalGaji;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan masa kerja (dalam tahun): ");
        masaKerja = scanner.nextInt();
        System.out.print("Masukkan jumlah jam kerja dalam 1 bulan: ");
        jamKerja = scanner.nextInt();

        if (jamKerja > 160) { // 160 jam = 8 jam/hari * 20 hari
            jamLembur = jamKerja - 160;
        } else {
            jamLembur = 0;
        }

        if (masaKerja < 5) {
            tambahan = 0;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            tambahan = GAJI_POKOK * 0.05; // Tambahan 5%
        } else {
            tambahan = GAJI_POKOK * 0.10; // Tambahan 10%
        }

        totalGaji = GAJI_POKOK + tambahan + (jamLembur * UANG_LEMBUR_PER_JAM);

        System.out.println("Total gaji yang diterima adalah: Rp " + totalGaji);

        scanner.close();


    }
}

   Pseudocode
    //Program Menghitung Gaji
    
    //Deklarasi
        //var 
        //    gajipokok = 50000000,uanglembur =50000, masakerja, jamkerja, jamlembur, : integer;
        //    tambahan, totalgaji, : double;

    //Algoritma
        //    input (masakerja);
        //    input (jamkerja);

        //    if masakerja < 5 then
        //       output (bonus = 0);
        //    else if masa kerja >=5 and masakerja <=10 then
        //       output (bonus = gajipokok * 0.05);
        //    else if masakerja > 10 then
        //       output (bonus = gajipokok * 10);
        //    end if

        //    if jumlahjamkerja > 160 then
        //       output (jumlahjamlembur = jumlahjamkerja - 160) ;
        //    else
        //       jumlahjamlembur = 0;
        //    end if
        
        //    output (totalgaji = gajipokok + bonus + (jumlahjamlembur * uanglembur));

    //End
        */
        
        System.out.println(totalGaji);
    }
}
