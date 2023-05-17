package leetcode

import spock.lang.Specification
import spock.lang.Unroll

class T14_LongestCommonPrefixTest extends Specification {

    T14_LongestCommonPrefix service = new T14_LongestCommonPrefix()

    @Unroll
    def "should return correct value with given parameters #strs"() {
        when:
        def result = service.longestCommonPrefix(strs as String[])

        then:
        result == expectedResult

        where:
        strs                         || expectedResult
        ["flower", "flow", "flight"] || "fl"
        ["dog", "racecar", "car"]    || ""

    }

}
