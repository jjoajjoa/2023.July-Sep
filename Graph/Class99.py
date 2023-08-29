import csv
import matplotlib.pyplot as plt
import matplotlib as mpl
import pandas as pd
import numpy as np

mpl.rcParams["font.family"] = "Malgun Gothic"
mpl.rcParams["axes.unicode_minus"] = False



def read_csv_file(file_path):
    data = []
    with open(file_path, mode='r', encoding='utf-8') as file:
        reader = csv.reader(file)
        next(reader)  # 헤더 건너뛰기

        for row in reader:
            name, age, gender, address = row
            if age.isdigit():  # age가 숫자인지 확인
                data.append((int(age), gender, address))

    return data



def create_scatter_plot(data):
    addresses = sorted(set(address for _, _, address in data))
    addresses_xcoord = {}
    for idx, address in enumerate(addresses):
        addresses_xcoord[address] = 50 + (idx * 100)
        # print(addresses_xcoord[address])

    coord_lst = [(addresses_xcoord[address], age, 'blue' if gender == '남성' else 'red')
                 for age, gender, address in data]

    x_coord_lst, y_coord_lst, colors = zip(*coord_lst)

    x_label = ["강남대로", "반포대로", "신반포로", "잠원로"]
    x_position = [20000, 40000, 60000, 80000]
    plt.xticks(x_position, x_label,rotation=45)


    plt.scatter(x_coord_lst, y_coord_lst, color = colors, alpha=0.5) # 알파:투명도(0~1)
    plt.xlabel('주소')
    plt.ylabel('나이')
    plt.title('서초구 주민 인구 - 나이, 성별, 주소')

file_path = 'seocho_people.csv'
data_set = read_csv_file(file_path)

create_scatter_plot(data_set)
plt.show()




