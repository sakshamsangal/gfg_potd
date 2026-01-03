package com.gfg_potd.topic.linked_list;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PalindromeLLDsa {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    private Node addFirst(Node head, Node item) {
        item.next = head;
        return item;
    }

    private Node reverse(Node head) {
        Node newHead = null;
        while (Objects.nonNull(head)) {
            Node next = head.next;
            newHead = addFirst(newHead, head);
            head = next;
        }
        return newHead;
    }


    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (Objects.nonNull(fast) && Objects.nonNull(fast.next)) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private boolean compareList(Node head1, Node head2) {
        while (Objects.nonNull(head1) && Objects.nonNull(head2)) {
            if (head1.data != head2.data) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }


    private void printList(Node head) {
        List<Integer> ls = new ArrayList<>();
        while (Objects.nonNull(head)) {
            ls.add(head.data);
            head = head.next;
        }
        System.out.println("ls = " + ls);
    }

    public boolean isPalindrome(Node head) {
        Node mid = getMid(head);
        Node reverseList = reverse(mid);
        printList(reverseList);

        return compareList(head, reverseList);
    }

}
