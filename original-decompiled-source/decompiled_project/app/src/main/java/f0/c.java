package f0;

import i0.n4;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import t2.g0;
import t2.h0;

/* loaded from: classes.dex */
public final class c extends s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8754b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i10) {
        super(0);
        this.f8753a = i10;
        this.f8754b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        g0 g0Var;
        switch (this.f8753a) {
            case 0:
                return (p1.e) this.f8754b;
            default:
                n4 n4Var = (n4) this.f8754b;
                t2.b bVar = n4Var.f13449b;
                h0 h0Var = (h0) n4Var.f13448a.getValue();
                return Boolean.valueOf(r.a(bVar, (h0Var == null || (g0Var = h0Var.f27819a) == null) ? null : g0Var.f27809a));
        }
    }
}
