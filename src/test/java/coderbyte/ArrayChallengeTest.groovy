package coderbyte

import spock.lang.Specification

class ArrayChallengeTest extends Specification {

    def "should return correct answer"() {
        when:
        def result = ArrayChallenge.ArrayChallenge(intArray as int[])

        then:
        result == expextedResult

        where:
        intArray || expextedResult
        [5,2,1] || 0
        [1, 20, 2, 5] || 6
    }
}
