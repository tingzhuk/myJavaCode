//��ӡ������
public class homework02{
	public static void main(String[] args){
		int n=10;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=2*n-1; j++) {
				if(i==n){
					System.out.print("*");
				}else if(j == n-i+1 || j == n+i-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}