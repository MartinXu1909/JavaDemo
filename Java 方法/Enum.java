/* 
 以下实例演示了Enum（枚举）构造函数及方法的使用
*/
enum Car{
	lamborghini(900), tata(2), audi(50), fiat(15), honda(12);
	private int price;
	Car(int p){
		price = p;
	}
	int getPrice(){
		return price;
	}
}
public class Enum{
	public static void main(String[] args){
		System.out.println("所有汽车的价格：");
		for(Car c : Car.values())
			System.out.println(c + " 需要 " + c.getPrice() + " 千美元。");
	}
}
/* 
所有汽车的价格：
lamborghini 需要 900 千美元。
tata 需要 2 千美元。
audi 需要 50 千美元。
fiat 需要 15 千美元。
honda 需要 12 千美元。
 */