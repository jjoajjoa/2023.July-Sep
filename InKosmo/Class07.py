# 음식(추상클래스) 햄버거, 피자, 김밥
from abc import *
from abc import ABC, abstractmethod

class Food (metaclass=ABCMeta):
    def __init__(self, name, setNum):
        self.name = name
        self.setNum = setNum
    @abstractmethod
    def info(self):
        pass

class SetMenu (ABC, Food):
    def __init__(self, drink):
        super().__init__()
        self.drink = drink
    def info(self):
        print("메롱")
    @abstractmethod
    def choice(self):
        pass
    
class Hamburger (Food, SetMenu):
    def __init__(self):
        super().__init__()
    def info(self):
        print("햄최몇")
    def choice(self):
        print("메롱")


asdf = Food("창녕마늘버거",1)
