a = [1,2,3,4,5,6,7,8,9,10]
def f(x):
    if x%2 ==0 :
        return 0
    else:
        return x
print(list(map(f, a)))


a = [1,2,3,4,5,6,7,8,9,10]
print(list(map(lambda x: 0 if x%2 ==0 else x, a)))


a = [1,2,3,4,5,6,7,8,9,10]
print(list(map(lambda x: 0 if x%2 ==0 else 1 if x%3 ==0 else 2, a)))
#[2, 0, 1, 0, 2, 0, 2, 0, 1, 0]