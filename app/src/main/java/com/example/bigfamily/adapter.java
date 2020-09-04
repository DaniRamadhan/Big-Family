package com.example.bigfamily;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.CardAdapter> {
    private ArrayList<List> list_adapter;

    public adapter(ArrayList<List> list){
        this.list_adapter = list;
    }
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    @NonNull
    @Override
    public CardAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview, viewGroup, false);
        return new CardAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final adapter.CardAdapter holder, final int position) {
        final List list = list_adapter.get(position);
        Glide.with(holder.itemView.getContext())
                .load(list.getImg())
                .apply(new RequestOptions().override(75,75))
                .into(holder.img);

        holder.tvName.setText(list.getName());
        holder.tvAge.setText(list.getAge());
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(list_adapter.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list_adapter.size();
    }

    static class CardAdapter extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tvName,tvAge;
        CardAdapter(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_item);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvAge = itemView.findViewById(R.id.tv_item_age);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(List data);
    }
}
