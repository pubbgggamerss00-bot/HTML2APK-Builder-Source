package x8;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.yalantis.ucrop.view.CropImageView;
import s8.e2;
import x0.j;

/* loaded from: classes.dex */
public final class d5 implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f32499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p5.x f32501c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f32502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f32503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f32504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j6 f32505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32506h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c.k<String[], Uri> f32507j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f32508k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32509l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.n1<ProjectEntity> f32510m;

    public d5(boolean z10, x0.n1 n1Var, p5.x xVar, x0.r3 r3Var, x0.r3 r3Var2, x0.r3 r3Var3, j6 j6Var, x0.n1 n1Var2, c.k kVar, Context context, x0.n1 n1Var3, x0.n1 n1Var4) {
        this.f32499a = z10;
        this.f32500b = n1Var;
        this.f32501c = xVar;
        this.f32502d = r3Var;
        this.f32503e = r3Var2;
        this.f32504f = r3Var3;
        this.f32505g = j6Var;
        this.f32506h = n1Var2;
        this.f32507j = kVar;
        this.f32508k = context;
        this.f32509l = n1Var3;
        this.f32510m = n1Var4;
    }

    public static final void a(x0.n1<Boolean> n1Var, boolean z10) {
        n1Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        z.n1 TopAppBar = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(TopAppBar, "$this$TopAppBar");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(-1154282001);
            boolean z10 = this.f32499a;
            Object obj = j.a.f31715a;
            if (z10) {
                boolean z11 = g5.f32665a;
                if (this.f32502d.getValue().booleanValue()) {
                    jVar2.L(-1154277531);
                    x0.n1<Boolean> n1Var2 = this.f32500b;
                    boolean zK = jVar2.K(n1Var2);
                    Object objG = jVar2.g();
                    if (zK || objG == obj) {
                        objG = new q8.c3(n1Var2, 1);
                        jVar2.C(objG);
                    }
                    jVar2.B();
                    g5.B((eh.a) objG, null, jVar2, 0);
                }
            }
            jVar2.B();
            jVar2.L(-1154272887);
            x0.r3<Boolean> r3Var = this.f32503e;
            if (g5.E(r3Var) || this.f32504f.getValue().booleanValue()) {
                long jC = c2.n0.c(r3Var.getValue().booleanValue() ? 4294956800L : 4290822336L);
                String strB = r3Var.getValue().booleanValue() ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -1422557788, R.string.pro_badge_content_description, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -1422434625, R.string.cat_world_star_content_description, jVar2);
                jVar2.L(-1154257128);
                final p5.x xVar = this.f32501c;
                boolean zL = jVar2.l(xVar);
                Object objG2 = jVar2.g();
                if (zL || objG2 == obj) {
                    objG2 = new eh.a() { // from class: x8.u4
                        @Override // eh.a
                        public final Object invoke() {
                            p5.x.c(e2.f.f24636c.f24627a, xVar);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG2);
                }
                jVar2.B();
                t0.s4.c((eh.a) objG2, androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.l(d.a.f1143b, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, 11), 36), false, null, f1.c.b(710668200, new w4(strB, jC), jVar2), jVar2, 196656, 28);
            }
            jVar2.B();
            jVar2.L(-1154234685);
            jVar2.B();
            Object[] objArr = new Object[0];
            jVar2.L(-1154181279);
            Object objG3 = jVar2.g();
            if (objG3 == obj) {
                objG3 = new v4();
                jVar2.C(objG3);
            }
            jVar2.B();
            x0.n1 n1Var3 = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG3, jVar2, 3072, 6);
            jVar2.L(-1154179010);
            boolean zK2 = jVar2.K(n1Var3);
            Object objG4 = jVar2.g();
            if (zK2 || objG4 == obj) {
                objG4 = new u8.o0(n1Var3, 1);
                jVar2.C(objG4);
            }
            jVar2.B();
            t0.s4.c((eh.a) objG4, null, false, null, c.f32342a, jVar2, 196608, 30);
            boolean zBooleanValue = ((Boolean) n1Var3.getValue()).booleanValue();
            jVar2.L(-1154165697);
            boolean zK3 = jVar2.K(n1Var3);
            Object objG5 = jVar2.g();
            if (zK3 || objG5 == obj) {
                objG5 = new u8.t0(n1Var3, 1);
                jVar2.C(objG5);
            }
            jVar2.B();
            q8.g.a(zBooleanValue, (eh.a) objG5, f1.c.b(1617448269, new c5(n1Var3, this.f32505g, this.f32506h, this.f32503e, this.f32507j, this.f32508k, this.f32501c, this.f32509l, this.f32510m), jVar2), jVar2, 384);
        }
        return pg.f0.f21461a;
    }
}
