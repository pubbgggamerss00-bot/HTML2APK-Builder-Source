package f9;

import h8.f;

/* loaded from: classes.dex */
public final /* synthetic */ class vd implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10814b;

    public /* synthetic */ vd(Object obj, int i10) {
        this.f10813a = i10;
        this.f10814b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10813a) {
            case 0:
                x0.n1 n1Var = (x0.n1) this.f10814b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                n1Var.setValue(it);
                return pg.f0.f21461a;
            default:
                f.a.b bVar = (f.a.b) this.f10814b;
                t8.y3 it2 = (t8.y3) obj;
                kotlin.jvm.internal.r.e(it2, "it");
                String str = bVar.f12388a;
                if (str == null) {
                    str = "ai_unavailable";
                }
                return t8.y3.a(it2, null, null, null, null, null, null, false, null, null, null, null, 0, str, null, null, 4062591);
        }
    }
}
