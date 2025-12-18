import java.util.*;
class Main_fib{
	public static void num(int i,int n){
		if(i<=n){
		System.out.println(i);
		num(i+1,n);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i=1;
		int n=sc.nextInt();
		num(i,n);
	}
}