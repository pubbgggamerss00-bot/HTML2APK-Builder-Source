package t0;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public final class f3 extends kotlin.jvm.internal.s implements eh.l<g2.v, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f25862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<g2.v> f25864c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f25865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f25866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(View view, int i10, x0.n1<g2.v> n1Var, x0.l1 l1Var, x0.l1 l1Var2) {
        super(1);
        this.f25862a = view;
        this.f25863b = i10;
        this.f25864c = n1Var;
        this.f25865d = l1Var;
        this.f25866e = l1Var2;
    }

    @Override // eh.l
    public final pg.f0 invoke(g2.v vVar) {
        g2.v vVar2 = vVar;
        x0.n1<g2.v> n1Var = this.f25864c;
        n1Var.setValue(vVar2);
        this.f25865d.f((int) (vVar2.a() >> 32));
        View rootView = this.f25862a.getRootView();
        Rect rect = new Rect();
        rootView.getWindowVisibleDisplayFrame(rect);
        p1.e eVarD = q1.x1.d(rect);
        g2.v value = n1Var.getValue();
        this.f25866e.f(o3.c(this.f25863b, eVarD, value == null ? p1.e.f21130e : p1.f.a(value.B(0L), f3.q.e(value.a()))));
        return pg.f0.f21461a;
    }
}
