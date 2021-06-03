package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);

        //continue view the code in the worksheet
        ArrayList<String> al = new ArrayList<String>();

        //add elements into the arraylist
        al.add("Apple");
        al.add("Banana");
        al.add("Cherry");
        al.add("Durian");

        //assign an element into a string
        String theFruit = al.get(1);

        //remove the first element
        al.remove("Apple");

        //update ArrayList
        al.set(0,"Dragon fruit");

        String text = "Fruits\n";
        text += "========\n";

        String msg = "";
        for(int i = 0; i <al.size(); i++){
            msg += al.get(i) + "\n";
        }

        System.out.println(msg);
        tv.setText(msg);


    }
}