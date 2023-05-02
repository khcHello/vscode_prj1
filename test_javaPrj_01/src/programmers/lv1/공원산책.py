


import re
class 공원산책:

    def __init__(self, park:list[str], routes:list[str]) -> None:

        # List.toString
        parkStr = ''.join(park)

        parkWidth = len(park[0])
        parkHeight = len(park)

        # None으로 채운 빈 방 + Generic 리스트 선언법
        parkRotated:list[str] = [None for _ in range(parkWidth)]
        
        for i in range(len(parkStr)):
            # 유사 삼항연산자 이용
            parkRotated[i%parkWidth] = parkStr[i] if parkRotated[i%parkWidth] is None else parkRotated[i%parkWidth] + parkStr[i]
        
        # String.charAt
        startIdx = parkStr.find('S')
        xStart = startIdx%parkWidth
        # 나누기 중 몫만 구하기(일반 나누기는 실수형)
        yStart = startIdx//parkWidth
        dog = Dog(xStart, yStart)

        for route in routes:

            # String replaceAll 정규식
            direction = re.sub('[0-9 ]', '', route)
            distance = int(re.sub('[^0-9]', '', route))

            # 값 비교 ==, 주소 비교 is
            if 'E' == direction:
 
                # 논리연산자(and, or), String subString indexOf
                if dog.x+distance > parkWidth-1 or park[dog.y][dog.x+1:dog.x+distance+1].find('X') > -1 :
                    continue

                dog.moveToEast(distance)

            elif 'W' == direction:
                
                if dog.x-distance < 0 or park[dog.y][dog.x-distance:dog.x].find('X') > -1:
                    continue
                    
                dog.moveToWest(distance)


            elif 'N' == direction:

                if dog.y-distance < 0 or parkRotated[dog.x][dog.y-distance:dog.y].find('X') > -1:
                    continue

                dog.moveToNorth(distance)

                    
            elif 'S' == direction:
                
                if dog.y+distance > parkHeight-1 or parkRotated[dog.x][dog.y+1:dog.y+distance+1].find('X') > -1:
                    continue

                dog.moveToSouth(distance)

        
        

class Dog:

    def __init__(self, x:int, y:int) -> None:     
        # 인스턴스 변수? 속성? 선언법   
        self.x = x
        self.y = y

    def moveToNorth(self, distance:int):
        self.y = self.y-distance

    def moveToSouth(self, distance:int):
        self.y = self.y+distance
    
    def moveToEast(self, distance:int):
        self.x = self.x+distance
    
    def moveToWest(self, distance:int):
        self.x = self.x-distance
        


공원산책(["OOOXO", "OOOOO", "OXOSX", "OOOOO", "OOOXO", "OOOOO"], ["S 2", "E 1"])