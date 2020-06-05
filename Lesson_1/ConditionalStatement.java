public class ConditionalStatement {
    public static void main(String[] args) {
      int age = 50;
      if(age > 20) {
         System.out.println("Ты можешь быть дедушкой");
      } 

      boolean isMale = true;
      if(isMale) {
          System.out.println("Ты можешь быть папой");
      }
      if(!isMale) {
          System.out.println("Ты не можешь быть папой");
      }

      double Height = 1.72;
      if(Height > 1.80) {
          System.out.println("Ты высокий");
      } else {
          System.out.println("Ты среднего роста");
      }

      char firstNameLetter = 'D';
      if(firstNameLetter == 'M') {
          System.out.println("Тебя зовут Миша");
      } else if(firstNameLetter == 'I') {
          System.out.println("Тебя зовут Илья");
      } else {
        System.out.println("Тебя зовут Даниил");
      }
   }
}