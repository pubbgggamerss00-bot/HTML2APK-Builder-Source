package f0;

import f3.p;
import i2.g1;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g extends s implements eh.a<p1.e> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f8772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f8773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n2.b f8774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, g1 g1Var, n2.b bVar) {
        super(0);
        this.f8772a = hVar;
        this.f8773b = g1Var;
        this.f8774c = bVar;
    }

    @Override // eh.a
    public final p1.e invoke() {
        g1 g1Var = this.f8773b;
        n2.b bVar = this.f8774c;
        h hVar = this.f8772a;
        p1.e eVarT1 = h.T1(hVar, g1Var, bVar);
        if (eVarT1 == null) {
            return null;
        }
        v.f fVar = hVar.f8775q;
        if (p.b(fVar.f29835z, 0L)) {
            y.c.c("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return eVarT1.j(fVar.X1(eVarT1, fVar.f29835z) ^ (-9223372034707292160L));
    }
}
