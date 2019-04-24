package com.JH.weather;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	private Scanner sc;
	private WeatherInit wi;
	private WeatherView wv;
	private ArrayList<Weather> weathers;
	
	public WeatherController() {
		sc = new Scanner(System.in);
		wi = new WeatherInit();
		wv = new WeatherView();
		weathers = new ArrayList<Weather>();
	}

	public void Start() {
		boolean check = true;
		weathers =wi.getWeathers();

		while(check) { 
			System.out.println("1. 날씨 정보 추가    2. 날씨 검색   3. 날씨 삭제  4.  날씨 전체 정보 출력   5. 종료");
			int num = sc.nextInt();
			switch(num) {
			case 1: 
				weathers.add(wi.setWeather());
				break;
			case 2:
				wv.view(wi.findWeather(weathers));
				break;
			case 3: 
				wi.deleteWeather(weathers);
				break;
			case 4:
				wv.view(weathers);
				break;
			case 5:
				check = !check;
				break;
			}
		}
	}

}
