import matplotlib.pyplot as plt
import numpy as np

np.random.seed(100)
x = np.random.normal(0,1,50)
y = np.random.normal(0,1,50) #평균0, 표준편차1인 난수 50개

plt.scatter(x, y)

plt.xlabel("X")
plt.ylabel("Y")
plt.title("Scatter Ex")

plt.show()