package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {111}, m = "drag-jO51t88")
/* loaded from: classes.dex */
public final class t extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c2.c f30079a;

    /* renamed from: b, reason: collision with root package name */
    public eh.l f30080b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30081c;

    /* renamed from: d, reason: collision with root package name */
    public int f30082d;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30081c = obj;
        this.f30082d |= PKIFailureInfo.systemUnavail;
        return u.d(null, 0L, null, this);
    }
}
