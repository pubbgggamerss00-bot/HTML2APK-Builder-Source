package x8;

import android.content.Context;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class x2 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap<Long, q8.e0> f33339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q8.d0 f33341c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f33342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q8.w0 f33343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f33344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p5.x f33345g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f33346h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f33347j;

    public x2(HashMap<Long, q8.e0> map, ProjectEntity projectEntity, q8.d0 d0Var, long j10, q8.w0 w0Var, Context context, p5.x xVar, float f10, boolean z10) {
        this.f33339a = map;
        this.f33340b = projectEntity;
        this.f33341c = d0Var;
        this.f33342d = j10;
        this.f33343e = w0Var;
        this.f33344f = context;
        this.f33345g = xVar;
        this.f33346h = f10;
        this.f33347j = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    @Override // eh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 invoke() {
        p1.e eVarN;
        g2.v vVar;
        ProjectEntity projectEntity = this.f33340b;
        q8.e0 e0Var = this.f33339a.get(Long.valueOf(projectEntity.getId()));
        if (e0Var == null || (vVar = e0Var.f22177a) == null) {
            eVarN = null;
        } else {
            if (!vVar.m()) {
                vVar = null;
            }
            if (vVar != null) {
                eVarN = g2.w.c(vVar).N(vVar, true);
            }
        }
        boolean zA = kotlin.jvm.internal.r.a(ProjectKind.INSTANCE.normalize(projectEntity.getKind()), ProjectKind.PDF);
        p5.x xVar = this.f33345g;
        Context context = this.f33344f;
        if (zA) {
            q8.w0 w0Var = this.f33343e;
            if (w0Var == null || eVarN == null) {
                g5.y(context, projectEntity, xVar);
            } else {
                String string = context.getString(R.string.opening_pdf);
                kotlin.jvm.internal.r.d(string, "getString(...)");
                ph.h.c(w0Var.f22428a, null, null, new q8.u0(new w2(eVarN, this.f33342d, this.f33346h, this.f33347j, string, projectEntity, this.f33345g, this.f33344f, null), w0Var, null), 3);
            }
        } else if (e0Var == null) {
            g5.y(context, projectEntity, xVar);
        } else {
            this.f33341c.a(e0Var, this.f33342d, new v2(context, projectEntity, xVar));
        }
        return pg.f0.f21461a;
    }
}
