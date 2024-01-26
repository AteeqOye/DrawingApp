package com.example.drawingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.drawingapp.Interface.ToolsListener;
import com.example.drawingapp.adapters.ToolsAdapter;
import com.example.drawingapp.model.ToolsItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ToolsListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        
        initTools();
    }

    private void initTools() {
        RecyclerView recyclerView = findViewById (R.id.recycler_view_tool);
        recyclerView.setHasFixedSize (true);
        recyclerView.setLayoutManager (new GridLayoutManager (this , 2));
        ToolsAdapter toolsAdapter = new ToolsAdapter (loadTools() , this);
        recyclerView.setAdapter (toolsAdapter);
    }

    private List<ToolsItem> loadTools() {

        List<ToolsItem> result = new ArrayList<> ();

        result.add (new ToolsItem (R.drawable.ic_baseline_brush_24 , "brush"));
        result.add (new ToolsItem (R.drawable.ic_baseline_carpenter_24 , "eraser"));
        result.add (new ToolsItem (R.drawable.ic_baseline_palette_24 , "colors"));
        result.add (new ToolsItem (R.drawable.ic_baseline_whatshot_24 , "background"));
        result.add (new ToolsItem (R.drawable.ic_baseline_undo_24 , "return"));

        return result;
    }


    public void finishPaint(View view) {
    }

    public void sharePaint(View view) {
    }

    public void showDrawing(View view) {
    }

    public void saveDrawing(View view) {
    }

    @Override
    public void onSelected(String name) {

    }
}