public class BalancedBST {

    static Node root;

    Node sortedArrayToBST(int[] sortedArray, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node middleNode = new Node(sortedArray[mid]);
        middleNode.leftNode = sortedArrayToBST(sortedArray, start, mid - 1);
        middleNode.rightNode = sortedArrayToBST(sortedArray, mid + 1, end);
        return middleNode;
    }

    void inOrderTraversal(Node parent){
        if (parent == null) {
            return;
        }
        inOrderTraversal(parent.leftNode);
        System.out.print(parent.data + " ");
        inOrderTraversal(parent.rightNode);
    }


    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        BalancedBST BST = new BalancedBST();
        root = BST.sortedArrayToBST(input, 0, input.length - 1);
        //In case of binary search trees (BST), Inorder traversal gives nodes in non-decreasing order.
        System.out.print("Inorder traversal(Left, Root, Right) of BST: ");
        BST.inOrderTraversal(root);
        System.out.println();
        System.out.println("BST toString method: ");
        System.out.println(root.toString());
    }

    class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int number){
            data = number;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", leftNode=" + leftNode +
                    ", rightNode=" + rightNode +
                    '}';
        }
    }

}
