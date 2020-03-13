package com.sslab.andcal;

public class RefScript {

//    리사이클러뷰 만들기

//    1. 리사이클러뷰 만들기
//    activity_main.xml
//    리사이클러뷰 넣음

//    <?xml version="1.0" encoding="utf-8"?>
//    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
//        android:layout_width="match_parent"
//        android:layout_height="match_parent"
//        android:orientation="vertical">
//
//        <android.support.v7.widget.RecyclerView
//        android:id="@+id/recyclerView"
//        android:layout_width="match_parent"
//        android:layout_height="match_parent"
//        android:background="#F0F0F0"/>
//    </LinearLayout>

//    2. 리사이클러뷰의 아이템뷰 만들기
//    item.xml
//    텍스트뷰 2개랑 이미지뷰 1개로 아이템 만들었음

//    <?xml version="1.0" encoding="utf-8"?>
//    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
//        android:orientation="horizontal" android:layout_width="match_parent"
//        android:layout_height="wrap_content"
//        android:padding="8dp"
//        android:gravity="center_vertical"
//        android:layout_marginBottom="8dp"
//        android:background="@android:color/white">
//
//        <LinearLayout
//        android:layout_width="0dp"
//        android:layout_height="match_parent"
//        android:layout_weight="1"
//        android:orientation="vertical"
//        android:gravity="center_vertical">
//
//            <TextView
//        android:id="@+id/textView1"
//        android:layout_width="wrap_content"
//        android:layout_height="wrap_content"
//        android:includeFontPadding="false"
//        android:text="TITLE"
//        android:textSize="15sp"
//        android:textColor="@android:color/black"
//        android:textStyle="bold"/>
//
//            <TextView
//        android:id="@+id/textView2"
//        android:layout_width="wrap_content"
//        android:layout_height="wrap_content"
//        android:includeFontPadding="false"
//        android:text="content"
//        android:textSize="13sp"
//        android:textColor="@android:color/darker_gray"/>
//        </LinearLayout>
//
//        <ImageView
//        android:id="@+id/imageView"
//        android:layout_width="50dp"
//        android:layout_height="50dp"
//        android:src="@mipmap/ic_launcher"/>
//    </LinearLayout>

//    3. 어댑터 클래스 만들기
//    RecylerAdapter.java
//    리사이클러뷰의 어댑터답게 RecyclerView.Adapter를 상속받아 사용

//    package com.imaec.forblog;
//
//    import android.support.annotation.NonNull;
//    import android.support.v7.widget.RecyclerView;
//    import android.view.LayoutInflater;
//    import android.view.View;
//    import android.view.ViewGroup;
//    import android.widget.ImageView;
//    import android.widget.TextView;
//
//    import java.util.ArrayList;
//
//        public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder> {
//
//            // adapter에 들어갈 list 입니다.
//            private ArrayList<Data> listData = new ArrayList<>();
//
//            @NonNull
//            @Override
//            public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//                // LayoutInflater를 이용하여 전 단계에서 만들었던 item.xml을 inflate 시킵니다.
//                // return 인자는 ViewHolder 입니다.
//                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
//                return new ItemViewHolder(view);
//            }
//
//            @Override
//            public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
//                // Item을 하나, 하나 보여주는(bind 되는) 함수입니다.
//                holder.onBind(listData.get(position));
//            }
//
//            @Override
//            public int getItemCount() {
//                // RecyclerView의 총 개수 입니다.
//                return listData.size();
//            }
//
//            void addItem(Data data) {
//                // 외부에서 item을 추가시킬 함수입니다.
//                listData.add(data);
//            }
//
//            // RecyclerView의 핵심인 ViewHolder 입니다.
//            // 여기서 subView를 setting 해줍니다.
//            class ItemViewHolder extends RecyclerView.ViewHolder {
//
//                private TextView textView1;
//                private TextView textView2;
//                private ImageView imageView;
//
//                ItemViewHolder(View itemView) {
//                    super(itemView);
//
//                    textView1 = itemView.findViewById(R.id.textView1);
//                    textView2 = itemView.findViewById(R.id.textView2);
//                    imageView = itemView.findViewById(R.id.imageView);
//                }
//
//                void onBind(Data data) {
//                    textView1.setText(data.getTitle());
//                    textView2.setText(data.getContent());
//                    imageView.setImageResource(data.getResId());
//                }
//            }
//        }

//    4. 데이터 클래스 만들기
//    Data.java
//    아이템의 텍스트뷰 2개와 이미지뷰 1개에 들어갈 데이터를 저장할 클래스

//    package com.imaec.forblog;
//
//    public class Data {
//
//        private String title;
//        private String content;
//        private int resId;
//
//        public String getTitle() {
//            return title;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//
//        public String getContent() {
//            return content;
//        }
//
//        public void setContent(String content) {
//            this.content = content;
//        }
//
//        public int getResId() {
//            return resId;
//        }
//
//        public void setResId(int resId) {
//            this.resId = resId;
//        }
//    }




}
