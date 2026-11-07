package f9;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel", f = "ProjectEditorViewModel.kt", l = {494}, m = "restoreFields")
/* loaded from: classes.dex */
public final class bh extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public fg f9136a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg f9138c;

    /* renamed from: d, reason: collision with root package name */
    public int f9139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(fg fgVar, vg.c cVar) {
        super(cVar);
        this.f9138c = fgVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f9137b = obj;
        this.f9139d |= PKIFailureInfo.systemUnavail;
        mh.k kVar = fg.X0;
        return this.f9138c.A(null, false, this);
    }
}
