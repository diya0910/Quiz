import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Student student = new Student();
    Quiz quiz = new Quiz();

    String tempPassword = "1234";
    int score = 0;
    int maxAttempts = 1;
    Scanner keyboardInput = new Scanner(System.in);

    boolean validInput = false;
    boolean retake = false;

    while (validInput == false) {
      System.out.println("Enter your name:");
      String name = keyboardInput.nextLine();
      student.setStudentName(name);

      System.out.println("Enter your student id:");
      String registration = keyboardInput.nextLine();
      student.setRegistration(registration);

      System.out.println("Enter the password:");
      String password = keyboardInput.nextLine();
      student.setStudentPassword(password);
      student.setNumberOfAttempts(maxAttempts);
      if (password.equals(tempPassword)) {
        while (retake == false) {
          validInput = true;
          quiz.storeQuestions(student);

          System.out.println("Do you want to retake the test?\n --IF yes, press Y!\n --IF no, press N!");
          String retakeInput = keyboardInput.nextLine();
          retakeInput = retakeInput.toLowerCase();

          if (retakeInput.equals("y")) {
            retake = false;
            maxAttempts++;
            student.setNumberOfAttempts(maxAttempts);
            System.out.println(maxAttempts);
          } else {
            retake = true;
            System.out.println("THANKYOU");
          }

        }
      } else {
        System.out.println("false");
        validInput = false;

      }

    }

  }
}