
import math
from functools import reduce
class 주사위의개수:

    def __init__(self, box:list[int], n:int) -> None:
        
        print( reduce(lambda x, y: x*y, [ math.floor(e/n) for e in box ]) )
        pass
    

주사위의개수([10, 8, 6], 3)
