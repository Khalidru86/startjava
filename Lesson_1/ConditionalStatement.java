public class ConditionalStatement{
    public static void main(String[] args) {
    int myAge = 36;
    if(myAge > 20) {
         System.out.println("Я могу быть дедушкой");
    } 
    boolean iAmMale = true;
    if (iAmMale = true) {
        System.out.println("Я могу быть папой");
    }
    boolean iAmNotMale = !false;
    if (iAmNotMale = !false) {
        System.out.println("Я не могу быть мамой");
    }
    double myHeight = 1.72;
    if (myHeight > 1.80) {
        System.out.println("Я высокий");
    }
    else {System.out.println("Я среднего роста");
    }
    char myNameBeginsWithALetterD = 'D';
    char myNameBeginsWithALetterM = 'D';
    char myNameBeginsWithALetterI = 'D';
    if (myNameBeginsWithALetterM == 'M') {
        System.out.println("Меня зовут Миша");
    }
    else if (myNameBeginsWithALetterI == 'I') {
        System.out.println("Меня зовут Илья");
    }
    else {
        System.out.println("Меня зовут Даниил");
    }
  }
}