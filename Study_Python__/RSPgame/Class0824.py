import random

def play():
    user = int(input("1. 가위, 2. 바위, 3. 보를 입력하세요 : "))
    com = random.randrange(1,4)
    total, win = read_game().split(",")


    print()
    if user == com:
        print("무승부")

    if user == 1:
        if com == 2:
            print("패배")
        elif com == 3:
            print("승리")
            win += 1

    if user == 2:
        if com == 1:
            print("승리")
            win += 1
        elif com == 3:
            print("패배")

    if user == 3:
        if com == 1:
            print("패배")
        elif com == 2:
            print("승리")
            win += 1

    write_game(total+1, win)



def write_game(total, win):
    with open("game.txt", "w") as f:
        f.write(str(total)+ ","+ str(win))

def read_game():
    with open("game.txt", "r") as f:
        contents = f.read()

while True:
    play()