import java.util.Scanner;

public class Percobaan6_24{
    static int hitungLuas(int pjg,int lb){
        int Luas=pjg*lb;
        return Luas;
    }
    static int hitungVolume(int tinggi, int a, int b){
        int Volume=hitungLuas(a, b)*tinggi;
        return Volume;
    }
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.print("Masukkan panjang: ");
        p=input.nextInt();
        System.out.print("Masukkan lebar: ");
        l=input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t=input.nextInt();

        L=hitungLuas(p, l);
        vol=hitungVolume(t, p, l);
        System.out.println("Luas persegi panjang adalah: "+L);
        System.out.println("Volume balok adalah: "+vol);
        input.close();
    }
}