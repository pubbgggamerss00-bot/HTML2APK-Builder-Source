package a9;

import android.app.Activity;
import android.content.Context;
import b9.o1;

/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f275c;

    public /* synthetic */ o1(int i10, Object obj, Object obj2) {
        this.f273a = i10;
        this.f274b = obj;
        this.f275c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f273a) {
            case 0:
                Context context = (Context) this.f274b;
                b2 b2Var = (b2) this.f275c;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    b2Var.f138b.e(activity, "premium_upgrade", b2Var.f139c.j());
                }
                break;
            default:
                o1.p.a(((b9.j0) this.f274b).f3901h, (x0.n1) this.f275c);
                break;
        }
        return pg.f0.f21461a;
    }
}
