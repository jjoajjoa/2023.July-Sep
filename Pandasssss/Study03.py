import numpy as np
import pandas as pd

# 사람 1000명의 데이터 만들기


# 1번 데이터 셋
# ID: ID_1 ~ ID_1000
# 나이: 20 ~ 60
# 도시: 누역 파리 베를린 런던 서울 도쿄
print("-------------1번 세트---------------")
np.random.seed(0)
data1 = pd.DataFrame({
    "ID": ["ID_" + str(i) for i in range(1,1001)],
    "Age": np.random.randint(20,60,1000),
    "City": np.random.choice(["New York", "Paris", "Berlin", "London", "Seoul", "Tokyo"], 1000)
})
print(data1)
# 2번 데이터 셋
# ID: ID_1 ~ ID_1000
# 연봉: 랜덤할당
print("-------------2번 세트---------------")
data2 = pd.DataFrame({
    "ID": ["ID_" + str(i) for i in range(1,1001)],
    "Income": np.random.randint(200,900,1000),
})
print(data2)
# 3번 데이터 셋
# 도시: 누역 파리 베를린 런던 서울 도쿄
# 나라: 유에스 프랑스 독일 영국 한국 일본
print("-------------2번 세트---------------")
data2 = pd.DataFrame({
    "City": np.random.choice(["New York", "Paris", "Berlin", "London", "Seoul", "Tokyo"], 1000)
    "Country": ["USA","France","Germany","UK","Korea","Japan"]
})
print(data2)











# 1. 1번 데이터셋과 2번 데이터셋 병합 (ID기준)
print("-------------1 2번 병합---------------")
data12 = pd.merge(data1, data2, on="ID")
print(data12)

# 2. 병합된 데이터에 City기준으로 병합
# print("-------------12 3번 병합---------------")
# data123 = pd.merge(data12, data3, on="City")
# print(data123)

# 3. 각 나라별 평균 연봉
# 4. 제일 연봉이 높은 사람은 어디 사람인지 출력




























