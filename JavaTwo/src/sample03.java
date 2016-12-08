//如何存取和父成員名稱相同的成員資料
class Num{
	int x;//在父類別中有x
	static final int Num_tire = 4;//只要在欄位中指定final  就無法變更值了
					//Num_tire 被視為 常數（constant）
}

//final class Num{//只要在類別中final  就無法宣告子類別
//	int x;//在父類別中有x
//}

class RacingNum extends Num{
	int x;//子類別也有x
	
	public void show(){
		x = 10;
		super.x = 20 ;
		
	}
}

public class sample03 {
	public static void main(String[] args){
		RacingNum racNum = new RacingNum();
		racNum.show();
	}

}
