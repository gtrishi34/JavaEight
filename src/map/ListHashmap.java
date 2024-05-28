package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListHashmap {
	
	int id;
	String name;
	
	
	public ListHashmap(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ListHashmap [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		
		List<ListHashmap> fruitlist = new ArrayList<>();
		
		fruitlist.add(new ListHashmap(1,"mango"));
		fruitlist.add(new ListHashmap(2,"apple"));
		fruitlist.add(new ListHashmap(3,"pears"));
		
		Map<Integer, ListHashmap> fruitmap = fruitlist.stream().collect(Collectors.toMap(ListHashmap::getId, e->e ));
		System.out.println(fruitmap);
		
		for (ListHashmap listHashmap : fruitlist) {
			System.out.println(listHashmap);
		}
		
	}
	
}
