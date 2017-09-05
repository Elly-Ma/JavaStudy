package basic.flowcontrol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
    * @ClassName: Pyramid
    * @Description: 打印金字塔相关图形
    * @author mayl
    * @date 2017年9月4日
    *
 */
public class Pyramid {

	public static void main(String[] args) {
		int layer = 0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("请输入金字塔的层数");
			layer = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("金字塔的层数为："+layer+"层");
		
		/*
		 半个金字塔
		 
		 * 
		 **
		 **** 
		 
		 */
		System.out.println("半个金字塔");
		for (int i = 1; i <= layer; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		/*
		 金字塔
		 
		 	* 
		   ***
		  ******
		 ******** 
		 
		 */
		System.out.println("整个金字塔");
		for (int i = 1; i <= layer; i++) {
			//找规律空格规律,以4层为例
			//1->3 2->2 3->1 4->0
			for (int k=1; k<=layer-i; k++) {
				System.out.print(" ");
			}
			//找规律*规律,以4层为例
			//1->1 2->3 3->5 4->7
			for (int j = 1; j <= (i-1)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	/*
	 镂空金字塔
	 
	 	* 
	   * *
	  *   *
	 *******
	 
	 */
		System.out.println("镂空金字塔");
	for (int i = 1; i <= layer; i++) {
		//找规律空格规律,以4层为例
		//1->3 2->2 3->1 4->0
		for (int k=1; k<=layer-i; k++) {
			System.out.print(" ");
		}
		//找规律*规律,以4层为例
		//1->1 2->3 3->5 4->7
		for (int j = 1; j <= (i-1)*2+1; j++) {
			//判断该层是否是顶层或者底层
			if(i==1||i==layer){
				System.out.print("*");
			}else{
				if(j==1||j==(i-1)*2+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
		}
		System.out.println();
	}
	System.out.println();
		
		/**
		 
		  *
		 ***
		*****
	   *******
	    *****
	     ***
	      *
	      
		 */
	System.out.println("实心菱形");
		// 1->3 2->2 3->1 4->0 5->3 6->2 7->1
		for (int i = 1; i <= 2 * layer - 1; i++) {
			if (i <= layer) {
				// 找规律空格规律,以4层为例
				// 1->3 2->2 3->1 4->0
				for (int k = 1; k <= layer - i; k++) {
					System.out.print(" ");
				}
				// 找规律*规律,以4层为例
				// 1->1 2->3 3->5 4->7
				for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				// 找规律空格规律,以4层为例
				// 5->1 6->2 7->3 
				for (int k = 1; k <= i-layer; k++) {
					System.out.print(" ");
				}
				// 找规律*规律,以4层为例
				// 5->5 6->3 7->1
				for (int j = 1; j <= (i - 2*(i-layer)) * 2 -1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
		
	/*
	 菱形
	 
	 	* 
	   * *
	  *   *
	 *	   *
	  *   *
	   * *
	    *
	 */
		System.out.println("空心菱形");
		for (int i = 1; i <= 2 * layer - 1; i++) {
			if (i <= layer) {
				// 找规律空格规律,以4层为例
				// 1->3 2->2 3->1 4->0
				for (int k = 1; k <= layer - i; k++) {
					System.out.print(" ");
				}
				// 找规律*规律,以4层为例
				// 1->1 2->3 3->5 4->7
				for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
					if(j==1||j==(i-1)*2+1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}else {
				// 找规律空格规律,以4层为例
				// 5->1 6->2 7->3 
				for (int k = 1; k <= i-layer; k++) {
					System.out.print(" ");
				}
				// 找规律*规律,以4层为例
				// 5->5 6->3 7->1
				for (int j = 1; j <= (i - 2*(i-layer)) * 2 -1; j++) {
					if(j==1||j==(i - 2*(i-layer)) * 2 -1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	
	
	}
}
