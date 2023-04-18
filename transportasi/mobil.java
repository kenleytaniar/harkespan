package transportasi;

public class mobil {


	int roda;
	String warna;
	int kecepatan;
	String merek;
	
	public void berjalan(String arah) {
		System.out.println("bergerak ke "+ arah);
	}
	
	public void berhenti() {
		kecepatan = 0;
		System.out.println("berhenti");
	}
	
	public void infoKendaraan() {
		System.out.println("kendaraan beroda "+ roda);
		System.out.println("kendaraan berwarna "+ warna);
		System.out.println("kendaraan bermerek "+ merek);
	}
	
	public int kecepatanSekarang (int speed,String tipe) {
		int x = 0;
		if (tipe == "cepat") {
			x = kecepatan + speed;
		}
		else if (tipe == "lambat") {
			x = kecepatan - speed;
		}
		return x;
	}
	public void mundur() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
