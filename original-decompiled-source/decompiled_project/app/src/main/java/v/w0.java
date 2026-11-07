package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {544}, m = "tryAwaitRelease")
/* loaded from: classes.dex */
public final class w0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public x0 f30105a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f30107c;

    /* renamed from: d, reason: collision with root package name */
    public int f30108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, vg.c cVar) {
        super(cVar);
        this.f30107c = x0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30106b = obj;
        this.f30108d |= PKIFailureInfo.systemUnavail;
        return this.f30107c.G1(this);
    }
}
