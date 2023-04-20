
import re
class 문자열정렬하기1:

    def __init__(self, my_string:str) -> None:

        

        my_string = re.sub('[a-zA-Z]', '', my_string)

        print(list(map(int, sorted( re.sub('[a-zA-Z]', '', my_string)))))
        

        pass

문자열정렬하기1('hi12392')