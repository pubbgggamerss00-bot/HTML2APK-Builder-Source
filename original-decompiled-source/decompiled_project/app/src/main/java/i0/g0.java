package i0;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.s implements eh.p<g1.o, Long, Long> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0.j2 f13290a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(m0.j2 j2Var) {
        super(2);
        this.f13290a = j2Var;
    }

    @Override // eh.p
    public final Long invoke(g1.o oVar, Long l10) {
        long jLongValue = l10.longValue();
        if (m0.n2.a(this.f13290a, jLongValue)) {
            return Long.valueOf(jLongValue);
        }
        return null;
    }
}
