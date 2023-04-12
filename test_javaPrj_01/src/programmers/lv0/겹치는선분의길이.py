
def 겹치는선분의길이_translatedFromJava(): 
    
    lines = [[0, 1], [2, 5], [3, 9]]
    # lines = [[2, 5], [3, 9]]

    minVal = min( (min(e) for e in lines) )
    maxVal = max( (max(e) for e in lines) )

    print(minVal)
    print(maxVal)

    firstLine = lines[0]
    secondLine = lines[1]
    thirdLine = lines[2]

    answer = 0
    for i in range(maxVal-minVal):
        parallelCount = 0

        # if(firstLine[0] <= minVal+i & i < firstLine[1]  ):
        #     pass
        if firstLine[0] <= minVal+i < firstLine[1]:
            parallelCount += 1

        if secondLine[0] <= minVal+i < secondLine[1]:
            parallelCount += 1

        if thirdLine[0] <= minVal+i < thirdLine[1]:
            parallelCount += 1

        if parallelCount > 1:
            answer += 1

    print("답은 ? ")
    print(answer)


겹치는선분의길이_translatedFromJava();

