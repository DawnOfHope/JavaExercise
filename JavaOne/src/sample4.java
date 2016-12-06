import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4 {
	public static void main(String[] args) throws IOException{
		System.out.print("請輸入考試人數\n");//提示使用者從鍵盤輸入字串
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		//可以接受從鍵盤輸入數字，作為陣列元素的個數
		
		int[] test = new int[num];
		System.out.println("請輸入" + test.length + "個人的分數");
		
		for(int i=0 ; i<test.length; i++){
			str = br.readLine();//根據前面得數字，從鍵盤輸入同樣個數的成績
			test[i] = Integer.parseInt(str);
			
		}
		
		for(int s=0 ; s<test.length ; s++){
			for(int t=s+1 ; t<test.length ; t++){
				if(test[t] > test[s]){
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
			}
		}
		
		for(int j=0 ; j<test.length ; j++){
			
			System.out.println("第" + (j+1) +"名的分數是 " + test[j] + "分");
			for(int k=0 ; k<test.length ; k++){
				int testVaule = test[k] - test[j];
				System.out.println("差距" + testVaule);
			}
			
		}
	}

}
