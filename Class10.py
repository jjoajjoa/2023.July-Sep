def outer(x):
    def inner(y):
        return x+y
    return inner

a = outer(5)
result = a(3)
print(result) #8