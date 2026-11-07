package m0;

import s1.a;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.s implements eh.l<s1.c, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<Boolean> f17341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1.n1 f17343c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1.p0 f17344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(eh.a aVar, boolean z10, q1.n1 n1Var, q1.p0 p0Var) {
        super(1);
        this.f17341a = aVar;
        this.f17342b = z10;
        this.f17343c = n1Var;
        this.f17344d = p0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(s1.c cVar) {
        s1.c cVar2 = cVar;
        cVar2.z1();
        if (this.f17341a.invoke().booleanValue()) {
            boolean z10 = this.f17342b;
            q1.p0 p0Var = this.f17344d;
            q1.n1 n1Var = this.f17343c;
            if (z10) {
                long jH1 = cVar2.h1();
                a.b bVarQ0 = cVar2.Q0();
                long jD = bVarQ0.d();
                bVarQ0.a().d();
                try {
                    bVarQ0.f24180a.e(-1.0f, 1.0f, jH1);
                    cVar2.D1(n1Var, s1.h.f24186a, p0Var);
                } finally {
                    t.r.a(bVarQ0, jD);
                }
            } else {
                cVar2.D1(n1Var, s1.h.f24186a, p0Var);
            }
        }
        return pg.f0.f21461a;
    }
}
