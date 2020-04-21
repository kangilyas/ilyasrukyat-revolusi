package contact;

import javax.swing.JOptionPane;

class Data {

    private String Nama;
    private String Alamat;
    private String noTelp;

    public void setAlamat(String Nama, String Alamat, String noTelp) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.noTelp = noTelp;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }
}

public class Contact {

    static String a, b, c;

    public static void main(String[] args) {
        int in, idx = 4, t = 0;
        String input, keluar, temp;
        Data Kontak[] = new Data[4];
        for (int i = 0; i < Kontak.length; i++) {
            Kontak[i] = new Data();
        }

        do {
            JOptionPane.showMessageDialog(null, "1. Tambah Data\n2. Edit Data\n3. Hapus Data\n4. Cari Data\n5. Tampilkan Data\n6. Urutkan Data");
            input = JOptionPane.showInputDialog("Masukkan Pilihan");
            if ("1".equals(input)) {
                //idx++;
                int z = 0;
                System.out.println("" + idx);
                //Kontak[idx] = new Data();
                for (int j = 0; j < Kontak.length; j++) {
                    if (Kontak[j].getNama() == null) {
                        t = j;
                        z = 1;
                        break;
                    } else {
                    }
                }
                if (z == 1) {
                    Contact.inputan();
                    Kontak[t].setAlamat(a, b, c);
                    System.out.println("Penambahan Data------------");
                    System.out.println(Kontak[t].getNama() + " " + Kontak[t].getAlamat() + " " + Kontak[t].getNoTelp());
                    System.out.println("---------------------------");
                    t++;
                } else {
                    System.out.println("Maaf Loker Sudah Penuh");
                }
            }
            if ("2".equals(input)) {
                in = Integer.valueOf(JOptionPane.showInputDialog("Masukkan No.Kontak"));
                Contact.inputan();
                Kontak[in].setAlamat(a, b, c);
                System.out.println("Data Setelah di Edit-------");
                for (int i = 0; i < Kontak.length; i++) {
                    System.out.println(Kontak[i].getNama() + " " + Kontak[i].getAlamat() + " " + Kontak[i].getNoTelp());
                }
                System.out.println("---------------------------");
            }
            if ("3".equals(input)) {
                in = Integer.valueOf(JOptionPane.showInputDialog("Masukkan No.Kontak"));
                Kontak[in].setAlamat(null, null, null);
                System.out.println("Data telah di Hapus------");
//                for (int i = in + 1; i < Kontak.length; i++) {
//                    Kontak[i - 1] = Kontak[i];
//                }
//                Kontak[Kontak.length - 1].setAlamat(null, null, null);
            }
            if ("4".equals(input)) {
                int x = 0;
                String cari = JOptionPane.showInputDialog("Masukkan Nama");
                for (int j = 0; j < Kontak.length; j++) {
                    if (cari.equals(Kontak[j].getNama())) {
                        System.out.println("Data Ditemukan-------------");
                        System.out.println(Kontak[j].getNama() + " " + Kontak[j].getAlamat() + " " + Kontak[j].getNoTelp());
                        System.out.println("---------------------------");
                        x = 1;
                        break;
                    }
                }
                if (x == 0) {
                    System.out.println("Data Tidak ditemukan-------");
                    System.out.println("|XXXXXXXXXXXXXXXXXXXXXXXXXX|");
                    System.out.println("---------------------------");
                }
            }
            if ("5".equals(input)) {
                for (int i = 0; i < Kontak.length; i++) {
                    if (Kontak[i] != null) {
                        System.out.println(i + 1 + " " + Kontak[i].getNama() + " " + Kontak[i].getAlamat() + " " + Kontak[i].getNoTelp());
                    } else {
                        break;
                    }
                }
            }
            if ("6".equals(input)) {
                for (int i = 0; i < Kontak.length; i++) {
                    for (int j = 0; j < Kontak.length - 1; j++) {
                        if ((Kontak[j].getNama()).compareTo(Kontak[j + 1].getNama()) > 0) {
                            temp = Kontak[j].getNama();
                            Kontak[j].setNama(Kontak[j + 1].getNama());
                            Kontak[j + 1].setNama(temp);
                        }
                    }
                }
                System.out.println("-----Data Setelah Di Urutkan-----");
                for (int i = 0; i < Kontak.length; i++) {
                    System.out.println(i + 1 + " " + Kontak[i].getNama() + " " + Kontak[i].getAlamat() + " " + Kontak[i].getNoTelp());
                }
            }
            keluar = JOptionPane.showInputDialog("tekan x untuk keluar");
        } while (!"x".equals(keluar));
    }

    public static void inputan() {
        a = JOptionPane.showInputDialog("Masukkan Nama");
        b = JOptionPane.showInputDialog("Masukkan Alamat");
        c = JOptionPane.showInputDialog("Masukkan No.Telp");
    }

}


 
