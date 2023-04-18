package transportasi;



public class sepedaaksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sepeda sepedaBalap = new sepeda(4,"balap","united");
		int gearSepeda = sepedaBalap.gear;
		System.out.println(gearSepeda);
		sepedaBalap.ngerem();
		new sepeda(4,"bayi","unico");

	}

}
