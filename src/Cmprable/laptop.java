package Cmprable;

public class laptop implements Comparable<laptop> {
	
	private String name;
	private int price;
	private int ram;

	public laptop(String name, int price, int ram) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "laptop [name=" + name + ", price=" + price + ", ram=" + ram + "]";
	}

	@Override
	public int compareTo(laptop o2) {
		
//		if(this.getRam()>o2.getRam()) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
		
		return this.name.compareTo(o2.name);
		
	}


}
