import pickle

def select():

    menu = int(input("1.입력 // 2.조회 // 3.삭제 // 4.종료 : "))
    if menu == 1:
        inputName = input("이름: ")
        inputMath = int(input("수학: "))
        inputEnglish = int(input("영어: "))
        write_input(inputName, inputMath, inputEnglish)

    elif menu == 2:
        print(read_list())


    elif menu == 3: #삭제
        del_num = int(input("삭제번호: "))
        del_list()
        int(input("삭제완룡"))

    elif menu == 0: #종료
        print("종료")
        return -1
    return 0

    else:
        print("다시 입력해주셍")



def write_input(inputName, inputMath, inputEnglish):
    lst = []
    score_data = {"name": inputName, "math": inputMath, "english": inputEnglish}

    with open("scoreData.p", "rb") as f:
        item = pickle.load(f)

    if item != "":
        if type(item) == dict:
          lst.append(item)
        elif type(item) == list:
          lst += item

    lst.append(score_data)
    with open("scoreData.p", "wb") as f:
        pickle.dump(lst, f)



def read_list():
    print(" *전체학생조회*")
    with open("scoreData.p", "rb") as f:
        check = pickle.load(f)
    for i in range(len(check)):
        print(f"[{i}] 이름: {check[i]["name"]}, 수학: {check[i]["math"]}, 영어: {check[i]["english"]}")



def del_list(delete):
    with open("scoreData.p", "rb") as f:
        check = pickle.load(f)

    if delete < 0 or delete >= len(check):




#####################################################################
print(" * 성적 관리 프로그램 *")
while True:
    if select() == -1:
        break

