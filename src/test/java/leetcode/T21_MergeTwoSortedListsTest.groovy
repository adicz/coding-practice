package leetcode

import spock.lang.Specification
import spock.lang.Unroll

class T21_MergeTwoSortedListsTest extends Specification {

    T21_MergeTwoSortedLists service = new T21_MergeTwoSortedLists()

    @Unroll
    def "should return correct value with given parameters #list1 #list2"() {
        given:
        def list1head = createListNode(list1)
        def list2head = createListNode(list2)

        when:
        def result = service.mergeTwoLists(list1head, list2head)
        def resultToList = new ArrayList<>()
        def node = result
        while (node != null) {
            resultToList.add(node.val);
            node = node.next
        }

        then:
        expectedResult == resultToList

        where:
        list1     | list2     || expectedResult
        [1, 2, 4] | [1, 3, 4] || [1,1,2,3,4,4]
        []        | [0]       || [0]
        []        | []        || []
    }

    private static T21_MergeTwoSortedLists.ListNode createListNode(list) {
        def head = null;
        if (!list.isEmpty()) {
            head = new T21_MergeTwoSortedLists.ListNode(list.get(0))
            def node = head
            for (int i = 1; i < list.size(); i++) {
                def newNode = new T21_MergeTwoSortedLists.ListNode(list.get(i))
                node.next = newNode
                node = newNode
            }
        }
        return head
    }
}
