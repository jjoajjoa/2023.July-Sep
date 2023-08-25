import numpy as np
import pandas as pd


# 시리즈
s = pd.Series([1,3,4, np.nan ,6,8])
print(s)
print(s[3])

s = pd.Series([1,3,4, np.nan ,6,8], index=["A","B","C","D","E","F"])
print(s)
print(s["C"])
print("-----------------------")


# 데이터프레임
data = {
    "Name":["짱구","철수","맹구"],
    "Age":[5,6,7]
}
df = pd.DataFrame(data)
print(df)
print("-----------------------")
print(df["Name"])
print("-----------------------")
print(df.loc[0]) #이름
print("-----------------------")
print(df.iloc[0]) #위치
print("-----------------------")



print("-----------------------")
print("-----------------------")


s1 = pd.Series([10,20,30,40,50])
print(s1)
print(s1.index)
print(s1.values)

s2 = pd.Series(["a","b","c",1,2,3])
print(s2)


date = ["2023-01-01", "2023-06-15", "2023-08-25", "2023-10.06"]
s4 = pd.Series([200,180,np.nan,210], index=date)
print(s4)

s5 = pd.Series({"2023":200, "2022":180, "2021":210})
print(s5)


s5 = pd.date_range(start="2023-08-15", end="2023-08-26")
print(s5)

s5 = pd.date_range(start="2023/08/15", end="2023.08.26")
print(s5)

s5 = pd.date_range(start="15.08.2020", end="26.08.2020")
print(s5)

s5 = pd.date_range(start="15.08.2020", end="2020.08.26")
print(s5)

s5 = pd.date_range(start="15.08.2023", periods= 4)
print(s5)

s5 = pd.date_range(start="15.08.2023", periods= 6, freq="2B")
print(s5)

s5 = pd.date_range(start="15.08.2023 09:30", periods= 6, freq="H")
print(s5)

s5 = pd.date_range(start="15.08.2023 09:30", periods= 6, freq="30min")
print(s5)


date = pd.date_range(start="2023.08.21", periods=5)
s4 = pd.Series([200,32,np.nan,210,123], index=date)
print(s4)


print("-----------------------")
print("-----------------------")


p1 =pd.DataFrame([[1,2,3],[4,5,6],[7,8,9]])
print(p1)

date_list = np.array([[1,2,3],[4,5,6],[7,8,9]])
print(pd.DataFrame(date_list))

# date = pd.date_range("2023-08-25", periods=3)
# column = ["A", "B", "C"]
# print(pd.DataFrame(date, index=date, columns=column))


# s1 = pd.Series
# s2 = pd.Series
# print(s1+s2)
# print(s1*s2)
print("-----------------------")
data1 = {"A":[1,2,3], "B":[4,5,6], "C":[7,8,9]}
data2 = {"B":[1,2,3], "C":[4,5,6], "A":[7,8,9]}
d1 = pd.DataFrame(data1)
print(d1)
print("-----------------------")
d2 = pd.DataFrame(data2)
print(d2)
print("-----------------------")
print(d1+d2)
print("-----------------------")
print(d2-d1)
print("-----------------------")

# data = {
#     "봄":[123.1,546.2,546.1,421.5],
#     "여름":[332.5,864.2,751,682.6],
#     "가을":[465.6,395.7,263.5,123.6],
#     "겨울":[111,222,333,444]
# }
# column_ist = ["봄","여름","가을","겨울"]
# index_ist = [2020,2021,2022,2023,2024]
# df = pd.DataFrame(data, columns=column_ist, index=index_ist)
# print(df)

KTX_data = {'경부선 KTX': [39060, 39896, 42005, 43621, 41702, 41266, 32427],
            '호남선 KTX': [7313, 6967, 6873, 6626, 8675, 10622, 9228],
            '경전선 KTX': [3627, 4168, 4088, 4424, 4606, 4984, 5570],
            '전라선 KTX': [309, 1771, 1954, 2244, 3146, 3945, 5766],
            '동해선 KTX': [np.nan,np.nan, np.nan, np.nan, 2395, 3786, 6667]}
col_list = ['경부선 KTX','호남선 KTX','경전선 KTX','전라선 KTX','동해선 KTX']
index_list = ['2011', '2012', '2013', '2014', '2015', '2016', '2017']

df_KTX = pd.DataFrame(KTX_data, columns = col_list, index = index_list)
print(df_KTX)
print(df_KTX.index)
print(df_KTX.values)
print(df_KTX.columns)
print(df_KTX.head())
print(df_KTX.tail())
print(df_KTX.head(3))
print(df_KTX[2:4])
print(df_KTX.loc["2012"])
print(df_KTX.loc["2012":"2016"])
print(df_KTX.loc["2015"]["경부선 KTX"])
df = df_KTX.sort_values("호남선 KTX")
print(df)
# print(df.loc["2015"])
# print(df.loc[df["2015"].idxmax()])

print("-----------------------")
print("-----------------------")
print("-----------------------")


# 1. 도시 기준으로 정렬
# 2. 평균나이 구하기
# 3. 이름이 Peter인 사람의 나이 출력
# 4. 가장 나이가 많은 사람의 이름, 살고있는 도시 출력
data = {
    "Name":["John", "Anna", "Peter", "Linda"],
    "Age":[28,24,35,32],
    "City":["New York", "Paris", "Berlin", "London"]
}
col_list = ["Name", "Age", "City"]
index_list = [0,1,2,3]
df = pd.DataFrame(data, columns = col_list, index= index_list)
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
# print(df.mean(axis=1))
print("-----------------------")
# print(df.loc["Name"=="Peter"]["Age"])
print("-----------------------")
print(df.values[0])




