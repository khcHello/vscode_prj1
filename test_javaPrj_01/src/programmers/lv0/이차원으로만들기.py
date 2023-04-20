
import numpy as numpy

class 이차원으로만들기:
    
    def __init__(self, num_list:list[int], n:int) -> None:
        
        a = numpy.reshape(num_list, (-1 , n))

        # answer = [ [e] for e in num_list ]

        

        print(type(a))
        print(a.tolist())
        print(numpy.reshape(num_list, (-1 , n)).tolist())



# 이차원으로만들기([1, 2, 3, 4, 5, 6, 7, 8], 2)
이차원으로만들기([100, 95, 2, 4, 5, 6, 18, 33, 948], 3)