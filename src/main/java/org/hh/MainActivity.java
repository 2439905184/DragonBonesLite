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
import android.widget.LinearLayout.*;
import android.content.DialogInterface.*;
import android.view.ViewGroup.*;
import android.graphics.*;
public class MainActivity extends Activity
{
	
private int AnimTracks;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		diyView diy=new diyView(this,null);
		ViewGroup a;

		/*LinearLayout time=(LinearLayout) findViewById(R.id.TimeLine);
		ViewGroup.LayoutParams pa=	time.getLayoutParams ( );
		diy.setLayoutParams ( pa);
		time.addView ( diy );*/
		//
	  }
private EditText fps;
	@Override
	protected void onStart ( )
	{
		super.onStart ( );
		
		//自定义时间线View
		/*HorizontalScrollView timeLine=findViewById(R.id.TimeLine);
		View time=new TimeLine(getApplicationContext());
		
		LayoutParams par=new LayoutParams(200,200);
		time.setLayoutParams(par);
		
		timeLine.addView(time);*/
	}
	//添加动画轨道
	public void addAnim(View v)
	{
		AnimTracks=AnimTracks+1;
		Integer s;
		Toast.makeText(getApplicationContext(),"添加动画"+AnimTracks,2000).show();
		ListView AnimTracksView=(ListView)findViewById(R.id.AnimTracksView);
		/*ArrayAdapter aadp=new ArrayAdapter(this,R.id.AnimTracksView);
		ArrayList t=new ArrayList();
		ArrayMap u=new ArrayMap();
		u.put(4,"32");
		AnimTracksView.setAdapter(aadp);
		*/
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
 				Toast.makeText(getApplicationContext(),d,2).show();
			}
	}
	//关于按钮 显示开发者信息
	public void about(View v)
	{
		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		alert.setTitle("关于这个软件");
		alert.setMessage("此软件由1288hh制作,在安卓手机上制作龙骨动画吧！");
		alert.setNegativeButton("知道了",null);
		alert.show();
	}
	//设置页面
public void settings(View v)
{
	//nflat
	final View itemView = View.inflate(MainActivity.this, R.layout.projectSettings, null);
	EditText fff=(EditText)itemView.findViewById(R.id.fps);
	final String txt=fff.getText().toString();
	AlertDialog.Builder set =new AlertDialog.Builder(this);
	set.setTitle("项目设置");
	set.setView(itemView);
	
	
	DialogInterface.OnClickListener click=new DialogInterface.OnClickListener()
		{
			@Override
			public void onClick ( DialogInterface p1, int p2 ) 
			{
				Toast.makeText(getApplicationContext(),txt,2000).show();
	}
	};
	set.setNegativeButton("确定",click);
	set.show();
}
//构建导出龙骨动画
public void build(View v)
{
	AlertDialog.Builder out= new AlertDialog.Builder(this);
	out.setTitle("导出设置");
	
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
