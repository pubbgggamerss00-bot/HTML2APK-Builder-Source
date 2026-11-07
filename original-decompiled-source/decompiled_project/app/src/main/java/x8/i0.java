package x8;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import t0.md;

/* loaded from: classes.dex */
public final class i0 implements eh.q<b0.e, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f32733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f32734b;

    public i0(s.b<Float, s.o> bVar, eh.a<pg.f0> aVar) {
        this.f32733a = bVar;
        this.f32734b = aVar;
    }

    @Override // eh.q
    public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
        b0.e item = eVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            md.b(this.f32734b, androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.r(e.a(d.a.f1143b, this.f32733a), CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET), s.f33139a), false, h0.f.a(16), q1.b1.f21653g, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, a9.d2.a(1, q1.b1.c(0.15f, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q)), null, b.f32250b, jVar2, 24576, 740);
        }
        return pg.f0.f21461a;
    }
}
