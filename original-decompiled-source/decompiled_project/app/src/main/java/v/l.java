package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1048}, m = "awaitDragOrCancellation-rnUCldI")
/* loaded from: classes.dex */
public final class l extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c2.c f29980a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f29981b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29982c;

    /* renamed from: d, reason: collision with root package name */
    public int f29983d;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29982c = obj;
        this.f29983d |= PKIFailureInfo.systemUnavail;
        return u.b(null, 0L, this);
    }
}
