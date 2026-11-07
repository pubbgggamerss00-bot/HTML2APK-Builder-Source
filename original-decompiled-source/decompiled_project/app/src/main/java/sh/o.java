package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl")
/* loaded from: classes2.dex */
public final class o<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f25038a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25039b;

    /* renamed from: c, reason: collision with root package name */
    public int f25040c;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f25039b = obj;
        this.f25040c |= PKIFailureInfo.systemUnavail;
        return gg.a.c(null, null, this);
    }
}
