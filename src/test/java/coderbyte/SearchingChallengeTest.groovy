package coderbyte

import spock.lang.Specification

class SearchingChallengeTest extends Specification {

    def "should return correct answer"() {
        when:
        def result = SearchingChallenge.SearchingChallenge(text)
        then:
        result == expectedResult
        where:
        text              || expectedResult
        "Hello apple pie" || "Hzeml3l7o0vwsa54"
        "No words"         | "-z1m370vwsa54"
    }
}
