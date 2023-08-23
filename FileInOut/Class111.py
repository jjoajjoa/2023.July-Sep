# 다이어리 프로그램 : 날짜입력 일기작성 -> 작성날짜 입력하면 그날일기 출력

def menu():
    print("1. 일기쓰기")
    print("2. 일기읽기")
    choice = int(input(" * 선택 택1 : "))

    if choice == 1:
        write_diary()
    elif choice == 2:
        read_diary()


def write_diary():
    date = input("날짜입력(yymmdd) : ")
    text = input("오늘하루어땠습니까 : ")

    with open(f"{date}.txt", "w") as f:
        f.write(text)

    print("저장완료")

def read_diary():
    view = input("날짜입력(yymmdd) : ")

    try:
        with open(f"{view}.txt", "r") as f:
            res = f.read()
        print(res)
    except FileNotFoundError:
        print("해당날짜는 없는디여")

while True:
    menu()