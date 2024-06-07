package com.codestates.seb.gugudan.V3;
import java.util.Scanner;

public class gugudan {
  private Scanner sc = new Scanner(System.in);
  public static final int min_gugudan = 2;
  public static final int max_gugudan = 9;
  public void printGugudan(int num){
    System.out.printf("%d단 이 입력되었습니다.",num);
    System.out.printf(num + "* 1 =  %d\n",num);
    System.out.printf(num + "* 2 =  %d\n",num*2);
    System.out.printf(num + "* 3 =  %d\n",num*3);
    System.out.printf(num + "* 4 =  %d\n",num*4);
    System.out.printf(num + "* 5 =  %d\n",num*5);
    System.out.printf(num + "* 6 =  %d\n",num*6);
    System.out.printf(num + "* 7 =  %d\n",num*7);
    System.out.printf(num + "* 8 =  %d\n",num*8);
    System.out.printf(num + "* 9 =  %d\n",num*9);
  }
  public void printErrorMessage(int num){
    System.out.printf("%d 단 이 입력되었습니다.\n",num);
    System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.\n" +
            "프로그램을 종료합니다.");
  }
  public void gugudanPlay() {
    String reUse = "";
    do {
      reUse = "";
      System.out.println("[안내]희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9)");
      int number = Integer.parseInt(sc.nextLine());
      if (min_gugudan <= number && number <= max_gugudan) {
        printGugudan(number);
        System.out.println("더 사용할거야?");
        reUse = sc.nextLine().toLowerCase();
      } else
        printErrorMessage(number);
    }while (reUse.equals("y"));
  }
}
// V2에 inputNumber 메서드를 지우고 gugudanplay 메서드 안에서 숫자와 재사용 의사를 입력 받음


