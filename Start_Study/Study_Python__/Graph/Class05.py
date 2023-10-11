import csv
import matplotlib.pyplot as plt
import matplotlib as mpl
import pandas as pd
import numpy as np
import calendar

mpl.rcParams["font.family"] = "Malgun Gothic"
mpl.rcParams["axes.unicode_minus"] = False


# data = [
#     [50, 40, 30, 20, 60, 70, 80, 90, 100, 110, 120, 130],
#     [60, 50, 40, 30, 80, 90, 100, 110, 120, 130, 140, 150]
# ]

# data2023 = pd.date_range(start="2023.01", end="2023.12", freq="M")
# print(data2023)
# index = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
# print(calendar.calendar(2023))
# print(calendar.month(2023, 8))
# print(calendar.weekday(2023,8,28), " << 0은 월요일")
# print(list(calendar.month_name)) # 첫칸은 빈칸
# print(list(calendar.month_name)[1:])
# print(list(calendar.month_abbr))
# print(list(calendar.month_abbr)[1:]) #약어


data = [
    [50, 40, 30, 20, 60, 70, 80, 90, 100, 110, 120, 130],
    [60, 50, 40, 30, 80, 90, 100, 110, 120, 130, 140, 150]
]

month_abbr = list(calendar.month_abbr)[1:]
# print(month_abbr)

# index_season = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]

n_data = len(month_abbr)
index = np.arange(n_data)
# plt.bar(index, data[0], tick_label=month_abbr)
# plt.show()

bwidth = 0.3
plt.bar(index, data[0], tick_label=month_abbr, color="b", align="edge", width=bwidth, label="2022")
plt.bar(index+bwidth, data[1], tick_label=month_abbr, color="y", align="edge", width=bwidth, label="2023")

plt.xticks(index+bwidth, month_abbr)
plt.legend()
plt.xlabel("월")
plt.ylabel("판매량")
plt.title("서초구 상점 물건 판매량")
plt.show()















