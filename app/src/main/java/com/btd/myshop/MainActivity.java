package com.btd.myshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.btd.myshop.adapters.HightTechItemAdapter;
import com.btd.myshop.models.HightTechItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<HightTechItem> hightTechItemList=new ArrayList<>();

        hightTechItemList.add(new HightTechItem("Ordinateur Fixe","computer",1000));
        hightTechItemList.add(new HightTechItem("Processeur x2000","cpu",200));
        hightTechItemList.add(new HightTechItem("Super Clavier","keyboard",50));

        ListView shopListView=(ListView) findViewById(R.id.shop_list_view);
        shopListView.setAdapter(new HightTechItemAdapter(this,hightTechItemList));

    }
}