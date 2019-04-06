package org.hh;

import android.view.*;
import android.graphics.*;
import java.text.*;
import android.util.*;
import android.content.*;
//骨架自定义view
public class diyView extends View 
{
public diyView(Context ctx,AttributeSet attrs)
{
	super(ctx,attrs);
}
	@Override
	protected void onDraw ( Canvas canvas )
	{
		//canvas.drawLine();
		Path path=new Path();
		Paint paint=new Paint();
		//paint.setStrokeWidth(10.0f);
		float x=10.4f;
		float y=10.4f;
		float radius=10.4f;
		paint.setColor(Color.BLUE);
		//连接父节点的圆
		path.addCircle(x,y,radius,Path.Direction.CW);
		//连接父节点和子节点的线
	//	path.addRect();
		//连接子节点的圆
		//path.addCircle(x,y,radius,Path.Direction.CW);
		
		//设置画笔线框模式
		//画组件
		//canvas.drawPath(path,paint);
		canvas.drawColor(Color.BLUE);
		
	}

	@Override
	protected void onMeasure ( int widthMeasureSpec, int heightMeasureSpec ) {
		// TODO: Implement this method
		super.onMeasure ( widthMeasureSpec, heightMeasureSpec );
	}
	

	@Override
	public boolean onTouchEvent ( MotionEvent event )
	{
		switch(event.getAction())
		{
			case event.ACTION_HOVER_MOVE:
				float x=event.getX();
				float y=event.getY();
				break;
		}
		return super.onTouchEvent ( event );
	}
	
}
