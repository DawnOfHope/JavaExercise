import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//操作字串的類別＿取得字串的長度和其中的字元
public class sample9 {
	public static void main(String[] args) throws IOException{
		//String str = "Hello!!";
		System.out.print("請輸入任何文字\n");//提示使用者從鍵盤輸入字串
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		char ch1 = str.charAt(0);//取得字串的第一個字元
		char ch2 = str.charAt(1);
		
		int len = str.length();//傳回字串的長度
		
		System.out.println(str + " 的第一個字元是" + ch1 );
		System.out.println(str + " 的第二個字元是" + ch2 );
		System.out.println(str + " 的長度是" + len );
	}

}
