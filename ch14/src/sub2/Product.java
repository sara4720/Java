package sub2;

public class Product<T1,T2> {
	
	private T1 item;
	private T2 info;
	
	public Product(T1 item, T2 info) {
		this.item = item;
		this.info = info;
	}
	
	public T1 getItem() {
		return item;
	}
	
	public void setItem(T1 item) {
		this.item = item;
	}
	
	public T2 getInfo() {
		return info;
	}
	
	public void setInfo(T2 info) {
		this.info = info;
	}
	
	public void show() {
		System.out.println("力前 辆幅 : "+item);
		System.out.println("力前 沥焊 : "+info);
	}
	
	
}
