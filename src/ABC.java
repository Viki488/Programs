import java.util.Arrays;
import java.util.List;

public class ABC {
	public static void main(String[] args) {
	
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
	//changes by vaibhav1

	// Changes by Rahul.

		
		myList.stream(). map (i->i+"").filter(i->i.startsWith("1")).forEach(System.out::println);
	
}
}