package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<EmployeeItem> EmployList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<EmployeeItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        EmployList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvJob = rowView.findViewById(R.id.textViewJob);
        TextView tvPay = rowView.findViewById(R.id.textViewPay);
        EmployeeItem currentItem = EmployList.get(position);

        String name = currentItem.getName();
        String job = currentItem.getJob();
        Float pay = currentItem.getPay();
        tvName.setText(name);
        tvJob.setText(job);
        tvPay.setText(pay+"");

        return rowView;
    }
}
