import pickle


def select():
    menu = int(input("1.입력 // 2.조회 // 3.삭제 // 4.종료 : "))
    if menu == 1:
        write_input()

    elif menu == 2:
        read_list()

    elif menu == 3: #삭제
        int(input("삭제번호: "))

    elif menu == 4: #종료
        print("시스템 종료할게용")

    else:
        print("다시 입력해주셍")


lst = []
bin = []
def write_input():

    inputName = input("이름: ")
    inputMath = int(input("수학: "))
    inputEnglish = int(input("영어: "))
    score_data = {"name": inputName, "math": inputMath, "english": inputEnglish}


    with open("scoreData.p", "wb") as f:
        pickle.dump(score_data, f)





def read_list():
    with open("scoreData.p", "rb") as f:
        print(" *전체학생조회*")
        check = pickle.load(f)
    print("이름:", check["name"], " 수학:", check["math"], " 영어:", check["english"])


print(" * 성적 관리 프로그램 *")
while True:
    select()

