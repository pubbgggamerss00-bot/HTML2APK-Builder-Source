package y8;

import android.text.Html;
import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;

/* loaded from: classes.dex */
public final class c0 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f34075a;

    public c0(String str) {
        this.f34075a = str;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        float f10 = 16;
        ff.b(Html.fromHtml(this.f34075a, 63).toString(), androidx.compose.foundation.layout.f.l(d.a.f1143b, f10, CropImageView.DEFAULT_ASPECT_RATIO, f10, f10, 2), ((e2) jVar2.f(f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26548k, jVar2, 48, 0, 65528);
        return pg.f0.f21461a;
    }
}
