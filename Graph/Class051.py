import matplotlib.pyplot as plt
import matplotlib as mpl
import numpy as np
import calendar


# 한글 세팅
mpl.rcParams["font.family"] = "Malgun Gothic"
mpl.rcParams["axes.unicode_minus"] = False


# 서초구 물품 판매량 비교 막대 그래프

# 판매량 자료
data = [
    [50, 40, 30, 20, 60, 70, 80, 90, 100, 110, 120, 130],
    [60, 50, 40, 30, 80, 90, 100, 110, 120, 130, 140, 150],
    [50, 40, 30, 20, 60, 70, 80, 90, 100, 110, 120, 130]
]
# 월 명 약어
month_abbr = list(calendar.month_abbr)[1:]

# 그래프 세팅
n_data = len(month_abbr)
index = np.arange(n_data)

bwidth = 0.3
plt.bar(index, data[0], tick_label=month_abbr, color="b", align="edge", width=bwidth, label="2022")
plt.bar(index + bwidth, data[1], tick_label=month_abbr, color="y", align="edge", width=bwidth, label="2023")
plt.bar(index + bwidth*2, data[1], tick_label=month_abbr, color="m", align="edge", width=bwidth, label="2024")

# 그래프 그리기
plt.xticks(index + bwidth, month_abbr)
plt.legend()
plt.xlabel("월")
plt.ylabel("판매량")
plt.title("서초구 상점 물건 판매량")
plt.show()
