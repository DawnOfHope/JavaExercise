import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//操作字串的類別＿新增/更改其中內容
public class sample11 {
	public static void main(String[] args) throws IOException{
		//String str = "Hello!!";
		System.out.print("請輸入任何文字\n");//提示使用者從鍵盤輸入字串
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char ch1 = str.charAt(1);//控制要修改字元在字串的位置
		int num = str.indexOf(ch1);
		
		System.out.println("請輸入要新增的字");
		
		String str1 = br.readLine();
		char ch2 = str1.charAt(0);
		
		StringBuffer sb = new StringBuffer(str);
		//sb.append(str1);
		sb.setCharAt(num, ch2);
		
		//System.out.println("在" + str + "後加上" + str1 + "會變成 =>" + sb);
		System.out.println(sb);
		
	}

}
