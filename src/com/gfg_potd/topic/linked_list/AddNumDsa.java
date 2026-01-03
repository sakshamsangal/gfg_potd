package com.gfg_potd.topic.linked_list;


import java.util.Objects;

public class AddNumDsa {

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
        while (Objects.nonNull(head) && head.data == 0) {
            head = head.next;
        }
        Node newHead = null;
        while (Objects.nonNull(head)) {
            Node next = head.next;
            newHead = addFirst(newHead, head);
            head = next;
        }
        return newHead;
    }

    private static int getCarry(int sum) {
        return 9 < sum ? 1 : 0;
    }

    public Node addTwoLists(Node head1, Node head2) {

        Node rHead1 = reverse(head1);
        Node rHead2 = reverse(head2);
        Node ansList = null;
        int carry = 0;
        while (Objects.nonNull(rHead1) && Objects.nonNull(rHead2)) {

            Node next = rHead2.next;
            int sum = carry + rHead1.data + rHead2.data;
            rHead2.data = sum % 10;
            ansList = addFirst(ansList, rHead2);

            rHead1 = rHead1.next;
            rHead2 = next;

            carry = getCarry(sum);
        }

        while (Objects.nonNull(rHead1)) {
            Node next = rHead1.next;

            int sum = carry + rHead1.data;
            rHead1.data = sum % 10;
            ansList = addFirst(ansList, rHead1);
            rHead1 = next;

            carry = getCarry(sum);
        }

        while (Objects.nonNull(rHead2)) {
            Node next = rHead2.next;

            int sum = carry + rHead2.data;
            rHead2.data = sum % 10;
            ansList = addFirst(ansList, rHead2);
            rHead2 = next;

            carry = getCarry(sum);
        }

        if (carry == 1) {
            ansList = addFirst(ansList, new Node(1));
        }

        return ansList;
    }


}
