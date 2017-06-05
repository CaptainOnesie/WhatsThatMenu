package menu.fish.whatsthatmenu.data;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

import menu.fish.whatsthatmenu.R;
import menu.fish.whatsthatmenu.menu.DataItemAdapter;
import menu.fish.whatsthatmenu.model.DataItem;
import menu.fish.whatsthatmenu.sample.SampleDataProvider;


public class MainActivity extends AppCompatActivity{
    List<DataItem> dataItemList = SampleDataProvider.dataItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Collections.sort(dataItemList, (o1, o2) -> o1.getItemName().compareTo(o2.getItemName()));

        DataItemAdapter adapter = new DataItemAdapter(this, dataItemList);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvItems);
        recyclerView.setAdapter(adapter);
    }
}
