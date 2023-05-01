package leetcode

import spock.lang.Specification
import spock.lang.Unroll

class T20_ValidParenthesesTest extends Specification {

    T20_ValidParentheses service = new T20_ValidParentheses()

    @Unroll
    def "should return correct value with given parameters #string"() {
        when:
        def result = service.isValid(string)

        then:
        result == expectedResult

        where:
        string   || expectedResult
        "()"     || true
        "()[]{}" || true
        "(]"     || false
        "([)]"   || false
        "){"     || false
        ")(){}"  || false
    }
}
