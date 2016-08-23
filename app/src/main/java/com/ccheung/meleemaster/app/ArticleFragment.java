package com.ccheung.meleemaster.app;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ArticleFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInterfaceState) {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_article, container, false);
    }
}
