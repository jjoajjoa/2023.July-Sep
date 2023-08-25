import pandas as pd

# concat
df1 = pd.DataFrame({
    "A": ["A0", "A1"],
    "B": ["B0", "B1"]
})
df2 = pd.DataFrame({
    "A": ["A2", "A3"],
    "B": ["B2", "B3"]
})

row = pd.concat([df1,df2], ignore_index=True)
print(row)
print("------------------")
column = pd.concat([df1,df2], axis=1)
print(column)

print("-----------------------------------")
# merge
df1 = pd.DataFrame({
    "Name": ["kim","lee"],
    "Age": [10,20]
})
df2 = pd.DataFrame({
    "Name": ["kim","lee"],
    "City": ["seoul","busan"]
})
res = pd.merge(df1,df2, on="Name")
print(res)

print("-----------------------------------")
# join
df1 = pd.DataFrame({"A": ["A0", "A1", "A2"]}, index=["I","J","K"])
df2 = pd.DataFrame({"B": ["B0", "B1", "B2"]}, index=["I","J","K"])
res = df1.join(df2)
print(res)

