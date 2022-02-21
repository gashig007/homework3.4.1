package com.example.homework341;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
private ArrayList<String> contacts;
private RecyclerView recyclerView;
private ContactAdapter contactAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadContacts();
        recyclerView = view.findViewById(R.id.recycler);
        contactAdapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(contactAdapter);
    }

    private void loadContacts() {
        contacts = new ArrayList<>();
        contacts.add("89453842745");
        contacts.add("0555214835");
        contacts.add("0707473528");
        contacts.add("0505036582");
        contacts.add("0771657365");
        contacts.add("0666647365");
        contacts.add("89234753654");
        contacts.add("0705746382");
        contacts.add("0772758354");
        contacts.add("0504756381");
        contacts.add("0555846372");
        contacts.add("0800857463");
        contacts.add("89234124659");


    }
}