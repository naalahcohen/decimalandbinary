import java.util.ArrayList;
import java.util.List;

public class Converter {

	public static void convertBinary(long num) { 
		List<Long> arr = new ArrayList <>(); 
		long quotientremainder = 0;
		long quotient = num;
		while (quotient != 0) {
			quotientremainder = quotient%2;
			arr.add(quotientremainder);
			quotient = quotient/2;
		}
//		for(int i =0; i < arr.size(); i++) {
//			System.out.println(num + "/ 2 =" + num/2 + "remainder" + arr.get(i));
//		}
		String str = "";
		for(int i = arr.size()-1; i >= 0; i--) {
			str += arr.get(i);
		}
		System.out.println (str);
	}
	
	public static int convertDecimal(String num) {
		List<Long> arr = new ArrayList <>(); 
		long numpow = 0;
		for (int i = num.length()-1; i >=0 ; i--) {
			long nummie = num.charAt(i) - '0';
			long nummmm= (long) Math.pow(2,numpow);
			long num1 = nummie * nummmm;
			numpow ++;
			arr.add(num1);
		}
		int totalnum =0;
		for(int i =0; i< arr.size();i++) {
			totalnum += arr.get(i);
		}
		return totalnum;
	}
}
