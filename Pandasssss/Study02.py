import pandas as pd
import numpy as np

# 1000명의 사람 데이터 만들기
# 이름: Person_1 ~ Person_1000
# 나이: 20 ~ 60 랜덤할당
# 도시: 어딘가에 랜덤할당

np.random.seed(0)
data = pd.DataFrame({
    "Name":["Person_" + str(i) for i in range(1,1001)],
    "Age": np.random.randint(20,60,1000),
    "City": np.random.choice(["New York", "Paris", "Berlin", "London", "Seoul", "Tokyo"], 1000)
})
print(data)

# 도시 별 평균나이 구하기
# 가장 사람이 많이 살고있는 도시 구하기
# 연봉 추가: $50,000 ~ 150,000 랜덤 할당
# 연봉 1등과 꼴등 출력

print("-------------도시 별 평균나이---------------")
# print("전체평균 >> ", data["Age"].mean())
# cityage = data[data["city"]["Age"].mean()]
# print(cityage)
group = data.groupby(["City"])["Age"].mean()
print(group)


print("-------------사람 많은 도시---------------")
citycnt = data["City"].value_counts()
print("전체 >> ", citycnt)
print()
many = citycnt.idxmax()
print("최대인구 >> ", many)
most_many = data["City"].value_counts().idxmax()
print("최대인구 >> ", most_many)


print("-------------연봉 열 추가---------------")
np.random.seed(0)
data["Income"] = np.random.randint(200,900,1000)
print(data)


print("-------------연봉 1등---------------")
rich = data.loc[data["Income"].idxmax()]
print(rich)
print(data.loc[data["Income"].idxmax()])


print("-------------연봉 꼴등---------------")
poor = data.loc[data["Income"].idxmin()]
print(poor)
print(data.loc[data["Income"].idxmin()])


print("-------------연봉 정렬---------------")
data_sort = data.sort_values('Income')
print(data_sort)
#정렬기준 맨앞 맨뒤
# print(data_sort.iloc[0])
# print(data_sort.iloc[len(data_sort-1)])
# print(data_sort.head(1))
# print(data_sort.tail(1))








# print("-------------그룹바이---------------")
# data = pd.DataFrame({
#     'City': ['Seoul', 'Seoul', 'Busan', 'Busan'],
#     'Fruit': ['Apple', 'Banana', 'Apple', 'Banana'],
#     'Quantity': [10, 15, 7, 12],
#     'Price': [1000, 2000, 1500, 2500]
# })
#
# group = data.groupby(["City", "Fruit"])["Quantity"].sum()
# print(group)