package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {209}, m = "consumeUntilUp")
/* loaded from: classes.dex */
public final class x1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c2.c f30119a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30120b;

    /* renamed from: c, reason: collision with root package name */
    public int f30121c;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30120b = obj;
        this.f30121c |= PKIFailureInfo.systemUnavail;
        return t1.a(null, this);
    }
}
