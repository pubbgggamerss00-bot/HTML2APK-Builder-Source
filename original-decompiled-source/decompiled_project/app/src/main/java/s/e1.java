package s;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {353, 356}, m = "runAnimations")
/* loaded from: classes.dex */
public final class e1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public z0 f23714a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0<Object> f23716c;

    /* renamed from: d, reason: collision with root package name */
    public int f23717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(z0 z0Var, vg.c cVar) {
        super(cVar);
        this.f23716c = z0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f23715b = obj;
        this.f23717d |= PKIFailureInfo.systemUnavail;
        return z0.e0(this.f23716c, this);
    }
}
