package f9;

import h8.v;

/* loaded from: classes.dex */
public final /* synthetic */ class ne implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10139a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10140b;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10139a) {
            case 0:
                ((eh.l) this.f10140b).invoke(Integer.valueOf((int) ((Float) obj).floatValue()));
                return pg.f0.f21461a;
            default:
                t8.y3 y3Var = (t8.y3) obj;
                return t8.y3.a(t8.m3.h(y3Var), k3.a.a(y3Var.f28584d, ((v.f) ((h8.v) this.f10140b)).f12486a), null, null, null, null, null, false, null, null, null, null, 0, null, null, null, 4194295);
        }
    }

    public /* synthetic */ ne(h8.v vVar, t8.m3 m3Var) {
        this.f10140b = vVar;
    }
}
