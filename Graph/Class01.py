import matplotlib.pyplot as plt
import numpy as np

# 데이터 생성
x = np.linspace(0,10,100)
y = np.sin(x)

# 선그래프 생성
plt.plot(x, y)

# 그래프 꾸미기
plt.title("Sine Graph")
plt.xlabel("Time")
plt.ylabel("Sine of Time")

# 그래프 출력
plt.show()
