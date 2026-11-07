package t0;

import com.yalantis.ucrop.view.CropImageView;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;

/* loaded from: classes.dex */
public final class ca extends kotlin.jvm.internal.s implements eh.l<s1.e, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.r3<q1.b1> f25595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.r3<f3.h> f25596b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(x0.r3<q1.b1> r3Var, x0.r3<f3.h> r3Var2) {
        super(1);
        this.f25595a = r3Var;
        this.f25596b = r3Var2;
    }

    @Override // eh.l
    public final pg.f0 invoke(s1.e eVar) {
        s1.e eVar2 = eVar;
        float fN0 = eVar2.N0(ea.f25812c);
        x0.r3<q1.b1> r3Var = this.f25595a;
        float f10 = 2;
        float f11 = fN0 / f10;
        s1.e.f0(eVar2, r3Var.getValue().f21656a, eVar2.N0(v0.b0.f30200a / f10) - f11, 0L, new s1.i(fN0, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 30), 0, HeaderItem.DATA_START_OFFSET);
        x0.r3<f3.h> r3Var2 = this.f25596b;
        if (Float.compare(r3Var2.getValue().f8817a, 0) > 0) {
            s1.e.f0(eVar2, r3Var.getValue().f21656a, eVar2.N0(r3Var2.getValue().f8817a) - f11, 0L, s1.h.f24186a, 0, HeaderItem.DATA_START_OFFSET);
        }
        return pg.f0.f21461a;
    }
}
