package com.example.thirdlesson.folders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.thirdlesson.App;
import com.example.thirdlesson.R;
import com.example.thirdlesson.datatype.Folder;
import com.example.thirdlesson.letters.LetterListActivity;

import javax.inject.Inject;
import java.util.List;

public class FolderListActivity extends AppCompatActivity {

    @Inject
    public FolderListActivityPresenter presenter;

    private ListView foldersListView;
    private ArrayAdapter<Folder> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folder_list);

        App.getInstance().getMailComponent().createFoldersListActivityComponent().injectFoldersListActivity(this);

        foldersListView = findViewById(R.id.foldersList);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        foldersListView.setAdapter(adapter);
        foldersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openFolder(adapter.getItem(position));
            }
        });

        presenter.loadFolders();
    }

    @Inject
    void setActivity() {presenter.setActivity(this);}

    void showFolders(List<Folder> folders){
        adapter.clear();
        adapter.addAll(folders);
    }

    void openFolder(Folder folder) {
        Intent intent = new Intent(this, LetterListActivity.class);
        intent.putExtra("folder", folder);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.getInstance().releaseMailComponent();
    }
}
