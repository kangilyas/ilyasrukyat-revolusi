package ison;

import java.util.Scanner;

public class statemenifelse {
  public static final double BIAYA_ADMIN = 8000;
 public static final double SUKU_BUNGA = 0.02;
 
 public static void main(String[] args) {
    double saldo;
    System.out.println("Masukan saldo Anda: Rp. ");
    Scanner keyboard = new Scanner(System.in);
    saldo = keyboard.nextDouble();
    System.out.println("Saldo awal Rp." + saldo );
    
    if (saldo >= 0)
        saldo = saldo + (SUKU_BUNGA + saldo);
    else
       saldo = saldo = BIAYA_ADMIN;
       System.out.println("Setelah berjalan satu bulan");
       System.out.println("dengan pertimbangan bunga dan biaya admin,");
       System.out.println("saldo baru anda adalah Rp. " + saldo);
 }
}

  

