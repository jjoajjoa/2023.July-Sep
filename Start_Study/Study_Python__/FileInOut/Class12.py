import pickle

data = {"no":1, "title":"제목", "contents":"내용"} #딕셔너리 형태
print(data)
print(data["no"])

with open("data.p", "wb") as f:
    pickle.dump(data, f)

d = dict()
with open("data.p", "rb") as f:
    d = pickle.load(f)
print(d)