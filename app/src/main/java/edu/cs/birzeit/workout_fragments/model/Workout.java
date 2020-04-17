package edu.cs.birzeit.workout_fragments.model;

public class Workout {
    private String name;
    private String desc;


    public Workout(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public static final Workout[] getWorkouts(){
        Workout[] workouts = new Workout[3];
        workouts[0] = new Workout("Running",
                "run 3 times every week \n each time 30 minutes");
        workouts[1] = new Workout("Squat",
                "Do 3 sets of squats, \n30 reps each");
        workouts[2] = new Workout("Pushups",
                "Do 4 sets \n 20 each");

        return workouts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    @Override
    public String toString() {
        return name;
    }
}
