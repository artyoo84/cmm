package oop01.syntax;
/*
Date :
Author : 
Desc : 생성자 문법
*/
/*
초기화
- 어떤 작업(현실 : job, 프로그램 : process)를 시작하기 ㅈㄴ에
- 준비 (현실 : standby, ready)를 하게 되는데
- 이것을 프로그램에서는 초기화(initializing)라고 한다. 
*/
/*
생성자
- 1. 값을 반환하지 않는다.
	따라서 return도 없고, void 도 표시하지 않는다.
- 2. 생성자의 이름은 클래스의 이름과 동일하다. 
- 3. 생성자를 명기하지 않으면, 디폴트 생성자(파라미터가 없는 ) 가 
		컴파일러에 의해 자동 생성된다. 
- 4. 생성자가 여러개일때, 다른 생성자를 호출할 수 있다. 
		이때 사용되는 특별한 코드가 this() 를 통하여 
		클래스 내부의 다른 생성자를 호출한다. 
		단, 생성자 맨 첫줄에 단 한번만 호출 가능하다. 
- 5. 4번과 동일한 개념으로 super() 로 부모의 생성자를 호출한다. 

*/
public class No05_ConstructorSyntax {

}
