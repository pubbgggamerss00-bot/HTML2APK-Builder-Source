package ph;

/* loaded from: classes2.dex */
public final class v<T> extends y1 implements u<T> {
    @Override // ph.p0
    public final Object await(tg.e<? super T> eVar) throws Throwable {
        Object objK = k(eVar);
        ug.a aVar = ug.a.f29706a;
        return objK;
    }

    @Override // ph.u
    public final boolean d0(Throwable th2) {
        return I(new y(false, th2));
    }

    @Override // ph.p0
    public final xh.e<T> getOnAwait() {
        z1 z1Var = z1.f21634a;
        kotlin.jvm.internal.r.c(z1Var, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.internal.m0.b(3, z1Var);
        a2 a2Var = a2.f21496a;
        kotlin.jvm.internal.r.c(a2Var, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        kotlin.jvm.internal.m0.b(3, a2Var);
        return new xh.f(this, z1Var, a2Var, null);
    }
}
