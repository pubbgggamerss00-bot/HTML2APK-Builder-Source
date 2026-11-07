package ph;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {102}, m = "withTimeoutOrNull")
/* loaded from: classes2.dex */
public final class t2<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f21592a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21593b;

    /* renamed from: c, reason: collision with root package name */
    public int f21594c;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f21593b = obj;
        this.f21594c |= PKIFailureInfo.systemUnavail;
        return u2.c(0L, null, this);
    }
}
