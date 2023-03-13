package com.yogeshaswar.recyclerviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.yogeshaswar.recyclerviews.R;
import com.yogeshaswar.recyclerviews.adapters.RVOneAdapter;
import com.yogeshaswar.recyclerviews.models.RvOneModel;

import java.util.ArrayList;

public class NormalRV extends AppCompatActivity {
RecyclerView rvOne;
ArrayList<RvOneModel> names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_rv);

        rvOne = findViewById(R.id.rv_one);
        rvOne.setLayoutManager(new LinearLayoutManager(this));
        names = new ArrayList<RvOneModel>();
        //populate list
        names.add(new RvOneModel("name 1"));
        names.add(new RvOneModel("name 2"));
        names.add(new RvOneModel("name 3"));
        names.add(new RvOneModel("name 4"));
        names.add(new RvOneModel("name 5"));
        names.add(new RvOneModel("name 6"));
        names.add(new RvOneModel("name 7"));
        names.add(new RvOneModel("name 8"));
        names.add(new RvOneModel("name 9"));
        names.add(new RvOneModel("name 10"));
        names.add(new RvOneModel("name 11"));
        names.add(new RvOneModel("name 12"));
        names.add(new RvOneModel("name 13"));
        names.add(new RvOneModel("name 14"));
        names.add(new RvOneModel("name 15"));
        names.add(new RvOneModel("name 16"));
        names.add(new RvOneModel("name 17"));
        names.add(new RvOneModel("name 18"));
        names.add(new RvOneModel("name 19"));
        names.add(new RvOneModel("name 20"));
        rvOne.setAdapter(new RVOneAdapter(this, names));

    }

    public static class RVTwo extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_rvtwo);
        }
    }
}