package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
/* loaded from: classes2.dex */
public final class z<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f25128a;

    /* renamed from: b, reason: collision with root package name */
    public x f25129b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25130c;

    /* renamed from: d, reason: collision with root package name */
    public int f25131d;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f25130c = obj;
        this.f25131d |= PKIFailureInfo.systemUnavail;
        return gg.a.f(null, this);
    }
}
