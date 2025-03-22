package in.basha.dto;

import java.util.List;

import lombok.Data;

@Data
public class QuestionsDto {

	private String question;
	private String answer;
	private List<String> options;
	private String difficulty;
}
