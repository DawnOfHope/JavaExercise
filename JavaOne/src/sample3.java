import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3 {
	public static void main(String[] args) throws IOException{
		System.out.print("請輸入考試人數\n");//提示使用者從鍵盤輸入字串
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		//可以接受從鍵盤輸入數字，作為陣列元素的個數
		
		int[] test = new int[num];
		System.out.println("請輸入考試分數");
		
		for(int i=0 ; i<num ; i++){
			str = br.readLine();//根據前面得數字，從鍵盤輸入同樣個數的成績
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}
		
		for(int i=0 ; i<num ; i++){
			System.out.println("第" + (i+1) +"個人的分數是 " + test[i] + "分");
			
		}
	}

}
