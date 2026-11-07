package b9;

import java.util.List;
import x8.j6;
import x8.q7;

/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4095b;

    public /* synthetic */ s2(Object obj, int i10) {
        this.f4094a = i10;
        this.f4095b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f4094a;
        Object obj2 = this.f4095b;
        switch (i10) {
            case 0:
                x0.n1 n1Var = (x0.n1) obj2;
                y2.c0 it = (y2.c0) obj;
                kotlin.jvm.internal.r.e(it, "it");
                if (it.f33682a.f27761b.length() <= 50) {
                    q1.d1 d1Var = o1.f3960b;
                    n1Var.setValue(it);
                }
                break;
            default:
                j6 j6Var = (j6) obj2;
                List ids = (List) obj;
                kotlin.jvm.internal.r.e(ids, "ids");
                ph.h.c(androidx.lifecycle.x0.a(j6Var), null, null, new q7(j6Var, ids, null), 3);
                break;
        }
        return pg.f0.f21461a;
    }
}
