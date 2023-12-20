package com.winter.study6.ex1;

import java.nio.channels.SelectableChannel;
import java.util.List;
import java.util.Scanner;

public class WeatherController {

	// 멤버 변수로 객체 선언
	// 의존성. Dependency
	// null 값에 데이터를 넣는거 injection
	// Dependency injection(의존성 주입)[약자 : DI]
	private WeatherDAO weatherDAO;
	private WeatherView weatherView;
	private Scanner sc;

	// 방법 1
	// WeatherController 객체가 만들어질때 넣어야함
	public WeatherController() {
		// 객체가 만들어져서 null 값이 아닌 객체의 주소가 들어감
		// DAO가 죽으면 같이 죽음 (내부에서만 주소를 알기때문에 사용이 불가 )
		// 강한 결합
		this.weatherDAO = new WeatherDAO();
		this.weatherView = new WeatherView();
		this.sc = new Scanner(System.in);
	}

	// 방법 2
	// WeatherController 객체가 만들어질때 넣어야함
	public WeatherController(WeatherDAO weatherDAO) {
		// 매개변수를 넣어서 사용
		// DAO가 죽어도 사용 가능 (외부에서 주소를 받아오기 때문에 DAO가 죽어도 Controller은 사용 가능)
		// 느슨한 결합
		this.weatherDAO = weatherDAO;
	}

	// 방법 3
	// set 으로 사용
	public void setWeatherDAO(WeatherDAO weatherDAO) {
		this.weatherDAO = weatherDAO;
	}

	public void setWeatherView(WeatherView weatherView) {
		this.weatherView = weatherView;
	}

	public void start() throws Exception{
		// 처음 한번만 파일에서 읽어오는 작업
		List<WeatherDTO> ar = weatherDAO.getWeathers();
		
		boolean check = true;
		while(check) {
			System.out.println("1. 날씨 정보를 출력");
			System.out.println("2. 날씨정보검색");
			System.out.println("3. 날씨정보추가");
			System.out.println("4. 날씨정보삭제");
			System.out.println("5. 파일추가욤");
			System.out.println("6. 프로그램종료");
			
			// 내부에서 exception을 해결할 경우
			try {
			int select = sc.nextInt();
			if(select==1) {
			this.weatherView.view(ar);
			}else if(select==2) {
				WeatherDTO w = weatherDAO.getDetail(ar, sc);
//				System.out.println(sc.next());
				weatherView.view(w);
				
			}else if(select==3) {
				boolean flag = weatherDAO.add(ar, sc);
				if(flag) {
					System.out.println("추가 완");
				}else {
					System.out.println("데이터 없");
				}
			}else if(select == 4) {
				boolean flag = weatherDAO.delete(ar, sc);
				if(flag) {
					System.out.println("잘지움");
				}else {
					System.out.println("실패임");
				}
			}else if(select==5) {
				weatherDAO.save(ar, sc);
				
//				weatherView.v
			}else {
				System.out.println("종료됨");
				check = false;
			}
			}catch(Exception e) {
				System.out.println("잘못 입력함");
				System.out.println(sc.next());
			}
		}
		
		
		
		
	}

}
