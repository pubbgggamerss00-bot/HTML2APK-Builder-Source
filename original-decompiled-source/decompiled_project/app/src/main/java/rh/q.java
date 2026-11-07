package rh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {302}, m = "awaitClose")
/* loaded from: classes2.dex */
public final class q extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public u f23631a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.s f23632b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23633c;

    /* renamed from: d, reason: collision with root package name */
    public int f23634d;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f23633c = obj;
        this.f23634d |= PKIFailureInfo.systemUnavail;
        return s.a(null, null, this);
    }
}
