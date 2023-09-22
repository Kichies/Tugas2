import java.util.Scanner;

class data {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        // Input Nama
        System.out.print("NAMA        : ");
        String nama = input.nextLine();
        
    	
        // Input NIM
        System.out.print("NIM         : ");
        int nim = input.nextInt();
      
    	
        // Input Nilai Tugas
        System.out.print("Nilai Tugas : ");
        int tugas = input.nextInt();

        // Input Nilai UTS
        System.out.print("Nilai UTS   : ");
        int uts = input.nextInt();

        // Input Nilai UAS
        System.out.print("Nilai UAS   : ");
        int uas = input.nextInt();

        // Input Nilai Akhir
        float akh = (tugas*30f/100f) + (uts*30f/100f) + (uas*40f/100f);
        System.out.print("Nilai Akhir : " + akh);
        
        
    }
}