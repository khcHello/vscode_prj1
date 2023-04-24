

class 달리기경주:

    def __init__(self, players:list[str], callings:list[str]) -> None:

        playerHash = {}
        i = 0
        for name in players:
            playerHash[name] = i
            i = i+1

        for call in callings:
            foreIdx = playerHash[call]

            playerHash[players[foreIdx-1]] = foreIdx
            playerHash[players[foreIdx]] = foreIdx-1
            players[foreIdx] = players[foreIdx-1]
            players[foreIdx-1] = call

        print(players)
달리기경주(["mumu", "soe", "poe", "kai", "mine"], ["kai", "kai", "mine", "mine"])