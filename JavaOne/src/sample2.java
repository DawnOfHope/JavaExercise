import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample2 {
	public static void main(String[] args) throws IOException{
		System.out.print("請輸入字串\n");//提示使用者從鍵盤輸入字串
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		//將使用者從鍵盤輸入的字串指定給變數str
		
		int num = Integer.parseInt(str);
		//將字串轉換成數值，再指定給int 形態的變數
		
		System.out.println("剛才輸入的字串是：" + str);//輸出剛才從鍵盤輸入的字串
		System.out.println("剛才輸入的數字是：" + num);
	}

}
