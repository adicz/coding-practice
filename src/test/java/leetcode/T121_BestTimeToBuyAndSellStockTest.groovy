package leetcode

import spock.lang.Specification

class T121_BestTimeToBuyAndSellStockTest extends Specification{

    T121_BestTimeToBuyAndSellStock service = new T121_BestTimeToBuyAndSellStock()

    def "should return correct value with given array"() {
        when:
        def result = service.maxProfit(prices as int[])

        then:
        result == expectedResult

        where:
        prices             || expectedResult
        [7, 1, 5, 3, 6, 4] || 5
        [7, 6, 4, 3, 1]    || 0
    }
}
