package leetcode

import spock.lang.Specification

class T49_GroupAnagramsTest extends Specification {

    T49_GroupAnagrams service = new T49_GroupAnagrams()

    def "should return grouped anagrams"() {
        when:
        def result = service.groupAnagrams(strs as String[])

        result.sort().forEach({ element -> element.sort() })
        expectedResult.sort().forEach({ element -> element.sort() })

        then:
        result.size() == expectedResult.size()
        result == expectedResult

        where:
        strs                                       || expectedResult
        ["eat", "tea", "tan", "ate", "nat", "bat"] || [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
        [""]                                       || [[""]]
        ["a"]                                      || [["a"]]
    }
}
