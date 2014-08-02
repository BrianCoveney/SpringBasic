package com.spring.tutorial;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class InjectCollections {

	private List<Integer> integerList;
	private Set<Integer> integerSet;
	private Map<String, String> map;
	
	
	public List<Integer> getIntegerList() {
		return integerList;
	}
	
	public void setIntegerList(List<Integer> integerList) {
		this.integerList = integerList;
	}
	
	public Set<Integer> getIntegerSet() {
		return integerSet;
	}
	
	public void setIntegerSet(Set<Integer> integerSet) {
		this.integerSet = integerSet;
	}
	
	public Map<String, String> getMap() {
		return map;
	}
	
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	
	
}
