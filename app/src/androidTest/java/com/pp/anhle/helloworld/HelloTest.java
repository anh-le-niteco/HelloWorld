package com.pp.anhle.helloworld;

import android.test.ActivityInstrumentationTestCase2;
import android.test.ActivityTestCase;
import android.widget.TextView;


public class HelloTest extends ActivityInstrumentationTestCase2<MainActivity>{

    TextView hello;

    public HelloTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        hello = (TextView) getActivity().findViewById(R.id.hello);
    }

    public void testTextThere() throws Exception {

       assertTrue(!hello.getText().toString().isEmpty());
    }

}