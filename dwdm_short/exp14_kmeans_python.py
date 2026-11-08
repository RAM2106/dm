# Exp 14: K-Means in Python
import numpy as np
from sklearn.cluster import KMeans

X = np.array([[1,1],[2,1],[4,3],[5,4],[6,5]])

model = KMeans(n_clusters=2, random_state=0)
model.fit(X)

print("Labels:", model.labels_)
print("Centroids:", model.cluster_centers_)
