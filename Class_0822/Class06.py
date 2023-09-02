from abc import ABC, abstractmethod


class Food(ABC):
    def __init__(self, name, price):
        self.name = name
        self.price = price

    @abstractmethod
    def cook(self):
        pass


class Pizza(Food):
    def __init__(self, name, price, topping, crust):
        super().__init__(name, price)
        self._topping = []
        if (type(self._topping) == list):
            self._topping += topping
        else:
            self._topping.append(topping)
        self._crust = crust

    def cook(self):
        print(
            "{}에서 피자가 나왔습니다. 토핑은 {}이고, 크러스트는 {}입니다. 가격은 {}입니다.".format(self.name, ','.join(self._topping), self._crust, self.price))

    def addTopping(self, topping):
        self._topping.append(topping)


p = Pizza("피자", 100, ["페페로니", "올리브"], "치즈")
p.addTopping("포테이토")

p.cook()
