package basic.abstractclass;
/**
    * @ClassName: AbstractClass
    * @Description: 抽象类
    * @author mayl
    * @date 2017年9月5日
    *
 */
public abstract class AbstractClass {
	
	/**
	 抽象类：当父类的一些方法不能确定时，可以用abstract关键字来修饰该方法[抽象方法]，用abstract来修饰该类[抽象类]
	       抽象方法在父类中不能实现，在子类中必须实现。
	       注意：
	       1）抽象类不能被实例化
	       2）抽象类不一定要包含abstract方法
	       3）一旦类包含了abstract方法，该类必须定义为抽象类
	       4）抽象类不能有主体
	 
	 */
	
	abstract void getInfo();
	
	public int getMax(int a,int b){
		if(a>b){
			return 1;
		}else if(a==b){
			return 0;
		}else{
			return -1;
		}
	}

}
