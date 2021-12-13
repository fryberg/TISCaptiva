package com.fry.tiscaptiva.ui.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.fry.tiscaptiva.R;
import com.fry.tiscaptiva.databinding.FragmentMenuListBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link menuListFragment#-newInstance} factory method to
 * create an instance of this fragment.
 */
public class menuListFragment extends Fragment {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;
    private FragmentMenuListBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final String[] s = new String[1];


        binding = FragmentMenuListBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        String etId;
        Bundle bundleOut = this.getArguments();
        etId= bundleOut.getString("host");


        expListView=binding.lvExp;
        prepareListData();
        listAdapter=new ExpandableListAdapter(root.getContext(), listDataHeader,listDataChild);//this,listDataHeaser,listDataChild
        expListView.setAdapter(listAdapter);


        expListView.setOnChildClickListener((parent, v, groupPosition, childPosition, id) -> {
            Bundle bundle = new Bundle();
    switch(groupPosition) {
        case 0:
            switch (childPosition) {
                    case 0:
                        s[0] = "file:///android_asset/" + etId + "/to.html";
                        break;
                    case 1:
                        s[0] = "file:///android_asset/" + etId + "/information.html";
                        break;
                    case 2:
                        s[0] = "file:///android_asset/" + etId + "/prep_body.html";
                        break;
                    case 3:
                        s[0] = "file:///android_asset/" + etId + "/weld_inst.html";
                        break;
                    case 4:
                        s[0] = "file:///android_asset/" + etId + "/forward_body.html";
                        break;
                    case 5:
                        s[0] = "file:///android_asset/" + etId + "/back_body.html";
                        break;
                    case 6:
                        s[0] = "file:///android_asset/" + etId + "/inner_body.html";
                        break;
                    case 7:
                        s[0] = "file:///android_asset/" + etId + "/fender_hood.html";
                        break;
                    case 8:
                        s[0] = "file:///android_asset/" + etId + "/size_body.html";
                        break;
                    case 9:
                        s[0] = "file:///android_asset/" + etId + "/sound_insulation.html";
                        break;
                    case 10:
                        s[0] = "file:///android_asset/" + etId + "/corrosion_shield.html";
                        break;
            }
            break;
        case 1:
            switch (childPosition) {
                case 0:
                    s[0] = "file:///android_asset/" + etId + "/electro.html";
                    break;
                case 1:
                    s[0] = "file:///android_asset/" + etId + "/plug_n_ground.html";
                    break;
                case 2:
                    s[0] = "file:///android_asset/" + etId + "/scheme_power.html";
                    break;
                case 3:
                    s[0] = "file:///android_asset/" + etId + "/fuse.html";
                    break;
                case 4:
                    s[0] = "file:///android_asset/" + etId + "/engine_start_scheme.html";
                    break;
                case 5:
                    s[0] = "file:///android_asset/" + etId + "/ecm_me799.html";
                    break;
                case 6:
                    s[0] = "file:///android_asset/" + etId + "/ecm_edc16c39.html";
                    break;
                case 7:
                    s[0] = "file:///android_asset/" + etId + "/ecm_e77.html";
                    break;
                case 8:
                    s[0] = "file:///android_asset/" + etId + "/transaxle.html";
                    break;
                case 9:
                    s[0] = "file:///android_asset/" + etId + "/body_control.html";
                    break;
                case 10:
                    s[0] = "file:///android_asset/" + etId + "/condition.html";
                    break;
                case 11:
                    s[0] = "file:///android_asset/" + etId + "/auto_temp_control.html";
                    break;
                case 12:
                    s[0] = "file:///android_asset/" + etId + "/chain_comp.html";
                    break;
                case 13:
                    s[0] = "file:///android_asset/" + etId + "/chain_vent.html";
                    break;
                case 14:
                    s[0] = "file:///android_asset/" + etId + "/chain_heater_rtc_20d.html";
                    break;
                case 15:
                    s[0] = "file:///android_asset/" + etId + "/chain_lamp.html";
                    break;
                case 16:
                    s[0] = "file:///android_asset/" + etId + "/chain_lamp_off.html";
                    break;
                case 17:
                    s[0] = "file:///android_asset/" + etId + "/chain_lamp_int.html";
                    break;
                case 18:
                    s[0] = "file:///android_asset/" + etId + "/chain_lamp_fog.html";
                    break;
                case 19:
                    s[0] = "file:///android_asset/" + etId + "/chain_turn_lamp.html";
                    break;
                case 20:
                    s[0] = "file:///android_asset/" + etId + "/chain_stop_lamp.html";
                    break;
                case 21:
                    s[0] = "file:///android_asset/" + etId + "/chain_salon_lamp.html";
                    break;
                case 22:
                    s[0] = "file:///android_asset/" + etId + "/chain_clw.html";
                    break;
                case 23:
                    s[0] = "file:///android_asset/" + etId + "/chain_heat_rear.html";
                    break;
                case 24:
                    s[0] = "file:///android_asset/" + etId + "/chain_rear_mirror.html";
                    break;
                case 25:
                    s[0] = "file:///android_asset/" + etId + "/chain_el_lift.html";
                    break;
                case 26:
                    s[0] = "file:///android_asset/" + etId + "/chain_rear_win.html";
                    break;
                case 27:
                    s[0] = "file:///android_asset/" + etId + "/chain_horn.html";
                    break;
                case 28:
                    s[0] = "file:///android_asset/" + etId + "/chain_clock.html";
                    break;
                case 29:
                    s[0] = "file:///android_asset/" + etId + "/chain_door_lock.html";
                    break;
                case 30:
                    s[0] = "file:///android_asset/" + etId + "/chain_xbcm_controller.html";
                    break;
                case 31:
                    s[0] = "file:///android_asset/" + etId + "/chain_dashboard.html";
                    break;
                case 32:
                    s[0] = "file:///android_asset/" + etId + "/chain_audio.html";
                    break;
                case 33:
                    s[0] = "file:///android_asset/" + etId + "/chain_abs.html";
                    break;
                case 34:
                    s[0] = "file:///android_asset/" + etId + "/chain_airbag.html";
                    break;
                case 35:
                    s[0] = "file:///android_asset/" + etId + "/chain_roof.html";
                    break;
                case 36:
                    s[0] = "file:///android_asset/" + etId + "/chain_hydro.html";
                    break;
                case 37:
                    s[0] = "file:///android_asset/" + etId + "/chain_parking.html";
                    break;
                case 38:
                    s[0] = "file:///android_asset/" + etId + "/chain_muft.html";
                    break;
                case 39:
                    s[0] = "file:///android_asset/" + etId + "/chain_cruise.html";
                    break;
                case 40:
                    s[0] = "file:///android_asset/" + etId + "/chain_immo.html";
                    break;
                case 41:
                    s[0] = "file:///android_asset/" + etId + "/chain_electro_seats.html";
                    break;
                case 42:
                    s[0] = "file:///android_asset/" + etId + "/chain_heat_seat.html";
                    break;
                case 43:
                    s[0] = "file:///android_asset/" + etId + "/chain_pricep.html";
                    break;
                case 44:
                    s[0] = "file:///android_asset/" + etId + "/chain_gmlan.html";
                    break;
                case 45:
                    s[0] = "file:///android_asset/" + etId + "/chain_navy.html";
                    break;
            }
            break;
        }

            bundle.putString("host", s[0]);

            Fragment newFragment = new WebviewFragment();
            newFragment.setArguments(bundle);
            FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            ft.replace(R.id.container, newFragment);
            ft.addToBackStack(null);
            ft.commit();

            return false;
        });
       // expListView.setOnGroupExpandListener(groupPosition -> Toast.makeText(root.getContext(),
        //        listDataHeader.get(groupPosition) + " Open‚"+groupPosition ,
        //        Toast.LENGTH_SHORT).show());
        //expListView.setOnGroupCollapseListener(groupPosition -> Toast.makeText(root.getContext(),
         //       listDataHeader.get(groupPosition) + " Close‚",
         //       Toast.LENGTH_SHORT).show());
        return root;
    }
    private void prepareListData() {

        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();


        listDataHeader.add(getString(R.string.list1));
        listDataHeader.add(getString(R.string.list2));
        listDataHeader.add(getString(R.string.list3));



        List<String> top250 = new ArrayList<String>();
        top250.add("0.УВЕДОМЛЕНИЕ О ТЕХНИЧЕСКОМ ОБСЛУЖИВАНИИ");
        top250.add("1. ОБЩИЕ СВЕДЕНИЯ");
        top250.add("2. ПОДГОТОВКА КУЗОВА");
        top250.add("3. СВАРКА И ИНСТРУМЕНТЫ");
        top250.add("4. ПЕРЕДНЯЯ ЧАСТЬ");
        top250.add("5. КРЫША, ПАНЕЛИ ЗАДКА И ЗАДНЕГО ПОЛА КУЗОВА");
        top250.add("6. ВНУТРЕННЯЯ ПАНЕЛЬ БОКОВИНЫ, ДВЕРЬ И НАРУЖНАЯ ПАНЕЛЬ БОКОВИНЫ ");
        top250.add("7. КРЫЛО, КАПОТ, ЗАДНЯЯ ДВЕРЬ И КРЫШКА БАГАЖНИКА");
        top250.add("8. ГАБАРИТНЫЕ РАЗМЕРЫ КУЗОВА");
        top250.add("9. УПЛОТНЕНИЕ, ЗАМАЗКА И ШУМОИЗОЛЯЦИЯ");
        top250.add("10. ПРЕДУПРЕЖДЕНИЕ КОРРОЗИИ");


        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("1. КАК ЧИТАТЬ ЭЛЕКТРИЧЕСКУЮ СХЕМУ");
        nowShowing.add("2. РАСПОЛОЖЕНИЕ РАЗЪЕМОВ И СОЕДИНЕНИЙ МАССЫ");
        nowShowing.add("3. ЭЛЕКТРИЧЕСКАЯ СХЕМА ИСТОЧНИКОВ ЭЛЕКТРОПИТАНИЯ");
        nowShowing.add("4. НАЗНАЧЕНИЕ И НОМИНАЛ ПРЕДОХРАНИТЕЛЕЙ В БЛОКЕ ПРЕДОХРАНИТЕЛЕЙ");
        nowShowing.add("5. СИСТЕМА ПУСКА ДВИГАТЕЛЯ И ЗАРЯДКИ");
        nowShowing.add("6. КОНТРОЛЛЕР ЭЛЕКТРОННОЙ СИСТЕМЫ УПРАВЛЕНИЯ ДВИГАТЕЛЕМ (ECM): ME7.9.9 (FAM II 2.4D)");
        nowShowing.add("7. КОНТРОЛЛЕР ЭЛЕКТРОННОЙ СИСТЕМЫ УПРАВЛЕНИЯ ДВИГАТЕЛЕМ (ECM): EDC16C39 (2.0 ДИЗЕЛЬ) ");
        nowShowing.add("8. КОНТРОЛЛЕР ЭЛЕКТРОННОЙ СИСТЕМЫ УПРАВЛЕНИЯ ДВИГАТЕЛЕМ (ECM): E77 (HFV6 3.2D) ");
        nowShowing.add("9. КОНТРОЛЛЕР КПП ");
        nowShowing.add("10. КОНТРОЛЛЕР КУЗОВА (BCM) ");
        nowShowing.add("11. КОНДИЦИОНЕР ");
        nowShowing.add("12. СИСТЕМА АВТОМАТИЧЕСКОГО РЕГУЛИРОВАНИЯ ТЕМПЕРАТУРЫ ");
        nowShowing.add("13. ЦЕПЬ КОМПРЕССОРА КОНДИЦИОНЕРА ");
        nowShowing.add("14. ЦЕПЬ ВЕНТИЛЯТОРА СИСТЕМЫ ОХЛАЖДЕНИЯ ");
        nowShowing.add("15. ЦЕПЬ НАГРЕВАТЕЛЯ-PTC: 2.0 ДИЗЕЛЬ (LLW) ");
        nowShowing.add("16. ЦЕПЬ ФАР ");
        nowShowing.add("17. ЦЕПЬ ВЫКЛЮЧАТЕЛЯ ФАР ");
        nowShowing.add("18. ЦЕПЬ ПОДСВЕТКИ ");
        nowShowing.add("19. ЦЕПЬ ПЕРЕДНИХ И ЗАДНИХ ПРОТИВОТУМАННЫХ ФАР ");
        nowShowing.add("20. ЦЕПЬ УКАЗАТЕЛЯ ПОВОРОТА И АВАРИЙНОЙ СИГНАЛИЗАЦИИ ");
        nowShowing.add("21. ЦЕПЬ СТОП-СИГНАЛОВ, ДОПОЛНИТЕЛЬНОГО ЦЕНТРАЛЬНОГО СТОП-СИГНАЛА (CHMSL), ЛАМПЫ ЗАДНЕГО ХОДА И ЗЕРКАЛ ECM ");
        nowShowing.add("22. ЦЕПЬ ОСВЕЩЕНИЯ ЭЛЕМЕНТОВ САЛОНА ");
        nowShowing.add("23. ЦЕПЬ СТЕКЛООЧИСТИТЕЛЕЙ ");
        nowShowing.add("24. ЦЕПЬ ОБОГРЕВА ПЕРЕДНЕГО/ЗАДНЕГО СТЕКЛА И СИСТЕМЫ ОБОГРЕВА НАРУЖНЫХ ЗЕРКАЛ ЗАДНЕГО ВИДА ");
        nowShowing.add("25. ЦЕПЬ НАРУЖНЫХ ЗЕРКАЛ ЗАДНЕГО ВИДА С ЭЛЕКТРОПРИВОДОМ (OSRV) И СКЛАДЫВАНИЯ ЗЕРКАЛ ");
        nowShowing.add("26. ЦЕПЬ ЭЛЕКТРИЧЕСКИХ СТЕКЛОПОДЪЕМНИКОВ ");
        nowShowing.add("27. ЦЕПЬ СТЕКЛА ЗАДНЕЙ ОТКИДНОЙ ДВЕРИ ЦЕПЬ ");
        nowShowing.add("28. ЦЕПЬ ЗВУКОВОГО СИГНАЛА, ДОПОЛНИТЕЛЬНОЙ РОЗЕТКИ И ПРИКУРИВАТЕЛЯ ");
        nowShowing.add("29. ЦЕПЬ ИНФОРМАЦИОННОГО ЦЕНТРА ВОДИТЕЛЯ И ЧАСОВ ");
        nowShowing.add("30. ЦЕПЬ СИСТЕМЫ ЗАПИРАНИЯ ДВЕРЕЙ ");
        nowShowing.add("31. ЦЕПЬ КОНТРОЛЛЕРА XBCM ");
        nowShowing.add("32. КОМБИНАЦИЯ ПРИБОРОВ ");
        nowShowing.add("33. ЦЕПЬ АУДИОСИСТЕМЫ ");
        nowShowing.add("34. АБС (АНТИБЛОКИРОВОЧНАЯ ТОРМОЗНАЯ СИСТЕМА) ");
        nowShowing.add("35. ЦЕПЬ ПОДУШКИ БЕЗОПАСНОСТИ (МОДУЛЬ ДАТЧИКОВ И ДИАГНОСТИКИ (SDM)) ");
        nowShowing.add("36. ЦЕПЬ ЛЮКА В КРЫШЕ ");
        nowShowing.add("37. ЦЕПЬ РУЛЕВОГО МЕХАНИЗМА С ГИДРОУСИЛИТЕЛЕМ, ОБЕСПЕЧИВАЮЩИМ ПЕРЕМЕННОЕ УСИЛЕНИЕ В ЗАВИСИМОСТИ ОТ СКОРОСТИ (SSPS) ");
        nowShowing.add("38. ЦЕПЬ КОНТРОЛЛЕРА ОБЛЕГЧЕНИЯ ПАРКОВКИ ");
        nowShowing.add("39. ЦЕПЬ КОНТРОЛЛЕРА МУФТЫ ");
        nowShowing.add("40. ЦЕПЬ СИСТЕМЫ ПОДДЕРЖАНИЯ СКОРОСТИ ");
        nowShowing.add("41. ЦЕПЬ RKE И СИСТЕМЫ ИММОБИЛИЗАТОРА ");
        nowShowing.add("42. ЦЕПЬ СИСТЕМЫ СИДЕНИЙ С ЭЛЕКТРИЧЕСКИМ ПРИВОДОМ РЕГУЛИРОВКИ ");
        nowShowing.add("43. ЦЕПЬ ПОДОГРЕВАЮЩЕГО МАТА ");
        nowShowing.add("44. ЦЕПЬ СИСТЕМЫ ПРИЦЕПА ");
        nowShowing.add("45. ЦЕПЬ GMLAN ");
        nowShowing.add("45. НАВИГАЦИЯ ");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("РџРѕРґРїСѓРЅРєС‚ 3.1");
        comingSoon.add("РџРѕРґРїСѓРЅРєС‚ 3.2");
        comingSoon.add("РџРѕРґРїСѓРЅРєС‚ 3.3");
        comingSoon.add("РџРѕРґРїСѓРЅРєС‚ 3.4");
        comingSoon.add("РџРѕРґРїСѓРЅРєС‚ 3.5");


        listDataChild.put(listDataHeader.get(0), top250);
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}