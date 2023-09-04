# 가위바위보 게임
# 총 게임횟수/ 승리횟수 -> 다시 실행해도 유지되도록
import pickle
import random
count = 0
win_user = 0

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
            print("↑ USER 승 ↑")
            win_user += 1
            count += 1

    if user == 2:
        if com == 1:
            print("COMP :", com)
            print("↑ USER 승 ↑")
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
            print("↑ USER 승 ↑")
            win_user += 1
            count += 1
        elif com == 3:
            print("COMP :", com)
            count += 1

    if user > 3:
        print("<게임종료>  전체: ", count, "  승리: ", win_user)
        toto = {"total":count, "win_user":win_user}




        with open("record.pickle", "wb") as file:
            pickle.dump(toto, file)
        print("<게임 정보 저장>")



        with open("record.pickle", "rb") as file:
            data = pickle.load(file)


        print(data["total"])
        a = data["total"]
        b = data["win_user"]
        print("<전체 게임 정보>  전체: ", count + int(a), "  승리: ", win_user + int(b))

        count = 0
        win_user = 0





###################################################

print(" * 가위바위보 게임 *")
print("1.가위//2.바위//3.보")
while True:
    game()


