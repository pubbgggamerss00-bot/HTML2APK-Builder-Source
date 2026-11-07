package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {122}, m = "userScroll")
/* loaded from: classes.dex */
public final class p0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public f0 f30024a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f30026c;

    /* renamed from: d, reason: collision with root package name */
    public int f30027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(f0 f0Var, vg.c cVar) {
        super(cVar);
        this.f30026c = f0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30025b = obj;
        this.f30027d |= PKIFailureInfo.systemUnavail;
        return this.f30026c.f(null, null, this);
    }
}
