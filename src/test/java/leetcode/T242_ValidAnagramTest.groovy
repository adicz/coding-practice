package leetcode

import spock.lang.Specification

class T242_ValidAnagramTest extends Specification {

    T242_ValidAnagram service = new T242_ValidAnagram()

    def "should return correct result if given strings are anagrams"() {
        when:
        def result = service.isAnagram(s, t)

        then:
        result == expectedResult

        where:
        s         | t         || expectedResult
        "anagram" | "nagaram" || true
        "rat"     | "car"     || false

    }
}
