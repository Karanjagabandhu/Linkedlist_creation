public class linkedlistExample {
    static class Node{
        String name;
        Node next;

        public Node( String name)
        {
         this.name=name;
         this.next=null;
        }

    }
    static class Linkedlist12{
        private Node head;
        public Linkedlist12()
        {
            this.head=null;
        }
        //method to insert new element in the end of list
 public void insert(String name)
        {
            Node newNode=new Node(name);
            if(head== null)
            {
                head=newNode;

            }else{
                Node current=head;
                while(current.next !=null)
                {
                    current =current.next;

                }
                current .next=newNode;

            }

        }

        //method to display the all the list of linkedlist according to our insert method of above mention

        public void display()
        {
            if(head==null)
            {
                System.out.println("Null...");
            }
            else{
                Node current=head;
                while(current !=null)
                {
                    System.out.print(current.name+" =>");
                    current =current.next;

                }
                System.out.println("null..");
            }
        }

    }
    public static void main(String args[])
    {
         Linkedlist12 list=new Linkedlist12();
         list.insert("jagabandhu");
         list.insert("Balaram");
         list.insert("Bhagirathi");
         list.insert("Kumar");
         list.display();
    }
    
}
