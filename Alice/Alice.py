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
word_lil = contents.lower()
word = word_lil.replace("\n", " ")
words = word.split(" ")
print(words)
print(" * 총 단어 갯수: ", len(words)) #최종아님

# 특정 단어 찾기
count = 0
for i in words:
    if "alice" in i:
        count += 1
print(" * Alice: 총",count, "회 언급")

# 단어 종류
count = 0
lst = []
# a = [i for i in range(len(words))]
for i in words:
    if

    else:






