import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample1 {
	public static void main(String[] args) throws IOException{
		System.out.print("請輸入字串\n");//提示使用者從鍵盤輸入字串
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		//將使用者從鍵盤輸入的字串指定給變數str
		
		Double num = Double.parseDouble(str);//可以輸入含有小數點的數字
		
		System.out.println("剛才輸入的字串是：" + str);//輸出剛才從鍵盤輸入的字串
		System.out.println("剛才輸入的數字是：" + num);
	}

}