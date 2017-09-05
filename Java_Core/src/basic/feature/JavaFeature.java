package basic.feature;

/**
    * @ClassName: JavaFeature
    * @Description: Java面向对象的四大特征
    * @author mayl
    * @date 2017年9月5日
    *
 */
public class JavaFeature {
	/**
	1、抽象：把一类事物的共有的属性和行为提取出来，形成一个物理模型（模板）。这种研究问题的方法称为抽象。
	2、封装：把抽象出的数据和对数据的操作封装在一起，数据被保护在内部，程序的其他部分只有通过被授权的操作（成员方法），才能对数据进行操作。
	       访问控制修饰符：四种，控制方法和变量的访问权限
	       1）公开级别的：public，所有类
	       2）受保护级别的：protected,同类、同包、子类
	       3）默认级别：没有修饰符号,同类、同包
	       4）私有级别：private,同类
	       包：
	           三大作用
	       1）区分相同名字的类
	       2）当类很多事，可以很好地管理类
	       3）控制访问范围
	           打包命令：package com.mayl;
	           命名规范：小写字母
	    java常用的包
	       1）java.lang.*;自动引入   
	       2）java.util.*;工具包  
	       3）java.net.*;网络开发包
	       4）java.awt.*;窗口工具包
	           
	3、继承：可以解决代码复用，让辩称更加靠近人类的思维。当多个类存在相同的属性和方法时，可以从这些类中抽象出来，在父类中定义这些形同的属性和方法，
	       所有的子类不需要重新定义这些属性和方法，只需要通过extends语句来声明继承父类。
	       class 子类 extends 父类 子类便会自动拥有父类定义的属性和方法。
	       私有属性不能被继承
	       注意：1）子类只能继承一个父类
	       2）java所有的类都是Object类的子类
	4、多态：一个引用（类型）在不同情况下的多种状态（通过指向父类的指针，来调用在不同子类中实现的方法）
	         注意：
	      1）java允许父类引用变量引用他的子类的实例（对象）（这种转换自动完成）
	      2)某些情况下子类也可以转换为父类
	      
	 	方法重载（overload）：类的同一种功能的多种实现方式，到底采用哪种方式，取决于调用者给出的参数。
	 		1）方法名相同
	 		2）方法的参数类型，个数，顺序至少有一项不同
	 		3）方法的返回类型可以不同（只是返回类型不同，不能构成重载）
	 		4）方法的修饰符可以不同
	 		
	 	方法覆盖（override）：子类有一个方法，和父类的某个方法名称、返回类型、参数一样，就说子类的这个方法覆盖了父类的那个方法。
	 	    1）方法名称、返回类型、参数子类必须和父类完全一样
	 	    2）子类不能缩小父类的访问权限
	 */

	public static void main(String[] args) {
//		Course course=new Course();
//		course.setName("数学");
//		course.setGrade(34f);
		
		Student stu=new Student();
		stu.setName("小红");
		stu.setCourse("数学");
		stu.setGrade(85f);
		stu.eat();
		stu.course();
		Teacher teacher=new Teacher();
		teacher.setName("秋远征");
		teacher.setCourse("体育");
		teacher.eat(2,"大龙虾");
		teacher.course();
		
		People people=new Student();
		people.setName("lily");
		people.eat();
		people=new Teacher();
		people.setName("grace");
		people.eat();
		
	}
	
}


class People{
	public int age;
	
	public String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * 方法的重载
	 */
	public void eat(){
		System.out.println(this.name+"吃饭了");
	}
	
	public void eat(String foodName){
		System.out.println(this.name+"吃了"+foodName);
	}
	
	public void eat(int num,String foodName){
		System.out.println(this.name+"吃了"+num+"个"+foodName);
	}
	
	public void course(String course){
		System.out.println("课程名字"+course);
	}
}

class Student extends People{
	public String course;
	
	public float grade;
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	/*
	 * 方法的重写（方法覆盖）
	 */
	public void course(){
		System.out.println(this.name+"学"+this.course+",分数是"+this.grade);
	}
	
}

class Teacher extends People{
	public String course;
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	/*
	 * 方法的重写（方法覆盖）
	 */
	public void course(){
		System.out.println(this.name+"教"+this.course);
	}
}