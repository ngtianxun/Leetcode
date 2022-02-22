// Referenced from: https://leetcode.com/problems/merge-two-sorted-lists/discuss/9715/Java-1-ms-4-lines-codes-using-recursion

import java.util.ArrayList;

public class MergeTwoSortedLists {
	
//	Own code
//	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//		
//		ArrayList<Integer> arr1 = new ArrayList<>();
//		ArrayList<Integer> arr2 = new ArrayList<>();
//		
//		// Generate arraylist from LinkNode
//		while (true) {
//			if (list1 == null)
//				break;
//			arr1.add(list1.val);
//			
//			if (list1.next == null)
//				break;
//			list1 = list1.next;
//		}
//		while (true) {
//			if (list2 == null)
//				break;
//			arr2.add(list2.val);
//			
//			if (list2.next == null)
//				break;
//			list2 = list2.next;
//		}
//		
//		// Algo
//		if (arr1.size() == 0 && arr2.size() == 0) {
//			return null;
//		}
//		else if (arr1.size() == 0) {
//			arr2 = arr2;
//		}
//		else if (arr2.size() == 0) {
//			arr2 = arr1;
//		}
//		else {
//			for (int i = 0; i < arr1.size(); i++) {
//				for (int j = 0; j < arr2.size(); j++) {
//					if (arr1.get(i) > arr2.get(j)) {
//						if (j == arr2.size() - 1) {
//							arr2.add(j + 1, arr1.get(i));
//							break;
//						}
//						else
//							continue;
//					}
//					else if (arr1.get(i) <= arr2.get(j)) {
//						arr2.add(j, arr1.get(i));
//						break;
//					}
//				}
//			}
//		}
//		
//		// Generate LinkNode from arraylist
//		ListNode res = new ListNode();
//		for (int i = arr2.size() - 1; i >= 0; i--) {
//			if (i == arr2.size() - 1)
//				res = new ListNode(arr2.get(i), null);
//			else
//				res = new ListNode(arr2.get(i), res);
//		}
//		
//		return res;
//    }
	
//	Referenced
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
		
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				dummy.next = l1;
				l1 = l1.next;
			}
			else {
				dummy.next = l2;
				l2 = l2.next;
			}
			dummy = dummy.next;
		}
		if (l1 == null) {
			dummy.next = l2;
		}
		else {
			dummy.next = l1;
		}
		
		return head.next;
    }

	public static void main(String[] args) {
		ListNode res = new ListNode();
		
		ListNode lista4 = new ListNode(4, null);
		ListNode lista3 = new ListNode(3, lista4);
		ListNode lista2 = new ListNode(2, lista3);
		ListNode lista1 = new ListNode(1, lista2);

		ListNode listb2 = new ListNode(3, null);
		ListNode listb1 = new ListNode(2, listb2);
		
		res = mergeTwoLists(lista1, listb1);
	}
}
