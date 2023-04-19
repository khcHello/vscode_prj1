

class 공던지기:
    
    def __init__(self, numbers:list[int], k:int) -> None:

        # 삼항연산자
        print(numbers[len(numbers)-1] if (1 + 2*(k-1)) % len(numbers) == 0 else (1 + 2*(k-1)) % len(numbers))
        

        pass




공던지기([1, 2, 3], 3)