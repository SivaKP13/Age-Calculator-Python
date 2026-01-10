print("Hello user, this is a code that can calculate the age of any person at any give month.")
BirthYear = int(input("Alright, let's begin. What is the year of birth? (Please enter a number): "))
Year = int(input("Awesome, now let's calculate the current age. What year is it as of today? (Please enter a number): "))
Age = str(Year - BirthYear)
print("This year, this person will turn " + Age + ".")
Decision = str(raw_input("Would you like to know how many months will pass until or have passed since this person's birthday? (Y/N): "))
if Decision == "Y" or Decision == "y":
  BirthMonth = int(input("Great! What is the month of birth? (Please enter a number, Jan. is 1 and Dec. is 12): "))
  MonthN = int(input("Alright, what month is it? (Please enter a number, Jan. is 1 and Dec. is 12): "))
  if MonthN == BirthMonth:
    print("This individual is turning " + Age + " this month! Wish him/her a great birthday!")
  elif MonthN <= BirthMonth:
    MonthN2 = BirthMonth - MonthN
    print("This individual is " + str(MonthN2) + " months away from turning " + Age + ".")
  else:
    MonthN2 = MonthN - BirthMonth
    MonthN3 = 12 - MonthN2
    print("It has been " + str(MonthN2) + " months since this individual has turned " + Age + " and his/her next birthday will be in " + str(MonthN3) + " months.")
  print("The age is now calculated. Have a good day!")
if Decision == "N" or Decision == "n":
  print("Alright then, have a good day!")