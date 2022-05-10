package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.viewHolder>{

    private final ArrayList<Company> companies ;

    public CompanyAdapter(ArrayList<Company> companies) {
        this.companies = companies;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler_view_row,parent,false) ;
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.textView.setText(companies.get(position).getName());
        Picasso.get().load(companies.get(position).getUrl()).into(holder.imageView); ;
    }

    @Override
    public int getItemCount() {
        return companies.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView ;
        TextView textView ;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image) ;
            textView=itemView.findViewById(R.id.textView) ;

        }
    }
}


