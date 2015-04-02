package com.example.aman.calc;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by aman on 30/3/15.
 */
public class Fragment_main extends Fragment {

    private Button b;
    private TextView t;
    public InputMethodManager im;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        b = (Button) rootView.findViewById(R.id.no7);
        t = (TextView) rootView.findViewById(R.id.output);

        im = (InputMethodManager) rootView.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        im.hideSoftInputFromInputMethod(t.getWindowToken(), 0);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.append("7");
            }
        });
        return rootView;


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.setContentView(R.layout.fragment_main)
    }
}
