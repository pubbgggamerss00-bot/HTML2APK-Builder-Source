package f9;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel", f = "ProjectEditorViewModel.kt", l = {770, 780}, m = "persistPastedHtml")
/* loaded from: classes.dex */
public final class sg extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public fg f10513a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg f10515c;

    /* renamed from: d, reason: collision with root package name */
    public int f10516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(fg fgVar, vg.c cVar) {
        super(cVar);
        this.f10515c = fgVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f10514b = obj;
        this.f10516d |= PKIFailureInfo.systemUnavail;
        return fg.f(this.f10515c, null, this);
    }
}
