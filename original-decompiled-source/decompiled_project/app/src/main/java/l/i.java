package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.basitce.htmltoapk.R;
import l.j;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16528a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.view.menu.a f16529b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16530c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16531d;

    /* renamed from: e, reason: collision with root package name */
    public View f16532e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16534g;

    /* renamed from: h, reason: collision with root package name */
    public j.a f16535h;

    /* renamed from: i, reason: collision with root package name */
    public h f16536i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f16537j;

    /* renamed from: f, reason: collision with root package name */
    public int f16533f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final a f16538k = new a();

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    public i(Context context, androidx.appcompat.view.menu.a aVar, View view, boolean z10, int i10, int i11) {
        this.f16528a = context;
        this.f16529b = aVar;
        this.f16532e = view;
        this.f16530c = z10;
        this.f16531d = i10;
    }

    public final h a() {
        h mVar;
        if (this.f16536i == null) {
            Context context = this.f16528a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                mVar = new c(context, this.f16532e, this.f16531d, this.f16530c);
            } else {
                mVar = new m(this.f16528a, this.f16529b, this.f16532e, this.f16531d, this.f16530c);
            }
            mVar.l(this.f16529b);
            mVar.r(this.f16538k);
            mVar.n(this.f16532e);
            mVar.i(this.f16535h);
            mVar.o(this.f16534g);
            mVar.p(this.f16533f);
            this.f16536i = mVar;
        }
        return this.f16536i;
    }

    public final boolean b() {
        h hVar = this.f16536i;
        return hVar != null && hVar.e();
    }

    public void c() {
        this.f16536i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f16537j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        h hVarA = a();
        hVarA.s(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f16533f, this.f16532e.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f16532e.getWidth();
            }
            hVarA.q(i10);
            hVarA.t(i11);
            int i12 = (int) ((this.f16528a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarA.f16527a = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        hVarA.a();
    }
}
