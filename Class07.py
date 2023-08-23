# 음식(추상클래스) 햄버거
from abc import ABC, abstractmethod

class Food (ABC):
    @abstractmethod
    def toString(self):
        pass

class Subway (Food):
    def __init__(self, name, set_num, menu):
        self.name = name
        self.set_num = set_num
        self.menu = menu

    # def add_menu(self):

    # def toString(self):
    #     return "주문하신 "+ str(self.name)+ "세트 "+ str(self.set_num)+ "번 "+ str(self.menu[0]+self.menu[1])+ " 나왔습니당"

    def toString(self):
        return "주문하신 "+ str(self.name)+ "세트 "+ str(self.set_num)+ "번 "+ str(list(i for i in self.menu))+ " 나왔습니당"



blt = Subway("BMT", 1, ["cider","cookie"])
print(blt.toString())
# blt.add_menu("감튀")
# print(blt.toString())
























# class Subway (SetMenu):
#     def __init__(self):
#         super().__init__(name=super().name, set_num=super().set_num, menu=super().menu)
#     def toString(self):
#         return "주문하신 "+ str(super().name)+ "세트 "+ str(super().set_num)+ "번 "+ str(super().menu)+ "나왔습니당"
#     def choice(self):
#         print("메롱")


# blt = SetMenu("blt", 1, "cider")
# print(blt.toString())
# bmt = Subway()
# print(bmt.toString())

