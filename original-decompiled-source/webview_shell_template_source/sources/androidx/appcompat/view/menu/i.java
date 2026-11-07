package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f219a;

    /* renamed from: b, reason: collision with root package name */
    public final f f220b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f221c;

    /* renamed from: d, reason: collision with root package name */
    public final int f222d;

    /* renamed from: e, reason: collision with root package name */
    public final int f223e;

    /* renamed from: f, reason: collision with root package name */
    public View f224f;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public j.a f226i;

    /* renamed from: j, reason: collision with root package name */
    public k.d f227j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f228k;

    /* renamed from: g, reason: collision with root package name */
    public int f225g = 8388611;

    /* renamed from: l, reason: collision with root package name */
    public final a f229l = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    public i(int i6, int i7, Context context, View view, f fVar, boolean z6) {
        this.f219a = context;
        this.f220b = fVar;
        this.f224f = view;
        this.f221c = z6;
        this.f222d = i6;
        this.f223e = i7;
    }

    public final k.d a() {
        k.d lVar;
        if (this.f227j == null) {
            Context context = this.f219a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                lVar = new b(this.f219a, this.f224f, this.f222d, this.f223e, this.f221c);
            } else {
                View view = this.f224f;
                lVar = new l(this.f222d, this.f223e, this.f219a, view, this.f220b, this.f221c);
            }
            lVar.l(this.f220b);
            lVar.r(this.f229l);
            lVar.n(this.f224f);
            lVar.d(this.f226i);
            lVar.o(this.h);
            lVar.p(this.f225g);
            this.f227j = lVar;
        }
        return this.f227j;
    }

    public final boolean b() {
        k.d dVar = this.f227j;
        return dVar != null && dVar.a();
    }

    public void c() {
        this.f227j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f228k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i6, int i7, boolean z6, boolean z7) {
        k.d dVarA = a();
        dVarA.s(z7);
        if (z6) {
            if ((Gravity.getAbsoluteGravity(this.f225g, this.f224f.getLayoutDirection()) & 7) == 5) {
                i6 -= this.f224f.getWidth();
            }
            dVarA.q(i6);
            dVarA.t(i7);
            int i8 = (int) ((this.f219a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            dVarA.s = new Rect(i6 - i8, i7 - i8, i6 + i8, i7 + i8);
        }
        dVarA.f();
    }
}
