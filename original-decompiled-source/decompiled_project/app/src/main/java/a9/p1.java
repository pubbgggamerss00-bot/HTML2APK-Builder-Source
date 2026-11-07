package a9;

import android.app.Activity;
import android.content.Context;
import b9.o1;

/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f293c;

    public /* synthetic */ p1(int i10, Object obj, Object obj2) {
        this.f291a = i10;
        this.f292b = obj;
        this.f293c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f291a) {
            case 0:
                Context context = (Context) this.f292b;
                b2 b2Var = (b2) this.f293c;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    b2Var.f138b.e(activity, "pro_subscription_monthly", b2Var.f139c.j());
                }
                break;
            default:
                o1.p.a(((b9.j0) this.f292b).f3902i, (x0.n1) this.f293c);
                break;
        }
        return pg.f0.f21461a;
    }
}
