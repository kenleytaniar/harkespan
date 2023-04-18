package transportasi;



public class mobilaksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mobil mobil = new mobil();
		mobil motor = new mobil();
		mobil sepeda = new mobil();

		motor.warna = "Hitam";
		motor.merek = "Yamaha Mio";
		motor.roda = 2;
		motor.infoKendaraan();

		mobil.warna = "Merah";
		mobil.merek = "Toyota Innova";
		mobil.roda = 4;
		mobil.infoKendaraan();
		mobil.berjalan("depan");
		mobil.berhenti();

		sepeda.kecepatan = 5;
		
		System.out.println("Kecepatan awal "+ mobil.kecepatan);
		int kecepatan = mobil.kecepatanSekarang(10,"lambat");
		System.out.println("Kecepatan kendaraan adalah "+ kecepatan);
		mobil.mundur();
		System.out.println("kecepatan sekarang setelah mundur "+ mobil.kecepatan);
	}

}
