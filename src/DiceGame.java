import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static final int COUNT = 0;
    public static final int WIN = 1;
    public static final int LOSE = 2;
    public static final int DRAW = 3;

    public static void GetDice(int[] array){
        var r = new Random();
        //サイコロの目を格納
        for(var i = 0; i<array.length; i++) {
            array[i] = (r.nextInt(6) + 1);
        }
    }

    public static int DiceSum(int[] array){
        var sum = 0;
        //サイコロの目を格納
        for(var i = 0; i<array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int GetInt_Input(){
        var sc = new Scanner(System.in);
        var num = sc.nextLine();
        return Integer.parseInt(num);
    }

    public static String Get_Input(){
        var sc = new Scanner(System.in);
        var s = sc.nextLine();
        return s;
    }

    public static void Game(int playerSum,int cpuSum,int[] battleRecord){
        battleRecord[COUNT]++;

        if(playerSum > cpuSum){
            System.out.println("Playerの勝ちです。");
            battleRecord[WIN]++;
        }else if(playerSum < cpuSum){
            System.out.println("Cpuの勝ちです。");
            battleRecord[LOSE]++;
        }else{
            System.out.println("同点です。");
            battleRecord[DRAW]++;
        }

        System.out.println(battleRecord[COUNT] +"戦 "+battleRecord[WIN]+"勝 "+battleRecord[LOSE]+"敗 "+ battleRecord[DRAW] +"引き分け");
    }
}
