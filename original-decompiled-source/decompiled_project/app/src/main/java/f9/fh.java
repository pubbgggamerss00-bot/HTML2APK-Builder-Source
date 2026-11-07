package f9;

import com.basitce.htmltoapk.domain.model.ProjectFile;

/* loaded from: classes.dex */
public final /* synthetic */ class fh implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9642b;

    public /* synthetic */ fh(Object obj, int i10) {
        this.f9641a = i10;
        this.f9642b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f9641a) {
            case 0:
                String strG = fg.g((fg) this.f9642b, (ProjectFile) obj);
                return strG != null ? strG : "";
            default:
                s5.l lVar = (s5.l) this.f9642b;
                p5.k0 destination = (p5.k0) obj;
                kotlin.jvm.internal.r.e(destination, "destination");
                return Boolean.valueOf(!lVar.f24490l.containsKey(Integer.valueOf(destination.f21235b.f24511d)));
        }
    }
}
