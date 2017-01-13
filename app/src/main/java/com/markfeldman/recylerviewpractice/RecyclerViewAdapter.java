package com.markfeldman.recylerviewpractice;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewAdapterViewHolder> {
    private String[] names;
    private Integer[] logos;

    private ClickedListener clickedListener;

    public interface ClickedListener{
        void onClicked(int clickedItemIndex);
    }

    public RecyclerViewAdapter(ClickedListener listener,String[] names, Integer[] logos){
        this.clickedListener = listener;
        this.names = names;
        this.logos = logos;
    }

    public class RecyclerViewAdapterViewHolder extends RecyclerView.ViewHolder  {
        public final TextView names;
        public final ImageView logos;

        public RecyclerViewAdapterViewHolder(View itemView) {
            super(itemView);
            names = (TextView)itemView.findViewById(R.id.teamName);
            logos = (ImageView)itemView.findViewById(R.id.teamLogo);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int adapterPosition = getAdapterPosition();
                    clickedListener.onClicked(adapterPosition);
                }
            });
        }


    }

    @Override
    public RecyclerViewAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.individual_team_view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        boolean attachToParent = false;
        View view = layoutInflater.inflate(layoutIdForListItem,parent,attachToParent);
        return new RecyclerViewAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapterViewHolder holder, int position) {
        holder.names.setText(names[position]);
        holder.logos.setImageResource(logos[position]);

    }

    @Override
    public int getItemCount() {
        return names.length;
    }

}
