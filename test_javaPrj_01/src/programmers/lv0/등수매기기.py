
class 등수매기기:

    def __init__(self) -> None:

        score = [[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]

        studentList = []

        for i in range(len(score)):
            
            s = Student(score[i][0] + score[i][1])
            studentList.append(s)

            for j in range(len(studentList)):

                if s.totalScore > studentList[j].totalScore:
                    studentList[j].rank = studentList[j].rank+1
                elif s.totalScore == studentList[j].totalScore:
                    pass
                else:
                    s.rank = s.rank + 1
        
        print([a.rank for a in studentList])
 

class Student:

    def __init__(self, totalScore: int) -> None:
        self.rank = 1
        self.totalScore = totalScore

등수매기기()




