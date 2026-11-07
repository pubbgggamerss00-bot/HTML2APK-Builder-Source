package b9;

import b9.o1;

/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f4146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4147c;

    public /* synthetic */ x2(Object obj, x0.n1 n1Var, int i10) {
        this.f4145a = i10;
        this.f4147c = obj;
        this.f4146b = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f4145a;
        x0.n1 n1Var = this.f4146b;
        Object obj = this.f4147c;
        switch (i10) {
            case 0:
                o1.p.a(((j0) obj).f3900g, n1Var);
                break;
            default:
                mh.k kVar = t8.v2.f28495e;
                ((eh.l) obj).invoke((String) n1Var.getValue());
                break;
        }
        return pg.f0.f21461a;
    }
}
