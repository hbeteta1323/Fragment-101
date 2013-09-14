package com.example.listasimple;

import java.util.Arrays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaActivity extends FragmentActivity {

	private String[] nombres = {"Helmuth","Andre","Francisco","Karla","Cecilia", "Rosibel"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista);
		
		ListView list = (ListView)findViewById(R.id.myListView);
		ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,Arrays.asList(nombres));
		list.setAdapter(adapter);
		
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int position,long id) {
				// TODO Auto-generated method stub
				//Toast.makeText(ListaActivity.this, "Click item", Toast.LENGTH_LONG).show();
				Intent intent=new Intent(ListaActivity.this,DetailActivity.class);
				intent.putExtra("nombre", nombres[position]);
				startActivity(intent);
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lista, menu);
		return true;
	}

}
