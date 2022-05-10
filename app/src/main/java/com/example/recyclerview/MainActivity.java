package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Preparing the dataset
        ArrayList<Company> companies = new ArrayList<>();
        Company meta = new Company("Meta","https://logo-logos.com/2021/11/Meta-logo-full.png");
        Company google= new Company("Google","https://logo-logos.com/2016/11/Google_logo_logotype.png");
        Company microsoft = new Company("Microsoft","https://logo-logos.com/2016/10/Microsoft_logo.png");
        Company dell = new Company("Dell","https://logo-logos.com/2016/10/Dell_logo.png");
        Company loreal = new Company("Loreal","https://logo-logos.com/2016/10/Loreal_logo.png");
        Company forever21 = new Company("Forever 21","https://logo-logos.com/2016/11/Forever_21_logo.png");
        Company jio = new Company("Jio","https://logo-logos.com/2016/10/Jio_logo_image_picture.png");
        Company emirates = new Company("Emirates","https://logo-logos.com/2016/10/Emirates_logo.png");
        Company lego = new Company("Lego","https://logo-logos.com/2016/10/Lego_logo.png");
        Company hdfc = new Company("HDFC","https://logo-logos.com/2016/10/HDFC_Bank_logo.png");

        //Adding individual companies in arraylist
        companies.add(meta);
        companies.add(google);
        companies.add(forever21);
        companies.add(dell);
        companies.add(microsoft);
        companies.add(loreal);
        companies.add(jio);
        companies.add(emirates);
        companies.add(lego);
        companies.add(hdfc);

        //Finding the recycler view
        RecyclerView recyclerView=findViewById(R.id.recyclerView) ;
        CompanyAdapter adapter=new CompanyAdapter(companies) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}