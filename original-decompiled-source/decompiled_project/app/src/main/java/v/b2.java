package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {384}, m = "waitForLongPress")
/* loaded from: classes.dex */
public final class b2 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f29784a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29785b;

    /* renamed from: c, reason: collision with root package name */
    public int f29786c;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29785b = obj;
        this.f29786c |= PKIFailureInfo.systemUnavail;
        return t1.h(null, null, this);
    }
}
