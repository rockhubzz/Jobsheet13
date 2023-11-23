import java.util.Scanner;

public class NilaiMahasiswa24b{
    private static int jmlMhs, jmlTugas, nilai[][]= new int[jmlMhs][jmlTugas];
    private static String nama[]= {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    private static Scanner sc= new Scanner(System.in);

    public static void inputNilai(){
        for(int i=0; i<nilai.length; i++){
            for(int j=0; j<nilai[i].length; j++){
                System.out.print("Masukkan nilai "+nama[i]+" minggu ke-"+(j+1)+": ");
                nilai[i][j]= sc.nextInt();
            }
            System.out.println();
        }
    }
    public static void TampilNilai() {
        for (int i = 0; i < nilai[0].length; i++) {
            System.out.println("Minggu ke-" + (i + 1));
            for (int j = 0; j < nilai.length; j++) {
                System.out.println(nama[j] + ": " + nilai[j][i]);
            }
            System.out.println();
        }
    }
        public static void NilaiTertinggi() {
        int mhsTertinggi = 0;
        int mingguTertinggi = 0;

        for (int i = 1; i < nilai.length; i++) {
            if (hitungTotalNilai(i) > hitungTotalNilai(mhsTertinggi)) {
                mhsTertinggi = i;
                mingguTertinggi = MingguTertinggi(i);
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi: " + nama[mhsTertinggi]);
        System.out.println("Pada minggu ke: " + (mingguTertinggi + 1));
    }    
    private static int MingguTertinggi(int mahasiswa) {
        int mingguTertinggi = 0;
        int nilaiTertinggi = nilai[mahasiswa][0];

        for (int j = 1; j < nilai[mahasiswa].length; j++) {
            if (nilai[mahasiswa][j] > nilaiTertinggi) {
                nilaiTertinggi = nilai[mahasiswa][j];
                mingguTertinggi = j;
            }
        }

        return mingguTertinggi;
    }
    private static int hitungTotalNilai(int mahasiswa) {
        int total = 0;
        for (int j = 0; j < nilai[mahasiswa].length; j++) {
            total += nilai[mahasiswa][j];
        }
        return total;
    }
    public static void HariTertinggi() {
        int mingguTertinggi = 0;
        int nilaiTertinggi = nilai[0][0];
        for (int j = 1; j < nilai[0].length; j++) {
            int totalMinggu = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalMinggu += nilai[i][j];
            }
            if (totalMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalMinggu;
                mingguTertinggi = j;
            }
        }
        System.out.println("Hari dengan nilai tertinggi dari keseluruhan mahasiswa: Minggu ke-" + (mingguTertinggi + 1));
    }
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        System.out.print("Masukkan jumlah minggu: ");
        int jmlMinggu = sc.nextInt();

        nilai = new int[jmlMhs][jmlMinggu];
        nama = new String[jmlMhs];
    
        System.out.println();
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = sc.next();
        }
        System.out.println();
        inputNilai();
        System.out.println();
        TampilNilai();
        HariTertinggi();
        System.out.println();
        NilaiTertinggi();
    }
}