def maxProfit(prices):
    maxProfit = 0
    min = prices[0]
    for i in range(1, len(prices)):
        if prices[i] < min:
            min = prices[i]
        if prices[i] - min > maxProfit:
            maxProfit = prices[i]-min
    return maxProfit

prices = [7,1,5,3,6,4]
print(maxProfit(prices))
    