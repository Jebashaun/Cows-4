import java.awt.*;
import java.util.*;

public class Painter
{

    public void paintVerticalLines(Graphics g){
        int x = 0;
        while (x < 500){
            g.setColor(Color.white);
            g.drawLine(x, 0, x, 500);
            x += 5;
        }        
    }
    

    public void paintHorizontalLines(Graphics g){
        int y = 0;
        while (y < 500){
            g.setColor(Color.white);
            g.drawLine(0, y, 500, y);
            y += 5;
        }
    }
    
    public void paintRowOfBoxes(Graphics g){
        int x = 0;
        while (x < 50000){
            g.setColor(Color.white);
            g.fillRect(x, 0, 50, 50);
            x += 60;
        }
    }
    
    public void paintPaperStack(Graphics g){
        for(int i = 1; i <  2000; i += 6){
            g.setColor(Color.white);
            g.fillRect(i*3, i*3, 300, 500);
            g.setColor(Color.gray);
            g.drawRect(i*3, i*3, 300, 500);
        }
    }
    
    public void paintCornerWeb(Graphics g){
        for (int i = 0; i < 2000; i+= 5) {
            for (int j = 0; j < 2000; j += 5) {
                g.drawLine(2000 - i, j, 2000 - j,i);
            }
        }
    }
    
    public void paintRedRange(Graphics g){
        // for(int i = 0; i <  2000; i++){
        //     g.setColor(new Color((i * 0.1285f), 0, 0));
        //     g.drawLine(i, 0, i, 2000);
        // }
    }
    
    public void paintXBox(Graphics g){
        
    }

    public void paintDreamCatcher(Graphics g){
        
    }
    
    public void paintBowTie(Graphics g){
        
    }
    
    public void paintBoxGrid(Graphics g){
        
    }
    
    public void paintBrickWall(Graphics g){
        
    }
    
    public void paintMultiplicationTable(Graphics g){
        
    }
    
    public void paintWallPaper70s(Graphics g){
        
    }
    
    public void paintTiledFloor(Graphics g){
        
    }
    
    public void paintPatchWork(Graphics g){
        
    }
    
    public void paintTubularTwo(Graphics g){
        
    }
    
}
