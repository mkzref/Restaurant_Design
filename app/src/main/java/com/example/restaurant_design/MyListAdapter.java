package com.example.restaurant_design;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private Context mcontext;
    private List<Resturant> listdata;


    public MyListAdapter(Context mcontext, List<Resturant> listdata) {
        this.mcontext = mcontext;
        this.listdata = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.listitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Resturant myListData = listdata.get(position);
        holder.img.setImageResource(listdata.get(position).getimag());
        holder.nameitem.setText(listdata.get(position).getnameitem());
        holder.countsitem.setText(listdata.get(position).getnumbersitem());

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (holder.getAdapterPosition() == 0) {

                    //Intent intent = new Intent(mcontext, Jordan_Activity.class);

                  //  mcontext.startActivity(intent);
                }

                if (holder.getAdapterPosition() == 1) {

                //    Intent intent = new Intent(mcontext, PalestineActivity.class);

                   // mcontext.startActivity(intent);
                }

                if (holder.getAdapterPosition() == 2) {

               //     Intent intent = new Intent(mcontext, QatarActivity.class);

                //    mcontext.startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameitem;
        public TextView countsitem;
        public ImageView img;
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.img = itemView.findViewById(R.id.list_item1_imageView);
            this.nameitem = itemView.findViewById(R.id.list_item1_title_textView);
            this.countsitem = itemView.findViewById(R.id.list_item1_itemsCount_textView);


        }
    }
}
