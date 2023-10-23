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
        int x = 0, y = 0;
        while (x < 2000){
            g.setColor(Color.white);
            g.fillRect(x*3, y*3, 300, 500);
            g.setColor(Color.gray);
            g.drawRect(x*3, y*3, 300, 500);
            x += 6 ;
            y += 6;
        }
    }
    
    public void paintCornerWeb(Graphics g){
      int x1 = 0;
      int y1 = 600;
      while (y1>=0){
        g.setColor(Color.WHITE);
        g.drawLine(x1,0,0,y1);
        x1=x1+10;
        y1=y1-10;

    }
    }
    
    public void paintRedRange(Graphics g){
        int x = 0;
        
        while (x < 255){
            Color color = new Color(x, 0 ,0);
            System.out.println(color);
            g.setColor(color);
            g.drawLine(x, 0, x, 500);
            x++;
        }
    }
    
    public void paintXBox(Graphics g){
        int x = 0;
        g.setColor(Color.WHITE);
        while (x < 240){
            g.fillRect(x, 0, 10, 10);
            x += 15;
        }
        x = 0;
        while (x <= 240){
            g.fillRect(x, 240, 10, 10);
            x += 15;
        }
        int y = 0;
        while (y < 240){
            g.fillRect(0, y, 10, 10);
            y += 15;
        }
        y = 0;
        while (y < 240){
            g.fillRect(240, y, 10, 10);
            y += 15;
        }
        x = 0;
        while (x < 240){
            g.fillRect(x, x, 10, 10);
            g.fillRect(240 - x, x, 10, 10);
            x += 15;
        }
        
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
