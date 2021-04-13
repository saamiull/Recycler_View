package org.samiulhaq.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    List<Friends> friendsList = new ArrayList<Friends>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListAdapter();

    }
    private void setListAdapter() {

        Friends f0 = new Friends(1,"Ali", 1980, "Giglgit");
        Friends f1 = new Friends(2,"Babar", 1981, "Lahore");
        Friends f2 = new Friends(3,"Musa", 1980, "Quetta");
        Friends f3 = new Friends(4,"Abid",1987,"Peshawar");
        Friends f4 = new Friends(5,"Shahid", 1980, "Karachi");
        Friends f5 = new Friends(6,"Zia",1987,"Faisalabad ");
        Friends f6 = new Friends(7,"Badar", 1980, "Rawalpindi");

        int[] images= {R.drawable.ic_person1,R.drawable.ic_person2,R.drawable.ic_person3,
                R.drawable.ic_person4, R.drawable.ic_person5, R.drawable.ic_person6, R.drawable.ic_person7};

        friendsList.addAll(Arrays.asList(new Friends[]{f0,f1,f2,f3,f4,f5,f6}));
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);


        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(friendsList,MainActivity.this,images) {

        };

        recyclerView.setAdapter(adapter);
    }
}