package s;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {543, 2142}, m = "waitForComposition")
/* loaded from: classes.dex */
public final class h1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public z0 f23762a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23763b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0<Object> f23765d;

    /* renamed from: e, reason: collision with root package name */
    public int f23766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(z0 z0Var, vg.c cVar) {
        super(cVar);
        this.f23765d = z0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f23764c = obj;
        this.f23766e |= PKIFailureInfo.systemUnavail;
        return z0.f0(this.f23765d, this);
    }
}
