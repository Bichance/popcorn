package spring.model.movie;

public class MovieDTO {
	
	 int movie_num;
	 String movie_name;
	 int movie_price;
	 String movie_content;
	 String movie_genre;
	 String movie_grade;
	 String movie_cast;
	 String movie_date;
	 
	 
	public int getMovie_num() {
		return movie_num;
	}
	public void setMovie_num(int movie_num) {
		this.movie_num = movie_num;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public int getMovie_price() {
		return movie_price;
	}
	public void setMovie_price(int movie_price) {
		this.movie_price = movie_price;
	}
	public String getMovie_content() {
		return movie_content;
	}
	public void setMovie_content(String movie_content) {
		this.movie_content = movie_content;
	}
	public String getMovie_genre() {
		return movie_genre;
	}
	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}
	public String getMovie_grade() {
		return movie_grade;
	}
	public void setMovie_grade(String movie_grade) {
		this.movie_grade = movie_grade;
	}
	public String getMovie_cast() {
		return movie_cast;
	}
	public void setMovie_cast(String movie_cast) {
		this.movie_cast = movie_cast;
	}
	public String getMovie_date() {
		return movie_date;
	}
	public void setMovie_date(String movie_date) {
		this.movie_date = movie_date;
	}
	@Override
	public String toString() {
		return "movieDTO [movie_num=" + movie_num + ", movie_name=" + movie_name + ", movie_price=" + movie_price
				+ ", movie_content=" + movie_content + ", movie_genre=" + movie_genre + ", movie_grade=" + movie_grade
				+ ", movie_cast=" + movie_cast + ", movie_date=" + movie_date + "]";
	}
	
	public MovieDTO(int movie_num, String movie_name, int movie_price, String movie_content, String movie_genre,
			String movie_grade, String movie_cast, String movie_date) {
		super();
		this.movie_num = movie_num;
		this.movie_name = movie_name;
		this.movie_price = movie_price;
		this.movie_content = movie_content;
		this.movie_genre = movie_genre;
		this.movie_grade = movie_grade;
		this.movie_cast = movie_cast;
		this.movie_date = movie_date;
	}
	
	public MovieDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
