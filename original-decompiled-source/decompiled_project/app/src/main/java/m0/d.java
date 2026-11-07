package m0;

import j2.k5;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k5 f17275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f17278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f17279e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k5 k5Var, long j10, boolean z10, androidx.compose.ui.d dVar, w wVar) {
        super(2);
        this.f17275a = k5Var;
        this.f17276b = j10;
        this.f17277c = z10;
        this.f17278d = dVar;
        this.f17279e = wVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            x0.y.a(j2.j2.f14790s.a(this.f17275a), f1.c.b(1260045569, new c(this.f17276b, this.f17277c, this.f17278d, this.f17279e), jVar2), jVar2, 56);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
