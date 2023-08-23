from Account.Account import Account
class AccountAtm (Account): #현금 입출금

    def __init__(self, amount):
        super().__init__(amount)


    def input_cash(self):
        howmuch = int(input("얼마입금: "))
        super().set_amount(howmuch)
    

    def output_cash(self):
        super().set_amount()


