package com.JH.weather;

import java.util.ArrayList;



public class WeatherView {
	public void view(ArrayList<Weather> ar) {
		for(int i = 0; i<ar.size(); i++) {
			
			System.out.println("지역 : " + ar.get(i).getCity());
			System.out.println("날씨 : " + ar.get(i).getState() );
			System.out.println("기온 : " + ar.get(i).getGion());
			System.out.println("습도 : " + ar.get(i).getHum());
			System.out.println("미세먼지 농도 : " + ar.get(i).getMise());
			System.out.println("===========================");
		}
	}
	
	public void view(Weather w) {
		if(!(w.getState() == null))
		System.out.println("날씨 : " + w.getState());
		
	}
	public void view(String str) {
		System.out.println(str);
		
	}
}
