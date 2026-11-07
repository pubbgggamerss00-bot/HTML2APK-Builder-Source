package d9;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import g8.s;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import pg.f0;
import q1.b1;
import t0.e2;
import t0.f2;
import t0.md;
import x0.n1;
import x0.r3;

/* loaded from: classes.dex */
public final class u implements eh.q<z.r, x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r3<g8.s> f7655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g8.u f7656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f7657c;

    public u(g8.u uVar, n1 n1Var, n1 n1Var2) {
        this.f7655a = n1Var;
        this.f7656b = uVar;
        this.f7657c = n1Var2;
    }

    @Override // eh.q
    public final f0 b(z.r rVar, x0.j jVar, Integer num) {
        z.r SettingsScreen = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(SettingsScreen, "$this$SettingsScreen");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else if (this.f7655a.getValue() instanceof s.a) {
            md.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(20), b1.c(0.85f, ((e2) jVar2.f(f2.f25858a)).I), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(101697138, new t(this.f7656b, this.f7657c), jVar2), jVar2, 12582918, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        }
        return f0.f21461a;
    }
}
