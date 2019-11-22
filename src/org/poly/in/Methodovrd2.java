package org.poly.in;

public class Methodovrd2 extends Methodovverrde {
@Override
public void saving(long d) {
	System.out.println("savings:"+d);
}
public static void main(String[] args) {
	Methodovverrde d=new Methodovverrde();
	d.saving(90000);
}
}

