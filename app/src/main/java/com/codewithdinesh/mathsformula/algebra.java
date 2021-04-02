package com.codewithdinesh.mathsformula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class algebra extends AppCompatActivity {

    PDFView algebra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra);
        algebra=(PDFView) findViewById(R.id.pdfalgebra);
        algebra.fromAsset("algebra.pdf").load();
    }
}
