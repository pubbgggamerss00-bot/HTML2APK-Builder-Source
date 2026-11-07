package f9;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel", f = "ProjectEditorViewModel.kt", l = {547, 550, 638}, m = "restoreFieldsInternal")
/* loaded from: classes.dex */
public final class ch extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public fg f9254a;

    /* renamed from: b, reason: collision with root package name */
    public ProjectEntity f9255b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9256c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9257d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f9258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg f9259f;

    /* renamed from: g, reason: collision with root package name */
    public int f9260g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(fg fgVar, vg.c cVar) {
        super(cVar);
        this.f9259f = fgVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f9258e = obj;
        this.f9260g |= PKIFailureInfo.systemUnavail;
        mh.k kVar = fg.X0;
        return this.f9259f.B(null, false, this);
    }
}
