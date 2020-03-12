package com.sslab.andcal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;

    private RecyclerAdapter adapter2;
    private RecyclerView recyclerView2;
    private GridLayoutManager gridLayoutManager2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        getData();

    }

    private void init() {
        recyclerView = findViewById(R.id.recyclerView);

        gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);

        recyclerView2 = findViewById(R.id.recyclerView2);

        gridLayoutManager2 = new GridLayoutManager(this, 1);
        recyclerView2.setLayoutManager(gridLayoutManager2);

        adapter2 = new RecyclerAdapter();
        recyclerView2.setAdapter(adapter2);
    }

    private void getData() {
        // 임의의 데이터입니다.

        List<String> listPrice = Arrays.asList("7","8","9","4","5","6","1","2","3","0",".","=");

//        Data data2 = new Data();
//        Data data3 = new Data();

        for (int i = 0; i < listPrice.size(); i++) {
            Data data = new Data();
            // 각 List의 값들을 data 객체에 set 해줍니다.

            data.setPrice(listPrice.get(i));
//            data2.setPrice(listPrice.get(i+1));
//            data3.setPrice(listPrice.get(i+2));

            // 각 값이 들어간 data를 adapter에 추가합니다.
            adapter.addItem(data);
        }

        // adapter의 값이 변경되었다는 것을 알려줍니다.
        adapter.notifyDataSetChanged();


        // 임의의 데이터입니다.

        List<String> listOperator = Arrays.asList("←","/","*","-","+");

        for (int i = 0; i < listOperator.size(); i++) {
            Data data2 = new Data();

            // 각 List의 값들을 data 객체에 set 해줍니다.
            data2.setPrice(listOperator.get(i));

            // 각 값이 들어간 data를 adapter에 추가합니다.
            adapter2.addItem(data2);
        }

        // adapter의 값이 변경되었다는 것을 알려줍니다.
        adapter2.notifyDataSetChanged();

    }

//    private void getData() {
//        // 임의의 데이터입니다.
//        List<String> listTitle = Arrays.asList("국화", "사막", "수국", "해파리", "코알라", "등대", "펭귄", "튤립",
//                "국화", "사막", "수국", "해파리", "코알라", "등대", "펭귄", "튤립");
//        List<String> listContent = Arrays.asList(
//                "이 꽃은 국화입니다.",
//                "여기는 사막입니다.",
//                "이 꽃은 수국입니다.",
//                "이 동물은 해파리입니다.",
//                "이 동물은 코알라입니다.",
//                "이것은 등대입니다.",
//                "이 동물은 펭귄입니다.",
//                "이 꽃은 튤립입니다.",
//                "이 꽃은 국화입니다.",
//                "여기는 사막입니다.",
//                "이 꽃은 수국입니다.",
//                "이 동물은 해파리입니다.",
//                "이 동물은 코알라입니다.",
//                "이것은 등대입니다.",
//                "이 동물은 펭귄입니다.",
//                "이 꽃은 튤립입니다."
//        );
//        List<Integer> listResId = Arrays.asList(
//                R.drawable.chrysanthemum,
//                R.drawable.desert,
//                R.drawable.hydrangeas,
//                R.drawable.jellyfish,
//                R.drawable.koala,
//                R.drawable.lighthouse,
//                R.drawable.penguins,
//                R.drawable.tulips,
//                R.drawable.chrysanthemum,
//                R.drawable.desert,
//                R.drawable.hydrangeas,
//                R.drawable.jellyfish,
//                R.drawable.koala,
//                R.drawable.lighthouse,
//                R.drawable.penguins,
//                R.drawable.tulips
//        );
//        for (int i = 0; i < listTitle.size(); i++) {
//            // 각 List의 값들을 data 객체에 set 해줍니다.
//            Data data = new Data();
//            data.setTitle(listTitle.get(i));
//            data.setContent(listContent.get(i));
//            data.setResId(listResId.get(i));
//
//            // 각 값이 들어간 data를 adapter에 추가합니다.
//            adapter.addItem(data);
//        }
//
//        // adapter의 값이 변경되었다는 것을 알려줍니다.
//        adapter.notifyDataSetChanged();
//    }

}
