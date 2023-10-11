def log_decorator(func):
    def wrapper(*args, **kwargs):
        print(func.__name__, "함수 실행 전")
        result = func(*args, **kwargs)
        print(func.__name__, "함수 실행 후")
        return result
    return wrapper

@log_decorator
def function():
    print("데코레이터 함수 실행")

function()
# 결과:
# function 함수 실행 전
# 데코레이터 함수 실행
# function 함수 실행 후

