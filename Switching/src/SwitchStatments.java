
public class SwitchStatments {

	public static void main(String[] args) {
//		for (int i = 0; i<10; i++) {
//			switch(i) {
//			case 1:
//				System.out.println("one");
//				break; 
//			case 2: 
//				System.out.println("two");
//				break;
//			case 3: 
//				System.out.println("three");
//				break;
//			default:
//				System.out.println("number");
//			}
//			
//			if(i==4) {
//				break; 
//			}
//		}
			
//		int num = 0; 
//		while(true) {
//			System.out.println("before " + num);
//			if(num == 3) {
//				num++;
//				continue; 
//			}
//			if (num == 7) {
//				break;
//			}
//			System.out.println("after " + num);
//			num++; 
//		}
		
		String food = "carrot";
		
		switch(food){
		case "apple":
		case "banana":
		case "tomato":
			System.out.println("fruit");
			break;
		case "carrot": 
		case "peas":
		case "broccoli":
			System.out.println("veggies");
			break;
		default: 
			System.out.println("not a fruit or a veggie");
		}
		
			
	}
}
