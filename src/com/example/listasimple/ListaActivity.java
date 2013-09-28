package com.example.listasimple;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class ListaActivity extends FragmentActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);		
	}

	public void updateDetail(String nombre) {
		//Obtener el fragmento del detalle
		DetailFragment detail = (DetailFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
		detail.update(nombre);
	}
	
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.lista, menu);
//		return true;
//	}
	
}
