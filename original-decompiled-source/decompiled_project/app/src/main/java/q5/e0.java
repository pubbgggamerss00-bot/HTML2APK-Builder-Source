package q5;

import java.util.ArrayList;
import java.util.List;
import x0.n1;
import x0.r3;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r3 f21955b;

    public /* synthetic */ e0(n1 n1Var, int i10) {
        this.f21954a = i10;
        this.f21955b = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f21954a) {
            case 0:
                List list = (List) this.f21955b.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (kotlin.jvm.internal.r.a(((p5.s) obj).f21269b.f21234a, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                ((n1) this.f21955b).setValue(Boolean.FALSE);
                return pg.f0.f21461a;
        }
    }
}
