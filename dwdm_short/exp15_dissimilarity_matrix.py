# Exp 15: Dissimilarity matrix (4 instances, 2 attributes)
import numpy as np
from scipy.spatial.distance import pdist, squareform

data = np.array([[1, 2],
                 [3, 4],
                 [5, 6],
                 [2, 8]])

matrix = squareform(pdist(data, 'euclidean'))
print("Dissimilarity matrix:")
print(matrix.round(2))
