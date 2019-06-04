package spring.model.qreply;

public class QreplyDTO {
	
	private int qreply_num;
	private String qreply_content;
	private String qreply_date;
	private int qna_num;
	private String id;
	
	
	@Override
	public String toString() {
		return "QreplyDTO [qreply_num=" + qreply_num + ", qreply_content=" + qreply_content + ", qreply_date="
				+ qreply_date + ", qna_num=" + qna_num + ", id=" + id + "]";
	}
	
	public QreplyDTO(int qreply_num, String qreply_content, String qreply_date, int qna_num, String id) {
		super();
		this.qreply_num = qreply_num;
		this.qreply_content = qreply_content;
		this.qreply_date = qreply_date;
		this.qna_num = qna_num;
		this.id = id;
	}

	public int getQreply_num() {
		return qreply_num;
	}
	public void setQreply_num(int qreply_num) {
		this.qreply_num = qreply_num;
	}
	public String getQreply_content() {
		return qreply_content;
	}
	public void setQreply_content(String qreply_content) {
		this.qreply_content = qreply_content;
	}
	public String getQreply_date() {
		return qreply_date;
	}
	public void setQreply_date(String qreply_date) {
		this.qreply_date = qreply_date;
	}
	public int getQna_num() {
		return qna_num;
	}
	public void setQna_num(int qna_num) {
		this.qna_num = qna_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
