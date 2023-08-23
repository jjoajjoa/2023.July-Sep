class Account: #계좌

    def __init__(self, amount):
        self._name = "Kim"
        self._accNum = "123-4567-89"
        self._amount = amount

    def get_amount(self):
        return self._amount
    def set_amount(self, amount):
        self._amount += amount

    def info(self):
        print(self._name, "님의 계좌번호 :", self._accNum, " 잔액: ", self._amount, "원")

    def check_amount(self):
        print(" *", self._name, "님의 계좌잔액: ", self._amount, "원")


class AccountAtm(Account):  # 현금 입출금

    def __init__(self, amount):
        super().__init__(amount)

    def input_cash(self):
        howmuch = int(input("얼마: "))
        super().set_amount(howmuch)

    # def output_cash(self):
    #     super().set_amount()



#############################################################################

Kim = Account(1000000)
Kim.info()
print()





userInput = (int(input("1. 현금 입출금 // 2. 예금 // 3. 름름몰  :  ")))
if userInput == 1:
    inOrOut = (int(input("1. 입금 // 2. 출금  :  ")))
    if inOrOut == 1:
        AccountAtm.input_cash(Kim.get_amount())
        Kim.check_amount()
    elif inOrOut == 2:
        print("현금출금")
    else:
        print("다시입력하숑")
    Kim.check_amount()

elif userInput == 2:
    print("예금")

elif userInput == 3:
    print("결제시스템")

else:
    print("다시입력하숑")