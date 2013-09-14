package com.example.listasimple;

import java.util.Arrays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainFragment extends Fragment {

	private String[] nombres = {"Helmuth","Andre","Francisco","Karla","Cecilia", "Rosibel"};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_lista,container,false);
		
		ListView list = (ListView)view.findViewById(R.id.myListView);
		ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,Arrays.asList(nombres));
		list.setAdapter(adapter);
		
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int position,long id) {
				// TODO Auto-generated method stub
				//Toast.makeText(ListaActivity.this, "Click item", Toast.LENGTH_LONG).show();
				Intent intent=new Intent(getActivity(),DetailActivity.class);
				intent.putExtra("nombre", nombres[position]);
				startActivity(intent);
			}
		});
	
		
		return view;
	}
}
