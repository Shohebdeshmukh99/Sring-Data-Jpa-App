package in.shoheb.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="FAMILY_INFO")
public class Family {
	
	public Family() {
		super();
	}

	@Id
	@Column(name="FAM_ID")
	Integer famId;
	
	@Column(name="USER_NAME")
	String name;
	
	@Column(name="USER_NUM")
	Long number;
	
	@Column(name="USER_AGE")
	Integer age;
	
	@Column(name="NICK_NAME")
	String nickName;
	
	@CreationTimestamp
	private LocalDate createdDate;
	
	@UpdateTimestamp
	private LocalDate updatedDate;

	public Family(Integer famId, String name, Long number, Integer age, String nickName, LocalDate createdDate,
			LocalDate updatedDate) {
		this.famId = famId;
		this.name = name;
		this.number = number;
		this.age = age;
		this.nickName = nickName;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Integer getFamId() {
		return famId;
	}

	public void setFamId(Integer famId) {
		this.famId = famId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "Family [famId=" + famId + ", name=" + name + ", number=" + number + ", age=" + age + ", nickName="
				+ nickName + "]";
	}
	
	
	

}
