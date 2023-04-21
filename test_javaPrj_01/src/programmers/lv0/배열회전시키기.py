

class 배열회전시키기:

    def __init__(self, numbers:list[int], direction:str) -> None:
        print(numbers)
        print( [numbers[-1]] + numbers[:-1] )
        print( numbers[1:] + [numbers[0]] ) 
        
        # Python은 list간 연산 시 새로운 List 합으로 생성된다.
        # Python의 Slicing과 활용하여 원소 제거 후 합연산을 활용했다.
        # Extended Slices 추가적으로 참고 필요

        print( [numbers[-1]] + numbers[:-1] if direction == 'right' else numbers[1:] + [numbers[0]] )


배열회전시키기([4, 455, 6, 4, -1, 45, 6], 'left')
