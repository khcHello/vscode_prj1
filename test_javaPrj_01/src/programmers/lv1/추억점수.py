

class 추억점수:

    def __init__(self, name:list[str], yearning:list[int], photo:list[list[str]]) -> None:

    
        o = [ sum( yearning[name.index(j)] for j in p if j in name ) for p in photo]

        testlist = [1,2,3,4]

        zipFucn = zip(name,yearning,testlist)
        dictionary = dict(zip(name,yearning))

        print(list(zipFucn))
        print(dictionary)
        print( o )

        # zip함수
        # zip함수 + list,dict,tuple의 조합

        peopleHash = dict(zip(name, yearning))
        o2 = [ sum( peopleHash.get(person) if peopleHash.get(person) else 0 for person in aCopy ) for aCopy in photo ]

        print(o2)
        pass


추억점수(["may", "kein", "kain", "radi"], [5, 10, 1, 3], [["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]])
# 추억점수(["may", "kein", "kain", "radi"], [5, 10, 1, 3], [["may", "kein", "kain", "radi"]])