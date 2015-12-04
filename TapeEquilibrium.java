

public class TapeEquilibrium {
	/** A non-empty zero-indexed array A consisting of N integers is given.
	 * Array A represents numbers on tape.
	 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: 
	 * A[0], A[1], ..., A[P-1] and A[P], A[P+1], ..., A[N-1].
	 * 
	 * The difference between the two parts is the value of
	 * |(A[0]+A[1}+...+A[P-1])-(A[P]+A[P+1]+...+A[N-1])|.
	 *  
	 * In other words, it is the absolute difference between the sum of the first part
	 * and the sum of the second part.
	 * 
	 * Write a function
	 *   class Solution { public int solution(int[] A); }
	 * that, given a non-empty zero-indexed array A of N integers, returns the minimal 
	 * difference that can be achieved
	 * 
	 * Assume that:
	 *  (*) N is an integer within the range [2..100,000];
	 *  (*) each element of array A is an integer within the range [-1000..1000];
	 *  (*) elements of input arrays can be modified.
	 * */

	public static int solution(int[] A) {
		int difference = Integer.MAX_VALUE;						//TODO: Change value
		int minimalDifference = Integer.MAX_VALUE;				//TODO: Change value
		int minimalDifferenceP = A.length-1;	//TODO: Deinitialize

		
		for (int P = 0; P < A.length; P++){
			int leftSide = 0;
			int rightSide = 0;
			
			for (int i = 0; i < P; i++){ leftSide += A[i]; }			/** Counting A[0]+A[1]+...+A[P-2]+A[P-1] */
			for (int i = P; i < A.length; i++){ rightSide += A[i]; }	/** Counting A[P]+A[P+1]+...+A[N-1]+A[N] */

			
			difference = Math.abs(leftSide - rightSide);
			if (difference < minimalDifference){
				minimalDifference = difference;
				minimalDifferenceP = P;
			}
		}
		
		return minimalDifferenceP;
	}
	
	public static void main(String[] args){
		int[] A = new int[5];
		
//		A = [3, 1, 2, 4, 3];
		A[0] = new Integer(3);
		A[1] = new Integer(1);
		A[2] = new Integer(2);
		A[3] = new Integer(4);
		A[4] = new Integer(3);
		
		System.out.println(solution(A));
	}


}
