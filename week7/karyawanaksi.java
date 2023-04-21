package week7;

import java.util.Scanner;

public class karyawanaksi {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		karyawan kar = new karyawan();
		karyawantetap tetap = new karyawantetap();
		karyawanhonor honor = new karyawanhonor();
		
		String nama;
		String id;
		int pokok;
		int tunjangan1;
		int hnr;
		int tunjangan2;
		
		System.out.print("masukan nama:");
		Scanner masuk = new Scanner(System.in);
		nama = masuk.next();
		System.out.print("masukan id:");
		Scanner masuk1 = new Scanner(System.in);
		id = masuk1.next();
		System.out.print("masukan gaji pokok:");
		Scanner masuk2 = new Scanner(System.in);
		pokok = masuk2.nextInt();
		System.out.print("masukan tunjangan untuk karyawan tetap:");
		Scanner masuk3 = new Scanner(System.in);
		tunjangan1 = masuk3.nextInt();
		System.out.print("masukan gaji honor:");
		Scanner masuk4 = new Scanner(System.in);
		hnr = masuk4.nextInt();
		System.out.print("masukan tunjangan karyawan honor:");
		Scanner masuk5 = new Scanner(System.in);
		tunjangan2 = masuk5.nextInt();
		
		kar.input_nama(nama);
		kar.input_id(id);
		tetap.gajitotal(pokok, tunjangan1);
		honor.honortotal(hnr, tunjangan2);
		
	}

}
