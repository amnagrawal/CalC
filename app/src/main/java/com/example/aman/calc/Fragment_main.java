package com.example.aman.calc;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by aman on 30/3/15.
 */
public class Fragment_main extends Fragment {

    private Button b[], backsp, clear_all, multiply, divide, add, subtract, decimal, equals
            , brackets, toggle_sign;
    private EditText t;
    public InputMethodManager im;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        b = new Button[10];

        b[0] = (Button) rootView.findViewById(R.id.no0);
        b[1] = (Button) rootView.findViewById(R.id.no1);
        b[2] = (Button) rootView.findViewById(R.id.no2);
        b[3] = (Button) rootView.findViewById(R.id.no3);
        b[4] = (Button) rootView.findViewById(R.id.no4);
        b[5] = (Button) rootView.findViewById(R.id.no5);
        b[6] = (Button) rootView.findViewById(R.id.no6);
        b[7] = (Button) rootView.findViewById(R.id.no7);
        b[8] = (Button) rootView.findViewById(R.id.no8);
        b[9] = (Button) rootView.findViewById(R.id.no9);

        t = (EditText) rootView.findViewById(R.id.output);
        t.setShowSoftInputOnFocus(false);

        im = (InputMethodManager) rootView.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        im.hideSoftInputFromInputMethod(t.getWindowToken(), 0);

        b[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), b[0].getText());
            }
        });

        b[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), b[1].getText());
            }
        });

        b[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), b[2].getText());
            }
        });

        b[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), b[3].getText());
            }
        });

        b[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), b[4].getText());
            }
        });

        b[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), b[5].getText());
            }
        });

        b[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), b[6].getText());
            }
        });

        b[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), b[7].getText());
            }
        });

        b[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), b[8].getText());
            }
        });

        b[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), b[9].getText());
            }
        });

        decimal = (Button) rootView.findViewById(R.id.decimal);
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), decimal.getText());
            }
        });

        backsp = (Button) rootView.findViewById(R.id.backsp);
        backsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t.getText().length()>0)
                    t.getText().delete(t.getSelectionStart()-1, t.getSelectionStart());
            }
        });

        clear_all = (Button) rootView.findViewById(R.id.clear_all);
        clear_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().clear();
            }
        });

        add = (Button) rootView.findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t.getText().insert(t.getSelectionStart(), add.getText());
            }
        });

        subtract = (Button) rootView.findViewById(R.id.subtract);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), subtract.getText());
            }
        });

        multiply = (Button) rootView.findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), multiply.getText());
            }
        });

        divide = (Button) rootView.findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.getText().insert(t.getSelectionStart(), divide.getText());
            }
        });

        brackets = (Button) rootView.findViewById(R.id.brackets);
        brackets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = String.valueOf(t.getText());
                if(s.endsWith("+") || s.endsWith("-") || s.endsWith("*") || s.endsWith("/") || s.equals(""))
                {
                    t.getText().insert(t.getSelectionStart(), "(");
                }
                else
                    t.getText().insert(t.getSelectionStart(), ")");
            }
        });
        //ScriptEngineManager mgr = new ScriptEngineManager();
        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
