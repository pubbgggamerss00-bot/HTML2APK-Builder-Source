package x8;

import android.content.Context;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

/* loaded from: classes.dex */
public final class v2 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f33278b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f33279c;

    public v2(Context context, ProjectEntity projectEntity, p5.x xVar) {
        this.f33277a = projectEntity;
        this.f33278b = xVar;
        this.f33279c = context;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        g5.y(this.f33279c, this.f33277a, this.f33278b);
        return pg.f0.f21461a;
    }
}
