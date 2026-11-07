package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class d implements f, j, AdapterView.OnItemClickListener {
    public Rect s;

    public static int m(ListAdapter listAdapter, Context context, int i6) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i7 = 0;
        int i8 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = listAdapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i9, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i6) {
                return i6;
            }
            if (measuredWidth > i7) {
                i7 = measuredWidth;
            }
        }
        return i7;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(h hVar) {
        return false;
    }

    public abstract void l(androidx.appcompat.view.menu.f fVar);

    public abstract void n(View view);

    public abstract void o(boolean z6);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j6) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (androidx.appcompat.view.menu.e) listAdapter).s.q((MenuItem) listAdapter.getItem(i6), this, !(this instanceof androidx.appcompat.view.menu.b) ? 0 : 4);
    }

    public abstract void p(int i6);

    public abstract void q(int i6);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z6);

    public abstract void t(int i6);

    @Override // androidx.appcompat.view.menu.j
    public final void g(Context context, androidx.appcompat.view.menu.f fVar) {
    }
}
