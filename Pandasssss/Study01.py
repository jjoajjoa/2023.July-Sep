import numpy as np
import pandas as pd

# 1. 도시 기준으로 정렬
# 2. 평균나이 구하기
# 3. 이름이 Peter인 사람의 나이 출력
# 4. 가장 나이가 많은 사람의 이름, 살고있는 도시 출력
# 5. 모든 사람의 이름을 대문자로 변경
# 6. 나이가 30 이상인 사람들만 뽑기
# 7. 각 도시별로 몇명 살고있는지 계산
# 8. Gender라는 새로운 열 추가
data = {
    "Name":["John", "Anna", "Peter", "Linda"],
    "Age":[28,24,35,32],
    "City":["New York", "Paris", "Berlin", "London"]
}

df = pd.DataFrame(data)
print(df)
# print(df.index)
# print(df.columns)
# print(df.values)
# print(df[1:3])
print("-----------도시기준------------")
dfc = df.sort_values("City")
print(dfc)
print("-----------나이기준------------")
dfa = df.sort_values("Age")
print(dfa)
print("-----------평균나이------------")
print(df["Age"].mean())
print("-----------피터 나이------------")
print(df[df["Name"]=="Peter"]["Age"].values)
print("-----------연장자 도시 이름------------")
oldman = df.loc[df["Age"].idxmax()]
print(oldman[["Name", "City"]])
print("-----------대문자------------")
df["Name"] = df["Name"].str.upper()
print(df)
print("-----------30살 이상------------")
oldman30 = df[df["Age"]>=30]
print(oldman30)
print("-----------도시인구------------")
citycnt = df["City"].value_counts()
print(citycnt)
print("-----------젠더추가------------")
np.random.seed(0)
df["Gender"] = np.random.choice(["Male", "Female"], size=df.shape[0])
print(df)





