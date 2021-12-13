package com.fry.tiscaptiva.ui.main;



import static android.content.Context.CLIPBOARD_SERVICE;
import static androidx.core.content.ContextCompat.getSystemService;
import static com.fry.tiscaptiva.R.*;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.fry.tiscaptiva.R;

import com.fry.tiscaptiva.databinding.MainFragmentBinding;

public class MainFragment extends Fragment implements View.OnClickListener{


private  MainFragmentBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = MainFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Button b2007 = root.findViewById(id.b2007);
        Button b2011 = root.findViewById(id.b2011);
        Button donateB = root.findViewById(id.donateB);

        b2007.setOnClickListener(this);
        b2011.setOnClickListener(this);
        donateB.setOnClickListener(this);
        return root;

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case id.b2007: importFrag("2007"); break;
            case id.donateB:{
                AlertDialog builder = new AlertDialog.Builder(getActivity())
                .setTitle("Так себе информация :))")
                .setMessage(Html.fromHtml("<p>Желающие могут скинуть автору программы копейку малую на развитие программы :<br> Ведется разработка модуля диагностики и вывода параметров через ELM <br></p><p valign='Center'><b>         4274 3200 5104 0965 </b></p><p>При нажатии кнопки 'ОК' скопируется номер карты VISA</p>"))
                .setCancelable(true)
                // Кнопка ОК
                .setPositiveButton(android.R.string.ok, (dialog, which) -> {
                    ClipboardManager clipboard = getSystemService(getContext(), ClipboardManager.class);;
                    ClipData clip = ClipData.newPlainText("Card", "4274 3200 5104 0965");
                    clipboard.setPrimaryClip(clip);
                    dialog.dismiss(); // Отпускает диалоговое окно
                })
                 .show();
            }
                break;

           // case R.id.b2011: importFrag("2011"); break;
        }
    }



    public void importFrag(String s)
    {
        Bundle bundle = new Bundle();

        bundle.putString("host", s);

        Fragment newFragment = new menuListFragment();
        newFragment.setArguments(bundle);
        FragmentTransaction ft = getParentFragmentManager().beginTransaction();
        ft.replace(id.container, newFragment);
        ft.addToBackStack(null);
        ft.commit();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}