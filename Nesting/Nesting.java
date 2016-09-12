import java.util.Stack;

class Solution {
    private final int fail = 0;
    private final int success = 1;

    public int solution(String S) {
	Stack stack = new Stack();
	char[] brackets = S.toCharArray();

	for (char c : brackets) {
	    if (c == '(')
		stack.push(c);
	    else if (c == ')') {
		if (stack.empty())
		    return fail;
		stack.pop();
	    }
	}

	return (stack.empty()) ? success : fail;
    }
}
