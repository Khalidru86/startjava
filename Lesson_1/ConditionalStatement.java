public class ConditionalStatement {
    public static void main(String[] args) {
      int isYourAge = 50;
      if(isYourAge > 20) {
         System.out.println("Ты можешь быть дедушкой");
      } 

      boolean isMale = true;
      if(isMale = true) {
          System.out.println("Ты можешь быть папой");
      }

      boolean isNotMale = true;
      if(isNotMale = true) {
          System.out.println(!false +" Ты не можешь быть мамой");
      }

      double isHeight = 1.72;
      if(isHeight > 1.80) {
          System.out.println("Ты высокий");
      } else{
          System.out.println("Ты среднего роста");
      }

      char isNameBeginsWithALetterD = 'D';
      if(isNameBeginsWithALetterD == 'M') {
          System.out.println("Тебя зовут Миша");
      } else if(isNameBeginsWithALetterD == 'I') {
          System.out.println("Тебя зовут Илья");
      } else {
        System.out.println("Тебя зовут Даниил");
      }
   }
}