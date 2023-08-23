class Account: #계좌

    def __init__(self, amount):
        self._name = "Kim"
        self._accNum = "123-4567-89"
        self._amount = amount


    def set_amount(self, amount):
        self._amount += amount

    def get_amount(self):
        return self._amount

    def info(self):
        print()
        print("름름은행 ", self._name, "님의 계좌번호 :", self._accNum, " 잔액: ", self._amount, "원")

    def check_amount(self):
        print(" *", self._name, "님의 계좌잔액: ", self._amount, "원")


class AccountAtm(Account):  # 현금 입출금

    def __init__(self, amount):
        super().__init__(amount)

    def input_cash(self):
        howmuch = int(input("입금액: "))
        return super().set_amount(howmuch)


    def output_cash(self):
        howmuch = int(input("출금액: "))
        if howmuch > super().get_amount():
            print(" * 한도초과 *")
        elif howmuch > 50000:
            five = int(input("1. 5만원 최대출금 // 2. 5만원 출금 지정 // 3. 1만원권 최대출금  :  "))
            if five == 1:
                print("<5마넌권 최대 출금> 5만원권:", (howmuch//50000), "장, 1만원권:", int((howmuch%50000)/10000), "장")
            elif five == 2:
                x = int(input("몇장: "))
                print(f"<5만원권 {x}장> 5만원권: {x} 장, 1만원권: {int((howmuch-(x*50000))/10000)} 장")
            elif five == 3:
                print("<1마넌권 최대 출금> 1만원권:", int((howmuch/10000)), "장")
            else:
                print("다시입력해주숑")

        return super().set_amount(-howmuch)


# class AccountBank (Account): #예금이자


class AccountCredit(Account):  # 결제 한도
    def __init__(self, amount):
        super().__init__(amount)




#############################################################################

Kim = AccountAtm(1000000)
Kim.info()
print()



userInput = (int(input("1. 현금 입출금 // 2. 예금 // 3. 름름몰  :  ")))
if userInput == 1:
    inOrOut = (int(input("1. 입금 // 2. 출금  :  ")))
    if inOrOut == 1:
        Kim.input_cash()
    elif inOrOut == 2:
        Kim.output_cash()
    else:
        print("다시입력하숑")
    Kim.check_amount()

elif userInput == 2:
    print("예금")

elif userInput == 3:
    print("결제시스템")

else:
    print("다시입력하숑")