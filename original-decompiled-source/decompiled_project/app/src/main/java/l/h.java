package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class h implements l, j, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f16527a;

    public static int m(ListAdapter listAdapter, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    @Override // l.j
    public final boolean c(f fVar) {
        return false;
    }

    @Override // l.j
    public final void f(Context context, androidx.appcompat.view.menu.a aVar) {
    }

    @Override // l.j
    public final boolean j() {
        return false;
    }

    public abstract void l(androidx.appcompat.view.menu.a aVar);

    public abstract void n(View view);

    public abstract void o(boolean z10);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (e) listAdapter).f16498a.p((MenuItem) listAdapter.getItem(i10), this, !(this instanceof c) ? 0 : 4);
    }

    public abstract void p(int i10);

    public abstract void q(int i10);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z10);

    public abstract void t(int i10);
}
