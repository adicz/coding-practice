package leetcode

import spock.lang.Specification

class T238_ProductOfArrayExceptSelfTest extends Specification {

    T238_ProductOfArrayExceptSelf service = new T238_ProductOfArrayExceptSelf()

    def "should return correct answer with given arrays"() {
        when:
        def result = service.productExceptSelf(nums as int[])

        then:
        result == expectedResult as int[]

        where:
        nums              || expectedResult
        [1, 2, 3, 4]      || [24, 12, 8, 6]
        [-1, 1, 0, 3, -3] || [0, 0, 9, 0, 0]
    }
}
