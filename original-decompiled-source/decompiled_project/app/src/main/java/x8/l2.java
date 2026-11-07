package x8;

import android.content.Context;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

/* loaded from: classes.dex */
public final class l2 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f32905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f32906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f32907c;

    public l2(j6 j6Var, Context context, ProjectEntity projectEntity) {
        this.f32905a = j6Var;
        this.f32906b = context;
        this.f32907c = projectEntity;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        Context context = this.f32906b;
        kotlin.jvm.internal.r.e(context, "context");
        j6 j6Var = this.f32905a;
        ph.h.c(androidx.lifecycle.x0.a(j6Var), null, null, new z6(context, this.f32907c, null, j6Var), 3);
        return pg.f0.f21461a;
    }
}
