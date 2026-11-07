package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.s1;

@vg.e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
/* loaded from: classes2.dex */
public final class p0<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public o0 f25059a;

    /* renamed from: b, reason: collision with root package name */
    public g f25060b;

    /* renamed from: c, reason: collision with root package name */
    public r0 f25061c;

    /* renamed from: d, reason: collision with root package name */
    public s1 f25062d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f25063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0<T> f25064f;

    /* renamed from: g, reason: collision with root package name */
    public int f25065g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(o0<T> o0Var, tg.e<? super p0> eVar) {
        super(eVar);
        this.f25064f = o0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f25063e = obj;
        this.f25065g |= PKIFailureInfo.systemUnavail;
        o0.l(this.f25064f, null, this);
        return ug.a.f29706a;
    }
}
