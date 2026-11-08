# Exp 11: Naive Bayes classification
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB
from sklearn.metrics import accuracy_score

iris = load_iris()
X = iris.data
y = iris.target

X1, X2, y1, y2 = train_test_split(X, y, test_size=0.2, random_state=9)

model = GaussianNB()
model.fit(X1, y1)
pred = model.predict(X2)

print("Accuracy =", accuracy_score(y2, pred))
