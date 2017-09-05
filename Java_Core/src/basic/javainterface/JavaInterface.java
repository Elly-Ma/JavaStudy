package basic.javainterface;
/**
    * @ClassName: JavaInterface
    * @Description: 接口知识点
    * @author mayl
    * @date 2017年9月5日
    *
 */
public interface JavaInterface {
	/**
	  接口：更加抽象的抽象类，抽象类里的方法可以有方法体，接口里的所有方法都没有方法体。接口体现了程序设计的多态和高内聚低耦合的设计思想。
	  一个类实现了一个接口，要求该类把这个接口的所有方法通通实现
	  注意：
	  1）接口不能被实例化
	  2）接口中的所有方法都不能有主题
	  3）一个类可以实现多个接口
	  4）接口中可以有变量[但变量不能用private protected修饰]
	     	接口中的变量，本质上都是static，而且是final的，不管你加不加static修饰
	     	java开发中，经常把常用的变量，定义在接口中，座位全局变量使用。访问方式：接口名.变量名
	  5）一个接口不能继承其他的类，但可以继承别的接口
	 
	 */
	int getSum(int a ,int b);

}
