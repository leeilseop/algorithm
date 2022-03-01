import java.util.Scanner;
//문자열에서 단어가 가장 긴 단어찾기(개수가 같은 단어가 두개 이상일 경우 앞에 있는 단어로 줄력)
public class ex2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String answer = "";
		int a = Integer.MIN_VALUE;
		String str = kb.nextLine();
		String[] b = str.split(" ");
		for(String c : b) {
			int len = c.length();
			if(len>a) {
				a = len;
				answer = c;
			}
		}
		System.out.println(answer);
		

	}

}
