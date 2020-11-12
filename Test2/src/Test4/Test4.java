package Test4;
/*
 * 날짜 : 2020/11/12
 * 이름 : 김사라
 * 내용 : 자바 선택 정렬하기
 */
public class Test4 {
	
	public static void main(String[] args) {
	
		int arr[] = {4,2,1,5,3};
		
		for(int i=0; i<4; i++) {
			
			for(int j=i+1; j<5; j++) {
				
				if(arr[i] > arr[j]) {   
					int temp = arr[j];   
					arr[j] = arr[i];     
					arr[i] = temp;
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+ ", ");
		}

	}
		
		
		
	}
	


