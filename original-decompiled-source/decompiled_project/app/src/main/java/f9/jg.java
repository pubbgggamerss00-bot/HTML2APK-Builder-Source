package f9;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel", f = "ProjectEditorViewModel.kt", l = {414, DilithiumEngine.DilithiumPolyT0PackedBytes, 451}, m = "createPlaceholderProject")
/* loaded from: classes.dex */
public final class jg extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public fg f9894a;

    /* renamed from: b, reason: collision with root package name */
    public ProjectEntity f9895b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9896c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg f9897d;

    /* renamed from: e, reason: collision with root package name */
    public int f9898e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(fg fgVar, vg.c cVar) {
        super(cVar);
        this.f9897d = fgVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f9896c = obj;
        this.f9898e |= PKIFailureInfo.systemUnavail;
        mh.k kVar = fg.X0;
        return this.f9897d.j(this);
    }
}
