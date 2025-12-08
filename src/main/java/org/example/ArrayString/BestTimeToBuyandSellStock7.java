package org.example.ArrayString;
//Вам дан массив prices,
// где prices[i] — цена определённой акции в ith-й день.
//Вы хотите получить максимальную прибыль, выбрав один день
// для покупки одной акции и другой день в будущем для её продажи.
//Верните максимальную прибыль, которую вы можете получить от этой сделки. Если вы не можете получить прибыль, верните 0.
//Пример 1:
//Входные данные: цены = [7, 1, 5, 3, 6, 4]
//Выходные данные: 5
//Пояснение: Купите на второй день (цена = 1) и продайте на пятый день (цена = 6), прибыль = 6-1 = 5.
//Обратите внимание, что покупка на второй день и продажа на первый день недопустимы, так как сначала нужно купить,
// а потом продать.
public class BestTimeToBuyandSellStock7 {
    public int maxProfit(int[] prices) {

        int left = 0;
        int right = 1;
        int maxProfit = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
