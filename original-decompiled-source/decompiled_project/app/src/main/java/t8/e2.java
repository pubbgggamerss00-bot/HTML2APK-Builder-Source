package t8;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class e2 implements eh.q<b0.e, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y3 f28208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f28210c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1.w<Integer, Boolean> f28211d;

    public e2(y3 y3Var, boolean z10, androidx.compose.ui.d dVar, h1.w<Integer, Boolean> wVar) {
        this.f28208a = y3Var;
        this.f28209b = z10;
        this.f28210c = dVar;
        this.f28211d = wVar;
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
            final y3 y3Var = this.f28208a;
            List<String> list = y3Var.f28589i;
            boolean z10 = y3Var.f28583c;
            jVar2.L(-1472548738);
            boolean zL = jVar2.l(y3Var);
            final boolean z11 = this.f28209b;
            boolean zC = zL | jVar2.c(z11);
            Object objG = jVar2.g();
            if (zC || objG == j.a.f31715a) {
                final h1.w<Integer, Boolean> wVar = this.f28211d;
                objG = new eh.a() { // from class: t8.d2
                    @Override // eh.a
                    public final Object invoke() {
                        wVar.put(Integer.valueOf(y3Var.f28581a), Boolean.valueOf(!z11));
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            v2.h(list, z10, this.f28209b, (eh.a) objG, androidx.compose.foundation.layout.f.l(this.f28210c, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), jVar2, 24576);
        }
        return pg.f0.f21461a;
    }
}
