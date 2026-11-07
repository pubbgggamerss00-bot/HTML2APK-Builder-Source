package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {352, 366}, m = "waitForUpOrCancellation")
/* loaded from: classes.dex */
public final class d2 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c2.c f29810a;

    /* renamed from: b, reason: collision with root package name */
    public c2.t f29811b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29812c;

    /* renamed from: d, reason: collision with root package name */
    public int f29813d;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29812c = obj;
        this.f29813d |= PKIFailureInfo.systemUnavail;
        return t1.i(null, null, this);
    }
}
