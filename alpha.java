package pseudoCodes1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class alpha {

	public static <V> void main(String[] args) {
		Map<Character,Integer> map=new HashMap<>();
		Map<Character,Integer> small=new HashMap<>();
		int num=1;
		for(char i='A';i<='Z';i++)
		{ 
			map.put(i,num);
			num++;
		}
		map.put(' ', 0);
		int num2=1;
		for(char i='a';i<='z';i++)
		{ 
			small.put(i,num2);
			num2++;
		}
		
		map.putAll(small);
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.toString());
		 
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
		 
			 count+=map.get(str.charAt(i));
			 
		 
		}
		
			System.out.println(count);
		
	}


}
