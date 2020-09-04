package com.example.bigfamily;

import java.util.ArrayList;

class item {
    private static String[] name = {
            "M Dani Ramadhan",
            "Ibnu",
            "Dito Rafie Harjanto",
            "Bambang Eko Yulianto",
            "Nurul Hidayah",
            "Lovinda Maylan",
            "Dwi Ratna Desianti",
            "Retno Yuda Iriani",
            "Dina Syifa Harjanto",
            "Zafira Ansy",
            "Violinda Yulian",
            "Yolanda Lovia Toscha Aprilia"
    };
    private static String[] age = {
            "Mahasiswa",
            "Wiraswasta",
            "Siswa",
            "Mahasiswa",
            "Mahasiswa",
            "Siswa",
            "Mahasiswa",
            "Guru",
            "Siswa",
            "Siswa",
            "Mahasiswa",
            "Wiraswasta"
    };
    private static int[] img = {
            R.drawable.dani,
            R.drawable.ibnu,
            R.drawable.dito_rafie,
            R.drawable.bayu,
            R.drawable.nurul,
            R.drawable.vinda,
            R.drawable.dwi,
            R.drawable.retno,
            R.drawable.dina,
            R.drawable.vira,
            R.drawable.violinda,
            R.drawable.yolan

    };

    static ArrayList<List> getListData() {
        ArrayList<List> list = new ArrayList<>();
        for (int position = 0; position < name.length; position++) {
            List list1 = new List();
            list1.setName(name[position]);
            list1.setAge(age[position]);
            list1.setImg(img[position]);
            list.add(list1);
        }
        return list;
    }
}