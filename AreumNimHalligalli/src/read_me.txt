 HalliGalli.project 
  할리갈리 

 원아름 
 ver.1 2020.03.02

 ComVo(컴퓨터 플레이어) -> 사용안함
					->생략
 UserVo(사용자 플레이어)
 memeber String name : 사용자 이름
		String id : 사용자 아이디
		int order : 사용자 순서, 몇번째 차례인지 
		int win : 이긴 누적횟수 

 CardDeck.Classs
 총 56장의 카드를 만든다.
 카드 56장은  "♥", "◆", "♠", "♣" 모양당 14장씩이며
 하나의 모양에는  ((5+3+3+2+1)*4 = 56)
 1개가 5장, 2개가 3장, 3개가 3장, 4개가 2장, 5개가 1장이 있다.


 GameMakeUser.Class
 player를 원하는 수만큼 생성(현재 4명)
 member	 HashMap<Integer, ArrayList<String>> playerCardMap
 		->  HashMap으로 int : player / Stirng[] : 소유한 카드덱을 저장한다. 		
 		
 GameRules.Class
  게임과 관련된 메서드를 가짐
 divideCards() : 카드덱을 인원수만큼 나눠준다.	
 drawPlayDeck() : 각자 가진 카드 수만큼을 볼 수 있게 출력시킴
 drawInBoardCards() : 플레이어가 보드판에 오픈한 카드 중 맨 위 카드들만 보여줌(4장) 
 open(int order) : order순서가 되면 그 순서의 플레이어 카드 한장을 open시킴 
 				->오픈된 카드는 member inBoard로 이동됨
 checkFive() : 오픈된 카드들(4개) 중 모양이 같은 카드의 숫자 합 5인지 확인
 				-> return : boolean type
 success(int order) : 5개를 맞췄을 경우 member inBoard에 있는 카드를 
 					order 플레이어의 카드덱으로 모두 가져옴
 fail(int order) : 틀렸을 경우 자신(order)을 제외한 다른 플레이어에게 한장씩 나눠줌
 result() : 마지막 승부체크, 플레이어들 중 가장 많은 카드를 가졌다면 true 					
 				-> return : boolean type
 				
 Process
 - 메뉴 선택 : 1)게임시작 2)설명듣기 3)사용자정보 4)제작자정보 5)게임종료
 1. 사용자 순서 정하기 (랜덤)	
 2. 카드 분배
 3. 순서대로 카드 한 장씩 오픈
 4. 각자 오픈된 카드들 중 맨 위에 놓인 4장의 카드만 체크
 5. 모양이 같은 카드의 숫자가 5가 되면 종bell을 침 	
 	-> 사용자 input : 종을 침 z, 패스 x
 6. 맞추면 오픈된카드 모두 가져감, 틀리면 한장씩 다른 플레이어에게 나눠줌
 6. 한 명의 탈락자가 나올 때까지 진행
 7. 탈락자가 나오면 게임이 종료, 가장 많은 카드를 가진 사람이 승리 
 
 
 호출 
 Main -> GameProcess.Class( loopGame() -> playGame() ) 		
 
 
 
 		