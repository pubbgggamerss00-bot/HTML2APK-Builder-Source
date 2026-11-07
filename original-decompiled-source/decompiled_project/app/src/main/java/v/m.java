package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {968}, m = "awaitLongPressOrCancellation-rnUCldI")
/* loaded from: classes.dex */
public final class m extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c2.b0 f29986a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f29987b;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.b0 f29988c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29989d;

    /* renamed from: e, reason: collision with root package name */
    public int f29990e;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29989d = obj;
        this.f29990e |= PKIFailureInfo.systemUnavail;
        return u.c(null, 0L, this);
    }
}
