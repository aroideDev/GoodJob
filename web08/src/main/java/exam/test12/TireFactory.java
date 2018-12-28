package exam.test12;

import java.text.SimpleDateFormat;
import java.util.Properties;

public class TireFactory {
	public Tire createTire(String maker) {
		
		if (maker.equals("Hankook")) {
			return createHankookTire();
		}
		else {
			return createKumhoTire();
		}
	}
	
	private Tire createHankookTire() {
		Tire tire = new Tire();
		tire.setMaker("Hankook");
		
		Properties spec = new Properties();
		
		spec.setProperty("width","205");
		spec.setProperty("ratio","65");
		spec.setProperty("rim.diameter","14");
		
		tire.setSpec(spec);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			tire.setCreatedDate(dateFormat.parse("2014-5-5"));
		} catch (Exception e){
			
		}
		
		return tire;
	}
	
	private Tire createKumhoTire() {
		Tire tire = new Tire();
		tire.setMaker("Kumho");
		
		Properties spec = new Properties();
		
		spec.setProperty("width","185");
		spec.setProperty("ratio","75");
		spec.setProperty("rim.diameter","16");
		
		tire.setSpec(spec);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			tire.setCreatedDate(dateFormat.parse("2014-3-1"));
		} catch (Exception e){
			
		}
		
		return tire;
	}
}
