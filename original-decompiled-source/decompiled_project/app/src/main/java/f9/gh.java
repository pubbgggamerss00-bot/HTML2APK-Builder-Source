package f9;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.util.LinkedHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel", f = "ProjectEditorViewModel.kt", l = {1093, 1095, 1096, 1097, 1098, 1099, 1124, 1149, 1269, 1277, 1288}, m = "saveProject")
/* loaded from: classes.dex */
public final class gh extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public fg f9727a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9728b;

    /* renamed from: c, reason: collision with root package name */
    public String f9729c;

    /* renamed from: d, reason: collision with root package name */
    public String f9730d;

    /* renamed from: e, reason: collision with root package name */
    public ProjectEntity f9731e;

    /* renamed from: f, reason: collision with root package name */
    public LinkedHashMap f9732f;

    /* renamed from: g, reason: collision with root package name */
    public long f9733g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9734h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg f9735j;

    /* renamed from: k, reason: collision with root package name */
    public int f9736k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(fg fgVar, vg.c cVar) {
        super(cVar);
        this.f9735j = fgVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f9734h = obj;
        this.f9736k |= PKIFailureInfo.systemUnavail;
        return this.f9735j.D(this);
    }
}
