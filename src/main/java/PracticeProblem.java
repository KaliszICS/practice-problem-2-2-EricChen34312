public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static int[] compareSearch(int[] array, int number){
		int[] out = {0,0};

		//sequential search
		for(int i = 0; i < array.length;i++){
			out[0]++;
			if(array[i] == number){
				//i don't think we learned this yet but i way prefer this over a flag or a while loop
				break;
			}
		}		

		//binary search
		int l = 0;
		int r = array.length-1;
		int mid;

		while(l <= r){
			out[1]++;

			mid = (l+r)/2;

			if (array[mid] > number){
				r = mid-1;
			} else if (array[mid] < number){
				l = mid+1;
			} else {
				l = r+1;
			}
		}

		return out;
	}


	public static int[] compareStringSearch(String[] array, String word){
		int[] out = {0,0};

		//sequential search
		for(int i = 0; i < array.length;i++){
			out[0]++;
			if(array[i] == word){
				//i don't think we learned this yet but i way prefer this over a flag or a while loop
				break;
			}
		}		

		//binary search
		int l = 0;
		int r = array.length-1;
		int mid;

		while(l <= r){
			out[1]++;

			mid = (l+r)/2;

			if (array[mid].compareTo(word) > 0){
				r = mid-1;
			} else if (array[mid].compareTo(word) < 0){
				l = mid+1;
			} else {
				l = r+1;
			}
		}

		return out;
	}
	
}
