package g9;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildViewModel", f = "SimpleBuildViewModel.kt", l = {146}, m = "createProject-IoAF18A")
/* loaded from: classes.dex */
public final class a0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f11685b;

    /* renamed from: c, reason: collision with root package name */
    public int f11686c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(y yVar, vg.c cVar) {
        super(cVar);
        this.f11685b = yVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f11684a = obj;
        this.f11686c |= PKIFailureInfo.systemUnavail;
        Object objJ = this.f11685b.j(this);
        return objJ == ug.a.f29706a ? objJ : new pg.p(objJ);
    }
}
