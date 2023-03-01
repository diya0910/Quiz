public class Student 
{
  String studentName;
  String studentPassword;
  String registration;
  int numberOfAttempts;
  int maximumScore;

  public String getStudentName()
  {
    return studentName;
  }

  public void setStudentName(String name)
  {
    this.studentName = name;
  }

  public String getStudentPassword()
  {
    return studentPassword;
  }

  public void setStudentPassword(String password)
  {
    this.studentPassword = password;
  }

  public String getRegistration() 
  {
    return registration;
  }

  public void setRegistration(String registration)
  {
    this.registration = registration;
  }

  public int getNumberOfAttempts()
  {
    return numberOfAttempts;
  }

  public void setNumberOfAttempts(int attempts)
  {
    this.numberOfAttempts = attempts;
  }

  public int getmaximumScore() 
  {
    return maximumScore;
  }

  public void setmaximumScore(int score)
  {
    this.maximumScore = score;
  }

}