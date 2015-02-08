public class Person{
    int id;
    int age;

    Person (int _id, int _age){
	id = _id;
	age = -age;
    }

    public static void main(String[] args){
	Person tom = new Person(1, 25);
    }
}