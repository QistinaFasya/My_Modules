package sg.edu.rp.c346.id18015170.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvCode;
    TextView tvName;
    TextView tvAcadYr;
    TextView tvSem;
    TextView tvCred;
    TextView tvVenue;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvAcadYr = findViewById(R.id.textViewAcadYr);
        tvSem = findViewById(R.id.textViewSem);
        tvCred = findViewById(R.id.textViewCred);
        tvVenue = findViewById(R.id.textViewVenue);
        back = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String code  = intentReceived.getStringExtra("ModuleCode");
        String name  = intentReceived.getStringExtra("ModuleName");
        int acadYr  = intentReceived.getIntExtra("AcademicYear", 0);
        int sem  = intentReceived.getIntExtra("Semester", 0);
        int cred  = intentReceived.getIntExtra("ModuleCredit",0);
        String venue  = intentReceived.getStringExtra("Venue");
        tvCode.setText("Module Code : " + code);
        tvName.setText("Module Name : " + name);
        tvAcadYr.setText("Academic Year : " + acadYr);
        tvSem.setText("Semester : " + sem);
        tvCred.setText("Module Credit : " + cred);
        tvVenue.setText("Venue : " + venue);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}
