package x8;

import android.content.Context;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;

/* loaded from: classes.dex */
public final class y2 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f33384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f33386c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f33387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f33388e;

    public y2(j6 j6Var, ProjectEntity projectEntity, Context context, String str, x0.n1<String> n1Var) {
        this.f33384a = j6Var;
        this.f33385b = projectEntity;
        this.f33386c = context;
        this.f33387d = str;
        this.f33388e = n1Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        ProjectKind projectKind = ProjectKind.INSTANCE;
        ProjectEntity projectEntity = this.f33385b;
        String strNormalize = projectKind.normalize(projectEntity.getKind());
        j6 j6Var = this.f33384a;
        if (j6Var.l(strNormalize)) {
            String newName = projectEntity.getName() + " (" + this.f33387d + ")";
            Context context = this.f33386c;
            kotlin.jvm.internal.r.e(context, "context");
            kotlin.jvm.internal.r.e(newName, "newName");
            ph.h.c(androidx.lifecycle.x0.a(j6Var), null, null, new v6(projectEntity, j6Var, newName, context, null), 3);
        } else {
            String strNormalize2 = projectKind.normalize(projectEntity.getKind());
            boolean z10 = g5.f32665a;
            this.f33388e.setValue(strNormalize2);
        }
        return pg.f0.f21461a;
    }
}
