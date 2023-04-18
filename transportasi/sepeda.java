package transportasi;

public class sepeda {

	int gear = 5;
	void ngerem() {
		System.out.println("sepeda direm");
	}
	sepeda(int jumlahRoda, String jenis,String merek){
		System.out.println("Sepeda "+jenis+" bermerk "+merek+
				 " memiliki jumlah roda "+jumlahRoda);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
