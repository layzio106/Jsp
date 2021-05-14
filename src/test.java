
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
//		System.out.println((4<2)&&(name.length()==4));
		System.out.println((4>2)&&(name.length()==4));
		
		//null이라는것은 length()라는 함수자체를 쓸수없다.
		//그러면 위의 코드는 왜 실행이되었을까?
		//f&&f. f&&t모두 false이기에 컴파일러는 뒤의 name.length()를 읽지않는다.
		//	=> F&&F	-> False결과를 출력
		// 		F&&?	-> 결과는 항상 false이기때문에 뒤에 코드실행x
		//System.out.println((4>2)&&(name.length()==4));
		//	=> F&&F	-> False결과를 출력
		// 		T&&?    -> 뒤의 값에 따라서 결과가 바뀌기때문에 실행0
		
	}

}
