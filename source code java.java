package jurnalno1;

import java.util.sacnner;
public class jurnalno1 {
	public static void main(string[]args){
	Scanner show = new Scanner(System.in);
	System.out.print("Masukkan Jumlah Deret Fibonacci :");
	int n = show.nextInt();
	long fib[] = new long[n];
	
	fib[0] = 0;
	fib[1] = 1;
	
	for(int i = 2; i< n; i++){
		fib[i] = fib[i-1] + fib[i-2];
		}
		
		for (int i = 0; i< n; i++) {
			System.out.print(fib[i] = "");
		}
	}
	public static void mengambilSpesialKarakter(String kalimat){
	String kalimatBaru = kalimat.replaceAll("[a-zA-Z0-9]*", "");
	System.out.println("Spesial Karakter :" +kalimatBaru);
	String [] splitKalimat = kalimatBAru.split("");
	System.out.println("Jumlah special karakter :" +splitKalimat.length);
	}
}
