package spring.model.qna;

public class QnaDTO {
	private int qna_num; // NUMBER NOT NULL,
	private String qna_title; // VARCHAR(30) NULL,
	private String qna_content; // VARCHAR(500) NULL,
	private String qna_date; // DATE NULL,
	private String qna_type; // VARCHAR(30) NULL,
	private String qna_pw; // VARCHAR(30) NULL,
	private int qna_grpno; // NUMBER NULL,
	private int qna_indent; // NUMBER NULL,
	private int qna_ansnum; // NUMBER NULL,
	private int qna_refnum; // NUMBER NULL,
	
	
	public int getQna_refnum() {
		return qna_refnum;
	}

	public void setQna_refnum(int qna_refnum) {
		this.qna_refnum = qna_refnum;
	}

	private String id; // VARCHAR(30) NOT NULL,
						// PRIMARY KEY (qna_num), FOREIGN KEY (id)

	public QnaDTO() {
   		super();
   		// TODO Auto-generated constructor stub
   	}

	public QnaDTO(int qna_num, String qna_title, String qna_content, String qna_date, String qna_type, String qna_pw, int qna_grpno, int qna_indent, int qna_ansnum, String id) {
   		super();
   		this.qna_num = qna_num;
   		this.qna_title = qna_title;
   		this.qna_content = qna_content;
   		this.qna_date = qna_date;
   		this.qna_type = qna_type;
   		this.qna_pw = qna_pw;
   		this.qna_grpno = qna_grpno;
   		this.qna_indent = qna_indent;
   		this.qna_ansnum = qna_ansnum;
   		this.id = id;
   	}
	
	@Override
	public String toString() {
		return "QnaDTO [qna_num=" + qna_num + ", qna_title=" + qna_title + ", qna_content=" + qna_content
				+ ", qna_date=" + qna_date + ", qna_type=" + qna_type + ", qna_pw=" + qna_pw + ", qna_grpno="
				+ qna_grpno + ", qna_indent=" + qna_indent + ", qna_ansnum=" + qna_ansnum + ", id=" + id + "]";
	}

	public int getQna_num() {
		return qna_num;
	}

	public void setQna_num(int qna_num) {
		this.qna_num = qna_num;
	}

	public String getQna_title() {
		return qna_title;
	}

	public void setQna_title(String qna_title) {
		this.qna_title = qna_title;
	}

	public String getQna_content() {
		return qna_content;
	}

	public void setQna_content(String qna_content) {
		this.qna_content = qna_content;
	}

	public String getQna_date() {
		return qna_date;
	}

	public void setQna_date(String qna_date) {
		this.qna_date = qna_date;
	}

	public String getQna_type() {
		return qna_type;
	}

	public void setQna_type(String qna_type) {
		this.qna_type = qna_type;
	}

	public String getQna_pw() {
		return qna_pw;
	}

	public void setQna_pw(String qna_pw) {
		this.qna_pw = qna_pw;
	}

	public int getQna_grpno() {
		return qna_grpno;
	}

	public void setQna_grpno(int qna_grpno) {
		this.qna_grpno = qna_grpno;
	}

	public int getQna_indent() {
		return qna_indent;
	}

	public void setQna_indent(int qna_indent) {
		this.qna_indent = qna_indent;
	}

	public int getQna_ansnum() {
		return qna_ansnum;
	}

	public void setQna_ansnum(int qna_ansnum) {
		this.qna_ansnum = qna_ansnum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
