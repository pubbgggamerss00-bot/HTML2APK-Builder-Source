package sh;

import i0.u2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {212}, m = "invokeSafely$FlowKt__EmittersKt")
/* loaded from: classes2.dex */
public final class l<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f25018a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25019b;

    /* renamed from: c, reason: collision with root package name */
    public int f25020c;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f25019b = obj;
        this.f25020c |= PKIFailureInfo.systemUnavail;
        return u2.a(null, null, null, this);
    }
}
