package day01;

public class ExceptionDemo04 {
	//主动抛出异常的第二种情况
	
	public static void main(String[] args) {
		connectDB("admin","1234");
	}
	//模拟用户登录数据库
	public static void connectDB(String user,String pwd) {
		if("scoot".equals(user)&&"123456".equals(pwd)) {
			System.out.println("数据库连接成功");
		}else {
			throw new RuntimeException("用户名或密码不正确");
		}
	}
}
