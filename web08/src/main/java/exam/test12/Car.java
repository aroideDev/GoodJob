package exam.test12;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class Car {
	String model;
	Engine engine;
	Tire[] tires;
	Map<String,Object> options;
	
	public Car() {}
	
	public Car(String model, Engine engine) {
		this.model = model;
		this.engine = engine;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Tire[] getTires() {
		return tires;
	}
	
	public void setTires(Tire[] tires) {
		this.tires = tires;
	}
	
	public Map<String,Object> options() {
		return options;
	}
	
	public void setOptions(Map<String,Object> options) {
		this.options = options;
	}
	
	@Override
	public String toString() {
	
		StringBuffer carInfo = new StringBuffer();
		
		carInfo.append("[Car:" + model);
		carInfo.append("\n " + engine.toString());
		
		if (tires != null) {
			for (Tire tire : tires) {
				carInfo.append("\n " + tire.toString());
			}
		}
		
		for (String key: options.keySet()) {
			Object option = options.get(key);
			
			if (option instanceof String) {
				carInfo.append("\n " + key + ":" + (String)option);
			}
			else if (option instanceof Tire) {
				carInfo.append("\n " + key + ":" + ((Tire)option));
			}
		}
		
		carInfo.append("\n]");
		
		return carInfo.toString();
	}
}
