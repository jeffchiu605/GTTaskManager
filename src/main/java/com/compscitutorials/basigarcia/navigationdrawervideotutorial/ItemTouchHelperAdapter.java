package com.compscitutorials.basigarcia.navigationdrawervideotutorial;

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}