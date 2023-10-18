package com.btd.myshop.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.btd.myshop.R;
import com.btd.myshop.models.HightTechItem;

import java.util.List;

public class HightTechItemAdapter extends BaseAdapter {
    private Context context;
    private List<HightTechItem> hightTechItemList;
    private LayoutInflater inflater;



    public HightTechItemAdapter(Context context, List<HightTechItem> hightTechItemList){
        this.context=context;
        this.hightTechItemList=hightTechItemList;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return hightTechItemList.size();
    }

    @Override
    public HightTechItem getItem(int position) {
        return hightTechItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=inflater.inflate(R.layout.adapter_item,null);

        HightTechItem currentItem=getItem(position);
        String itemName= currentItem.getName();
        String mnemonic= currentItem.getMnemonic();
        double itemPrice= currentItem.getPrice();

        ImageView itemIconView=convertView.findViewById(R.id.item_icon);
        String resourceName= "item_" + mnemonic + "_icon";
        Log.d("MyTag", resourceName);
        int resId=context.getResources().getIdentifier(resourceName,"drawable",context.getPackageName());

        itemIconView.setImageResource(resId);

        TextView itemNameView=convertView.findViewById(R.id.item_name);
        itemNameView.setText(itemName);

        TextView itemPriceView=convertView.findViewById(R.id.item_price);
        itemPriceView.setText(itemPrice+"$");

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Vous voulez acheter un "+itemName+ " pour le prix de "+ itemPrice+" $", Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
