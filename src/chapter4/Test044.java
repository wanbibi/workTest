package chapter4;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Test044 {
	public static void main(String[] args) {
		
/*		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Hello").append("world");
		System.out.println(stringBuffer.toString());*/
		
		StringBuffer stringBuffer2 = new StringBuffer();
		stringBuffer2.append("Hello").append("world").insert(2, "a");
		System.out.println(stringBuffer2);
		
		
		
		
	}
}
