package com.example.internproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.MyViewHolder> {
    private  Context context;
    ArrayList<therapist_data> list;
    public DoctorAdapter(Context context, ArrayList<therapist_data> list) {
        this.context = context;
        this.list = list;
    }




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.doctor_card,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        therapist_data data= list.get(position);
        holder.name.setText(data.getName());
        holder.desc.setText(data.getDesc());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name,desc;
        AppCompatButton details;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.card_name);
            desc=itemView.findViewById(R.id.card_desc);
            details=itemView.findViewById(R.id.detail_btn);
            details.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context,Doctor_profile.class);
                    context.startActivity(intent);
                }
            });
        }
    }
}
