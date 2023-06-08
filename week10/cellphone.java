package week10;
import java.lang.Math;
import java.util.Scanner;
public class cellphone implements Phone {

	String merk;
    String type;
    String[] nama = new String[5];
    int batteryLevel;
    int status;
    int volume;
    int pulsa;
    

    public cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);  
    }

    public void powerOn(){
        this.status = 1;
        System.out.println("Ponsel menyala");
    }
    
    public void powerOff(){
        this.status = 0;
        System.out.println("Ponsel mati");
    }

    public void volumeUp(){
        if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
        }
        else
        {
            this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    }

    public void volumeDown(){
        this.volume--;
    }

    public int getVolume(){
        return this.volume;
    }
    public int isipulsa() {
    	Scanner isi = new Scanner(System.in);
    	System.out.print("isi berapa:");
    	pulsa =isi.nextInt();
    	
    	return this.pulsa;
    }
    public void liatpulsa() {
    	System.out.println("pulsa anda saat ini:"+ pulsa);
    	
    }
    public tambahkontak() {
    	Contact()
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
