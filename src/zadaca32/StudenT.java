package zadaca32;

public class StudenT {
int index;
String ime;
static String fakultet="ITS";
StudenT(int r,String n){
	index =r;
	ime = n;
}
void display () {
	System.out.println(index +" "+ime+ " " +fakultet);
}
	public static void main(String[] args) {
	StudenT s1 = new StudenT(111, "Petar");
	StudenT s2 = new StudenT(222, "Marko");
	s1.display();
	s2.display();
	

	}

}
