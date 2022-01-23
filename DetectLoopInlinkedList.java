//Detect Loop in linked list 

class DetectLoopInlinkedList {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        Node n = head;
        Node nn = head;
        
        while(n!=null && nn!=null && nn.next!=null){
            n =n.next;
            nn=nn.next.next;
            if(n==nn){
                return true;
            }
        }
         
        return false;
    }
}
