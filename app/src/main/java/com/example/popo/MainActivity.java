package com.example.popo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.IOException;
import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    //Переменная для работы с БД
    private DatabaseHelper mDBHelper;
    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  mDBHelper = new DatabaseHelper(this);

        try {
            mDBHelper.updateDataBase();
        } catch (IOException mIOException) {
            throw new Error("UnableToUpdateDatabase");
        }*/

        mDb = mDBHelper.getWritableDatabase();

        //Найдем компоненты в XML разметке
        button = (Button) findViewById(R.id.start);
        textView = (TextView) findViewById(R.id.textView);

        //Пропишем обработчик клика кнопки
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String product = "";

                Cursor cursor = mDb.rawQuery("SELECT * FROM nodes", null);
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    product += cursor.getString(1) + " | ";
                    cursor.moveToNext();
                }
                cursor.close();

                textView.setText(product);
            }
        });*/
    }
}