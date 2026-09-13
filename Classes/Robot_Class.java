package Classes;

public class Robot_Class {
    public String team_name;
    public int team_num;
    private int ball_scored;
    private int climb_level;

    Robot_Class(int num,String name)
    {
        team_name = name;
        team_num = num;

    }
    public void add_balls(int balls)
    {
    ball_scored += balls;
    }
    public void set_climb_level(int level)
    {
    climb_level = level;
    }
    public int tot_points(int tot_points)
    {
    int climb_points = 0;
    switch(climb_level){
        case 1:
            climb_points = 4;
        case 2:
            climb_points = 6;
        case 3:
            climb_points = 10;
        case 4:
            climb_points = 15;
        }
        tot_points = climb_points+this.ball_scored;
        return tot_points;
    }

}
    