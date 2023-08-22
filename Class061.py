class Student:
    def __init__(self, name, grade, studentNumber):
        self._name = name
        self._grade = grade
        self._studentNumber = studentNumber

    def getName(self):
        return self._name
    def setName(self, name):
        self._name = name

    def getGrade(self):
        return self._grade

    def info(self):
        print("이름: ", self._name, " 학년: ", self._grade, end="   ")

class Student20 (Student) :
    Num = 0
    grade = 4
    zero = "000"
    def __init__(self, name):
        super().__init__()
        super().setName(name)
        Student20.Num += 1

    def info(self):
        super().info()
        # print("학번: ", 2020, Student20.Num)
        print(f"학번: 2020{Student20.Num}")




Kim = Student20("kim")
Kim.info()

Lee = Student20("Lee")
Lee.info()