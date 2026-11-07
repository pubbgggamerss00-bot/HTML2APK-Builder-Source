package t8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionViewModel", f = "AiSessionViewModel.kt", l = {218}, m = "indexFile")
/* loaded from: classes.dex */
public final class p3 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f28388b;

    /* renamed from: c, reason: collision with root package name */
    public int f28389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(m3 m3Var, vg.c cVar) {
        super(cVar);
        this.f28388b = m3Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f28387a = obj;
        this.f28389c |= PKIFailureInfo.systemUnavail;
        return this.f28388b.i(this);
    }
}
