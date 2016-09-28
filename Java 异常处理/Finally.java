/* 
Java 中的 Finally 关键一般与try一起使用，在程序进入try块之后，
无论程序是因为异常而中止或其它方式返回终止的，finally块的内容一定会被执行 。

以下实例演示了如何使用 finally 通过 e.getMessage() 来捕获异常（非法参数异常） 
*/

public class Finally{
	public static void main(String[] args){
		new Finally().doTheWork();
	}
	public void doTheWork(){
		Object o = null;
		for(int i = 0; i < 5; i++){
			try{
				o = makeObj(i);
			}
			catch (IllegalArgumentException e){
				System.out.println("Error: (" + e.getMessage() + ").");
				return;
			}
			finally{
				System.out.println("都已执行完毕");
				if(o == null)
					System.exit(0);
			}
			System.out.println(o);
		}
	}
	public Object makeObj(int type) throws IllegalArgumentException {
		if(type == 1)
			throw new IllegalArgumentException("不是指定的类型：" + type);
		return new Object();
	}
}
/* 
都已执行完毕
java.lang.Object@15db9742
Error: (不是指定的类型：1).
都已执行完毕
 */