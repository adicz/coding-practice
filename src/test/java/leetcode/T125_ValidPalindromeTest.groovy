package leetcode

import spock.lang.Specification

class T125_ValidPalindromeTest extends Specification {

    T125_ValidPalindrome service = new T125_ValidPalindrome()

    def "should return correct result"() {
        when:
        def result = service.isPalindrome(text)

        then:
        result == expectedResult

        where:
        text                             || expectedResult
        "A man, a plan, a canal: Panama" || true
        "race a car"                     || false
        "0P"                             || false
    }
}
