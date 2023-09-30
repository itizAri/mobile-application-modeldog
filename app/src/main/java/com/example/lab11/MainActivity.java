package com.example.lab11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lab11.model.dog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // เก็บ Food 2 อย่างไว้ใน ArrayList<Food> ชื่อว่า foods
        //
        List<dog> dogs = new ArrayList<dog>();
        dog dog1 = new dog();
        dog1.setDog_name("golden Retriver");
        dog1.setDog_image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXHfbCokDL35ZheLgQ-5ma4__m-NRNOVWsjRPXMjpYgEdt7y7xbu3MUIyVmyCrFLz96fk&usqp=CAU");
        dog1.setDog_type("เป็นสุนัขพันธ์ใหญ่)");
        dogs.add(dog1);

        dog dog2 = new dog();
        dog2.setDog_name("Labrador Retriever");
        dog2.setDog_image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSrxblQjxJ0A159gvJLu96yA51voDCc4tdqMg&usqp=CAU");
        dog2.setDog_type("เป็นสุนัขพันธ์ใหญ่");
        dogs.add(dog2);

        dog dog3 = new dog();
        dog3.setDog_name("Cavalier King Charles Spaniel");
        dog3.setDog_image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPyE9SIHq06LNYxPklIh7yvIMnrl27nFpJaw&usqp=CAU");
        dog3.setDog_type("เป็นสุนัขพันธ์เล็ก");
        dogs.add(dog3);

        dog dog4 = new dog();
        dog4.setDog_name("Jamthund");
        dog4.setDog_image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTA03A4ARg0O3eVJWHSrsixX1WOnppPAnF0yQ&usqp=CAU");
        dog4.setDog_type("เป็นสุนัขพันธ์ใหญ่");
        dogs.add(dog4);

        dog dog5 = new dog();
        dog5.setDog_name("Rottweiler");
        dog5.setDog_image("https://img.kapook.com/image/pet/rottwiler.jpg");
        dog5.setDog_type("เป็นสุนัขพันธ์ใหญ่");
        dogs.add(dog5);

        dog dog6 = new dog();
        dog6.setDog_name("Canadian Eskimo");
        dog6.setDog_image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_0Ac_wa2mz1GVctQc1tuOd7hHpdyDcLEBLA&usqp=CAU");
        dog6.setDog_type("เป็นสุนัขพันธ์ใหญ่");
        dogs.add(dog6);

        dog dog7 = new dog();
        dog7.setDog_name("Komondor");
        dog7.setDog_image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLpAgfmmZMdk5-0sNfSVW6wEdeY-qfjTm6KJHTnhmgSm5opHvdvicD_LtyWi4yEfkVEhg&usqp=CAU");
        dog7.setDog_type("เป็นสุนัขพันธ์ใหญ่");
        dogs.add(dog7);

        dog dog8 = new dog();
        dog8.setDog_name("Japanese Spitiz");
        dog8.setDog_image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeFSHI4tz0hu8py6c3GsGY70v6GB_4k2-QcQ&usqp=CAU");
        dog8.setDog_type("เป็นสุนัขพันธ์เล็ก");
        dogs.add(dog8);

        dog dog9 = new dog();
        dog9.setDog_name("Thai Bangkaew");
        dog9.setDog_image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSL2VO_nqdl-xIbzxHqHTawBUv6O9LGZfRcqg&usqp=CAU");
        dog9.setDog_type("เป็นสุนัขพันธ์ใหญ่");
        dogs.add(dog9);

        dog dog10 = new dog();
        dog10.setDog_name("Goldendoodle");
        dog10.setDog_image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5V1veZyzmZ6gD1Qa4WFXbWKy6W95Ewc9Udw&usqp=CAU");
        dog10.setDog_type("เป็นสุนัขพันธ์ใหญ่/เล็ก ขึ้นอยู่กับการผสมพันธ์ุของ Golden Retriever และ Poodle ที่ใช้");
        dogs.add(dog10);

        dog dog11 = new dog();
        dog11.setDog_name("Belgian Malinois");
        dog11.setDog_image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjmOHcrFea7ehQTpLF7c5f6zkdLgldSPZmVQ&usqp=CAU");
        dog11.setDog_type("เป็นสุนัขพันธ์ใหญ่");
        dogs.add(dog11);

        dog dog12 = new dog();
        dog12.setDog_name("german shepherd");
        dog12.setDog_image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdFyLXpk4K5DOTMkH2zKOclXzbWVLlXholoA&usqp=CAU");
        dog12.setDog_type("เป็นสุนัขพันธ์ใหญ่");
        dogs.add(dog12);


        // ส่ง foods ไปให้ MyAdapter
        //
        mAdapter = new MyAdapter(dogs, this);
        recyclerView.setAdapter(mAdapter);

    }
}