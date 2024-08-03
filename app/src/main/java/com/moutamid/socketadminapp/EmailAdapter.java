package com.moutamid.socketadminapp;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.EmailViewHolder> {

    private List<UserEmail> emailList;

    public EmailAdapter(List<UserEmail> emailList) {
        this.emailList = emailList;
    }

    @NonNull
    @Override
    public EmailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_email, parent, false);
        return new EmailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmailViewHolder holder, int position) {
        UserEmail userEmail = emailList.get(position);
        holder.tvEmail.setText(userEmail.getEmail());

        if ("online".equals(userEmail.getStatus())) {
            holder.tvStatusOffline.setVisibility(View.GONE);
            holder.tvStatusOnline.setVisibility(View.VISIBLE);
        } else {

            holder.tvStatusOffline.setVisibility(View.VISIBLE);
            holder.tvStatusOnline.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return emailList.size();
    }

    public static class EmailViewHolder extends RecyclerView.ViewHolder {
        TextView tvEmail;
        ImageView tvStatusOnline,tvStatusOffline ;
        public EmailViewHolder(@NonNull View itemView) {
            super(itemView);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            tvStatusOnline = itemView.findViewById(R.id.tvStatusOnline);
            tvStatusOffline = itemView.findViewById(R.id.tvStatusOffline);
        }
    }
}
