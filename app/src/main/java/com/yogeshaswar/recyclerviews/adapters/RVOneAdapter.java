package com.yogeshaswar.recyclerviews.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yogeshaswar.recyclerviews.R;
import com.yogeshaswar.recyclerviews.models.RvOneModel;

import java.util.List;

public class RVOneAdapter extends RecyclerView.Adapter<RVOneAdapter.RVOneViewHolder>{
    Context context;
    List<RvOneModel> nameList;

    public RVOneAdapter(Context context, List<RvOneModel> nameList) {
        this.context = context;
        this.nameList = nameList;
    }

    @NonNull
    @Override
    public RVOneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_one_card, parent, false);
        return new RVOneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVOneViewHolder holder, int position) {
        holder.name.setText(nameList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public class RVOneViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        public RVOneViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
        }
    }
}
