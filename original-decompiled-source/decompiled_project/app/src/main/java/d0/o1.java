package d0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class o1 extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7213b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(Object obj, int i10) {
        super(1);
        this.f7212a = i10;
        this.f7213b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final Object invoke(Object obj) {
        e0.o0 o0Var;
        switch (this.f7212a) {
            case 0:
                g0 g0VarInvoke = ((n1) this.f7213b).f7196q.invoke();
                int itemCount = g0VarInvoke.getItemCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= itemCount) {
                        i10 = -1;
                    } else if (!g0VarInvoke.d(i10).equals(obj)) {
                        i10++;
                    }
                }
                return Integer.valueOf(i10);
            default:
                float fFloatValue = ((Number) obj).floatValue();
                e0.d1 d1Var = (e0.d1) this.f7213b;
                long jB = b1.b(d1Var);
                float f10 = d1Var.f8151i + fFloatValue;
                long jC = gh.a.c(f10);
                d1Var.f8151i = f10 - jC;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j10 = jB + jC;
                    long jN = jh.j.n(j10, d1Var.f8150h, d1Var.f8149g);
                    boolean z10 = j10 != jN;
                    long j11 = jN - jB;
                    float f11 = j11;
                    d1Var.f8152j = f11;
                    long jAbs = Math.abs(j11);
                    float fO = CropImageView.DEFAULT_ASPECT_RATIO;
                    if (jAbs != 0) {
                        d1Var.F.setValue(Boolean.valueOf(f11 > CropImageView.DEFAULT_ASPECT_RATIO));
                        d1Var.G.setValue(Boolean.valueOf(f11 < CropImageView.DEFAULT_ASPECT_RATIO));
                    }
                    int i11 = (int) j11;
                    int i12 = -i11;
                    e0.o0 o0VarJ = ((e0.o0) d1Var.f8158p.getValue()).j(i12);
                    if (o0VarJ != null && (o0Var = d1Var.f8144b) != null) {
                        e0.o0 o0VarJ2 = o0Var.j(i12);
                        if (o0VarJ2 != null) {
                            d1Var.f8144b = o0VarJ2;
                        } else {
                            o0VarJ = null;
                        }
                    }
                    if (o0VarJ != null) {
                        d1Var.h(o0VarJ, d1Var.f8143a, true);
                        d2.b(d1Var.B);
                    } else {
                        e0.r0 r0Var = d1Var.f8146d;
                        e0.d1 d1Var2 = r0Var.f8277a;
                        x0.u1 u1Var = r0Var.f8279c;
                        if (d1Var2.o() != 0) {
                            fO = i11 / d1Var2.o();
                        }
                        u1Var.e(u1Var.getFloatValue() + fO);
                        g2.i1 i1Var = (g2.i1) d1Var.f8166x.getValue();
                        if (i1Var != null) {
                            i1Var.h();
                        }
                    }
                    fFloatValue = (z10 ? Long.valueOf(j11) : Float.valueOf(fFloatValue)).floatValue();
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
