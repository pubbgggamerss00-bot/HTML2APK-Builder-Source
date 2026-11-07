package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

/* loaded from: classes.dex */
public final class b3 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f32326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<ProjectEntity> f32327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32328c;

    public b3(ProjectEntity projectEntity, x0.n1<ProjectEntity> n1Var, x0.n1<Boolean> n1Var2) {
        this.f32326a = projectEntity;
        this.f32327b = n1Var;
        this.f32328c = n1Var2;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        boolean z10 = g5.f32665a;
        this.f32327b.setValue(this.f32326a);
        g5.l(this.f32328c, true);
        return pg.f0.f21461a;
    }
}
