# 음식(추상클래스) 햄버거
from abc import ABC, abstractmethod

class Food (ABC):
    def __init__(self, name, set_num):
        self.name = name
        self.set_num = set_num

    @abstractmethod
    def info(self):
        pass

class SetMenu (Food):
    def __init__(self, drink):
        super().__init__(name=super().name, setNum=super().setNum)
        self.drink = drink
    def info(self):
        return "주문하신 ", super().name, "세트 ", super().setNum, "번 음료", self.drink, "나왔습니당"

    def choice(self):
        pass


BLT = Food("BLT",1)
# BMT = SetMenu("cider")
# print(BMT.info())
#
#
# class Subway (SetMenu):
#     def __init__(self):
#         super().__init__(name=super().name, setNum=super().setNum, drink=super().drink)
#     def info(self):
#         return "주문하신 ", super().name, "세트 ", super().setNum, "번 음료", super().drink, "나왔습니당"
#     def choice(self):
#         print("메롱")
#
#
#
#
#
#
#
#
# BLL = Subway()
# BTT = Subway("BLT",1, "cider")

