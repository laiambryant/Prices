import matplotlib.pyplot as plt
import numpy as np

x,y = np.loadtxt("data.csv", delimiter = ',', unpack = True, skiprows = 1)

plt.plot(x,y)
plt.xlabel("Quantity")
plt.ylabel("Price")

plt.show()