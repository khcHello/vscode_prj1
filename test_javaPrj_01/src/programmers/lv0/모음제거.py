
import re
class 모음제거:
    
    def __init__(self, my_string:str) -> None:
        # re.sub(pattern, replacement, string, count=0, flags=0)
        # re.sub(pattern_1 | pattern_2, replacement, string, count=0, flags=0)
        print( re.sub('a|e|i|o|u', '', my_string) )



모음제거('bus')