import calendar





print(calendar.calendar(2023))
print(calendar.month(2023, 8))
print(calendar.weekday(2023,8,28), " << 0부터 월요일")
print(calendar.weekday(2023,8,30), " << 2니까 수요일")
print()
print(list(calendar.month_name)) # 첫칸은 빈칸
print()
print(list(calendar.month_name)[1:])
print()
print(list(calendar.month_abbr))
print()
print(list(calendar.month_abbr)[1:]) #약어











