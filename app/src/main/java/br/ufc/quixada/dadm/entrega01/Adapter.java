package br.ufc.quixada.dadm.entrega01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

        List<String> titles;
        List<Integer> images;
        LayoutInflater inflater;

        public Adapter (Context ctx, List<String> titles, List<Integer> images){
            this.titles = titles;
            this.images = images;
            this.inflater = LayoutInflater.from(ctx);
        }

        @NonNull
        @Override
        public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = inflater.inflate(R.layout.custom_grid_layout, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
            holder.title.setText(titles.get(position));
            holder.gridIcon.setImageResource(images.get(position));

        }

        @Override
        public int getItemCount() {
            return titles.size();
        }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView gridIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView9);
            gridIcon = itemView.findViewById(R.id.imageView12);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext() ,"Imagem " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    }

