import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Myrtle extends Turtle
{
    public Myrtle(JPanel world, Block [][] map, char direction, int row, int col, int fruitCount){
        super(world, map, direction, row, col, fruitCount);
    }

    //Level 1

    public void move(int numSteps){
        for (int i = 0; i < numSteps; i++){
            super.move();
        }
    }

    public void moveToWall(){
        while(super.frontIsClear()){
            super.move();
        }
    }

    //Level 2

    public void moveToFruit(){
        while(super.frontIsClear() && !super.isNextToFruit()){
            super.move();
        }
    }

    public void pickFruit(int numFruit){
        for (int i = 0; i < numFruit; i++){
            super.pickFruit();
        }
    }

    //Level 3

    public void pickAllFruit(){
        while(super.hasFruit()){
            super.pickFruit();
        }
    }

    public void placeRow(int numSteps){
        
    }

    //Level 4

    public void pickRow(int numSteps){
        
    }

    public void pickAllFruitToWall(){
        
    }

    //Level 5

    public void placeGrid(int width, int height){
        
    }

    public void searchForFruit(){
        
    }

    //Level 6

    public void harvestEverything(){
        
    }

    public void findFruitInMaze(){
        
    }

}
