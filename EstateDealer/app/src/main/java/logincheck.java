import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.harin.estatedealer.R;
import com.example.harin.estatedealer.register;

import java.util.List;

public class logincheck extends ArrayAdapter<register> {

    private Activity context;
    private List<register> ar;
    public logincheck(Activity context,List<register> ar){
        super(context, R.layout.list_layout,ar);
        this.context=context;
        this.ar=ar;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listViewItem=inflater.inflate(R.layout.list_layout,null,true);
        return super.getView(position, convertView, parent);
    }
}
