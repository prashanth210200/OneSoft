package collection_ArrayList;
import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("rajesh",107,25000,"engineer","male");
		Employee e2=new Employee("kumar",108,55000,"Banking","male");
		Employee e3=new Employee("Nisha",109,50000,"Manager","female");
		Employee e4=new Employee("magesh",120,75000,"Manager","male");
ArrayList<Employee>es=new ArrayList<>();
    es.add(e1);
    es.add(e2);
    es.add(e3);
    es.add(e4);
    for(int i=0;i<es.size();i++) {
    	System.out.println(es.get(i).getName());
    }
    for(Employee x:es) {
    	System.out.println(x.getName());
    	
    }
    es.forEach(z->{System.out.println(z.getName());});

	
	ArrayList<Employee>esIds=new ArrayList<>();
	for(Employee x:es) {
		if(x.getId()>=109) {
			esIds.add(x);
		}
	}
	esIds.forEach(x->System.out.println(x));
	
	
	
	//arraylist for role
	
	
	
	ArrayList<Employee>esRole=new ArrayList<>();
     for(Employee x:es) {
    	 if(x.getRole().equals("Manager"));
    	 esRole.add(x);
    	 
     }
	
	esRole.forEach(x->System.out.println(x.getName()));
	
	
	
	//first letter print
	char a;
	ArrayList<Character>esSt=new ArrayList<>();
//char a;
	for(Employee x:es) {
		a=x.getName().charAt(0);
		esSt.add(a);
		
	}
esSt.forEach(x->System.out.println(x));


// set to given value in the methode

for(Employee x:es) {
	if(x.getGender().equalsIgnoreCase("female")) {
		x.setSalary(x.getSalary()+(x.getSalary()*5/100));
	}
}
es.forEach(x->System.out.println(x));

		

}
}

