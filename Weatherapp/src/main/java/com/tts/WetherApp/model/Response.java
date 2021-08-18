package com.tts.WetherApp.model;

import java.util.List;
import java.util.Map;

public class Response {
	private Map<String, String> coord;
	private List<Map<String, String>> weather;
	private String base;
	private Map<String, String> main;
	private String dt;
	private Map<String, String> sys;
	private String id;
	private String name;
	private String cod;
	
	public Response() {
		
	}
	
	public Response(Map<String, String> coord, List<Map<String, String>> weather, String base, Map<String, String> main,
			String dt, Map<String, String> sys, String id, String name, String cod) {
		super();
		this.coord = coord;
		this.weather = weather;
		this.base = base;
		this.main = main;
		this.dt = dt;
		this.sys = sys;
		this.id = id;
		this.name = name;
		this.cod = cod;
	}
	public Map<String, String> getCoord() {
		return coord;
	}
	public void setCoord(Map<String, String> coord) {
		this.coord = coord;
	}
	public List<Map<String, String>> getWeather() {
		return weather;
	}
	public void setWeather(List<Map<String, String>> weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Map<String, String> getMain() {
		return main;
	}
	public void setMain(Map<String, String> main) {
		this.main = main;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public Map<String, String> getSys() {
		return sys;
	}
	public void setSys(Map<String, String> sys) {
		this.sys = sys;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	
}
