package id.sch.smktelkom_mlg.www.fragment.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import id.sch.smktelkom_mlg.www.fragment.R;

public class TulipFragment extends Fragment {
    public TulipFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_multiple_tulip, container, false);
        Button btnTulip = rootView.findViewById(R.id.btnTulip);
        btnTulip.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Kamu Telah Klik Bunga Tulip", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}