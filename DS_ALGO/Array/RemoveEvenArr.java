
public class RemoveEvenArr {
	static int[] removeEven(int[] arr) {
		int n = arr.length;
		
//		first count number of odd elements to create a new array of only odd elemnets
		int oddCount =0;
		
		for(int i=0;i<n;i++) {
			if (arr[i]%2==1)
				oddCount++;
			
		}
		int[] resultArr = new int[oddCount];
		
//		now placing elements one by one in new array
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==1) {
				resultArr[j]=arr[i];
				j++;
			}
		}
		
		return resultArr;
	}
	
	
	
	public static void main(String[] args) {
//		in this program we remove even integeres from an array
		int[] myArr = {9,7,0,6,5,4,3,2,33,2,4,6,7,6,6,9};
        int[] resultArr = removeEven(myArr);
        for(int i=0 ; i<resultArr.length;i++)
        System.out.println(resultArr[i]);
	}

}
