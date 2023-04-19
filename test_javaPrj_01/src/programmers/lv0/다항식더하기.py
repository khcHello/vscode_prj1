

import re
class 다항식더하기:

    def __init__(self, polynomial:str) -> None:

        print(  [str.strip() for str in polynomial.split('+')]  )

        monominal = 0
        constant = 0

        for element in [e.strip() for e in polynomial.split('+')]:
            
            if element.find('x') > -1:
                
                data = re.sub('x', '', element)
                monominal += int(data) if len(data) > 0 else 1

                
            else:
                constant += int(element)
        

        answer = ''
        if monominal > 0:
            answer += str(monominal) + 'x' if monominal > 1 else 'x'
        
        if constant > 0:
            if len(answer) > 0:
                answer += ' + '
            answer += str(constant)
        
        print(answer)

        

다항식더하기('3x + 7 + x')
