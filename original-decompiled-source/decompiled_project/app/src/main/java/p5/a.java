package p5;

import android.content.Context;
import android.content.ContextWrapper;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21188a;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f21188a) {
            case 0:
                Context it = (Context) obj;
                kotlin.jvm.internal.r.e(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            default:
                ProjectEntity it2 = (ProjectEntity) obj;
                kotlin.jvm.internal.r.e(it2, "it");
                return Long.valueOf(it2.getId());
        }
    }
}
