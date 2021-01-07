package programmer.zaman.now.database.entity;

public class Comment {

  private Integer id;

  private String email;

  private String comment;

  public Comment() {
  }

  public Comment(String email, String comment) {
    this.email = email;
    this.comment = comment;
  }

  public Comment(Integer id, String email, String comment) {
    this.id = id;
    this.email = email;
    this.comment = comment;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}
