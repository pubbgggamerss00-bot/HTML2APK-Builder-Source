package x8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel", f = "HomeViewModel.kt", l = {1231}, m = "runExport-gIAlu-s")
/* loaded from: classes.dex */
public final class r7<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public j6 f33128a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f33129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j6 f33130c;

    /* renamed from: d, reason: collision with root package name */
    public int f33131d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(j6 j6Var, vg.c cVar) {
        super(cVar);
        this.f33130c = j6Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f33129b = obj;
        this.f33131d |= PKIFailureInfo.systemUnavail;
        Object objK = j6.k(this.f33130c, null, this);
        return objK == ug.a.f29706a ? objK : new pg.p(objK);
    }
}
