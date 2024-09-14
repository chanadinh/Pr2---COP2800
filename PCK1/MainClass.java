/*
 * COP 2800 Tues/Thurs
 * Name: Chan Dinh
 */
package PCK1;

public class MainClass {

	public static void main(String[] args) {
		Person p1 = new Person("Chan", "Dinh",1);
		Person p2 = new Person("James","Lance",2);
		Student st1 = new Student(1,"Computer Science" , 4.0);
		Student st2 = new Student(2,"Computer Science" , 3.5);
		st1.p = p1;
		st2.p = p2;
		st1.displayData();
		st2.displayData();
	}
}
