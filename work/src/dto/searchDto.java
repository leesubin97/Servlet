package dto;

import java.io.Serializable;
import java.util.Arrays;

public class searchDto implements Serializable {
	private String name;
	private String age;
	private String uniS;
	private String favor;
	
	public searchDto() {
		
	}

	public searchDto(String name, String age, String uniS, String favor) {
		super();
		this.name = name;
		this.age = age;
		this.uniS = uniS;
		this.favor = favor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getUniS() {
		return uniS;
	}

	public void setUniS(String uniS) {
		this.uniS = uniS;
	}

	public String getFavor() {
		return favor;
	}

	public void setFavor(String favor) {
		this.favor = favor;
	}

	@Override
	public String toString() {
		return "searchDto [name=" + name + ", age=" + age + ", uniS=" + uniS + ", favor=" + favor
				+ "]";
	}
	
	
}
