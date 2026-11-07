package j9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import j9.x1;
import p0.va;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;
import x0.r3;

/* loaded from: classes.dex */
public final class r0 implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1.a f15514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f15515d;

    public r0(boolean z10, boolean z11, x1.a aVar, r3<Boolean> r3Var) {
        this.f15512a = z10;
        this.f15513b = z11;
        this.f15514c = aVar;
        this.f15515d = r3Var;
    }

    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        long j10;
        z.n1 Button = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(-436367673);
            boolean z10 = this.f15513b;
            boolean z11 = this.f15512a;
            if (z11) {
                w1.d dVarA = va.a();
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.n(d.a.f1143b, 20), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 11);
                jVar2.L(-436357088);
                long j11 = z10 ? ((e2) jVar2.f(f2.f25858a)).f25757d : q1.b1.f21650d;
                jVar2.B();
                t4.b(dVarA, null, dVarL, j11, jVar2, 432, 0);
            }
            jVar2.B();
            String strB = this.f15515d.getValue().booleanValue() ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -436350048, R.string.catalog_creating, jVar2) : z11 ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -436347474, R.string.template_detail_upgrade_to_use, jVar2) : this.f15514c.f15641f != null ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -436343834, R.string.catalog_create_project, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -436341138, R.string.template_detail_create_project, jVar2);
            if (z11) {
                jVar2.L(-641545110);
                j10 = z10 ? ((e2) jVar2.f(f2.f25858a)).f25757d : q1.b1.f21650d;
                jVar2.B();
            } else {
                jVar2.L(-641412368);
                j10 = ((e2) jVar2.f(f2.f25858a)).f25753b;
                jVar2.B();
            }
            ff.b(strB, null, j10, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26545h, jVar2, 196608, 0, 65498);
        }
        return pg.f0.f21461a;
    }
}
