import java.util.scanner;

public class Main {
  
  public static void main(String [] args){
    
    //Deklarasi variabel
    int hargaBarang,diskon,hargaDiskon,hargaAkhir;
    
    //membuat objek dari class Scanner
    Snanner input = new Scanner(System.in);
     
    //perintah untuk user
    System.out.println("Masukkan harga barang:");
    
    //mengambil nilai input user lalu disimpan ke var harga barang
    hargaBarang = input.next.Int();
    
    //tampilkan output hasil
    System.out.println("Harga Barang Rp."+ hargaBarang);
    
    //perintah untuk user
    System.out.println("Masukan diskon :");
    
    //mengambil nilai input user lalu disimpan ke var diskon
    diskon = input.nextInt();
    
    //tampil output hasil
    System.out.println("Diskon "+diskon+"%");
    
    //perhitungan mencari hargadiskon barang
    hargaDiskon = (hargaBarang * diskon/100);
    
    //tampilkan output hasil
    System.out.println("Jadi Harga Diskon =" + hargaDiskon);
    
    //perhitungan mencari harga akhir barang setelah didiskon
    hargaAkhir = HargaBarang - hargaDiskon;
    
    
    //tampilkan output hasil
    System.out.println("Jadi Harga barang setelah potongan diskon =" +hargaAkhir);
  
  }
}