package utility;

public class StringUtility {
	/**
	 * inlocuieste toate White Space-urile cu nimic
	 * @param myString
	 * @return myString fara White Space-uri
	 */
	public String removeWhiteSpaces(String myString) {
		String rez = null;
		int poz = 0;
		int check = 0;
		for(int i =0;i<myString.length();i++) {
			if (myString.charAt(i)==' ') {
				if(check == 0) {
					rez =myString.substring(0, i);
					check++;
					poz = i+1;
				}else {
					rez = rez+myString.substring(poz,i);
					poz = i+1;
				}
				
				
			}
		}rez = rez+myString.substring(poz,myString.length());
		return rez;
	}

	/** folosesc functia toLowerCase() ca sa imi fac String-ul doar de lowercase sa pot executa pe orice input programul, nu avea sens sa fac asta din 
	 * moment ce e facuta deja, dar nu stiam ca exista asa ceva pana nu am creat functia si voiam sa fac chestia din C++ cum am invatat la scoala sa 
	 * fac + ceva ca sa imi dea litera mare
	 * @param myString
	 * @return tot in lowercase
	 */
	public String lowerCaseTransformation(String myString) {
		String toLower=myString.toLowerCase();
	 return toLower;}
	/**
	 * Aceasta functie primeste un String si returneaza String-ul schimbat daca gaseste cuvinte care reprezinta numerele de la 0 la 9 si
	 * nu face nimic daca gaseste ca locul de dinaintea numarului nu e gol.
	 * face 3 for-uri, in cel mai des(cel de k) verifica daca substringul de forurile de i si j sunt egale si stringArray de k si daca sunt
	 * pune in loc numArray de k.
	 * @param myString
	 * @return String
	 */
	public String changeNumber(String myString) {
		String [] stringArray = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String [] numArray = {"0","1","2","3","4","5","6","7","8","9"};
		String rezolvare="";
		int count=0;
		int poz=0;
		for(int i=0;i<myString.length();i++) {
			for(int j=i+1;j<myString.length();j++) {
				for(int k=0;k<stringArray.length;k++) {
					if (myString.substring(i, j).equals(stringArray[k])&&myString.charAt(i-1)==' ') 
					{ if(count==0) {
						rezolvare = myString.substring(poz,i)+ numArray[k];
					}else
						rezolvare = rezolvare +" " +myString.substring(poz,i)+ numArray[k];
								//" "+ test.substring(j,test.length());
						//System.out.println(rezolvare);
						poz=j+1;
						count++;
					}
				}		
		}
		}rezolvare = rezolvare +myString.substring(poz-1,myString.length());
		if(count ==0) {
			return myString;
		}else {System.out.println(rezolvare);
		return rezolvare;
}
		
	}
}
