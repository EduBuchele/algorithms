# https://judge.beecrowd.com/pt/problems/view/1110
while True:
    n = int(input())
    if n == 0:
        break

    cards = [i for i in range(n, 0, -1)]
    discardedCards = []

    while len(cards) >= 2:
        # print(cards)
        discardedCards.append(cards.pop())
        cards.insert(0, cards.pop())

    print('Discarded cards: ' + ', '.join(map(str, discardedCards)))
    print(f'Remaining card: {cards[0]}')
