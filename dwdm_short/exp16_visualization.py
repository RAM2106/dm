# Exp 16: Histogram, Box plot, Bar chart, Pie chart
import matplotlib.pyplot as plt

data = [10,20,30,20,40,30,50]
names = ["C","C++","Java","Python"]
count = [20,15,30,35]

plt.hist(data)
plt.show()

plt.boxplot(data)
plt.show()

plt.bar(names, count)
plt.show()

plt.pie(count, labels=names)
plt.show()
