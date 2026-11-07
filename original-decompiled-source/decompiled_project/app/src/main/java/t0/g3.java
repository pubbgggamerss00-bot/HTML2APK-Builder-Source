package t0;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public final class g3 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f25910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<g2.v> f25912c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f25913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(View view, int i10, x0.n1<g2.v> n1Var, x0.l1 l1Var) {
        super(0);
        this.f25910a = view;
        this.f25911b = i10;
        this.f25912c = n1Var;
        this.f25913d = l1Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        View rootView = this.f25910a.getRootView();
        Rect rect = new Rect();
        rootView.getWindowVisibleDisplayFrame(rect);
        p1.e eVarD = q1.x1.d(rect);
        g2.v value = this.f25912c.getValue();
        this.f25913d.f(o3.c(this.f25911b, eVarD, value == null ? p1.e.f21130e : p1.f.a(value.B(0L), f3.q.e(value.a()))));
        return pg.f0.f21461a;
    }
}
