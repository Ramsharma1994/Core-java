package in.com.Logic;

public class CountStringOnly {
	public static void main(String[] args) {
		String name="ram@123.com";
		int count=0;
		for (char ch='a'; ch<'z'; ch++) {
			
			for (int i = 0; i < name.length(); i++) {
				if(ch==name.charAt(i)) {
					count++;
				}
			}
			
			}
		if(count>0) {
			System.out.println(count);
		}
	}}
	
		
			
		




