package com.fc.model;

public class Config {
	private Integer cid;
	private String name;
	private String value;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Config [cid=" + cid + ", name=" + name + ", value=" + value
				+ "]";
	}

}
