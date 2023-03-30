package week_4;

import java.util.Scanner;

public class konversi {

	int s,m,j,h,d ;
	
	void detik() {
		System.out.println("masukan detik: ");
		Scanner sec = new Scanner(System.in);
		s = sec.nextInt();
		d = s;
		ulang();
	}
	void konver() {
		if ( s>86400 ) {
			h = h+1;
			s = s-86400;
		}
		else if (s>3600) {
			j = j +1;
			s = s-3600;
		}
		else if (s>60 ) {
			m = m + 1;
			s = s -60;
		}

		
	}
	
	void cetak() {
		System.out.println(" detik awal: "+ d);
		System.out.println(" hari: "+ h);
		System.out.println(" jam: "+ j);
		System.out.println(" menit: "+ m);
		System.out.println(" detik: "+ s);
	}
	void ulang () {
		do{
			konver();
		}while(s <60);
		cetak();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
