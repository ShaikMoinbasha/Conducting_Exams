package in.basha.dto;

import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TestDto {

	@NotBlank(message="Test name should not be empty")
	@Size(max=100,message = "Test name Should be with in 100 characters")
	private String testName;
	
	
	@NotNull(message = "Number of questions is required")
	@Min(value = 1,message = "Atleast 1 question is required")
	@Max(value = 100,message = "Only 100 question is Allowed")
	private Integer numberOfQuestion;
	
	@NotBlank(message="Test Duration should not be empty")
	private String testDuration;
	
	@NotEmpty(message = "Topics are Mandatory")
	
	private List<@NotBlank(message = "Topics are Mandatory")String> topicCoverd;
}
