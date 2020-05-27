package sg.edu.rp.c346.id18015170.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvAP;
    TextView tvITSD;
    TextView tvDCCM;
    TextView tvProj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAP = findViewById(R.id.textViewAP);
        tvITSD = findViewById(R.id.textViewITSD);
        tvDCCM = findViewById(R.id.textViewDCCM);
        tvProj = findViewById(R.id.textViewProject);

        tvAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "Android Programming");
                intent.putExtra("AcademicYear", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W67R");
                startActivity(intent);
            }
        });

        tvITSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C382");
                intent.putExtra("ModuleName", "IT Service Delivery");
                intent.putExtra("AcademicYear", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W67R");
                startActivity(intent);
            }
        });

        tvDCCM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C322");
                intent.putExtra("ModuleName", "Data Centre and Cloud Mgmt");
                intent.putExtra("AcademicYear", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "E61G");
                startActivity(intent);
            }
        });
        tvProj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C300");
                intent.putExtra("ModuleName", "Project");
                intent.putExtra("AcademicYear", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "-");
                startActivity(intent);
            }
        });

    }
}
