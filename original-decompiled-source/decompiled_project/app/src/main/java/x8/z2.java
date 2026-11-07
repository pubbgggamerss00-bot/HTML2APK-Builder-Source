package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

/* loaded from: classes.dex */
public final class z2 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f33435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f33436c;

    public z2(ProjectEntity projectEntity, x0.n1<Long> n1Var, x0.n1<String> n1Var2) {
        this.f33434a = projectEntity;
        this.f33435b = n1Var;
        this.f33436c = n1Var2;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        ProjectEntity projectEntity = this.f33434a;
        Long lValueOf = Long.valueOf(projectEntity.getId());
        boolean z10 = g5.f32665a;
        this.f33435b.setValue(lValueOf);
        this.f33436c.setValue(projectEntity.getName());
        return pg.f0.f21461a;
    }
}
