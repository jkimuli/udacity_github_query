package com.example.jkimuli.githubquery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mSearchUrl;
    private EditText mSearchQuery;
    private TextView mSearchResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchResults = (TextView)findViewById(R.id.tv_github_search_results_json);
        mSearchQuery = (EditText)findViewById(R.id.et_search_box);
        mSearchUrl = (TextView)findViewById(R.id.tv_url_display);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater myMenu = getMenuInflater();
        myMenu.inflate(R.menu.main,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){

            case R.id.search_menu_item:

                Toast.makeText(this,"Search Menu Item Clicked",Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
