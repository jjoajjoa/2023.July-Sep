from abc import *
from abc import ABC, abstractmethod

class Animal(metaclass=ABCMeta):
    @abstractmethod
    def eat(self):
        pass

class Dog(ABC, Animal):
    @abstractmethod
    def walk(self):
        pass

    def eat(self):
        print("냠냠")

class Buchu(Dog):
    def walk(self):
        print("챱챱")

buchu = Buchu()
buchu.walk() #챱챱
buchu.eat() #냠냠