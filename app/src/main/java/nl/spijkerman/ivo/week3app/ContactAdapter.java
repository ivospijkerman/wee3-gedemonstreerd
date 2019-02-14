package nl.spijkerman.ivo.week3app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

public class ContactAdapter extends ArrayAdapter<Contact> {

    public ContactAdapter(3-parameters) {
        super(3-parameters);
    }

    View getView(View convertView, int position) {

        Contact contact = new ContactRepository().get(position);

        if (convertView == null)
            convertView = ((LayoutInflater) getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                    .inflate(R.layout.listview_row, null);

        TextView firstName = convertView.findViewById(R.id.firstName);
        firstName.setText(contact.name.toString());

        TextView lastName = convertView.findViewById(R.id.lastName);
        lastName.setText(contact.email);

        return convertView;
    }
}
