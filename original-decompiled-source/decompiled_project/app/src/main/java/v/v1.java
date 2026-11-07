package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {304}, m = "awaitPrimaryFirstDown")
/* loaded from: classes.dex */
public final class v1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c2.c f30101a;

    /* renamed from: b, reason: collision with root package name */
    public c2.t f30102b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30103c;

    /* renamed from: d, reason: collision with root package name */
    public int f30104d;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30103c = obj;
        this.f30104d |= PKIFailureInfo.systemUnavail;
        return t1.d(null, null, this);
    }
}
