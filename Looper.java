public class Looper
{
    public void countUpTo10(Intake feed){
        for (int i = 1; i <= 10; i++) {
            feed.give(i);
        }
    }
    
    public void countDownFrom10(Intake feed){
        for (int i = 10; i > 0; i--) {
            feed.give(i);
        }
    }
    
    public void countUpToX(Intake feed, int x){
        for (int i = 1; i <= x; i++) {
            feed.give(i);
        }
    }
    
    public void countDownFromX(Intake feed, int x){
        for (int i = x; i > 0; i--) {
            feed.give(i);
        }
    }
    
    public void countUpToXfromYbyA(Intake feed, int x, int y, int a){
        for (int i = y; i <= x; i += a) {
            feed.give(i);
        }
    }
    
    public void countDownFromXtoYbyA(Intake feed, int x, int y, int a){
        for (int i = x; i >= y; i -= a) {
            feed.give(i);
        }
    }
    
    public void runSequence1(Intake feed, int stop){
        double num = 1;
        while (num != stop) {
            num += Math.pow(2.0, num);
        }
    }
    
    public void runSequence2(Intake feed, int stop){
        double num = 1;
        while (num != stop) {
            num += 3 * i;
        }
    }
    
    public void runSequence4(Intake feed, int n){
        
    }
    
    public void runSequence5(Intake feed, int n){
        
    }
    
    public void runSequence7(Intake feed, int stop){
        
    }
    
    public void runSequence8(Intake feed, int n){
        
    }
}
