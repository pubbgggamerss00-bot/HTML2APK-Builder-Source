package ph;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {160}, m = "awaitCancellation")
/* loaded from: classes2.dex */
public final class s0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21587a;

    /* renamed from: b, reason: collision with root package name */
    public int f21588b;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f21587a = obj;
        this.f21588b |= PKIFailureInfo.systemUnavail;
        t0.a(this);
        return ug.a.f29706a;
    }
}
