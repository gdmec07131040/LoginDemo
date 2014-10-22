package cn.edu.gdmec.s07131040.logindemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class SecondActivity extends Activity {
	EditText myEd1,myEd2;
	Button myBtn2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		myEd1=(EditText) findViewById(R.id.editText1);
		myEd2=(EditText) findViewById(R.id.editText2);
		myBtn2=(Button) findViewById(R.id.button2);
		
		myBtn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Uri data=Uri.parse("");
				Intent result=new Intent(null,data);
				result.putExtra("para1", myEd1.getText().toString());
				result.putExtra("para2", myEd2.getText().toString());
				setResult(RESULT_OK,result);
				finish();
				
			}
		});
	}

}
