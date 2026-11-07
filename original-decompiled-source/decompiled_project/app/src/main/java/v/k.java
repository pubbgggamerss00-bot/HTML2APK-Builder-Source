package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {851}, m = "awaitAllPointersUpWithSlopDetection")
/* loaded from: classes.dex */
public final class k extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c2.c f29956a;

    /* renamed from: b, reason: collision with root package name */
    public c2.t f29957b;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f29958c;

    /* renamed from: d, reason: collision with root package name */
    public g2 f29959d;

    /* renamed from: e, reason: collision with root package name */
    public int f29960e;

    /* renamed from: f, reason: collision with root package name */
    public float f29961f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f29962g;

    /* renamed from: h, reason: collision with root package name */
    public int f29963h;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29962g = obj;
        this.f29963h |= PKIFailureInfo.systemUnavail;
        return u.a(null, null, null, this);
    }
}
