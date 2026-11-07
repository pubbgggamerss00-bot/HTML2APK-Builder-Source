package x8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel", f = "HomeViewModel.kt", l = {1098}, m = "findExistingKeystore")
/* loaded from: classes.dex */
public final class b7 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public String f32334a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f32335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j6 f32336c;

    /* renamed from: d, reason: collision with root package name */
    public int f32337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(j6 j6Var, vg.c cVar) {
        super(cVar);
        this.f32336c = j6Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f32335b = obj;
        this.f32337d |= PKIFailureInfo.systemUnavail;
        return this.f32336c.p(null, this);
    }
}
