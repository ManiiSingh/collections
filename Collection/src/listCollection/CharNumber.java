package listCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//comment
public class CharNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ManjeetSingh";
		getcharcount(str);

	}

	private static void getcharcount(String str) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> charcount = new HashMap<>();
		char[] str1 = str.toCharArray();
		for(char c: str1) {
			if(charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c)+1);
			}
			else {
				charcount.put(c, 1);
			}
			for(Map.Entry entry : charcount.entrySet()) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	//Chnages commented
	}

}
