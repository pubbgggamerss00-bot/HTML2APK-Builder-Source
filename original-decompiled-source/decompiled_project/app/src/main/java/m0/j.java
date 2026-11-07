package m0;

import x0.j;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<Boolean> f17360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17361b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(eh.a<Boolean> aVar, boolean z10) {
        super(3);
        this.f17360a = aVar;
        this.f17361b = z10;
    }

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        androidx.compose.ui.d dVar2 = dVar;
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(-196777734);
        long j10 = ((q3) jVar2.f(r3.f17501a)).f17464a;
        boolean zJ = jVar2.j(j10);
        eh.a<Boolean> aVar = this.f17360a;
        boolean zK = zJ | jVar2.K(aVar);
        boolean z10 = this.f17361b;
        boolean zC = zK | jVar2.c(z10);
        Object objG = jVar2.g();
        if (zC || objG == j.a.f31715a) {
            objG = new i(j10, aVar, z10);
            jVar2.C(objG);
        }
        androidx.compose.ui.d dVarB = androidx.compose.ui.draw.a.b(dVar2, (eh.l) objG);
        jVar2.B();
        return dVarB;
    }
}
