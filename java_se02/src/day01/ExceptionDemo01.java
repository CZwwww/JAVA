package day01;

public class ExceptionDemo01 {
	/**
	 * java异常捕获机制:
	 * 程序中只能解决Exception,不能解决Error
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("程序开始了");
		/*
		 * JVM发现我们要调用一个lang的方法
		 * JVM创建一个空指针异常的实例来描述
		 * 这里发生的问题(意外情况),在当前行
		 * 抛出异常,跑出后JVM会检查我们的代码片段,
		 * 查看是否有异常处理机制,当发现当前代码没有
		 * 异常捕获机制,则将该异常实例抛出到当前代码
		 * 所在的方法之外,当逐级抛出到main方法之外时
		 * JVM会直接杀掉当前程序,程序退出,异常代码以下
		 * 的代码就不再执行
		 */
		

		try {
			String str = "abc";
//			System.out.println(str.charAt(0));
			int i = Integer.parseInt(str);
		}catch(NullPointerException e) {
			System.out.println("出现了空指针异常");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("出现了字符串下标越界异常");
		}catch(Exception e) {
			/*
			 * 捕获异常机制的良好习惯:
			 * 在最后一个catch中捕获Exception
			 * 以保证可以捕获在程序中出现其他异常情况,
			 * 使得程序不会出现闪退的情况
			 */
			System.out.println("反正出现了个异常");
		}
		System.out.println("程序结束了");
	}
}
