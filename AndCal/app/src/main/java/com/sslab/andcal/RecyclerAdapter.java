package com.sslab.andcal;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder> {
//
//    private ArrayList<Data> listData = new ArrayList<>();
//
//
//
//    class ItemViewHolder extends RecyclerView.ViewHolder{
//
//    }
//
//
//}
//
////import android.support.annotation.NonNull;
////import android.support.v7.widget.RecyclerView;
//import android.provider.ContactsContract;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder> {
//
//    // adapter에 들어갈 list 입니다.
//    private ArrayList<ContactsContract.Contacts.Data> listData = new ArrayList<>();
//
//    @NonNull
//    @Override
//    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        // LayoutInflater를 이용하여 전 단계에서 만들었던 item.xml을 inflate 시킵니다.
//        // return 인자는 ViewHolder 입니다.
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, parent, false);
//        return new ItemViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
//        // Item을 하나, 하나 보여주는(bind 되는) 함수입니다.
//        holder.onBind(listData.get(position));
//    }
//
//    @Override
//    public int getItemCount() {
//        // RecyclerView의 총 개수 입니다.
//        return listData.size();
//    }
//
//    void addItem(ContactsContract.Contacts.Data data) {
//        // 외부에서 item을 추가시킬 함수입니다.
//        listData.add(data);
//    }
//
//    // RecyclerView의 핵심인 ViewHolder 입니다.
//    // 여기서 subView를 setting 해줍니다.
//    class ItemViewHolder extends RecyclerView.ViewHolder {
//
//        private Button button;
//        private Button button2;
//        private Button button3;
//
//        ItemViewHolder(View itemView) {
//            super(itemView);
//
//            button = itemView.findViewById(R.id.button);
//            button2 = itemView.findViewById(R.id.button2);
//            button3 = itemView.findViewById(R.id.button3);
//        }
//
//        void onBind(ContactsContract.Contacts.Data data) {
//            button.setText(data.getTitle());
//            button2.setText(data.getContent());
//            button3.setText(data.getResId());
//        }
//    }
//}

//import android.support.annotation.NonNull;
//import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder> {

    // adapter에 들어갈 list 입니다.
    private ArrayList<Data> listData = new ArrayList<>();

    private GridLayoutManager.LayoutParams layoutParams;

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // LayoutInflater를 이용하여 전 단계에서 만들었던 item.xml을 inflate 시킵니다.
        // return 인자는 ViewHolder 입니다.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        // Item을 하나, 하나 보여주는(bind 되는) 함수입니다.
        holder.onBind(listData.get(position));

//
//        layoutParams = (GridLayoutManager.LayoutParams)viewHolder.itemView.getLayoutParams();
//        layoutParams.height = layoutParams.width;
//        viewHolder.itemView.requestLayout();

    }

    @Override
    public int getItemCount() {
        // RecyclerView의 총 개수 입니다.
        return listData.size();
    }

    void addItem(Data data) {
        // 외부에서 item을 추가시킬 함수입니다.
        listData.add(data);

    }

    // RecyclerView의 핵심인 ViewHolder 입니다.
    // 여기서 subView를 setting 해줍니다.
    class ItemViewHolder extends RecyclerView.ViewHolder {

        private Button button;


        ItemViewHolder(View itemView) {
            super(itemView);

            button = itemView.findViewById(R.id.button);

        }

        void onBind(Data data) {
            button.setText(data.getPrice());

        }
    }
}

