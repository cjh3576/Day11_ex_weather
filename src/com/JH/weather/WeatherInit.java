package com.JH.weather;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class WeatherInit {
	private String info;
	private Scanner sc;

	public WeatherInit() {
		info = "seoul, 맑음, 10, 20, 0.3, Daejon, 비, 22, 50, 0.1, incheon, 태풍, 56, 90, 22.2, jeju, 흐림, 15, 10, 1.2";
		sc = new Scanner(System.in);
	}

	public Weather setWeather() {
		Weather weather = new Weather();
		System.out.println("도시를 입력하세요");
		weather.setCity(sc.next());
		System.out.println("날씨를 입력하세요");
		weather.setState(sc.next());
		System.out.println("기온을 입력하세요");
		weather.setGion(sc.nextInt());
		System.out.println("습도를 입력하세요");
		weather.setHum(sc.nextInt());
		System.out.println("미세먼지 농도를 입력하세요");
		weather.setMise(sc.nextDouble());

		return weather;
	}

	public ArrayList<Weather>  getWeathers() {
		ArrayList<Weather> ar = new ArrayList<Weather>();
		String[] a = info.split(",");

		//		Weather [] weathers = new Weather[a.length/5];
		//		int index = 0;
		/*
		  StringTokenizer st = new StringTokenizer(info, ",");
		 
		while(st.hasMoreTokens()) {
			Weather w = new Weather();
			w.setCity(st.nextToken().trim());
			
			ar.add(w);
		}
		*/
		for(int i=0; i<a.length;i++) {
			Weather w = new Weather();
			w.setCity(a[i].trim());
			w.setState(a[++i].trim());
			w.setGion(Integer.parseInt(a[++i].trim()));
			w.setHum(Integer.parseInt(a[++i].trim()));
			w.setMise(Double.parseDouble(a[++i].trim()));
			//			weathers[index] = w;
			//			ar.add(weathers[index]);
			//			index++;
			ar.add(w);
			
		}
		return ar;
	}

	public Weather findWeather(ArrayList<Weather> ar) {
		//도시를 입력하면 그 도시의 날씨가 출력
		System.out.println("어떤 도시의 날씨를 출력할까요");
		String c = sc.next();
		Weather weather = new Weather();
		int i = 0;
		for(i=0; i<ar.size(); i++) {
			if(ar.get(i).getCity().equals(c)) {
//				weather.setState(ar.get(i).getState()); 
				weather = ar.get(i);
				break;
			}
			else if(ar.get(i).getCity().isEmpty()){
				System.out.println("검색한 도시가 없거나 날씨 정보가 없습니다");
				break;
			}	
		}//for문
		return weather;
	}
	
	public void deleteWeather(ArrayList<Weather> ar) {
		System.out.println("어떤 도시의 날씨를 삭제할까요");
		String c = sc.next();

		for(int i=0; i<ar.size(); i++) {

			if( ar.get(i).getState() == null) {
				System.out.println("검색한 도시가 없거나 날씨 정보가 없습니다");
				break;
			}
			else if(ar.get(i).getCity().equals(c)) {
				
//				ar.get(i).setState(null);
//				Weather w = ar.get(i);
				ar.remove(i);
				System.out.println("날씨가 삭제되었습니다");
				break;
			}

			else if(ar.get(i).getCity().isEmpty()) {
				System.out.println("검색한 도시가 없거나 날씨 정보가 없습니다");
				break;
			}
		}
	}
}


