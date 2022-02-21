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
        contacts.add("Мама");
        contacts.add("Папа");
        contacts.add("Рашид");
        contacts.add("Арман");
        contacts.add("Бексултан");
        contacts.add("Матай");
        contacts.add("Медина");
        contacts.add("Рустам");
        contacts.add("Дастан");
        contacts.add("Арстан");
        contacts.add("Дима");
        contacts.add("Бабушка");
        contacts.add("Дедушка");


    }
}