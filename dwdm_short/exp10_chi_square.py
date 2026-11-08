# Exp 10: Chi-square test
from scipy.stats import chi2_contingency

data = [[20, 30, 10],
        [15, 25, 20]]

chi, p, dof, exp = chi2_contingency(data)
print("Chi-square =", chi)
print("p-value =", p)

if p < 0.05:
    print("Dependent")
else:
    print("Independent")
