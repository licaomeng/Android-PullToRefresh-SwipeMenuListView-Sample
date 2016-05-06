package edu.swu.pulltorefreshswipemenulistview.library.swipemenu.interfaces;

import edu.swu.pulltorefreshswipemenulistview.library.swipemenu.bean.SwipeMenu;

public interface OnMenuItemClickListener {
    void onMenuItemClick(int position, SwipeMenu menu, int index);
}