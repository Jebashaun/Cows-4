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
        int value = 1;
        while (value <= stop) {
            feed.give(value);
            value = value * 2 + 1;
        }
    }
    
    public void runSequence2(Intake feed, int stop){
        int value = 1;
        while (value <= stop) {
            feed.give(value);
            value = value * 2 + 2;
        }
    }
    
    public void runSequence4(Intake feed, int n){
        int x = -1;
        for (int i = 0; i < n; i++){
            x *= -1;
            feed.give(x);
        }
    }
    
    public void runSequence5(Intake feed, int n){
        int x = 1;
        feed.give(x);
        for (int i = 1; i < n; i++){
            x *= -10;
            feed.give(x);
        }
    }
    
    public void runSequence7(Intake feed, int stop){
        int num = 1;
        int step = 1;
        int count = 0;
        while (num <= stop){
            if(count == 0){
                feed.give(num);
                num += step;
                step++;
                if (step == 4){
                    count = 1;
                }
            } else {
                feed.give(num);
                num += step;
                step--;
                if (step == 0) {
                    count = 0;
                }
            }
        }
        
    
    }
    
    public void runSequence8(Intake feed, int n){
        int num = 1;
        int count = 1;
        int feedCount = 0;
        while (num <= n){
            for (int i = 0; i < count; i++){
                if (feedCount >= n) { return; }
                feed.give(num);
                feedCount++;
            }
            num++;
            count++;
        }
    }
}
