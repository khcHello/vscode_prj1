    # @SuppressWarnings("unused")
    # public void Solution() throws Exception{

    #     String[] strlist = {"We", "are", "the", "world!"};

    #     int[] list = Arrays.stream(strlist).mapToInt(str -> str.length()).toArray();

    #     System.out.println(Arrays.toString(list));

    # }


def 배열원소의길이():
    
    strlist = ["We", "are", "the", "world!"]

    newArr = []
    for element in strlist:
        print(element.count)
        print(len(element))
        newArr.append(len(element))

    print(newArr)

    # 다른사람 아이디어 1
    # return [len(str) for str in strlist]

    # 다른사람 아이디어 2
    # return list(map(len, strlist))

    pass


배열원소의길이();
