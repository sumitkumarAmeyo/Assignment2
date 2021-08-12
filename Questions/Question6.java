package Questions;

public class Question6 {
	public static void main(String[] args) {
		tablePrint(3);
	}

	private static void tablePrint(int table) {
		for(int i=1;i<=10;i++) {
			System.out.println(table + " x " + i + " = " + table * i );
		}
	}

}
