package site.metacoding.demo.domain;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String username;
	private String password;
	private String email;
}
