import java.util.*;
class Main_sum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		num(n,s);
	}
	public static void num(int n,int s){
		if(n>0){
			s+=n%10;
			num(n/10,s);
		}else{
			System.out.print(s);
		}
	}
}