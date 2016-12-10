import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//從檔案讀入資料
public class sample07 {
	public static void main(String[] args){
		try{
			BufferedReader br = 
					new BufferedReader(new FileReader("test1.txt"));
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("讀取的字串是：");
			System.out.println(str1);
			System.out.println(str2);
		}catch(IOException e){
			System.out.println("讀取錯誤");
		}
	}
}
