package ch22;

public class Alphabet {

	public static void main(String[] args) {
		
		char[][] alphbet = new char[13][2];
		char alph = 'a';
		
		for (int i = 0; i < alphbet.length; i++) {
			for (int j = 0; j < alphbet[i].length; j++) {
				alphbet[i][j] = alph;
				alph++;
				System.out.print(alphbet[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
