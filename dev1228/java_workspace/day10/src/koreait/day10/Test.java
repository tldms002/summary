package koreait.day10;

public class Test {
//테스트 해보고 파일 삭제 해도 됩니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		
		for(int i=0;i<5;i++)
			arr[i] = 11*i+1;
		
		System.out.println(TrialStr(arr));
	}
	
	

	static String TrialStr(int[] lst) {
		String trials = "";
		
		for (int l = 0; l < lst.length; l++) {
			if (l == lst.length - 1 || lst[l+1]==0) {
				trials += lst[l];
				break;
			} else	trials += lst[l] + ", ";
		}
		
		return trials;
	}

}