import csv
import matplotlib.pyplot as plt
import matplotlib as mpl
import pandas as pd
import numpy as np

mpl.rcParams["font.family"] = "Malgun Gothic"
mpl.rcParams["axes.unicode_minus"] = False

# df = pd.read_csv("seocho_people.csv")
# print(df)

def read_csv_file(file_path):
    data = []
    with open(file_path, mode="r", encoding="utf-8") as file:
        reader = csv.reader(file)
        next(reader) # 헤더 건너뛰기

        for row in reader:
            name, age, gender, address = row
            data.append((int(age), gender, address))

    return data

def create_scatter_plot(data):

    coordinates_lst= [(age, 0 if gender == "남성" else 1) for age, gender, _ in data]
    x_coords_ldt, y_coords_lst = zip(*coordinates_lst)

    plt.scatter(x_coords_ldt, y_coords_lst, c = y_coords_lst, cmap=plt.get_cmap("bwr"))

    plt.yticks([0,1],["남성", "여성"])
    plt.xlabel("나이")
    plt.title("서초구 사람들")


def compare_age(data):
    male_lst = [age for age, gender, _ in data if gender == "남성"]
    female_lst = [age for age, gender, _ in data if gender == "여성"]

    average_male = sum(male_lst)/ len(male_lst)
    average_female = sum(female_lst)/ len(female_lst)
    print(f"남성 평균 나이: {average_male: .2f}")
    print(f"여성 평균 나이: {average_female: .2f}")




data_set = read_csv_file("seocho_people.csv")

create_scatter_plot(data_set)

plt.colorbar(label="Gender")
plt.show()
compare_age()







# print("서초사람들 요약 >>> ", read_csv_file("seocho_people.csv"))
# lst_man = []
# lst_woman = []
# # 1. 나이와 성별에 따른 산점도 그래프 그리기
# # 2. 성별 평균 나이 구하기
#
# # 그래프 그리기
#
# for i in read_csv_file("seocho_people.csv"):
#     if i[1] == "남성":
#         lst_man.append(i[0])
#     else:
#         lst_man.append(np.nan)
#
# for i in read_csv_file("seocho_people.csv"):
#     if i[1] == "여성":
#         lst_woman.append(i[0])
#     else:
#         lst_woman.append(np.nan)
#
# total = [i*0 for i in range(len(read_csv_file("seocho_people.csv")))]
#
# print(len(lst_man))
# print(len(lst_woman))
# print(total)
#
# plt.ylim("man", "woman")
# plt.title("seocho people")
#
# # plt.scatter(lst_man,total, lst_woman,total)
# plt.scatter(lst_man, total,10,"b")
# # plt.scatter(lst_woman, total,15,"r")
#
# # plt.plot(total,lst_man, total,lst_woman)
# plt.show()


















