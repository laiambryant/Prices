import matplotlib.pyplot as plt
import csv

P_x = list(range(0,10))
P_y = []

Q_x = []
Q_y = list(range(0,10))

with open("data.csv", "r") as csvfile:
	plots = csv.reader(csvfile, delimiter=',')
	next(plots)
	print("Fetched data... passing to array")
	for i in plots:
		P_y.append(float(i[0]))
		Q_x.append(float(i[1]))
		
print("Exited Fetch...")

plt.plot(P_x,P_y)
plt.plot(Q_x, Q_y)
plt.xlabel("Q")
plt.ylabel("P")

plt.show()