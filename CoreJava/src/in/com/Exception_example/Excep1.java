package in.com.Exception_example;

public class Excep1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		//int c=a/b;
	//	System.out.println(c);
try {
	int c=a/b;
	System.out.println(c);
} catch (Exception e) {
	System.out.println(e);
	
}
	}

}
