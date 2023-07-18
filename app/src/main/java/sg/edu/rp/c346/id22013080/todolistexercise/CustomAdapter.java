package sg.edu.rp.c346.id22013080.todolistexercise;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AndroidViewModel;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> itemList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        itemList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvItem = rowView.findViewById(R.id.textViewItem);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        ToDoItem currentItem = itemList.get(position);

        tvItem.setText(currentItem.getTitle());
        tvDate.setText(currentItem.toString());

        return rowView;
    }
}
