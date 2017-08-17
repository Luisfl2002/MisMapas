package com.angel_fere.mismapas;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapas extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);






    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        float zoom=15;
        int velocidad=2000;
        mMap = googleMap;
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        double latitud = (double)extras.get("latitud");
        double longitud = (double)extras.get("longitud");

        LatLng lugar = new LatLng(latitud, longitud);
        mMap.addMarker(new MarkerOptions().position(lugar).title("")
        .icon(BitmapDescriptorFactory.fromResource(R.drawable.icons8_marker_64))
        );


         mMap.moveCamera(CameraUpdateFactory.newLatLng(lugar));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(zoom),velocidad,null);
    }
}
