public class zero{
	public static void main(String args[]){
		try{
			System. out. println(1/0);
		}
		catch(ArithmeticException e){
			System. out. println("你好");
			System. out. println(e);
		}
		finally{
			System. out. println("fianlly 执行完了");
		}
		System. out. println("ok");
	}
}