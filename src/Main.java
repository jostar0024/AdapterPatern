
public class Main {

	public static void main(String[] args) {
		Print p = new PrintAdapter("MoJi");
		p.printLowerCase();
		p.printUpperCase();
	}

}
