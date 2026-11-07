package j2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {219}, m = "textInputSession")
/* loaded from: classes.dex */
public final class y1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f14989b;

    /* renamed from: c, reason: collision with root package name */
    public int f14990c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(d2 d2Var, vg.c cVar) {
        super(cVar);
        this.f14989b = d2Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f14988a = obj;
        this.f14990c |= PKIFailureInfo.systemUnavail;
        this.f14989b.a(null, null, this);
        return ug.a.f29706a;
    }
}
