package exam.test16;

import java.util.Date;
import java.util.Map.Entry;
import java.util.Properties;

public class Tire {

	String maker;
	Properties spec;
	Date createdDate;
	
	public Tire() {}
	
	public Tire(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}

	public Properties getSpec() {
		return spec;
	}
	
	public void setSpec(Properties spec) {
		this.spec = spec;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date date) {
		this.createdDate = date;
	}
	
	@Override
	public String toString() {

		StringBuffer specInfo = new StringBuffer();
		
		if (spec != null) {
			for (Entry<Object,Object> entry : spec.entrySet()) {
				specInfo.append(entry.getKey() + ":" + entry.getValue() + ",");
			}
		}
		
		return "[Tire:" + maker + "," + specInfo.toString() + ((createdDate !=null) ? ("," + createdDate.toString()):"") + "]";
	}
}
