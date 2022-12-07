package in.techcamp.issueapp38535;

import lombok.Data;

@Data
public class IssueForm {
    private String title;
    private String content;
    private String period;
    private char importance;
}
