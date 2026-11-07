package x8;

import android.content.Context;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;

/* loaded from: classes.dex */
public final class q2 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f33088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f33090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f33091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f33092e;

    public q2(j6 j6Var, ProjectEntity projectEntity, Context context, p5.x xVar, x0.n1<String> n1Var) {
        this.f33088a = j6Var;
        this.f33089b = projectEntity;
        this.f33090c = context;
        this.f33091d = xVar;
        this.f33092e = n1Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        p2 p2Var = new p2(this.f33090c, this.f33091d, this.f33092e);
        j6 j6Var = this.f33088a;
        j6Var.n(ProjectKind.APK, p2Var, null, new m6(j6Var, this.f33089b, null));
        return pg.f0.f21461a;
    }
}
