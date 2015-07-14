package cn.swu.pulltorefresh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;

@SuppressLint("UseSparseArrays")
public class PullToRefreshListAdapter extends BaseAdapter {
	
	Context context;
	public static CheckBox check;
	public static ArrayList<HashMap<String, Object>> listData;	
	HashMap<Integer, Boolean> state = new HashMap<Integer, Boolean>();	
	@SuppressLint("UseSparseArrays")
	Map<Integer, Boolean> map_state = new HashMap<Integer, Boolean>();
	public PullToRefreshListAdapter(Context context,	ArrayList<HashMap<String, Object>> listData) {
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listData.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return listData.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	
	public static void selectAll()
	{
		check.setChecked(true);
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		return null;
	}

}