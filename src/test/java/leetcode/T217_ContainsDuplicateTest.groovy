package leetcode

import spock.lang.Specification

class T217_ContainsDuplicateTest extends Specification {

    T217_ContainsDuplicate service = new T217_ContainsDuplicate()

    def "should return correct value with given array"() {
        when:
        def result = service.containsDuplicate(nums as int[])

        then:
        result == expectedResult

        where:
        nums                           | expectedResult
        [1, 2, 3, 1]                   | true
        [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] | true
        [1, 2, 3, 4]                   | false
    }
}
