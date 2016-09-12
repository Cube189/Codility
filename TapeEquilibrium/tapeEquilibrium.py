def solution(A):
    leftSide = A[0]
    rightSide = 0

    for i in xrange(1, len(A)):
        rightSide += A[i]

    minimalDifference = abs(leftSide - rigthSide)
    for P in xrange(1, len(A)):
        difference = abs(leftSide - rigthSide)

        if(difference < minimalDifference):
            minimalDifference = difference

        leftSide += A[P]
        rightSide -= A[P]

    return minimalDifference
