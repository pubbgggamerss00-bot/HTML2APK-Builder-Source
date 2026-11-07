package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

/* loaded from: classes.dex */
public final class m2 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f32926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<ProjectEntity> f32927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32928c;

    public m2(ProjectEntity projectEntity, x0.n1<ProjectEntity> n1Var, x0.n1<Boolean> n1Var2) {
        this.f32926a = projectEntity;
        this.f32927b = n1Var;
        this.f32928c = n1Var2;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        boolean z10 = g5.f32665a;
        this.f32927b.setValue(this.f32926a);
        this.f32928c.setValue(Boolean.TRUE);
        return pg.f0.f21461a;
    }
}
