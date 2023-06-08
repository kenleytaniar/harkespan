package week10;
import java.util.Scanner;
public class Contact {

	String[] nama = new String[5];
    int[] nomor = new int[5];
    int i = 0;

    public Contact(String[] nama, int[] nomor)
    {
        this.nama = nama;
        this.nomor = nomor;
    }

    String getNama(int b)
    {
        return this.nama[b];
    }

    int getNomor(int a)
    {
        return this.nomor[a];
    }
    
    public void tambahkontak() {
    	
    	Scanner tambah = new Scanner(System.in);
    	System.out.print("sapa namanya :");
    	nama[i] = tambah.next();
    	System.out.print("nomor berapa :");
    	nomor[i] = tambah.nextInt();
    	i = i+1;
    }
    public void lihatkontak() {
    	for (int z = 0;z<5;z++) {
    		System.out.print("nama ke-"+z+":"+nama[z]);
    		System.out.print("nomor ke-"+z+":"+nomor[z]);
    	}
    }
    public void carikontak() {
    	String cari;
    	Scanner c = new Scanner(System.in);
    	System.out.print("sapa namanya :");
    	cari = c.next();
    	
    	for (int z = 0;z<5;z++) {
    		if (cari == nama[z]) {
    			System.out.print("nama ke-"+z+":"+nama[z]);
        		System.out.print("nomor ke-"+z+":"+nomor[z]);
    		}
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
