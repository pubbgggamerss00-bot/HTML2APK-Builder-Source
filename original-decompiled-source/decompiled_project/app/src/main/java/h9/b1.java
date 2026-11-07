package h9;

import com.basitce.htmltoapk.data.licenses.OpenSourceLicenses;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12532a;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f12532a) {
            case 0:
                OpenSourceLicenses.a it = (OpenSourceLicenses.a) obj;
                kotlin.jvm.internal.r.e(it, "it");
                return it.f5693a;
            case 1:
                return pg.f0.f21461a;
            default:
                return Long.valueOf(((ProjectEntity) obj).getId());
        }
    }
}
