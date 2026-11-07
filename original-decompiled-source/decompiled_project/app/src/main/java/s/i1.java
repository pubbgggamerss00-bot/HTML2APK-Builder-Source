package s;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {519, 2142}, m = "waitForCompositionAfterTargetStateChange")
/* loaded from: classes.dex */
public final class i1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public z0 f23774a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23775b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0<Object> f23777d;

    /* renamed from: e, reason: collision with root package name */
    public int f23778e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(z0 z0Var, vg.c cVar) {
        super(cVar);
        this.f23777d = z0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f23776c = obj;
        this.f23778e |= PKIFailureInfo.systemUnavail;
        return z0.g0(this.f23777d, this);
    }
}
