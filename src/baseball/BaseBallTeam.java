package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;
    
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setWin(int win) {
        this.win = win;
    }
    
    public void setLose(int lose) {
        this.lose = lose;
    }
    
    public void setDraw(int draw) {
        this.draw = draw;
    }
    
    public double getRate() {
        if (win + lose == 0) {
            return 0.0;
        }
        return (double) win / (win + lose);
    }
    
    public void report() {
        System.out.println(this.name + "の2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" + getRate() + "です。");
    }
}
