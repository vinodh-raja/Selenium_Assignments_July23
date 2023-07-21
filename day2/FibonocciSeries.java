package week1.day2;

public class FibonocciSeries {

	public static void main(String[] args) {

		int range = 8; 
		int frNum = 0;
		int secNum = 1;
		int sum = 0;
		System.out.println(frNum);
		System.out.println(secNum);
		for (int i=0; i<=range; i++) {
			sum=frNum+secNum;
			frNum=secNum;
			secNum=sum;
			
			System.out.println(sum);
			
	  }

	}

}