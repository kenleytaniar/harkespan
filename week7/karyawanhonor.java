package week7;

public class karyawanhonor extends karyawan{
	
	int upah = 100000;
	int honor_tot;
	
	public void honortotal(int newmasuk , int newtunjangan ) {
		honor_tot = upah * newmasuk + newtunjangan;
	    System.out.println("gaji karyawan honor : "+honor_tot);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
