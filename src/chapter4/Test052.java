package chapter4;


/**
 * 替换特定的字符串
 * 
 * @author wan.z.c
 *
 */
public class Test052 {
	public static void main(String[] args) {
		String string = "asdlkj;ksldajfasdj;sdakf";
		String newString = string.replace('s', '万');
		System.out.println(newString);
		String substring = newString.substring(8);
		System.out.println(substring);
	}
	
}
