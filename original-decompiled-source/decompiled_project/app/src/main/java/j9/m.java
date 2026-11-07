package j9;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import e0.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements eh.q<z.n, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0.b f15465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<String, q8.e0, pg.f0> f15467c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x.m f15468d;

    public m(e0.b bVar, eh.p pVar, ArrayList arrayList, x.m mVar) {
        this.f15465a = bVar;
        this.f15466b = arrayList;
        this.f15467c = pVar;
        this.f15468d = mVar;
    }

    @Override // eh.q
    public final pg.f0 b(z.n nVar, x0.j jVar, Integer num) {
        z.n BoxWithConstraints = nVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(BoxWithConstraints) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            f3.h hVar = new f3.h(BoxWithConstraints.a() * 0.92f);
            f3.h hVar2 = new f3.h(520);
            if (hVar.compareTo(hVar2) > 0) {
                hVar = hVar2;
            }
            float f10 = hVar.f8817a;
            o.b bVar = new o.b(f10);
            z.g1 g1VarC = androidx.compose.foundation.layout.f.c((BoxWithConstraints.a() - f10) / 2, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), f10 / 1.5f);
            eh.p<String, q8.e0, pg.f0> pVar = this.f15467c;
            x.m mVar = this.f15468d;
            e0.b bVar2 = this.f15465a;
            e0.b0.a((-f10) * 0.14f, 1, 24576, 16320, dVarF, null, bVar2, bVar, f1.c.b(-152629941, new l(bVar2, pVar, this.f15466b, mVar), jVar2), null, null, null, null, jVar2, g1VarC, false);
        }
        return pg.f0.f21461a;
    }
}
