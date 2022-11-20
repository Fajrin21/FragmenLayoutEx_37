package com.F55121037.fragmenlayoutex;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragmentAccount extends Fragment {
    View view;
    public fragmentAccount(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstancesState){
        view = inflater.inflate(R.layout.account_fragment_037,container, false);
        return view;
    }

}
