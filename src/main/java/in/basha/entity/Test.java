package in.basha.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String testName;
	private Integer numberOfQuestion;
	private String testDuration;
	@ElementCollection
	private List<String> topicCoverd;
	@OneToMany(mappedBy = "test",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
	private Questions questions;

}
