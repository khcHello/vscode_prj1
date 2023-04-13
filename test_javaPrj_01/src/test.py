

class test():
    def __init__(self) -> None:
        
        name = "Paul"
        age = 23
        height = 175.324
        # str.format 예시
        introduction = "My name is {}. My age is {}. My height is {:.1f}".format(name, age, height)
        print(introduction)

        # f-string 예시
        introduction = f"My name is {name}. My age is {age}. My height is {height:.2f}"
        print(introduction)

        print(introduction)


test()
