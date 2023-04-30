package leetcode

import spock.lang.Specification

class T128_LongestConsecutiveSequenceTest extends Specification {

    T128_LongestConsecutiveSequence service = new T128_LongestConsecutiveSequence()

    def "should return correct value with given array"() {
        when:
        def result = service.longestConsecutive(nums as int[])

        then:
        result == expectedResult

        where:
        nums                           || expectedResult
        [100, 4, 200, 1, 3, 2]         || 4
        [0, 3, 7, 2, 5, 8, 4, 6, 0, 1] || 9

    }
}
