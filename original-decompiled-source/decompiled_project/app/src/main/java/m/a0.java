package m;

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
import java.lang.reflect.Method;
import l.c;

/* loaded from: classes.dex */
public final class a0 extends y implements z {
    public static final Method C;
    public c.C0165c B;

    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    public static class c extends v {

        /* renamed from: n, reason: collision with root package name */
        public final int f17093n;

        /* renamed from: p, reason: collision with root package name */
        public final int f17094p;

        /* renamed from: q, reason: collision with root package name */
        public z f17095q;

        /* renamed from: r, reason: collision with root package name */
        public l.f f17096r;

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f17093n = 21;
                this.f17094p = 22;
            } else {
                this.f17093n = 22;
                this.f17094p = 21;
            }
        }

        @Override // m.v, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            l.e eVar;
            int headersCount;
            int iPointToPosition;
            int i10;
            if (this.f17095q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    eVar = (l.e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (l.e) adapter;
                    headersCount = 0;
                }
                l.f item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= eVar.getCount()) ? null : eVar.getItem(i10);
                l.f fVar = this.f17096r;
                if (fVar != item) {
                    androidx.appcompat.view.menu.a aVar = eVar.f16498a;
                    if (fVar != null) {
                        this.f17095q.b(aVar, fVar);
                    }
                    this.f17096r = item;
                    if (item != null) {
                        this.f17095q.c(aVar, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f17093n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f17094p) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (l.e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (l.e) adapter).f16498a.c(false);
            return true;
        }

        public void setHoverListener(z zVar) {
            this.f17095q = zVar;
        }

        @Override // m.v, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                C = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.z
    public final void b(androidx.appcompat.view.menu.a aVar, MenuItem menuItem) {
        c.C0165c c0165c = this.B;
        if (c0165c != null) {
            c0165c.b(aVar, menuItem);
        }
    }

    @Override // m.z
    public final void c(androidx.appcompat.view.menu.a aVar, l.f fVar) {
        c.C0165c c0165c = this.B;
        if (c0165c != null) {
            c0165c.c(aVar, fVar);
        }
    }
}
