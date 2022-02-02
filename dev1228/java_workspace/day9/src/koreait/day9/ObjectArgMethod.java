package koreait.day9;

import java.util.Arrays;
import java.util.Random;

public class ObjectArgMethod {
	//int 배열의 정수값 중에서 최대값/최소값 구하는 메소드를 만듭니다.- 참조값을 인자로 전달하는 연습합니다.
	
	//전역변수
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		Random r = new Random();		//난수 범위 1~100 으로 합니다.
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = r.nextInt(100) +1 ;	
		}
		
		System.out.println(Arrays.toString(arr));			//정수배열을 인자로 합니다.
		
		int max;		//max 초기값 : 1) 배열 인덱스 0번값  		2) 비교될 다른값들보다 작은값
						//비교 범위    : 1) 배열인덱스 1~마지막 인덱스   2) 0~마지막 인덱스
		max= arr[0];		//1)으로 구현
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)			//최대값은 다른 값들보다 큰값이 되어야 하므로, 그렇지 않을 경우
				max = arr[i];		//max 의 값을 그 값으로 변경합니다.
		}
		
		System.out.println("최대값 : " + max);
		
		
		int min;   		//min 초기값 : 1) 배열 인덱스 0번값  		2) 비교될 다른값들보다 큰값
						//비교 범위    : 1) 배열인덱스 1~마지막 인덱스   2) 0~마지막 인덱스
		
		min = 999;		//100 으로 해도 됩니다. 2) 로 구현
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)				//최소값은 다른 값들보다 작은값이 되어야 하므로, 그렇지 않을 경우
					min =arr[i];		//min 의 값을 그 값으로 변경합니다.
		}
		
		System.out.println("최소값 : " + min);
		
		//메소드로 실행해보기.
		//arrayMaxValue(arr);
		System.out.println("메소드로 구한 최대값 : " + arrayMaxValue(arr));
		System.out.println("메소드로 구한 최소값 : " + arrayMinValue(arr));
		System.out.println("메소드로 구한 합계 : " + arraySumValue(arr));
		System.out.println("메소드로 구한 평균: " + arrayAvgValue(arr));
		
		
		double[] darr = new double[10];
		
		for(int i=0;i<darr.length;i++) {
//			darr[i] = r.nextDouble();		//0~1 사이의 실수
//			darr[i] = r.nextDouble()*10;		//0~10 사이의 실수
			darr[i] = r.nextDouble()*9+1;		//0~9 사이의 실수 +1 -> 1~10 사이의 실수
			
		}
		
		System.out.println("Arrays.toString 메소드 오버로딩 확인 ");
		System.out.println(Arrays.toString(darr));	//실수 배열을 인자로 합니다.
		
		//메소드 오버로딩(overloading) - 메소드 이름은 같으나  인자 형식이 다릅니다.
		//  						- 반환값은 같거나 다른 타입 형식도 가능합니다.
		//			대표적인 메소드 - Arrays.toString() 메소드 입니다.
		
	}
	
	//메소드 작성으로 구현해봅니다. : 최대값/최소값을 구하기 위해 다룰 데이터는 배열에 있습니다. -> 배열 변수는 참조 변수.
	//					-> 메소드 인자가 참조 타입이 됩니다. -> 데이터 자체를 전달하지 않고 데이터 저장 주소를 전달.	
	//메소드의 반환값은 최대값 또는 최소값 결과로 합니다.
	
	static int arrayMaxValue(int[] array ) {   //인자의 변수 선언은 전달될 데이터 타입을 지정.
		int max;		//max 초기값 : 1) 배열 인덱스 0번값  		2) 비교될 다른값들보다 작은값
		//비교 범위    : 1) 배열인덱스 1~마지막 인덱스   2) 0~마지막 인덱스
		max= array[0];		//1)으로 구현
		for(int i=1;i<array.length;i++) {
		if(array[i]>max)			//최대값은 다른 값들보다 큰값이 되어야 하므로, 그렇지 않을 경우
		max = array[i];		//max 의 값을 그 값으로 변경합니다.
}
		return max;		//최대값
	}
	
	static int arrayMinValue(int[] array) {
		int min;   		//min 초기값 : 1) 배열 인덱스 0번값  		2) 비교될 다른값들보다 큰값
		//비교 범위    : 1) 배열인덱스 1~마지막 인덱스   2) 0~마지막 인덱스

		min = 999;		//100 으로 해도 됩니다. 2) 로 구현
		for(int i=0;i<array.length;i++) {
		if(array[i]<min)				//최소값은 다른 값들보다 작은값이 되어야 하므로, 그렇지 않을 경우
			min =array[i];		//min 의 값을 그 값으로 변경합니다.
		}
		return min;		//최소값
	}
	
	//합계를 구하는 메소드
	static int arraySumValue(int[] array) {
		int sum=0;		
		for(int i=0;i<array.length;i++) {
			sum +=array[i];		//배열 인덱스 0~마지막까지 순차적으로 sum 변수에 (누적)더합니다.
		}
		
		return sum;
	}
	
	//평균을 구하는 메소드 : 평균은 실수형식입니다.
	static double arrayAvgValue(int[] array) {
		int sum =0;
		for(int i=0;i<array.length;i++) {
			sum +=array[i];		//배열 인덱스 0~마지막까지 순차적으로 sum 변수에 (누적)더합니다.
		}
		
		//sum = arraySumValue(array);   //위의 메소드 호출하는 방법도 있습니다.
		
		return (double)sum/array.length;
	}

	
	
	
}

