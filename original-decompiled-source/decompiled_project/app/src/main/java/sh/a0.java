package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
/* loaded from: classes2.dex */
public final class a0<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f24925a;

    /* renamed from: b, reason: collision with root package name */
    public y f24926b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24927c;

    /* renamed from: d, reason: collision with root package name */
    public int f24928d;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24927c = obj;
        this.f24928d |= PKIFailureInfo.systemUnavail;
        return gg.a.e(null, null, this);
    }
}
