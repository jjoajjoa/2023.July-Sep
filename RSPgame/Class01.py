# 가위바위보 게임
# 총 게임횟수/ 승리횟수 -> 다시 실행해도 유지되도록
import pickle
import random

count = 0
win_user = 0
lst = []

def randcom():
    comp = random.randrange(1, 4)
    return comp

def game():
    global count
    global win_user

    user = int(input("USER : "))
    com = randcom()

    if user == 1:
        if com == 1:
            print("COMP :", com)
            count += 1
        elif com == 2:
            print("COMP :", com)
            count += 1
        elif com == 3:
            print("COMP :", com)
            print("USER 승 ↑")
            win_user += 1
            count += 1

    if user == 2:
        if com == 1:
            print("COMP :", com)
            print("USER 승 ↑")
            win_user += 1
            count += 1
        elif com == 2:
            print("COMP :", com)
            count += 1
        elif com == 3:
            print("COMP :", com)
            count += 1

    if user == 3:
        if com == 1:
            print("COMP :", com)
            count += 1
        elif com == 2:
            print("COMP :", com)
            print("USER 승 ↑")
            win_user += 1
            count += 1
        elif com == 3:
            print("COMP :", com)
            count += 1

    if user > 3:

        print("<게임종료>  전체: ", count, "  승리: ", win_user)

        res = read_game()  # <- n m
        lst = res.split(" ")
        return lst
        write_game()

        count = 0
        win_user = 0





def write_game():
    print(lst)
    with open("recordList.txt", "w") as file:
        file.write("0 0")
        file.write(str(count+lst[0]) + " " + str(win_user+lst[1]))
    print(" * 저장완료")
    print("<전체 게임 정보>  전체: ", count, "  승리: ", win_user)

def read_game():
    with open("recordList.txt", "r") as file:
        data = file.read()
    return data


print(" * 가위바위보 게임 *")
print("1.가위//2.바위//3.보")
print()

while True:

    game()
