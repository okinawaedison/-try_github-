package try_github;

public class Main {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		Add add =new Add();
		Sub sub = new Sub();
		int c ;
		c = Add.add(a,b);


		 System.out.println(Sub.sub(a,b));
		 System.out.println(c);
		 }
}
