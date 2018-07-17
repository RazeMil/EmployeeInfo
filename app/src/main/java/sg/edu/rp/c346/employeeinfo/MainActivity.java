package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmploy;
    ArrayList<EmployeeItem> alEmployeeItem;
    CustomAdapter caEmploy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmploy = findViewById(R.id.listViewEmploy);

        alEmployeeItem = new ArrayList<>();

        EmployeeItem name1 = new EmployeeItem("John","Software Technical Leader",3400f);
        EmployeeItem name2 = new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name3 = new EmployeeItem("James","Senior Programmer",2900f);
        EmployeeItem name4 = new EmployeeItem("May","Programmer Trainee",1900f);
        EmployeeItem name5 = new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name6 = new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name7 = new EmployeeItem("John","Software Technical Leader",3400f);
        EmployeeItem name8 = new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name9 = new EmployeeItem("James","Senior Programmer",2900f);
        EmployeeItem name10 = new EmployeeItem("May","Programmer Trainee",1900f);
        EmployeeItem name11= new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name12= new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name13 = new EmployeeItem("John","Software Technical Leader",3400f);
        EmployeeItem name14 = new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name15 = new EmployeeItem("James","Senior Programmer",2900f);
        EmployeeItem name16 = new EmployeeItem("May","Programmer Trainee",1900f);
        EmployeeItem name17 = new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name18 = new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name19 = new EmployeeItem("John","Software Technical Leader",3400f);
        EmployeeItem name20 = new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name21 = new EmployeeItem("James","Senior Programmer",2900f);
        EmployeeItem name22 = new EmployeeItem("May","Programmer Trainee",1900f);
        EmployeeItem name23 = new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name24 = new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name25 = new EmployeeItem("John","Software Technical Leader",3400f);
        EmployeeItem name26 = new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name27 = new EmployeeItem("James","Senior Programmer",2900f);
        EmployeeItem name28 = new EmployeeItem("May","Programmer Trainee",1900f);
        EmployeeItem name29= new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name30= new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name31 = new EmployeeItem("John","Software Technical Leader",3400f);
        EmployeeItem name32 = new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name33 = new EmployeeItem("James","Senior Programmer",2900f);
        EmployeeItem name34 = new EmployeeItem("May","Programmer Trainee",1900f);
        EmployeeItem name35 = new EmployeeItem("May","Programmer",2200f);
        EmployeeItem name36 = new EmployeeItem("May","Programmer",2200f);
        alEmployeeItem.add(name1);
        alEmployeeItem.add(name2);
        alEmployeeItem.add(name3);
        alEmployeeItem.add(name4);
        alEmployeeItem.add(name5);
        alEmployeeItem.add(name6);
        alEmployeeItem.add(name7);
        alEmployeeItem.add(name8);
        alEmployeeItem.add(name9);
        alEmployeeItem.add(name10);
        alEmployeeItem.add(name11);
        alEmployeeItem.add(name12);
        alEmployeeItem.add(name13);
        alEmployeeItem.add(name14);
        alEmployeeItem.add(name15);
        alEmployeeItem.add(name16);
        alEmployeeItem.add(name17);
        alEmployeeItem.add(name18);
        alEmployeeItem.add(name19);
        alEmployeeItem.add(name20);
        alEmployeeItem.add(name21);
        alEmployeeItem.add(name22);
        alEmployeeItem.add(name23);
        alEmployeeItem.add(name24);
        alEmployeeItem.add(name25);
        alEmployeeItem.add(name26);
        alEmployeeItem.add(name27);
        alEmployeeItem.add(name28);
        alEmployeeItem.add(name29);
        alEmployeeItem.add(name30);
        alEmployeeItem.add(name31);
        alEmployeeItem.add(name32);
        alEmployeeItem.add(name33);
        alEmployeeItem.add(name34);
        alEmployeeItem.add(name35);
        alEmployeeItem.add(name36);
        caEmploy = new CustomAdapter(this,R.layout.employee_item,alEmployeeItem);

        lvEmploy.setAdapter(caEmploy);
    }
}
