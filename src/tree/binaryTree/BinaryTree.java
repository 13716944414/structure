package tree.binaryTree;

/**
 * @author jiangjiaxin
 * @date 2018-02-26 15:24
 */
public class BinaryTree {

    private Node root;

    /**
     *    插入节点
     *
     * @author jiangjiaxin
     * @date 2018-02-26 15:56
     * @param
     * @return
     */
    public void insert(int number, String name){
        Node newNode = new Node(number, name);
        Node currentNode = root;
        Node parentNode;
        if(root == null){
            root = newNode;
        }else{
            while(true){
                parentNode = currentNode;
                if(currentNode.getNumber() > number){
                    currentNode = currentNode.getLeftChild();
                    if(currentNode == null){
                        parentNode.setLeftChild(newNode);
                        return;
                    }
                }else{
                    currentNode = currentNode.getRightChild();
                    if(currentNode == null){
                        parentNode.setRightChild(newNode);
                        return;
                    }
                }
            }

        }
    }

    public void delete(int number){
        Node currentNode = root;
        Node parentNode;
        if(root == null){
            System.out.println("这是一棵空树");
        }else{
            while(currentNode != null && currentNode.getNumber() != number){
                parentNode = currentNode;
                if(currentNode.getNumber() > number){
                    currentNode = currentNode.getLeftChild();
                }else{
                    currentNode = currentNode.getRightChild();
                }
            }
            if(currentNode == null){
                System.out.println("未找到该数据");
            }else if(currentNode.getLeftChild() == null && currentNode.getRightChild() == null){
                parentNode = null;
            }
        }
    }

    /**
     *    中序遍历
     *
     * @author jiangjiaxin
     * @date 2018-02-26 15:56
     * @param
     * @return
     */
    public void inOrderTraversal(Node localNode){
        if(localNode != null){
            inOrderTraversal(localNode.getLeftChild());
            System.out.println(localNode.getNumber() + ": " + localNode.getName());
            inOrderTraversal(localNode.getRightChild());
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
