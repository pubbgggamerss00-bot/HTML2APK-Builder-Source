package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {531}, m = "reset")
/* loaded from: classes.dex */
public final class v0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public x0 f30097a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f30099c;

    /* renamed from: d, reason: collision with root package name */
    public int f30100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(x0 x0Var, vg.c cVar) {
        super(cVar);
        this.f30099c = x0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30098b = obj;
        this.f30100d |= PKIFailureInfo.systemUnavail;
        return this.f30099c.w(this);
    }
}
