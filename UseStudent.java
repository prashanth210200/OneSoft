package collection_ArrayList;
import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("mano",12,21,"A","male","kumar");
		Student s2=new Student("luxs",11,11,"Ab","female","raj");
		Student s3=new Student("fuzi",9,31,"c","male","kanthan");
		Student s4=new Student("raj",10,41,"d","male","kumar");

		ArrayList<Student>stds=new ArrayList<>();
		stds.add(s1);
		stds.add(s2);
		stds.add(s3);
		stds.add(s4);
for(int i=0;i<stds.size();i++) {
	System.out.println(stds.get(i));
}
for(int i=stds.size()-1;i>=0;i--) {
	System.out.println(stds.get(i).getName());
}
for(Student x:stds) {
	System.out.println(x.getName());;
}
stds.forEach(z->{
	
System.out.println(z);
});
	
	for(Student x:stds) {
		if(x.getName().contains("s")) {
			System.out.println("is vowels");
		}
		else {
			System.out.println("is not vowels");
		}
	}
	stds.forEach(z->{
		if(z.getGender()=="female") {
		System.out.println(z.getName());
		}
		else {
			System.out.println("null");
		}
		
		
	});
	int max=stds.get(0).getId();
	String temp=null;
	for(Student x:stds) {
		if(x.getId()>max) {
			max=x.getId();
			temp=x.getName();
		}
	
	}
	System.out.println(temp);
	}
}

