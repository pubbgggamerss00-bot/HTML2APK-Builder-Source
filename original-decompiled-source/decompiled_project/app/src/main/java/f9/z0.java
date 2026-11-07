package f9;

import com.basitce.htmltoapk.domain.model.ProjectKind;

/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11049b;

    public /* synthetic */ z0(Object obj, int i10) {
        this.f11048a = i10;
        this.f11049b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f11048a) {
            case 0:
                ((eh.l) this.f11049b).invoke("  ");
                break;
            case 1:
                ((eh.l) this.f11049b).invoke(ProjectKind.PDF);
                break;
            default:
                c6.e eVar = (c6.e) this.f11049b;
                eVar.getLifecycle().a(new c6.a(eVar));
                break;
        }
        return pg.f0.f21461a;
    }
}
