/*http://ichitcltk.hustle.ne.jp/gudon/modules/pico_rd/index.php?content_id=113*/
/*http://youinfo.sitemix.jp/uncategorized/705.html
*/package com.example.musicgameanimation2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.TableRow;
import android.view.View;

public class MainActivity extends Activity {
	
	private final static int WC=TableLayout.LayoutParams.WRAP_CONTENT;
	private final static int FP=TableLayout.LayoutParams.FILL_PARENT;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TableLayout tableLayout = new TableLayout(this);
		setContentView(tableLayout, new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT));
		 
		int index =1;
		
			TableRow[] tableRow = new TableRow[4];
			for (int iRow = 0; iRow < 4; iRow++) {
				tableRow[iRow] = new TableRow(this);
				tableRow[iRow].setLayoutParams(new TableLayout.LayoutParams(FP,FP));
				tableRow[iRow].setGravity(Gravity.CENTER);//’†‰›Šñ‚¹
				tableLayout.addView(tableRow[iRow]); 
				
				ImageButton[] button_list = new ImageButton[4];
				for(int i = 0; i < 4; i++){
					button_list[i] = new ImageButton(this);
					button_list[i].setId(index++);
					button_list[i].setImageResource(R.drawable.musicgame1);
					tableRow[iRow].addView(button_list[i]);
				}
			}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
     