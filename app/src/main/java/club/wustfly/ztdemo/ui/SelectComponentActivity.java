package club.wustfly.ztdemo.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import club.wustfly.ztdemo.R;
import club.wustfly.ztdemo.conf.Constants;

public class SelectComponentActivity extends AppCompatActivity {

    @BindView(R.id.grid_layout)
    GridLayout gridLayoutView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_component);
        ButterKnife.bind(this);
        view();
    }

    public void view() {
        ViewGroup.LayoutParams lp = gridLayoutView.getLayoutParams();
        lp.width = Constants.SCREEN_WIDTH - 100;
        lp.height = Constants.SCREEN_WIDTH - 100;
        gridLayoutView.setLayoutParams(lp);
    }

    public void bpClick(View view) {
        startActivity(new Intent(this, BPMainPageActivity.class));
    }

    public void ljClick(View view) {
        startActivity(new Intent(this, LJMainpageActivity.class));
    }
}
