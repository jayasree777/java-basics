import java.util.*;

class Node{

    Node tail=null;
    String value;

    Node(String value){
        this.value=value;
    }

    public static void add(String value){
        //Node node = new Node();
        
        Node node = this;
            while (node.hasNext()) {
            node=node.tail;
            }
        node.tail= new Node(value);
        }
    
        public boolean hasNext(){
    
            if (this.tail==null){
                return false;
            }
            else
            return true;
        }

        void showNodes(){
            Node nodeobj = this;
            while(nodeobj.hasNext()){
                nodeobj = nodeobj.tail;
            }
            System.out.println(nodeobj.value);
        }
    
    
    
        public static void main(String[] args) {
        System.out.println("Enter the value to add");
        Scanner myObj = new Scanner(System.in);
        String value = myObj.nextLine();
        Node nodeobj1=new Node("4");
        nodeobj1.add(value);
        nodeobj1.showNodes();
        
        }

}



