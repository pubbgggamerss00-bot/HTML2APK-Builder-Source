package j9;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import j9.x1;
import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import x0.j;

/* loaded from: classes.dex */
public final class l implements eh.r<e0.p0, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0.b f15457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<String, q8.e0, pg.f0> f15458c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x.m f15459d;

    public l(e0.b bVar, eh.p pVar, ArrayList arrayList, x.m mVar) {
        this.f15456a = arrayList;
        this.f15457b = bVar;
        this.f15458c = pVar;
        this.f15459d = mVar;
    }

    @Override // eh.r
    public final pg.f0 f(e0.p0 p0Var, Integer num, x0.j jVar, Integer num2) {
        e0.p0 HorizontalPager = p0Var;
        final int iIntValue = num.intValue();
        x0.j jVar2 = jVar;
        int iIntValue2 = num2.intValue();
        kotlin.jvm.internal.r.e(HorizontalPager, "$this$HorizontalPager");
        ArrayList arrayList = this.f15456a;
        final x1.a aVar = (x1.a) arrayList.get(iIntValue % arrayList.size());
        jVar2.L(-67824403);
        Object objG = jVar2.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            objG = new q8.e0();
            jVar2.C(objG);
        }
        final q8.e0 e0Var = (q8.e0) objG;
        jVar2.B();
        String str = aVar.f15636a;
        String str2 = aVar.f15637b;
        String str3 = aVar.f15638c;
        androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(q8.p0.c(d.a.f1143b, e0Var), 1.0f);
        final e0.b bVar = this.f15457b;
        androidx.compose.ui.d dVarC = j1.l.c(dVarD, iIntValue != bVar.j() ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f);
        jVar2.L(-67809396);
        boolean zK = ((((iIntValue2 & 112) ^ 48) > 32 && jVar2.i(iIntValue)) || (iIntValue2 & 48) == 32) | jVar2.K(bVar);
        Object objG2 = jVar2.g();
        if (zK || objG2 == c0321a) {
            objG2 = new eh.l() { // from class: j9.j
                @Override // eh.l
                public final Object invoke(Object obj) {
                    q1.l1 graphicsLayer = (q1.l1) obj;
                    kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                    float fL = jh.j.l(Math.abs(bVar.k() + (r0.j() - iIntValue)), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                    float f10 = 1.0f - (0.14f * fL);
                    graphicsLayer.h(f10);
                    graphicsLayer.d(f10);
                    graphicsLayer.f(1.0f - (fL * 0.12f));
                    return pg.f0.f21461a;
                }
            };
            jVar2.C(objG2);
        }
        jVar2.B();
        androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.a.a(dVarC, (eh.l) objG2);
        jVar2.L(-67816754);
        final eh.p<String, q8.e0, pg.f0> pVar = this.f15458c;
        boolean zK2 = jVar2.K(pVar) | jVar2.l(aVar) | jVar2.l(e0Var);
        Object objG3 = jVar2.g();
        if (zK2 || objG3 == c0321a) {
            objG3 = new eh.a() { // from class: j9.k
                @Override // eh.a
                public final Object invoke() {
                    q8.e0 e0Var2 = e0Var;
                    pVar.invoke(aVar.f15636a, e0Var2);
                    return pg.f0.f21461a;
                }
            };
            jVar2.C(objG3);
        }
        jVar2.B();
        e.a(str, str2, str3, false, (eh.a) objG3, dVarA, 0, this.f15459d, false, jVar2, 12585984, DilithiumEngine.DilithiumPolyT1PackedBytes);
        return pg.f0.f21461a;
    }
}
