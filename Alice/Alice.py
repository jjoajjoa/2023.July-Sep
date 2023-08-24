# alice.txt 에서
# 1. 단어가 총 몇개 있는지: 2145
# 2. 어떤 단어가 있는지
# 3. 각 단어가 몇개씩 있는지


with open("alice.txt", "r") as f:
    contents = f.read()

# 구두점 제거
punctuations = """~!@#$%^&*()_+-=\|{}[]:";'<>?,./"""
for punctuation in punctuations:
    contents = contents.replace(punctuation, "")

# 문장 쪼개기
word_lil = contents.lower() #문장 소문자로 통일
word = word_lil.replace("\n", " ")
words = word.split(" ")
print(">>> ", words) #################################이거
print(" * 총 단어 갯수: ", len(words)) #최종아님
# words - '' = 2145 <<< '' 이거 어캐 뺌???

# 특정 단어 찾기
count = 0
for i in words: # 단어 하나씩 훑기
    if "alice" in i:
        count += 1
print(" * Alice: 총", count, "회 언급")

# 단어 종류
count = 0
lst = []
for i in words:
    if i not in lst:
        lst.append(i)
    else:
        pass
print(lst)
print(" * 단어 종류: ", len(lst), "개")

# 단어 종류 갯수
count = 0
dic = {}
for i in words: # 단어 하나씩 훑기
    try: #실행할코드
        dic[i] += 1 #dic에 이미 존재한다면 트라이문 실행 -> 벨류에 +1
    except: #예외가발생했을때
        dic[i] = 1 #dic에 없는 값이면 except가 실행 -> 그냥 1로 저장
print(dic)
print(" * 단어 종류: ", len(dic), "개")






