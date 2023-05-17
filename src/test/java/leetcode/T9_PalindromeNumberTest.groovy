package leetcode

import spock.lang.Specification
import spock.lang.Unroll

class T9_PalindromeNumberTest extends Specification {

    T9_PalindromeNumber service = new T9_PalindromeNumber()

    @Unroll
    def "should return correct value with given parameters #x"() {
        when:
        def result = service.isPalindrome(x)

        then:
        result == expectedResult

        where:
        x    || expectedResult
        121  || true
        -121 || false
        10   || false

    }

}
