import java.util.Scanner;

public class StudiKasus225 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama_mahasiswa, jenis_kegiatan, lolos_pendaan;
        int jumlah_dokumen, peringkat_juara;

        System.out.print("\n==========Program Dana Penghargaan Mahasiswa==========");
        System.out.print("\nMasukkan nama mahasiswa: ");
        nama_mahasiswa = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya): ");
        jenis_kegiatan = input.nextLine();

        if (jenis_kegiatan.equalsIgnoreCase("belmawa")
                || jenis_kegiatan.equalsIgnoreCase("bakorma")
                || jenis_kegiatan.equalsIgnoreCase("mandiri")) {
            System.out.print("Masukkan jumlah dokumen (0-4): ");
            jumlah_dokumen = input.nextInt();
            System.out.print("Masukkan peringkat juara (1-3, atau 0 jika tidak juara): ");
            peringkat_juara = input.nextInt();

            if (jumlah_dokumen < 0 || jumlah_dokumen > 4 || peringkat_juara < 0 || peringkat_juara > 4) {
                System.out.println("Status: Dokumen dan peringkat juara Anda tidak valid");
            } else if (jumlah_dokumen == 4 && peringkat_juara >= 1 && peringkat_juara <= 3) {
                System.out.println("Status: Selamat " + nama_mahasiswa + "! Anda mendapatkan dana penghargaan dari institusi.");
            } else if (jumlah_dokumen < 4 && peringkat_juara >= 1 && peringkat_juara <= 3) {
                System.out.println("Status: Dokumen tidak lengkap, Anda tidak diberi dana penghargaan.");
            } else if (jumlah_dokumen == 4 && (peringkat_juara == 0 || peringkat_juara == 4)) {
                System.out.println("Status: Dana penghargaan tidak diberikan karena hanya juara harapan atau peserta.");
            } else if (jumlah_dokumen < 4 && (peringkat_juara == 0 || peringkat_juara == 4)) {
                System.out.println("Status: Dokumen tidak lengkap dan Anda hanya juara harapan atau peserta, sehingga dana penghargaan tidak diberikan.");
            } else {
                System.out.println("Status: Dokumen dan peringkat juara Anda tidak valid");
            }

        } 
    }
}




