package leetcode

import spock.lang.Specification
import spock.lang.Unroll

class T1_TwoSumTest extends Specification {

    T1_TwoSum service = new T1_TwoSum()

    @Unroll
    def "should return correct value with given parameters - first solution"() {
        when:
        def result = service.twoSum(nums as int[], target)

        then:
        result == expectedResult as int[]

        where:
        nums           | target || expectedResult
        [2, 7, 11, 15] | 9      || [0, 1]
        [3, 2, 4]      | 6      || [1, 2]
        [3, 3]         | 6      || [0, 1]
    }

    @Unroll
    def "should return correct value with given parameters - second solution"() {
        when:
        def result = service.twoSum(nums as int[], target)

        then:
        result == expectedResult as int[]

        where:
        nums           | target || expectedResult
        [2, 7, 11, 15] | 9      || [0, 1]
        [3, 2, 4]      | 6      || [1, 2]
        [3, 3]         | 6      || [0, 1]
    }
}
