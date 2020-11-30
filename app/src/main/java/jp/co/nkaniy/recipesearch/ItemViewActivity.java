package jp.co.nkaniy.recipesearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemViewActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView1;
    TextView textView2;

    ItemsModel itemsModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view);

        imageView = findViewById(R.id.imageViewItem);
        textView1 = findViewById(R.id.textViewName);
        textView2 = findViewById(R.id.textViewRecipe);

        Intent intent = getIntent();

        if(intent.getExtras() != null){
            itemsModel = (ItemsModel) intent.getSerializableExtra("item");

            imageView.setImageResource(itemsModel.getImage());
            textView1.setText(itemsModel.getName());
            textView2.setText(itemsModel.getRecipe());
        }

    }
}
