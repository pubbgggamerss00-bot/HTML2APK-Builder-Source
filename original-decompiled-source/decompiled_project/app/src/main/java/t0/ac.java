package t0;

/* loaded from: classes.dex */
public final class ac extends kotlin.jvm.internal.s implements eh.l<Float, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hc f25482a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(hc hcVar) {
        super(1);
        this.f25482a = hcVar;
    }

    @Override // eh.l
    public final Boolean invoke(Float f10) {
        int i10;
        float fFloatValue = f10.floatValue();
        hc hcVar = this.f25482a;
        x0.u1 u1Var = hcVar.f26018c;
        jh.d dVar = hcVar.f26017b;
        float fL = jh.j.l(fFloatValue, Float.valueOf(dVar.f15742a).floatValue(), Float.valueOf(dVar.f15743b).floatValue());
        int i11 = hcVar.f26016a;
        boolean z10 = false;
        if (i11 > 0 && (i10 = i11 + 1) >= 0) {
            float fAbs = fL;
            float f11 = fAbs;
            int i12 = 0;
            while (true) {
                float fB = h3.b.b(Float.valueOf(dVar.f15742a).floatValue(), Float.valueOf(dVar.f15743b).floatValue(), i12 / i10);
                float f12 = fB - fL;
                if (Math.abs(f12) <= fAbs) {
                    fAbs = Math.abs(f12);
                    f11 = fB;
                }
                if (i12 == i10) {
                    break;
                }
                i12++;
            }
            fL = f11;
        }
        if (fL != u1Var.getFloatValue()) {
            if (fL != u1Var.getFloatValue()) {
                eh.l<? super Float, pg.f0> lVar = hcVar.f26019d;
                if (lVar != null) {
                    lVar.invoke(Float.valueOf(fL));
                } else {
                    hcVar.d(fL);
                }
            }
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
