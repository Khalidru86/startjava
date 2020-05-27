public class ConditionalStatement {
    public static void main(String[] args) {
      int Age = 50;
      if(Age > 20) {
         System.out.println("Ты можешь быть дедушкой");
      } 

      boolean isMale = true;
      if(isMale) {
          System.out.println("Ты можешь быть папой");
      }
      if(!isMale) {
          System.out.println("Ты не можешь быть папой");
      }

      double isHeight = 1.72;
      if(isHeight > 1.80) {
          System.out.println("Ты высокий");
      } else {
          System.out.println("Ты среднего роста");
      }

      char firstNameLetterD = 'D';
      if(firstNameLetterD == 'M') {
          System.out.println("Тебя зовут Миша");
      } else if(firstNameLetterD == 'I') {
          System.out.println("Тебя зовут Илья");
      } else {
        System.out.println("Тебя зовут Даниил");
      }
   }
}