# class Dog:
#     def __init__(self, name, color):
#         self.hungry = 0
#         self.name = name
#         self.color = color
#
#     def eat(self):
#         self.hungry -= 10
#         print("밥먹음", self.hungry)
#
#     def walk(self):
#         self.hungry += 10
#         print("산책", self.hungry)
#
#
# choco = Dog("choco", "black")
# jjong = Dog("jjong", "white")
#
# choco.eat()
# choco.eat()
# choco.walk()
# print(choco.hungry)
# print(jjong.hungry)



#####################################################
# 계산기 클래스
#변수 2개, +-/* 연산
# class calc:
#     def __init__(self, num1, num2, expression):
#         self.num1 = num1
#         self.num2 = num2
#         self.expression = expression
#
#     def sum(self):
#         self.expression = "+"
#         print(self.num1 , "+", self.num2, "=", (self.num1 + self.num2) )
#
#     def minus(self):
#         self.expression = "-"
#         print(self.num1, "-", self.num2, "=", (self.num1 - self.num2))
#
#     def Multi(self):
#         self.expression = "*"
#         print(self.num1, "*", self.num2, "=", (self.num1 * self.num2))
#
#     def division(self):
#         self.expression = "/"
#         print(self.num1, "/", self.num2, "=", (self.num1 / self.num2))
#
# exSum = calc(10,5,"+")
# exSum.sum()
# exMinus = calc(10,5,"-")
# exMinus.minus()
# exMulti = calc(10,5,"*")
# exMulti.Multi()
# exDivi = calc(10,5,"/")
# exDivi.division()

# 다른방법
class Calculator:
    def __init__(self):
        self._num1 = 0
        self._num2 = 0
        self._expression = ""

    def set_num1(self, num):
        self._num1 = num

    def set_num2(self, num):
        self._num2 = num

    def set_expression(self, exp):
        self._expression = exp

    def add(self):
        return self._num1 + self._num2

    def subtract(self):
        return self._num1 - self._num2

    def multiply(self):
        return self._num1 * self._num2

    def divide(self):
        if self._num2 == 0:
            return "error"
        return self._num1 / self._num2




