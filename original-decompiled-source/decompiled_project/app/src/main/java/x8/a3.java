package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

/* loaded from: classes.dex */
public final class a3 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f32218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f32219b;

    public a3(ProjectEntity projectEntity, x0.n1<Long> n1Var) {
        this.f32218a = projectEntity;
        this.f32219b = n1Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        Long lValueOf = Long.valueOf(this.f32218a.getId());
        boolean z10 = g5.f32665a;
        this.f32219b.setValue(lValueOf);
        return pg.f0.f21461a;
    }
}
