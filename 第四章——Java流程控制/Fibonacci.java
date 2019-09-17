import javax. swing. JOptionPane;
public class Fibonacci{
	public long fibonacciRecursion(int n){//递归求解
		if(1==n||2==n)
		{
			return 1;
		}
		else
		{
			return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
		}	
	}
	public long fibonacci(int n){
		if(1==n||2==n){
			return 1;
		}
		long f1=1;
		long f2=1;
		long temp=0;
		for(int i=2;i<n;i++)
			{
				temp=f2;
				f2=f2+f1;
				f1=temp;
			}
			return f2;
	}
	public static void main(String args[]){
		String s = JOptionPane. showInputDialog(null,"斐波那契数列F(n):");
		int n=Integer.parseInt(s);
		Fibonacci fibo = new Fibonacci();
		long start = System.currentTimeMillis();
		System. out. println("F("+n+")"+fibo.fibonacci(n));//fibo.fibonacci ??
		long end =  System.currentTimeMillis();
		System. out. println("非递归计算时间"+(end-start)/1000.0+"秒");
		start = System.currentTimeMillis();
		System. out. println("F("+n+")="+fibo.fibonacciRecursion(n));
		end = System.currentTimeMillis();
		System. out. println("递归计算时间："+(end-start)/1000.0+"秒");
	}//end main
}//end Fibonacci
//有一说一，这个递归是真的慢