

class 머쓱이보다키큰사람:

    def __init__(self, array:list[int], height:int) -> None:

        print( len(list(filter(lambda x: x > height, array))) )


머쓱이보다키큰사람([149, 180, 192, 170]	, 167)