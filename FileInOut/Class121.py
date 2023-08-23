# 가위바위보 게임
# 총 게임횟수/ 승리횟수 -> 다시 실행해도 유지되도록
import random

def game():
    # count = 0
    win_user = 0
    user1 = int(input("USER1 : "))
    user2 = int(input("USER2 : "))

    while user1 < 4:
        if user1 == 1:
            if user2 == 1:
                print("무승부")
            elif user2 == 2:
                print("패배")
            elif user2 == 3:
                print("승리")
                win_user += 1

        if user1 == 2:
            if user2 == 1:
                print("승리")
                win_user += 1
            elif user2 == 2:
                print("무승부")
            elif user2 == 3:
                print("패배")


        if user1 == 3:
            if user2 == 1:
                print("패배")
            elif user2 == 2:
                print("승리")
                win_user += 1
            elif user2 == 3:
                print("무승부")






# def write_game():

# def read_game():


print(" * 가위바위보 게임 *")
print("1.가위//2.바위//3.보")
while True:
    game()