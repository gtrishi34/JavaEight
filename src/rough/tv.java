package rough;

public class tv  {
	
	private String name;
	private int price;
	private int size;
	private int year;
	
	
	public tv(String name, int price, int size, int year) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
		this.year = year;
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


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "tv [name=" + name + ", price=" + price + ", size=" + size + ", year=" + year + "]";
	}


	
	}
	


