package Comprable1;

public class Employ implements Comparable<Employ>{
public int id;
public String name;
public String phone;
public Employ(int id, String name, String phone) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
}
@Override
public int compareTo(Employ o) {
	
	return this.id-o.id;
	
	//return this.name.compareTo(o.toString());//is-se-string se bhi compare kr skte h
	
//	if(this.id<o.id) //logic for accending decending by id
//		return 1;
//	else if(this.id>o.id)
//		return -1;
//	return 0;
	
}

public String toString() {
	return "Employ [id=" + id + ", name=" + name + ", phone=" + phone + "]";
}
}
