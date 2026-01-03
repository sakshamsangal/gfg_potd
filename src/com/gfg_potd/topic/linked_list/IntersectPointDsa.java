package com.gfg_potd.topic.linked_list;

import java.util.Objects;

public class IntersectPointDsa {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


    private static int getSize(Node head) {
        int size = 0;
        while (Objects.nonNull(head)) {
            size++;
            head = head.next;
        }
        return size;
    }

    // todo: can be improved
    public Node intersectPoint(Node head1, Node head2) {
        int s1 = getSize(head1);
        int s2 = getSize(head2);

        if (s1 > s2) {
            // skip nodes
            int diff = s1 - s2;
            while (diff != 0) {
                head1 = head1.next;
                diff--;
            }
        } else if (s1 < s2) {
            // skip nodes
            int diff = s2 - s1;
            while (diff != 0) {
                head2 = head2.next;
                diff--;
            }
        }

        while (head1.next != head2.next) {
            head1 = head1.next;
            head2 = head2.next;
        }

        return head1.next;
    }


}