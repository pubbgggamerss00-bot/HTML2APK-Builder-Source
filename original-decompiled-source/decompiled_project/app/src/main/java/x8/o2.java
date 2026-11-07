package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

/* loaded from: classes.dex */
public final class o2 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f33011b;

    public o2(ProjectEntity projectEntity, x0.n1<Long> n1Var) {
        this.f33010a = projectEntity;
        this.f33011b = n1Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        Long lValueOf = Long.valueOf(this.f33010a.getId());
        boolean z10 = g5.f32665a;
        this.f33011b.setValue(lValueOf);
        return pg.f0.f21461a;
    }
}
