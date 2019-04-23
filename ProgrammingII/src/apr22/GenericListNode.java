package apr22;
//VIckie
public class GenericListNode<T> {//Done for nothing

	private T data;
	private GenericListNode link;

	public GenericListNode() {
		link = null;
		data = null;
	}

	public GenericListNode(T newData, GenericListNode linkValue) {
		data = newData;
		link = linkValue;
	}

	public void setData(T newData) {
		data = newData;
	}

	public T getData() {
		return data;
	}

	public void setLink(GenericListNode newLink) {
		link = newLink;
	}

	public GenericListNode getLink() {
		return link;
	}
}


