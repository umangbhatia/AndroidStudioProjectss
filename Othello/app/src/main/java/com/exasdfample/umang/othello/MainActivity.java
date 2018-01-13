package com.exasdfample.umang.othello;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button bts[] = new Button[64];
    int[] xDir = {-1,-1,-1,0,1,1,1,0};
    int yDir[] = {-1,0,1,1,1,0,-1,-1};
    int count1 = 1;
    int count2 = 1;
    Players player1 = new Players();
    Players player2 = new Players();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            bts[0] = (Button) findViewById(R.id.button1);
        bts[1] = (Button) findViewById(R.id.button2);
        bts[2] = (Button) findViewById(R.id.button3);
        bts[3] = (Button) findViewById(R.id.button4);
        bts[4] = (Button) findViewById(R.id.button5);
        bts[5] = (Button) findViewById(R.id.button6);
        bts[6] = (Button) findViewById(R.id.button7);
        bts[7] = (Button) findViewById(R.id.button8);
        bts[8] = (Button) findViewById(R.id.button9);
        bts[9] = (Button) findViewById(R.id.button10);
        bts[10] = (Button) findViewById(R.id.button11);
        bts[11] = (Button) findViewById(R.id.button12);
        bts[12] = (Button) findViewById(R.id.button13);
        bts[13] = (Button) findViewById(R.id.button14);
        bts[14] = (Button) findViewById(R.id.button15);
        bts[15] = (Button) findViewById(R.id.button16);
        bts[16] = (Button) findViewById(R.id.button17);
        bts[17] = (Button) findViewById(R.id.button18);
        bts[18] = (Button) findViewById(R.id.button19);
        bts[19] = (Button) findViewById(R.id.button20);
        bts[20] = (Button) findViewById(R.id.button21);
        bts[21] = (Button) findViewById(R.id.button22);
        bts[22] = (Button) findViewById(R.id.button23);
        bts[23] = (Button) findViewById(R.id.button24);
        bts[24] = (Button) findViewById(R.id.button25);
        bts[25] = (Button) findViewById(R.id.button26);
        bts[26] = (Button) findViewById(R.id.button27);
        bts[27] = (Button) findViewById(R.id.button28);
        bts[28] = (Button) findViewById(R.id.button29);
        bts[29] = (Button) findViewById(R.id.button30);
        bts[30] = (Button) findViewById(R.id.button31);
        bts[31] = (Button) findViewById(R.id.button32);
        bts[32] = (Button) findViewById(R.id.button33);
        bts[33] = (Button) findViewById(R.id.button34);
        bts[34] = (Button) findViewById(R.id.button35);
        bts[35] = (Button) findViewById(R.id.button36);
        bts[36] = (Button) findViewById(R.id.button37);
        bts[37] = (Button) findViewById(R.id.button38);
        bts[38] = (Button) findViewById(R.id.button39);
        bts[39] = (Button) findViewById(R.id.button40);
        bts[40] = (Button) findViewById(R.id.button41);
        bts[41] = (Button) findViewById(R.id.button42);
        bts[42] = (Button) findViewById(R.id.button43);
        bts[43] = (Button) findViewById(R.id.button44);
        bts[44] = (Button) findViewById(R.id.button45);
        bts[45] = (Button) findViewById(R.id.button46);
        bts[46] = (Button) findViewById(R.id.button47);
        bts[47] = (Button) findViewById(R.id.button48);
        bts[48] = (Button) findViewById(R.id.button49);
        bts[49] = (Button) findViewById(R.id.button50);
        bts[50] = (Button) findViewById(R.id.button51);
        bts[51] = (Button) findViewById(R.id.button52);
        bts[52] = (Button) findViewById(R.id.button53);
        bts[53] = (Button) findViewById(R.id.button54);
        bts[54] = (Button) findViewById(R.id.button55);
        bts[55] = (Button) findViewById(R.id.button56);
        bts[56] = (Button) findViewById(R.id.button57);
        bts[57] = (Button) findViewById(R.id.button58);
        bts[58] = (Button) findViewById(R.id.button59);
        bts[59] = (Button) findViewById(R.id.button60);
        bts[60] = (Button) findViewById(R.id.button61);
        bts[61] = (Button) findViewById(R.id.button62);
        bts[62] = (Button) findViewById(R.id.button63);
        bts[63] = (Button) findViewById(R.id.button64);

        player1.c = Color.WHITE;
        player2.c = Color.BLACK;

    }
    public void OnClick(View v){

    }
    public boolean checkIfMovePossible(Players player ){
        for(int i=0;i<8;i++){
            for(int j=1;j<9;j++){
                ColorDrawable buttonColor = (ColorDrawable) bts[i*8+j].getBackground();
                int colorId = buttonColor.getColor();
                if(colorId == 65280){
                    for(int k=0;k<xDir.length;k++){

                        int stepX = xDir[k];
                        int stepY = yDir[k];
                        int currentX = i + stepX;
                        int currentY = j + stepY;

                        while(currentX>=0&&currentX<=7&&currentY>=1&&currentY<=8){
                            ColorDrawable buttonColor1 = (ColorDrawable) bts[currentX*8+currentY].getBackground();

                            int color = buttonColor1.getColor();
                            System.out.print(color);
                            if(color==65280){
                                break;
                            }else if(color==player.c){
                                if(currentX-stepX == i && currentY-stepY==j){
                                    break;
                                }else{
                                    return true;
                                }

                            }else{
                                currentX +=stepX;
                                currentY +=stepY;
                            }
                        }
                    }

                }
            }
        }
        return false;
    }
    public boolean move(int x, int y, Players player) throws InvalidMove{
        ColorDrawable buttonColor = (ColorDrawable) bts[x*8+y].getBackground();
        int colorId = buttonColor.getColor();
        if(x<0||x>7||y<1||y>8 || colorId!=65280){
            throw new InvalidMove();
        }
        int count = 0;
        boolean moveSuccessful = false;
        for(int i=0;i<xDir.length;i++){

            int stepX = xDir[i];
            int stepY = yDir[i];
            int currentX = x + stepX;
            int currentY = y + stepY;

            while(currentX>=0&&currentX<=7&&currentY>=1&&currentY<=8){
                ColorDrawable buttonColor1 = (ColorDrawable) bts[currentX*8+currentY].getBackground();

                int color = buttonColor1.getColor();
                if(color==65280){
                    break;
                }else if(color==player.c){
                    if(currentX-stepX == x && currentY-stepY==y){
                        break;
                    }else{
                        moveSuccessful = true;
                        bts[x*8+y].setBackgroundColor(player.c);
                        currentX = currentX - stepX;
                        currentY = currentY-stepY;
                        while(true){
                            if(currentX==x&&currentY==y){
                                break;
                            }
                            bts[currentX*8+currentY].setBackgroundColor(player.c);

                            count++;
                            currentX = currentX - stepX;
                            currentY = currentY-stepY;

                        }
                        break;
                    }

                }else{
                    currentX +=stepX;
                    currentY +=stepY;
                }
            }
        }
        if(moveSuccessful){
            if(player == player1){
                count1+=count+1;
                count2-=count;
            }else{
                count2+=count+1;
                count1-=count;
            }
        }
        return moveSuccessful;
    }
}
