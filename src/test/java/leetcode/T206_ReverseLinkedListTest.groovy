package leetcode

import spock.lang.Specification
import spock.lang.Unroll

class T206_ReverseLinkedListTest extends Specification {

    T206_ReverseLinkedList service = new T206_ReverseLinkedList()

    @Unroll
    def "should return correct value with given parameters #nums"() {
        given:
        def head = null
        if (!nums.isEmpty()) {
            head = new T206_ReverseLinkedList.ListNode(nums.get(0))
            def node = head
            for (int i = 1; i < nums.size(); i++) {
                def newNode = new T206_ReverseLinkedList.ListNode(nums.get(i))
                node.next = newNode
                node = newNode
            }
        }

        when:
        def result = service.reverseList(head)
        def resultToList = new ArrayList<>()
        def node = result
        while (node != null) {
            resultToList.add(node.val);
            node = node.next
        }


        then:
        expectedResult == resultToList

        where:
        nums            || expectedResult
        [1, 2, 3, 4, 5] || [5, 4, 3, 2, 1]
        [0, 1]          || [1, 0]
        []              || []
    }

}
