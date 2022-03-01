import java.util.ArrayList;
import java.util.Scanner;
//입력한 수 만큼의 단어를 입력 받고 입력 받은 단어를 뒤집어서 출력하기
public class ex3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<String> answer = new ArrayList<>();
		int a = kb.nextInt();
		String[] str = new String[a];
		for(int i = 0; i<a; i++) {
			str[i] = kb.next();
		}
		for(String b : str) {
			String tmp = new StringBuilder(b).reverse().toString();
			answer.add(tmp);	
		}
		System.out.println(answer);
	}

}
