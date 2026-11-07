package s;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s.s;

@vg.e(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {231, 280}, m = "animate")
/* loaded from: classes.dex */
public final class p1<T, V extends s> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public n f23862a;

    /* renamed from: b, reason: collision with root package name */
    public h f23863b;

    /* renamed from: c, reason: collision with root package name */
    public eh.l f23864c;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f23865d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f23866e;

    /* renamed from: f, reason: collision with root package name */
    public int f23867f;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f23866e = obj;
        this.f23867f |= PKIFailureInfo.systemUnavail;
        return w1.b(null, null, 0L, null, this);
    }
}
