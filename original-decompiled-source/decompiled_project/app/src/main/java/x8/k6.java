package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.basitce.htmltoapk.domain.model.ProjectLimits;
import java.util.Iterator;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$canCreateProject$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k6 extends vg.i implements eh.q<m0, Boolean, tg.e<? super Boolean>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ m0 f32875a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f32876b;

    @Override // eh.q
    public final Object b(m0 m0Var, Boolean bool, tg.e<? super Boolean> eVar) {
        boolean zBooleanValue = bool.booleanValue();
        k6 k6Var = new k6(3, eVar);
        k6Var.f32875a = m0Var;
        k6Var.f32876b = zBooleanValue;
        return k6Var.invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        m0 m0Var = this.f32875a;
        boolean z10 = this.f32876b;
        boolean z11 = false;
        if (!m0Var.f32925b) {
            ProjectLimits projectLimits = ProjectLimits.INSTANCE;
            List<ProjectEntity> list = m0Var.f32924a;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.r.a(ProjectKind.INSTANCE.normalize(((ProjectEntity) it.next()).getKind()), ProjectKind.APK) && (i10 = i10 + 1) < 0) {
                        qg.p.n();
                        throw null;
                    }
                }
            } else {
                i10 = 0;
            }
            if (projectLimits.canCreate(ProjectKind.APK, z10, i10)) {
                z11 = true;
            }
        }
        return Boolean.valueOf(z11);
    }
}
