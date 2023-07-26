package com.fisa.model.domain.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity //(name = "deptcopy")
public class DeptCopy {
	@Id
	private int deptNo;
	private String dname;
	private String loc;
}
