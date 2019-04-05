package org.hh;

import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;
import android.widget.*;
import java.util.*;
import android.util.*;
import android.net.*;
import android.database.*;
import android.provider.*;
public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
//	SimpleAdapter aadp=new SimpleAdapter(getApplicationContext(),null,"d",0);
		//aadp.setViewText(null,"g");
//		ExpandableListAdapter adp=new ExpandableListAdapter();
	  
    }

	@Override
	protected void onStart ( )
	{
		super.onStart ( );
		/*ExpandableListView a=findViewById(R.id.res);
		LinearLayout resView=findViewById(R.id.resView);
		a.addView(resView);*/
	}
	//导入龙骨动画,跳跃到导入界面
	public void importFile(View v)
	{
		Intent intent=new Intent(Intent.ACTION_GET_CONTENT);
		intent.setType("*/*");
		startActivityForResult(intent,1);
	}
	@Override
	protected void onActivityResult ( int requestCode, int resultCode, Intent data ) 
	{
		super.onActivityResult ( requestCode, resultCode, data );
		if(resultCode==Activity.RESULT_OK)
			{
				Uri uri=data.getData();
				String uui=uri.toString();
				String d=uri.decode(uui);
				MediaStore media;
				//media.getDocumentUri();
				Cursor a;
 				Toast.makeText(getApplicationContext(),d,2).show();
			}
	}
	
public void settings(View v)
{
	AlertDialog.Builder set =new AlertDialog.Builder(this);
	set.setTitle("项目设置");
	set.setView(R.layout.projectSettings);
	/*set.setNegativeButton();
	set.setPositiveButton();
	set.setCancelable(false);
	set.show();*/
}
//构建导出龙骨动画
public void build(View v)
{
	AlertDialog.Builder out= new AlertDialog.Builder(this);
	out.setTitle("导出设置");
	out.setView(R.layout.out);
	out.setPositiveButton("导出",new AlertDialog.OnClickListener()
		{
			@Override
			public void onClick ( DialogInterface p1, int p2 ) 
			{
				
			}
			
		
	});
	out.setNegativeButton("取消",new AlertDialog.OnClickListener()
	{
			@Override
			public void onClick ( DialogInterface p1, int p2 )
			{
				
			}

		
	});
	out.setCancelable(false);
	out.show();
}
}
