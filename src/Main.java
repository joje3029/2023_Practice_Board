import java.util.Scanner; // import를 해줘야 Main 클래스가 내가 사용하려는 것을 쓸꺼다를 알아들음.
						  //import 문은 Scanner 클래스의 정확한 경로가 import에 나와있는거라고 알려주는 것.
						  //그래서 여기에 등록이 안되거나 잘못 되면 내가 원하는걸 가져다 쓸수 없음.

public class Main {
	

	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		
		
		//콘솔에 입력되려면 Scanner를 사용.
		//ctrl+shift+O= import
		Scanner sc = new Scanner(System.in);  // System.in(인자) 을 Scanner안에 적은 이유는 키보드에서 사용자로부터 키 입력을 받기 위해서.
		//여기까지가 입력받을 준비 not 입력 받아라.	// System. in : System 안에서 일어나는 모든 입력에 대한 값을 인자로 넘기겠다.
	
		//무한반복을 명령어 입력부터 하는 이유 : 안그러면 명령어 입력 한번하면 다른 기능을 사용 못하기 때문에
		while(true) {
		System.out.println("명령어를 입력해주세요)" );

		String cmd =sc.nextLine(); // String 타입 변수 cmd에 입력한 문자열 전체를 저장-> 입력 받으라는 명령어
									//이게 위에 있으면 프로그램 시작하고 문자치고 나서 밑에 명령어를 입력해주세요가 뜹니다.(순서는 중요해요!!)

		
		
		
		
		if(cmd.equals("exit")) {
		break;
		}// 만약에 cmd에 있는 문자가 exit와 동일하면 탈출한다.(이걸 이해 잘해야 니가 원하는걸 만들어.)
		
		}
		sc.close(); //sc는 자원이기때문에 끄고 다쓰고 나면 꺼주는게 관례고 예의 임.
		System.out.println("==프로그램 끝==");
		
}
}
