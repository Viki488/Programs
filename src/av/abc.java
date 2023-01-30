package av;

public class abc {

	public static void main(String[] args) {
		
		String[] arr={"cow" , "dog" , "cow" , "cat" , "mouse" , "cat"};
		
		boolean flag=false;
		
		for(int i=0 ; i<arr.length ; i++) {
			
			for (int j=i+1 ; j<arr.length ; j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println("duplicate founds :" +arr[i]);
					flag=true;
				}
			}
		}
		if(flag == false){
			System.out.println("Duplicates Not Found");
		}
	}
}
