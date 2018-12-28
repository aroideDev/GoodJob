package exam.test07;

import java.util.Date;

public class Tire {

	String maker;
	String spec;
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

	public String getSpec() {
		return spec;
	}
	
	public void setSpec(String spec) {
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

		return "[Tire:" + maker + "," + spec + ((createdDate !=null) ? ("," + createdDate.toString()):"") + "]";
	}
}
