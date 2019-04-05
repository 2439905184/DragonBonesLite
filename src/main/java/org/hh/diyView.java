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
		// TODO: Implement this method
		super.onDraw ( canvas );
		//canvas.drawLine();
		Path path=new Path();
		Paint paint=new Paint();
		float x=4.4f;
		float y=4.4f;
		float radius=4.4f;
		path.addCircle(x,y,radius,Path.Direction.CW);
		paint.setColor(Color.BLUE);
		canvas.drawPath(path,paint);
		
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
