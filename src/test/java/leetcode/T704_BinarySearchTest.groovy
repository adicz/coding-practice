package leetcode

import spock.lang.Specification

class T704_BinarySearchTest extends Specification {

    T704_BinarySearch service = new T704_BinarySearch()

    def "shoudl return correct value with given parameters #nums #target"() {
        when:
        def result = service.search(nums as int[], target)

        then:
        result == expectedResult

        where:
        nums                 | target || expectedResult
        [-1, 0, 3, 5, 9, 12] | 9       | 4
        [-1, 0, 3, 5, 9, 12] | 2       | -1
        [5]                  | 5       | 0
    }

}
