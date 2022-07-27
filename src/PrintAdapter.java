
public class PrintAdapter extends PrintAdaptee implements Print {

	public PrintAdapter(String string) {
		super(string);
	}

	@Override
	public void printUpperCase() {
		printOmoji();
	}

	@Override
	public void printLowerCase() {
		printKomoji();
	}

}
