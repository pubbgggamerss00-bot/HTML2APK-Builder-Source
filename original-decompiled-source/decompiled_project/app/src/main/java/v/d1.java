package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {1023}, m = "semanticsScrollBy-d-4ec7I")
/* loaded from: classes.dex */
public final class d1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public s1 f29806a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.d0 f29807b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29808c;

    /* renamed from: d, reason: collision with root package name */
    public int f29809d;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29808c = obj;
        this.f29809d |= PKIFailureInfo.systemUnavail;
        return androidx.compose.foundation.gestures.i.a(null, 0L, this);
    }
}
