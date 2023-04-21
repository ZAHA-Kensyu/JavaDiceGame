import java.util.Random;
import java.util.Scanner;

public class Main {
    //メソッド
    public static void main(String[] args) {
        boolean isGame = true;
        int [] battleRecord = new int[4];

        do {
            //何回振るか入力
            System.out.println("サイコロを振る回数を指定してください。");
            int shakeNum = DiceGame.GetInt_Input();

            //Player
            int[] player_dice = new int[shakeNum];
            //Cpu
            int[] cpu_dice = new int[shakeNum];

            DiceGame.GetDice(player_dice);//Playerサイコロ格納
            var playerDiceSum = DiceGame.DiceSum(player_dice);//Playerサイコロ合計


            DiceGame.GetDice(cpu_dice);//CPUサイコロ格納
            var cpuDiceSum = DiceGame.DiceSum(cpu_dice);//CPUサイコロ合計

            //出力
            for (var i = 0; i < player_dice.length; i++) {
                System.out.print(player_dice[i] + " ");
            }
            System.out.println("サイコロ合計 Player" + playerDiceSum);

            for (var i = 0; i < cpu_dice.length; i++) {
                System.out.print(cpu_dice[i] + " ");
            }
            System.out.println("サイコロ合計 Cpu" + cpuDiceSum);

            //試合結果
            DiceGame.Game(playerDiceSum,cpuDiceSum,battleRecord);

            System.out.println("ゲームを続けますか?(y/n)");
            var input = DiceGame.Get_Input();

            //続けるか?
            if(input.equals("y") || input.equals("Y")){
                isGame = true;
            }else{
                isGame = false;
            }
        }while(isGame);

        System.out.println("サイコロゲームを終了します。");
    }
}