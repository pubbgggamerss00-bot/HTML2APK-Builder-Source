package f9;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel", f = "ProjectEditorViewModel.kt", l = {469, 472, 478, 481, 484}, m = "loadProject")
/* loaded from: classes.dex */
public final class og extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public fg f10200a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg f10202c;

    /* renamed from: d, reason: collision with root package name */
    public int f10203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(fg fgVar, vg.c cVar) {
        super(cVar);
        this.f10202c = fgVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f10201b = obj;
        this.f10203d |= PKIFailureInfo.systemUnavail;
        return this.f10202c.n(0L, this);
    }
}
