package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.b;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o0 extends m0 implements n0 {
    public static final Method V;
    public b.c U;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z6) {
            popupWindow.setTouchModal(z6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends i0 {
        public final int E;
        public final int F;
        public n0 G;
        public androidx.appcompat.view.menu.h H;

        public c(Context context, boolean z6) {
            super(context, z6);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.E = 21;
                this.F = 22;
            } else {
                this.E = 22;
                this.F = 21;
            }
        }

        @Override // l.i0, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.e eVar;
            int headersCount;
            int iPointToPosition;
            int i6;
            if (this.G != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    eVar = (androidx.appcompat.view.menu.e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (androidx.appcompat.view.menu.e) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.h item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i6 = iPointToPosition - headersCount) < 0 || i6 >= eVar.getCount()) ? null : eVar.getItem(i6);
                androidx.appcompat.view.menu.h hVar = this.H;
                if (hVar != item) {
                    androidx.appcompat.view.menu.f fVar = eVar.s;
                    if (hVar != null) {
                        this.G.g(fVar, hVar);
                    }
                    this.H = item;
                    if (item != null) {
                        this.G.c(fVar, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i6 == this.E) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i6 != this.F) {
                return super.onKeyDown(i6, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.e) adapter).s.c(false);
            return true;
        }

        public void setHoverListener(n0 n0Var) {
            this.G = n0Var;
        }

        @Override // l.i0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                V = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.n0
    public final void c(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        b.c cVar = this.U;
        if (cVar != null) {
            cVar.c(fVar, hVar);
        }
    }

    @Override // l.n0
    public final void g(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        b.c cVar = this.U;
        if (cVar != null) {
            cVar.g(fVar, menuItem);
        }
    }

    @Override // l.m0
    public final i0 q(Context context, boolean z6) {
        c cVar = new c(context, z6);
        cVar.setHoverListener(this);
        return cVar;
    }
}
