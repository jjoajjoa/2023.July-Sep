class Student:
    def __init__(self, name="학생", grade=1, studentNumber=1):
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
        return "이름: ", self._name, " 학년: ", self._grade, " 학번: ", self._studentNumber


class Student20 (Student) :
    gradeNum = 20
    number = 1

    def __init__(self):
        super(str(Student20.gradeNum) + "0" + str(Student20.number), 4)
        self.student = Student20.number
        self.zero = "000"
        Student20.number += 1

    def zeroSet(self):
        num = self.student
        while num //10 >0 :
            self.zero = self.zero[0: len(self.zero)-1]
            num //= 10
        return self.zero

    def info(self):
        return "이름: ", super().getName(), " 학년: ", super().getGrade(), " 학번: ", Student20.gradeNum, self.zeroSet(), self.student




Kim = Student20()
Kim.info()

Lee = Student20()
Lee.info()