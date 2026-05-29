public class snake {
    private static void render(int[][] total_square) {
        for (int i = 0; i < total_square.length; i++) {
            for (int j = 0; j < total_square[i].length; j++) {
                if(total_square[i][j]==8)System.out.print("* ");
                if(total_square[i][j]==0)System.out.print(total_square[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int mode_selection(int gamemode){
        System.out.println("do you want easy(1) or hard(2)?");
        while(true) {
            int selection = Utils.leerInt();
            switch (selection) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                default:
                    System.out.println("invalid number, try again.");break;
            }
        }
    }
    public static void main(String[] args) {
        int gamemode =0;int total_width =0;int total_height =0;int total_mines =0;int mines=0;

        //1=easy 2=hard
        gamemode = mode_selection(gamemode);
        System.out.println("se selecciono el modo "+gamemode);
        if (gamemode==1){
            total_width =8;
            total_height =8;
        }
        if (gamemode==2){
            total_width =15;
            total_height =15;
        }
        int[][] total_square = new int[total_width][total_height];
        total_mines = (int)((total_width*total_height)*0.15);
        while(mines<total_mines){
            int x =(int)(Math.random()*total_width);
            int y =(int)(Math.random()*total_height);
            if (total_square[x ][y ]==0){
                total_square[x ][y ]=8;
                mines+=1;
            }
        }

        render(total_square);
        //for(int i=0;i<total_mines;i++)
        //int rand = (int)(Math.random() * );
        //System.out.println(rand);

    }
}



