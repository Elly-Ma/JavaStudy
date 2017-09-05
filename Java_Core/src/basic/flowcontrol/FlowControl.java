package basic.flowcontrol;
/**
    * @ClassName: FlowControl
    * @Description: 流程控制学习
    * @author mayl
    * @date 2017年9月4日
    *
 */
public class FlowControl {
/**
java流程控制包括顺序控制、条件控制和循环控制
1、顺序控制：就是从头到尾依次执行每条语句操作。
		    只能顺序执行，不能进行判断和选择，因此需要分支结构。
		    
2、条件控制：基于条件选择执行语句，比方说，如果条件成立，则执行操作A，或者如果条件成立，则执行操作A，反之则执行操作B。
		Java有两种分支结构：
		  1)if语句
		  2)switch语句:数据类型应和case后的常量类型一致
			switch 是否能作用在byte 上，是否能作用在long 上，是否能作用在String上？ 
			答：在Java 5以前，switch(expr)中，expr只能是byte、short、char、int。
			       从Java 5开始，Java中引入了枚举类型，expr也可以是enum类型，
		                 从Java 7开始，expr还可以是字符串（String），但是长整型（long）在目前所有的版本中都是不可以的。

3、循环控制：又称为回路控制，根据循环初始条件和终结要求，执行循环体内的操作。
		Java中有三种主要的循环结构：
			while循环:符合while条件才会执行
			do…while循环：无论是否符合条件都会执行一次
			for循环：符合条件才会执行
 */
	public static void main(String[] args) {
		//1、顺序控制:顺序执行以下语句
		int a=1;
		System.out.println("顺序执行  a:"+a);
		int b=2;
		System.out.println("顺序执行 b:"+b);
		
		//2、条件控制:根据条件执行以下语句
		//1)if else
		if(a>0){
				System.out.println("执行if 条件：a大于0");
		}else{
			System.out.println("执行else 条件：a小于0");
		}
		//2)switch
		switch(a){
			default:
				System.out.println("打印默认值");
				break;
			case 1:
				System.out.println("执行switch条件  case :1");
				break;
		}
		
		//3、循环控制
		//1)for
		for (int i = 0; i < 1; i++) {
			System.out.println("执行for循环，i="+i);
		}
		//2)while
		while(a>0){
			System.out.println("执行while循环,a="+a);
			a--;
		}
		//3)do while
		do{
			System.out.println("执行do while循环");
		}while(a>1);
	}
	
}
