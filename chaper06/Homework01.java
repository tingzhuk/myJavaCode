public class Homework01{
	public static void main(String[] args){
		A01 a01 = new A01();

		double[] arr = {33, 66, 21, 99, 65};

		System.out.println(a01.max(arr));
	}
}

class A01{
	public double max(double[] arr){
		if(arr != null && arr.length>0){
			double maxnum = arr[0];

			for(int i=0; i<arr.length; i++){
				if(arr[i] > maxnum) maxnum = arr[i];
			}

			return maxnum;
		}else{
			return null;
		}
	}
}