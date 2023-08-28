import pandas as pd
import numpy as np

data = {
    'Name':['John', 'Anna', 'Peter', 'Linda'],
    'Age':[28,24,35,32],
    'City':['New York', "Paris", "Berlin", "London"]
}

# 1. 도시 기준으로 정렬
# 2. 평균 나이 구하기
# 3. 이름이 Peter인 사람의 나이 출력
# 4. 가장 나이가 많은 사람이 살고 있는 이름, 도시 출력해보기
df = pd.DataFrame(data)
df = df.sort_values('City')
print(df)
print(df['Age'].mean())
print(df[df['Name']=='Peter']['Age'].values)
oldest = df.loc[df['Age'].idxmax()]
print(oldest[['Name','City']])

# 모든 사람의 이름을 대문자로 변경하기
df['Name'] = df['Name'].str.upper()
print(df)
# 나이가 30 이상인 사람들만 선택하기
older_than_30 = df[df['Age']>=30]
print(older_than_30)

# 각 도시별로 몇명이 살고 있는지 계산하기
city_counts = df['City'].value_counts()
print(city_counts)

# Gender라는 새로운 열을 추가해서 임의 성별 할당하기
np.random.seed(0)
df['Gender'] = np.random.choice(['Male', 'Female'], size=df.shape[0])
print(df)