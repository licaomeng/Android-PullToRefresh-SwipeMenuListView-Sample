package edu.swu.pulltorefreshswipemenulistview.library.swipemenu.interfaces;

import edu.swu.pulltorefreshswipemenulistview.library.swipemenu.bean.SwipeMenu;
import edu.swu.pulltorefreshswipemenulistview.library.swipemenu.view.SwipeMenuView;


public interface OnSwipeItemClickListener {
    void onItemClick(SwipeMenuView view, SwipeMenu menu, int index);
}