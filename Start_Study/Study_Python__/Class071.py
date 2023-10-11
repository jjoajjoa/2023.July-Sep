# 음식(추상클래스) 햄버거
from abc import ABC, abstractmethod

class Food (ABC):
    def __init__(self, name, num):
        self.name = name
        self.num = num

    # @abstractmethod
    def cook(self):
        pass


class Setmenu (Food) :
    def __init__(self):
        super().__init__(name=super().name, num=super().num)

    def cook(self):
        return super().name, super().num


abc = Food("abc", 4)
abcd = Setmenu()

print(abcd.cook())