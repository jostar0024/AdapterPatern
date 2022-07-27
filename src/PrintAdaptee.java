
public class PrintAdaptee {
	private final String string;
	
	public PrintAdaptee(String string) {
		this.string = string;
	}
	
	public void printOmoji() {
		System.out.println(string.toUpperCase());
	}
	public void printKomoji() {
		System.out.println(string.toLowerCase());
	}

}
