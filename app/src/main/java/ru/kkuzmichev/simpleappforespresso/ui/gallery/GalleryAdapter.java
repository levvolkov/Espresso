package ru.kkuzmichev.simpleappforespresso.ui.gallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.kkuzmichev.simpleappforespresso.R;


public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {
    private List<GalleryItem> itemList;

    public GalleryAdapter(List itemList) {
        this.itemList = itemList;
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.list_item;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GalleryItem list = itemList.get(position);
        holder.itemTitle.setText(list.getTitle());
        holder.itemDescription.setText(list.getDescription());
        holder.itemNumber.setText(String.valueOf(list.getNumber()));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView itemTitle;
        private TextView itemDescription;
        private TextView itemNumber;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTitle = itemView.findViewById(R.id.item_title);
            itemDescription = itemView.findViewById(R.id.item_description);
            itemNumber = itemView.findViewById(R.id.item_number);
        }
    }
}
