package leetcode

import spock.lang.Specification

class T347_TopKFrequentElementsTest extends Specification {

    T347_TopKFrequentElements service = new T347_TopKFrequentElements()

    def "should return correct answer with given arrays"() {
        when:
        def result = service.topKFrequent(nums as int[], k)

        then:
        result == expectedResult as int[]

        where:
        nums               | k || expectedResult
        [1, 1, 1, 2, 2, 3] | 2 || [1, 2]
        [1]                | 1 || [1]
    }
}
