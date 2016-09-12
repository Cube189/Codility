class Solution {
    public int solution(int X, int Y, int D) {
	int distance = Y - X;
	double jumpsRough = distance / (double)D;

	int jumpsNeeded = (int)Math.ceil(jumpsRough);

	return jumpsNeeded;
    }
}
