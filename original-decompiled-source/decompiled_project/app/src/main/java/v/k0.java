package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {227}, m = "dispatchMouseWheelScroll$waitNextScrollDelta")
/* loaded from: classes.dex */
public final class k0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public f0 f29964a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f29965b;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.d0 f29966c;

    /* renamed from: d, reason: collision with root package name */
    public s1 f29967d;

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f29968e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f29969f;

    /* renamed from: g, reason: collision with root package name */
    public int f29970g;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29969f = obj;
        this.f29970g |= PKIFailureInfo.systemUnavail;
        return f0.c(null, null, null, null, null, 0L, this);
    }
}
