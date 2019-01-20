package listCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
//comment
public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "abcdedqwsseaerfy";
		char StringArray[] = original.toCharArray();
		ArrayList<Character> al = new ArrayList<>();
		char prev = StringArray[0];
		al.add(StringArray[0]);
	Arrays.sort(StringArray);
		System.out.println(StringArray);
		for(int i = 0;i<StringArray.length;i++) {
			if(!(prev == StringArray[i])) {
				al.add(StringArray[i]);
			}
			prev = StringArray[i];
			
			
		}
		for (int j = 0;j<al.size();j++) {
			System.out.print(al.get(j));
		}
	}

}
