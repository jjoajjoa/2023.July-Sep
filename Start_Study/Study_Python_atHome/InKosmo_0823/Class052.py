class Person:
    def __init__(self, name, age):
        self._name = name
        self._age = age

    def getName(self):
        return self._name

    def getAge(self):
        return self._age

    def sayHello(self):
        print("안녕, 나는 ", self._age, "살 ",self._name)


class Dog:
    def __init__(self, name, age):
        self._name = name
        self._age = age

    def sayHello(self):
        print("안녕, 나는 ", self._age, "살 ", self._name)

    def ageCalc(self):
        print("사람 나이로는 ", 24 + (self._age-2) *4, "살" )

    def compareToAge(self, person):
        if ( 24 + (self._age-2) *4 > person.getAge() ):
            print(person.getName(), "보다 ", (24 + (self._age-2) *4 - person.getAge()), "살 더 많어")
        else:
            print(person.getName(), "보다 ", (person.getAge() - 24 + (self._age-2) *4), "살 더 적어")



Buchu = Dog("부추", 8)
Kim = Person("Kim", 26)

Kim.sayHello()
Buchu.sayHello()
Buchu.ageCalc()

Buchu.compareToAge(Kim)