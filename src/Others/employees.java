package Others;

import java.io.Serializable;
	public class employees implements Serializable {
	private transient String name;
	private int salay;
	public employees(String name, int salay) {
		super();
		this.name = name;
		this.salay = salay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalay() {
		return salay;
	}
	public void setSalay(int salay) {
		this.salay = salay;
	}
	
}
