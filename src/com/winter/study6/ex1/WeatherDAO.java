package com.winter.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherDAO {
	private static int count;
	
	//초기화 블럭 
	static {
		WeatherDAO.count=0;
	}
	// DAO : Data Access Object

	// getWeathers
	// file에서 내용을 읽어오는 역할

	// 1. 파일의 내용을 한줄씩 읽어오기
	// 2. 한줄의 내용을 파싱
	// 3. 파싱한 토큰을 DTO를 생성하고 멤버변수에 대입
	// 4. DTO를 List에 추가
	// 5. List를 return

	
	
	
	public ArrayList<WeatherDTO> getWeathers() throws Exception {		
		ArrayList<WeatherDTO> ar = new ArrayList<>();
		File file = new File("C:\\study\\weather.txt");
		File file23 = new File("c:\\study");
		
		String [] ar3 = file23.list();
		
		File [] files = file23.listFiles();
		
		for(String s : ar3) {
			System.out.println(s);
			int idx = s.lastIndexOf(".");
			 
//			 String idx2 = s.substring(idx);
//			System.out.println(idx2);
		}
		
	
		

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		while (true) {
			String s = br.readLine();
			if (s == null) {
				break;
			}

			// 파싱 - split, StringTokenizer

			System.out.println(s);
			StringTokenizer st = new StringTokenizer(s, "-");
			// 서울-12-맑음-60
			WeatherDTO weatherDTO = new WeatherDTO();

			weatherDTO.setCity(st.nextToken());
			weatherDTO.setGion(Integer.parseInt(st.nextToken()));
			weatherDTO.setInfo(st.nextToken());
			weatherDTO.setHum(Integer.parseInt(st.nextToken()));

			ar.add(weatherDTO);

		}
		br.close();
		fr.close();

		return ar;

	}

	// 검색 하는 기능
	public WeatherDTO getDetail(List<WeatherDTO> ar, Scanner sc) {
		System.out.println("도시명 입력");
		// 스캐너를 만들어도되고 컨트롤러에 있는 매개변수를 받아와도됨
		// 매개변수를 받아와서 하는 방식
		WeatherDTO weatherDTO = new WeatherDTO();
		weatherDTO.setCity(sc.next());
		for (WeatherDTO w : ar) {
			if (w.getCity().equals(weatherDTO.getCity())) {
				return w;
			}

		}
		return null;
	}

	// 추가 하는 기능
	public boolean add(List<WeatherDTO> ar, Scanner sc) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명");
		weatherDTO.setCity(sc.next());
		System.out.println("기온 입력");
		weatherDTO.setGion(sc.nextInt());
		System.out.println("날씨 정보 입력");
		weatherDTO.setInfo(sc.next());
		System.out.println("습도 입력");
		weatherDTO.setHum(sc.nextInt());
		return ar.add(weatherDTO);
	}

	// 삭제 하는 기능
	public boolean delete(List<WeatherDTO> ar, Scanner sc) {
		boolean result = false;
		System.out.println("도시명을 입력");
		String city = sc.next();
		for (WeatherDTO weatherDTO : ar) {
			if (weatherDTO.getCity().equals(city)) {
				// 지우는 메서드 오브젝트 기준으로 지움
				result = ar.remove(weatherDTO);
				break;
			}
		}
		return result;
	}
		// 저장
		public void save(List<WeatherDTO>ar, Scanner sc) throws Exception{
			// 1. 파일에 작성
			// 2. 파일명은 save.txt
			// ## 날씨정보
			// 도시명-기온=정보-습도
			// 도시명-기온=정보-습도
			// 파일을 가져오는 flow
			// 20231220
			Calendar cal = Calendar.getInstance();
			int year=cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONDAY)+1;
			int day=cal.get(Calendar.DAY_OF_MONTH);
			System.out.println(year+"년"+month+"월"+day);
			
			File file2 = new File("C:\\study\\weather.txt");
			FileReader re = new FileReader(file2);
			BufferedReader bf = new BufferedReader(re);
			
			File file = new File("C:\\study\\save.txt");
			FileWriter fw = new FileWriter(file);
			while(true) {
				String a = bf.readLine();
				if(a==null) {
					break;
				}
				fw.write(a+"\r");
			}
//				System.out.println("입력하셈");
//				String dml = sc.next();
//				fw.write(dml+"\r");
//				fw.flush();
//				if(file2.exists()==file2.exists()) {
//					file2.renameTo(file2);
//				}
		}	

	
}
