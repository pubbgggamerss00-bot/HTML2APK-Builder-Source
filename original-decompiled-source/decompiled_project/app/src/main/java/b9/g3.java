package b9;

import com.basitce.htmltoapk.domain.model.ProjectFile;
import f9.xd;
import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3848c;

    public /* synthetic */ g3(int i10, Object obj, Object obj2) {
        this.f3846a = i10;
        this.f3847b = obj;
        this.f3848c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f3846a) {
            case 0:
                p5.x xVar = (p5.x) this.f3847b;
                ((x0.n1) this.f3848c).setValue(Boolean.FALSE);
                p5.x.c(e2.r.f24648c.f24627a, xVar);
                break;
            case 1:
                ((eh.l) this.f3847b).invoke((ProjectFile) this.f3848c);
                break;
            default:
                ((eh.l) this.f3847b).invoke(new xd((x0.n1) this.f3848c, 1));
                break;
        }
        return pg.f0.f21461a;
    }
}
