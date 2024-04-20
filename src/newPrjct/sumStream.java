package newPrjct;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sumStream {
	
	public static void main(String[] args) {
		
	int a=8; 
	int b=2;
	
	//ADDITION
	
	Optional<Integer> sum = Stream.of(a,b).reduce((x,y)->x+y);
	System.out.println("sum of two number : "+sum.get());
	
	//ADDITION IN LIST
	
	List<Integer> list =Arrays.asList(1,2,3,4);
	Optional<Integer> sumlist = list.stream().reduce((x,y)->x+y);
	System.out.println("sum of list : "+sumlist.get());
	
	
	//SUBSTRACTION
	Optional<Integer> sub = Stream.of(a,b).reduce((x,y)->a-b);
	System.out.println("subtract of two number: " +sub.get());
	
	
	
	//MULTIPLICATION
	Optional<Integer> mul = Stream.of(a,b).reduce((x, y)->x*y);
	System.out.println("multiplication : " +mul.get());
	
	//MULTIPLICATION OF NUMBER IN LIST
	
	List<Integer> list1 = Arrays.asList(1,2,3,4);
	Optional<Integer>listmul = list.stream().reduce((x,y)->x*y);
	System.out.println("multiplication of numbers in a list : "+listmul.get()); 
	
	
	   //DIVISION
	                          double div = Stream.of(a,b).mapToDouble(Double::valueOf).reduce((x,y)->{
                              if (y == 0) {
                              throw new ArithmeticException("Division by zero");
                              }
                              return x / y;
                              })
                              .orElseThrow (() -> new IllegalArgumentException("Both numbers are required"));

                              System.out.println("division : "+div);
                      
        //AVERAGE
                      List<Integer> list3 = Arrays.asList(1,2,3,4);
                      
                     double avg =  list3.stream().mapToInt(e->e).average().getAsDouble();
                      System.out.println("average of number in list : " +avg);
                      
                      
        // SQUARE 
                      
                      List<Integer>list4 = Arrays.asList(1,2,3,4);
                      List<Integer>sq = list4.stream().map(e->e*e).collect(Collectors.toList());
                      System.out.println("squre of number in list : " +sq);
                      
        //SQUARE AND FILTER  
                      
	List<Integer>list5 = Arrays.asList(1,22,32,4);
	List<Integer>sqnum = list5.stream().map(e->e*e).filter(e->e>100).collect(Collectors.toList());
	System.out.println("square of number greater than 100 : " +sqnum);
	
	
	//SQUARE, FILTER AND AVERAGE
	
	List<Integer>list6 = Arrays.asList(1,12,14,2,3);
	 double meansq = list6.stream().map(e->e*e).filter(e->e<100).mapToInt(e->e).average().getAsDouble();
	System.out.println("Mean of square of number in the list : " +meansq);

	// FILTER THE NUMBER IN LIST
	
	List<Integer> list7 = Arrays.asList( 1,2,3,5,8,9,7);
	List<Integer> filternum = list7.stream().filter(e->e>5).collect(Collectors.toList());
	System.out.println("number greater than 5 : " +filternum);
	
	// EVEN NUMBER IN THE LIST
	
	List<Integer> list8 = Arrays.asList(1,2,3,4,5,6);
	List<Integer> evenlist = list8.stream().filter(e->e%2==0).collect(Collectors.toList());
	System.out.println("even number present in list : "+evenlist);
	
	// ODD NUMBER PRESENT THE LIST
	
	List<Integer>list9 = Arrays.asList(1,2,3,4,5,6,7);
	List<Integer> oddlist = list9.stream().filter(e->e%2!=0).collect(Collectors.toList());
	System.out.println("odd number present in the list : " +oddlist);
	
	// NUMBER STARTS WITH 2 OR ANY NUMBER
	
	List<Integer> list10 = Arrays.asList(1,2,22,3,25);
	List<Integer> flterlist = list10.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2"))
			.map(Integer::valueOf).collect(Collectors.toList());
	System.out.println("number starts with 2 : " +flterlist);
	

	// STRING STARTS WITH T
	List<String> list11 = Arrays.asList("bh","te","ht","dt","tt");
	List<String> filterlist = list11.stream().filter(e->e.startsWith("t"))
			.collect(Collectors.toList());
	System.out.println("number starts with 2 : " +filterlist);
	
	// DUPLICATE NUMBER
	
	List<Integer> list12 = Arrays.asList(1,2,2,3,5,5,6,7,8,3,6);
	Set<Integer> dup = list12.stream().filter(e->Collections.frequency(list12, e)>1).collect(Collectors.toSet());
	System.out.println("duplicate number present in list : " +dup);
	
	// DUPLICATE STRING
	
	List<String>list13 = Arrays.asList("tt","tt","dt","st","dt");
	Set<String>dupstr = list13.stream().filter(e->Collections.frequency(list13,e)==1).collect(Collectors.toSet());
	System.out.println("duplicate string present in list : " +dupstr);
	
	// LARGEST AND SMALLEST NUMBER PRESENT IN LIST
	
	List<Integer>list14 = Arrays.asList(1,9,8,4,5,6);
	int lrgstnum =  list14.stream().max(Integer::compareTo).get();
	System.out.println("largest number present in integer : " +lrgstnum);
	
	int smlstnum = list14.stream().min(Integer::compareTo).get()	;
	System.out.println("smallest number present in list : " +smlstnum);
	
	//2ND METHOD
	int smallestnum = list14.stream().sorted().distinct().findFirst().get();
	System.out.println("Smallest number present 2nd method : " +smallestnum);
	
	int largestnum = list14.stream().sorted(Collections.reverseOrder()).distinct().findFirst().get();
	System.out.println("largest number 2nd method : " +largestnum);

	// SORTED 
    List<Integer> sort = list14.stream().sorted().collect(Collectors.toList());
    System.out.println("Sorted number : " +sort);
    
    List<Integer> revs = list14.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    System.out.println("Sorted number desc : " +revs);
	
    //FILTER OUT NUMBER AND GET THE SUM
    
    List<Integer> list15 = Arrays.asList(1,2,3,4,5,6);
    List<Integer> filter = list15.stream().limit(4).collect(Collectors.toList());
    System.out.println("filtered number : " +filter);
    
    
    int sumfilter = list15.stream().limit(3).reduce((x,y)->x+y).get();
    System.out.println("filtered number sum : " +sumfilter);
    
    //SKIPED NUMBER
    
    List<Integer> skip = list15.stream().skip(3).collect(Collectors.toList());
    System.out.println("skiped number in list : " +skip);
    
    //FILETRED NUMBER FROM THE LIST :
    
   // 1ST METHOD
    int lb = 2;
    int ub = 5;
    
    List<Integer> lll = list15.stream().filter(e->e>=lb && e<=ub).collect(Collectors.toList());
    System.out.println("filtered number 1st method : " +lll);
    
    //2ND METHOD
    List<Integer>le = list15.stream().limit(4).skip(2).collect(Collectors.toList());
    System.out.println("filtered number 2nd method : " +le);
    
    //SECOND LOWEST
    
    List<Integer> list16 = Arrays.asList(1,1,2,2,3,4,5,5,6,9,8,7,7);
    int seclow = list16.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
    System.out.println("second lowest number : " +seclow);
    
    int sechigh = list16.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
    System.out.println("secong highest number : " +sechigh);
    
    
    System.out.println("rishi");
	}
	}
	
	


