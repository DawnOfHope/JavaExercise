//使用類別變數 類別方法

//車子類別

class Car3{
	public static int sum = 0;//這是類別變數
	private int num;
	private double gas;
	
	public Car3(){//建構式名稱要class 一樣
		num = 0;
		gas = 0.0;
		sum++;//建構式每次被呼叫，都會使類別變數sum的值增加1
		System.out.println("呼叫一次建構式，初始化車車");
	}
	
	public void setCar3(int n,double g){
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "汽油量設為" + gas );
		
	}
	public static void showSum(){//這是類別方法method
		System.out.println("車子總共有" + sum + "台");
	}
	
	public void show(){//這是方法method
		System.out.println("車號是" + num + "！");
		System.out.println("汽油量是" + gas + "！！");
	}
	
}

public class sample8 {
	public static void main(String[] args){
		Car3.showSum();//呼叫類別方法
		
		Car3 car30 = new Car3();//建立新物件
		car30.setCar3(5678, 8985.5);

		car30.showSum();//再次呼叫類別方法
		
		Car3 car31 = new Car3();
		car31.setCar3(77888, 33233.43);
		
		Car3.showSum();
		
		
		
	}

}
