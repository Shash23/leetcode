public class linkedlistpractice {

    public static void main(String args[]) {

        int num = 456;

        ListNode l1 = new ListNode(0,null);
        
        while(num > 0) {

            l1.val = num % 10;
            
            num /= 10;

            l1 = l1.next;

        }

        while(l1.next == null) {
         
            System.out.println(l1.next.val);

        }
        
    }
    
}
