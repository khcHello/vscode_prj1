
# from 등수매기기 import List


class 등수매기기:

    def __init__(self) -> None:

        score = [[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]

        # Python Generic Type 선언법
        studentList:list[Student] = list()

        for tempScore in score:
            
            s = Student(tempScore[0] + tempScore[1])
            
            studentList.append(s)
            
            for student in studentList:

                if s.totalScore > student.totalScore:
                    student.rank = student.rank+1
                elif s.totalScore == student.totalScore:
                    pass
                else:
                    s.rank = s.rank + 1
        
        print([a.rank for a in studentList])
 

class Student:

    def __init__(self, totalScore: int) -> None:
        self.rank = 1
        self.totalScore = totalScore

등수매기기()




