package kr.ac.mjc.timeline;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class TimelineAdapter extends RecyclerView.Adapter<TimelineAdapter.ViewHolder> {

    ArrayList<Photo> mPhotoList;

    public TimelineAdapter(ArrayList<Photo> photoList) {
        this.mPhotoList = photoList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_photo, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Photo photo = mPhotoList.get(position);
        holder.bind(photo);
    }

    @Override
    public int getItemCount() {
        return mPhotoList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView photoIv;
        TextView textTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            photoIv = itemView.findViewById(R.id.photo_iv);
            textTv = itemView.findViewById(R.id.text_tv);
        }
        public void bind(Photo photo) {
            Glide.with(photoIv).load(photo.getUrl()).into(photoIv);
            String text = String.format("이 고양이 사진의 너비는 %d고 높이는 %d 입니다."
                    , photo.getWidth()
                    , photo.getHeight());
            textTv.setText(text);
        }
    }
}
