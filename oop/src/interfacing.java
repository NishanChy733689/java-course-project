
interface Lol_Code{
    void give_emoji();
    void Lough_Out_Loud();
}


public class interfacing implements Lol_Code{
    @Override
    public void give_emoji(){
        System.out.println("\uD83D\uDE01\uD83D\uDE01");
    }

    @Override
    public void Lough_Out_Loud() {
        System.out.print("Lol\uD83D\uDE02 Lol\uD83D\uDE02 Lol\uD83D\uDE02 Haha-haha\uD83E\uDD23\uD83E\uDD23 LOL\uD83E\uDD23\uD83E\uDD23 LOLOLOLOL ");
    }

    public static void main(String[] args) {
        Lol_Code lol=new interfacing();
        lol.give_emoji();
        lol.Lough_Out_Loud();
    }
}
