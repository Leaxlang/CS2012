package vehicleActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class VehicleFactoryMain{
	public static void main(String[] args) {
		Object[] vehicles = new Object[20]; 

		int[] randoms = new int[4];
		for(int i = 0; i < 4; i++) {
			randoms[i] = (int)Math.floor(2+Math.random()*4); 
		}

		for(int i = 0; i < randoms[0]; i++) {
			vehicles[i] = new Car();
		}
		for(int i = randoms[0]; i < randoms[1]; i++) {
			vehicles[i] = new Truck();
		}
		for(int i = (randoms[0] + randoms[1]); i < randoms[2]; i++) {
			vehicles[i] = new Ballon();
		}
		for(int i = (randoms[0] + randoms[1] + randoms[2]); i < randoms[3]; i++) {
			vehicles[i] = new Glider();
		}

		int numVehicles=0;
		for(int i = 0; i<randoms.length;i++) {
			numVehicles += randoms[i];
		}
		
		MyFileManager file = new MyFileManager();
		file.clearFile( "VehicleProductionInventory.txt");
		file.appendLine("Number of vehicles produced " + numVehicles + "\n", "VehicleProductionInventory.txt");
		file.appendArray(vehicles, "VehicleProductionInventory.txt");

		TimeZone tz = TimeZone.getTimeZone("PST");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
		df.setTimeZone(tz);
		String nowAsISO = df.format(new Date());
		file.appendLine(nowAsISO, "VehicleProductionInventory.txt");

	}
}