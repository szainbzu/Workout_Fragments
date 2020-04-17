package edu.cs.birzeit.workout_fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.cs.birzeit.workout_fragments.model.Workout;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {

    private int id;
    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view !=null){
            TextView txtName = view.findViewById(R.id.txtTitle);
            TextView txtDesc = view.findViewById(R.id.txtDescription);
            Workout[] arr = Workout.getWorkouts();
            txtName.setText(arr[id].getName());
            txtDesc.setText(arr[id].getDesc());
        }
    }

    public void setId(long id){
        this.id = (int)id;
    }

}
