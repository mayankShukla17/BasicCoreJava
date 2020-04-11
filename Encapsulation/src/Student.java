//Java Bean class
public class Student {
//	Instance var/field/property
	private int id;
	private String name;
	private double perc;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setPerc(double perc) {
		this.perc = perc;
	}
	
	public double getPerc() {
		return this.perc;
	}

}
