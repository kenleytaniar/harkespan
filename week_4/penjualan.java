package week_4;
import java.util.Scanner;
public class penjualan {
	
	String l;
	float total ;
	String c,n;
	float h;
	int j;
	void setData(String kode,String nama,float harga,int jumlah) {
		
		total = harga * jumlah;
		cetakNota();
	}
	void getTotalPembelian() {
		
		System.out.println("Masukan kode: ");
		Scanner code = new Scanner(System.in);
		c = code.next();
		
		System.out.println("masukan nama: ");
		Scanner name = new Scanner(System.in);
		n = name.next();
		
		System.out.println("masukan harga: ");
		Scanner price = new Scanner(System.in);
		h = price.nextFloat();
		
		System.out.println("masukan jumlah: ");
		Scanner all = new Scanner(System.in);
		j = all.nextInt();
		
		 
		setData(c,n,h,j);
		
		System.out.println("Input data lagi[Y/T] ?");
		Scanner lagi = new Scanner(System.in);
		l = lagi.next();
	}
	void getBonus() {
		if (h>= 500000 && j >5) {
			System.out.println("Bonus setrika");
		}
		else if (h>= 100000 && j >3) {
			System.out.println("Bonus payung");
		}
		else if (h>= 50000 && j >2) {
			System.out.println("Bonus ballpoint");
		}
		else {
			System.out.println("tidak ada bonus");
		}
	}
	void cetakNota() {
		
		System.out.println("kode: "+ c);
		System.out.println("nama: "+ n);
		System.out.println("harga: "+ h);
		System.out.println("jumlah: "+ j);
		System.out.println("total pembelian: "+ total);
		getBonus();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
