package com.example.thirdlesson.letters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.thirdlesson.App;
import com.example.thirdlesson.R;
import com.example.thirdlesson.datatype.Folder;
import com.example.thirdlesson.datatype.Letter;

import javax.inject.Inject;
import java.util.List;

public class LetterListActivity extends AppCompatActivity {

    @Inject
    public LetterListActivityPresenter presenter;

    private ListView lettersListView;
    private ArrayAdapter<Letter> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_list);

        Folder folder = (Folder) getIntent().getSerializableExtra("folder");
        App.getInstance().getMailComponent().createLetterListActivityComponent(new LetterListActivityModule(folder)).injectLetterListActivity(this);

        lettersListView = findViewById(R.id.lettersList);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        lettersListView.setAdapter(adapter);
        presenter.loadLetters();
    }

    @Inject
    void setActivity() {
        presenter.setActivity(this);
    }

    public void showLetters(List<Letter> letters) {
        adapter.clear();
        adapter.addAll(letters);
    }
}
