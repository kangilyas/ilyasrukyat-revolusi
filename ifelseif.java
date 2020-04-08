package ison;

public class ifelseif {
 public static void main(String[] args) {
  int bulan = 4; // April
  String musim;
  
  if(bulan == 12 || bulan == 1 || bulan == 2)
    musim = "Musim Dingin";
  else if(bulan == 3 || bulan == 4 || bulan == 5)
    musim = "Musim Semi";
  else if(bulan == 6 || bulan == 7 || bulan == 8) 
    musim = "Musim Panas";
   else if(bulan == 9 || bulan == 10 || bulan == 11)
    musim = "Musim Gugur";
   else
    musim = "Musim tidak valid";
    
    System.out.println("April adalah " + musim + ".");
   }
 }