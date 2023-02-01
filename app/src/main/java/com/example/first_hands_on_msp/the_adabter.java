package com.example.first_hands_on_msp;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class the_adabter extends RecyclerView.Adapter<the_adabter.itemviewholder>
{

    @NonNull
    @Override
    public the_adabter.itemviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull the_adabter.itemviewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class itemviewholder {

    }
}
