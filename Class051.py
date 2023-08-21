class Porsche:
    count = 0
    def __init__(self, name, displace, productYear):
        self._name = name
        self._displace = displace #배기량
        self._productYear = productYear
        Porsche.count += 1
    def getName(self, name):
        return name
    def setName(self, name):
        self._name = name

    def checkDis(self):
        if self._displace > 3000:
            print("대형")
        elif self._displace < 1000:
            print("소형")
        else:
            print("중형")

    @classmethod
    def cntCar(cls):
        print(cls.count)




Taycan = Porsche("Taycan", 100, 2022)
Cayenne = Porsche("Cayenne", 3996, 2024)
Boxster = Porsche("Boxster", 2497, 2019)

Taycan.checkDis()
Cayenne.checkDis()
Boxster.checkDis()

Porsche.cntCar()
