package week7;

public class karyawantetap extends karyawan{
	
	int gaji_tot;
	
	public void gajitotal(int newgaji , int newtunjangan ) {
		gaji_tot = newgaji + newtunjangan;
		System.out.print("gaji karyawan tetap:"+gaji_tot);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
