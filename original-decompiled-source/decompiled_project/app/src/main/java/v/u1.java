package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {291}, m = "awaitFirstDown")
/* loaded from: classes.dex */
public final class u1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c2.c f30088a;

    /* renamed from: b, reason: collision with root package name */
    public c2.t f30089b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30090c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30091d;

    /* renamed from: e, reason: collision with root package name */
    public int f30092e;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30091d = obj;
        this.f30092e |= PKIFailureInfo.systemUnavail;
        return t1.b(null, false, null, this);
    }
}
