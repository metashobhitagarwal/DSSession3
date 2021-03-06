package MirrorTree;
/**
 * MyNode create nodes for tree and also 
 *have getter setter method for all parameter
 * @param <T>
 */
public class MyNode<T> {

	MyNode<T> left, right;
	T data;

	MyNode(T data) {
		this.data = data;
		left = null;
		right = null;
	}

	T getData() {
		return data;
	}

	void setLeft(MyNode<T> node) {
		this.left = node;
	}

	void setRight(MyNode<T> node) {
		this.right = node;
	}

	MyNode<T> getLeft() {
		return left;
	}

	MyNode<T> getRight() {
		return right;
	}
}
