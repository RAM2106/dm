# Exp 9: Apriori (frequent itemsets + association rules)
import pandas as pd
from mlxtend.frequent_patterns import apriori, association_rules

data = pd.DataFrame({
    'Milk':   [1, 1, 0, 1],
    'Bread':  [1, 1, 1, 0],
    'Butter': [0, 1, 1, 1]
}).astype(bool)

freq = apriori(data, min_support=0.5, use_colnames=True)
rules = association_rules(freq, metric="confidence", min_threshold=0.5)

print(freq)
print(rules)
