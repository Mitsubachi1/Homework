package IA;
public class MyBSTree<T extends Comparable <T>> implements ITree<T> {
    private Node root;
    private int size;
    @Override
    public boolean containsItem(T item) {
        return itemChecker(root, item);
    }

    private boolean itemChecker(Node current, T value) {
        if (current == null) {
            return false;
        }

        if (value.compareTo(current.data) == 0) {
            return true;
        }

        if (value.compareTo(current.data) < 0) {
            return itemChecker(current.left, value);
        } else {
            return itemChecker(current.right, value);
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void insert(T item) {
        if(containsItem(item)){return;}
        root = insertTo(root,item);
        size++;
    }

    private Node insertTo(Node node, T data) {
        if (node == null) { //check if base/curr node is null
            node = new Node(data);
            System.out.print(node.data);
            return node; 
        } if (data.compareTo(node.data) < 0) { //if data is lt curr node
            node.left = insertTo(node.left, data); //left base node created
        } else if (data.compareTo(node.data) > 0) {
            node.right = insertTo(node.right, data);
        }
        
        return node;
    }  

    @Override
    public void printInOrder() {
        printInOrderHelper(root);
        System.out.println();
        
    }

    private void printInOrderHelper(Node current) {
        if (current != null) {
            printInOrderHelper(current.left);
            System.out.print(current.data + " ");
            printInOrderHelper(current.right);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toStringHelper(root, sb);
        return sb.toString().trim();
    }

    private void toStringHelper(Node current, StringBuilder sb) {
        if (current != null) {
            toStringHelper(current.left, sb);
            sb.append(current.data).append(" ");
            toStringHelper(current.right, sb);
        }
    }

    //embedded node class
	class Node{
        public T data;
        public Node left;
        public Node right;

        public Node(T data){ // creating parent or child
            this.data = data;
        }
        public void insert(T item) {
            if (item.compareTo(data) == 0) {
                return;
            }
            if (item.compareTo(data) < 0) {
                if (left == null) {
                    left = new Node(item);
                } else {
                    left.insert(item);
                }
            } else {
                if (right == null) {
                    right = new Node(item);
                } else {
                    right.insert(item);
                }
            }
        }
        /* 
        public void insert(T item){
            insertTo(root, item);
        }
        */
       /* public void insert(T item) {
            if (root == null) {
                root = new Node(item);
                return;
            }
    
            Node current = root;
            Node parent = null;
            boolean isChild = false;
    
            while (current != null) {
                parent = current;
                if (item.compareTo(current.data) < 0) {
                    current = current.left;
                    isChild = true;
                } else if (item.compareTo(current.data) > 0) {
                    current = current.right;
                    isChild = false;
                } else {
                    return; 
                }
            }
    
            if (isChild) {
                parent.left = new Node(item);
            } else {
                parent.right = new Node(item);
            }
        }*/

    }
}