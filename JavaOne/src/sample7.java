
//方法的回傳值＿帶有傳回值的方法

//車子類別

class Car2{
	int num;
	double gas;
	
	int getNum(){//這個方法會傳回int型態的值
		System.out.println("調查車號");
		return num;//回傳數值給原來的呼叫程式
	}
	
	double getGas(){
		System.out.println("調查汽油量");
		return gas;
	}
	
	void setNumGas(int n,double g){
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "汽油量設為" + gas );
		
	}
	
	void show(){//這是方法method
		System.out.println("車號是" + num + "！");
		System.out.println("汽油量是" + gas + "！！");
	}
	
}

public class sample7 {
	public static void main(String[] args){
		Car2 car2 = new Car2();
		car2.setNumGas(1234,29.4);
		
		int number = car2.getNum();//呼叫具有傳回值的方法
		//將傳回的值再指定給新變數number
		double gasOnline = car2.getGas();
		
		System.out.println("車號是" + number + "，汽油量是" + gasOnline );
		//輸出剛傳回來的訊息
	}

}
