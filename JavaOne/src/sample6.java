//呼叫方法並傳遞引數

//車子類別

class Car1{
	int num;
	double gas;
	
	void setNum(int n){//int n 這是用來接受值的參數
		num = n;
		System.out.println("將車號設為" + num + "。");
	}//擁有參數的方法
	
	void setGas(double g){
		gas = g;
		System.out.println("將汽油設為" + gas + "。");
	}
	
	void show(){//這是方法method
		System.out.println("車號是" + num + "！");
		System.out.println("汽油量是" + gas + "！！");
	}
	
}

public class sample6 {
	public static void main(String[] args){
		Car1 car1 = new Car1();
		car1.setNum(5566);
		car1.setGas(20.5);
	}

}
