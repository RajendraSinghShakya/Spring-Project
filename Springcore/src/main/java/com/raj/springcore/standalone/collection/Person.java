package com.raj.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
private List<String> friends;
private Properties prop;
private  Map<String, Integer>feestructure;

public Properties getProp() {
	return prop;
}

public void setProp(Properties prop) {
	this.prop = prop;
}

public Map<String, Integer> getFeestructure() {
	return feestructure;
}

@Override
public String toString() {
	return "Person [friends=" + friends + ", feestructure=" + feestructure + "]";
}

public void setFeestructure(Map<String, Integer> feestructure) {
	this.feestructure = feestructure;
}



public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

}
