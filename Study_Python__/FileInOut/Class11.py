file = open("example.txt", "w")
file.write("하이 파이썬 \n 파일 입출력")
file.close()


file = open("example.txt", "r")
res = file.read()
# print(res) #하이 파이썬 파일 입출력
for i in res:
    if i == " ":
        print()
file.close()


with open("example.txt", "r") as file:
    res = file.read()
    print(res) #하이 파이썬 파일 입출력


# 다이어리 프로그램 : 날짜입력 일기작성 -> 작성날짜 입력하면 그날일기 출력