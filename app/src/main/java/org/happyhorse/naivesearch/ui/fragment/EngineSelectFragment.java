package org.happyhorse.naivesearch.ui.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.happyhorse.naivesearch.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EngineSelectFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EngineSelectFragment extends Fragment {
    private ImageButton ENGINE_BAIDU_BUTTON;    //TODO:not used
    private ImageButton ENGINE_BING_BUTTON;//TODO:not used
    private ImageButton ENGINE_SELECTION_BUTTON;//TODO:not used


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1; //parameter 1
    private String mParam2; //parameter 2

    public EngineSelectFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EngineSelectFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EngineSelectFragment newInstance(String param1, String param2) {
        EngineSelectFragment fragment = new EngineSelectFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1); //set parameter 1
            mParam2 = getArguments().getString(ARG_PARAM2); //set parameter 2
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //TODO:not used

        // below codes already move to MainActivity2.class
//        ENGINE_BAIDU_BUTTON = getActivity().findViewById(R.id.imageButton_baidu);
//        ENGINE_BING_BUTTON = getActivity().findViewById(R.id.imageButton_bing);
//        ENGINE_SELECTION_BUTTON = getActivity().findViewById(R.id.engine_selection_imageButton);
//        ENGINE_BAIDU_BUTTON.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ENGINE_SELECTION_BUTTON.setImageResource(R.mipmap.ic_baidu_engine_foreground);
//            }
//        });
//        ENGINE_BING_BUTTON.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ENGINE_SELECTION_BUTTON.setImageResource(R.mipmap.ic_bing_engine_foreground);
//            }
//        });
//        int height = ENGINE_SELECTION_BUTTON.getLayoutParams().height;
//        ENGINE_BAIDU_BUTTON.setLayoutParams(new LinearLayout.LayoutParams(height, height));
//        ENGINE_BING_BUTTON.setLayoutParams(new LinearLayout.LayoutParams(height, height));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_engine_select, container, false);
    }

    /**
     * set it invisible when fragment is clicked
     *
     * @param v event view
     */
    public void onClick(View v) {
        v.setVisibility(View.INVISIBLE);    //set invisible
        Log.d("TAG", "onClick: vis");
    }

}