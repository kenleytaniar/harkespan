package week_4;
import java.util.Scanner;

public class Nilai {
	
	String cek;
	int nilaiAkhir;
	int angka;
	char nHuruf;
	String predikat;
	char getNilHuruf(float nilai) {
		if(nilai >=85) {
			nHuruf = 'A';
		}
		else if (nilai >=70 && nilai <85) {
			nHuruf = 'B';
		}
		else if (nilai >=60 && nilai <70) {
			nHuruf = 'C';
		}
		else if (nilai >=40 && nilai <60) {
			nHuruf = 'D';
		}
		else {
			nHuruf = 'E';
		}
		return nHuruf;
	}
	String getPredikat(char huruf) {
		switch(huruf) {
			case 'A':predikat = "Apik";
					 break;
			case 'B':predikat = "Baik";
			 break;
			case 'C':predikat = "Cukup";
			 break;
			case 'D':predikat = "Dablek";
			 break;
			default:predikat = "Elek";
		}
		return predikat;
	}
	void cetakNilai() {
		System.out.println("Nilai Huruf : "+getNilHuruf(nilaiAkhir));
		System.out.println("Predikat    : "+getPredikat(nHuruf));
	}
	void MasukNilai() {

			System.out.println("Masukan nilainya: ");
			Scanner masuk = new Scanner(System.in);
			nilaiAkhir = masuk.nextInt();
			cetakNilai();
			System.out.println("apakah ingin lanjut[Y/T: ");
			Scanner pilih = new Scanner(System.in);
			cek = pilih.next();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
	}

}
