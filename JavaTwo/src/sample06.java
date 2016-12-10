import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//將資料輸出到指定檔案
public class sample06 {
	public static void main(String[] args){
		try{
			PrintWriter pw = 
					new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
			pw.println("Hello");
			pw.println("I'm Yours.");
			System.out.println("ok");
			pw.close();
			
		}catch(IOException e){
			System.out.println("輸出錯誤");
		}
	}
}
