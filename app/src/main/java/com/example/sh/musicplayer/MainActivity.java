package com.example.sh.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<SongInfo> SongsList=new ArrayList<SongInfo>();
    RecyclerView recyclerView;
    MusicAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SongsList.add(new SongInfo("http://server6.mp3quran.net/thubti/001.mp3","Fataha","bakar","quran"));
        SongsList.add(new SongInfo("http://server6.mp3quran.net/thubti/002.mp3","Bakara","bakar","quran"));
        SongsList.add(new SongInfo("http://server6.mp3quran.net/thubti/003.mp3","Al-Imran","bakar","quran"));
        SongsList.add(new SongInfo("http://server6.mp3quran.net/thubti/004.mp3","An-Nisa'","bakar","quran"));
        SongsList.add(new SongInfo("http://server6.mp3quran.net/thubti/005.mp3","Al-Ma'idah","bakar","quran"));
        SongsList.add(new SongInfo("http://server6.mp3quran.net/thubti/006.mp3","Al-An'am","bakar","quran"));
        SongsList.add(new SongInfo("http://server6.mp3quran.net/thubti/007.mp3","Al-A'raf","bakar","quran"));

        recyclerView = (RecyclerView)findViewById(R.id.recyler_view);
        recyclerView.setHasFixedSize(true);

        // RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);'
        StaggeredGridLayoutManager gridLayoutManager =
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mAdapter = new MusicAdapter(SongsList);
        recyclerView.setAdapter(mAdapter);

        MyThread myThread= new MyThread();
        myThread.start();
    }

    class MyThread extends Thread{
        public void run(){

            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //seeek bar
                    }
                });
            }


        }
    }
}
