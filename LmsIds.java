package collection_ArrayList;
import java.util.ArrayList;

public class LmsIds {
	public static void main(String[] args) {
		ArrayList<Integer>ids=new ArrayList<>();
		ids.add(5233);
		ids.add(1233);
		ids.add(433);
		ids.add(633);
		
//		for(int i=0;i<ids.size();i++) {
//			System.out.println(ids.get(1));
//		}
//		
//		for(Integer x:ids) {
//			System.out.println(x);	
//		}
//		
//		ids.forEach(z->System.out.println(z));

	
//	for(int i=0;i<ids.size();i++) {
//		if(ids.get(i)>500) {
//			System.out.println(ids.get(i));
//		}
//	}
//	for(Integer x:ids) {
//	if(x>500) {
//		System.out.println(x);
//	}
//	}
//	ids.forEach(z-> {
//		if(z>500) {
//	
//		System.out.println(z);
//		}
//	
//	else {
//		System.out.println("null")
//	
//		);
//	}

	for(Integer x:ids) {
		if(x>600&&x<900) {
			System.out.println(x);
		}
	}
	}
}


