package f9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class za implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11091a;

    public za(String str) {
        this.f11091a = str;
    }

    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        z.n1 Button = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            w1.d dVarA = p0.x0.a();
            x0.s3 s3Var = t0.f2.f25858a;
            t0.t4.b(dVarA, null, null, ((t0.e2) jVar2.f(s3Var)).f25753b, jVar2, 48, 4);
            p1.d.b(androidx.compose.foundation.layout.g.r(d.a.f1143b, 8), jVar2);
            t0.ff.b(kotlin.jvm.internal.r.a(this.f11091a, "aab") ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -1355423464, R.string.editor_button_build_aab, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -1355421224, R.string.editor_button_build_apk, jVar2), null, ((t0.e2) jVar2.f(s3Var)).f25753b, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(t0.of.f26647a)).f26545h, jVar2, 196608, 0, 65498);
        }
        return pg.f0.f21461a;
    }
}
