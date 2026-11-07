package t0;

import java.util.List;
import java.util.NoSuchElementException;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes.dex */
public final class o8 implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<Float> f26607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26609c;

    /* JADX WARN: Multi-variable type inference failed */
    public o8(eh.a<Float> aVar, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, boolean z10) {
        this.f26607a = aVar;
        this.f26608b = pVar;
        this.f26609c = z10;
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        g2.k0 k0Var;
        g2.g1 g1VarP;
        g2.g1 g1VarP2;
        o8 o8Var = this;
        float fFloatValue = o8Var.f26607a.invoke().floatValue();
        long jB = f3.b.b(j10, 0, 0, 0, 0, 10);
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            g2.k0 k0Var2 = list.get(i10);
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var2), "icon")) {
                g2.g1 g1VarP3 = k0Var2.P(jB);
                char c10 = 2;
                float f10 = 2;
                int iB1 = o0Var.b1(s8.f26947d * f10) + g1VarP3.f11382a;
                int iB = gh.a.b(iB1 * fFloatValue);
                int iB12 = o0Var.b1(s8.f26948e * f10) + g1VarP3.f11383b;
                int size2 = list.size();
                int i11 = 0;
                while (i11 < size2) {
                    g2.k0 k0Var3 = list.get(i11);
                    char c11 = c10;
                    float f11 = fFloatValue;
                    if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var3), "indicatorRipple")) {
                        if (!((iB1 >= 0) & (iB12 >= 0))) {
                            f3.l.a("width and height must be >= 0");
                        }
                        g2.g1 g1VarP4 = k0Var3.P(f3.c.h(iB1, iB1, iB12, iB12));
                        int size3 = list.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size3) {
                                k0Var = null;
                                break;
                            }
                            k0Var = list.get(i12);
                            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var), "indicator")) {
                                break;
                            }
                            i12++;
                        }
                        g2.k0 k0Var4 = k0Var;
                        if (k0Var4 != null) {
                            if (!((iB >= 0) & (iB12 >= 0))) {
                                f3.l.a("width and height must be >= 0");
                            }
                            g1VarP = k0Var4.P(f3.c.h(iB, iB, iB12, iB12));
                        } else {
                            g1VarP = null;
                        }
                        eh.p<x0.j, Integer, pg.f0> pVar = o8Var.f26608b;
                        if (pVar != null) {
                            int size4 = list.size();
                            for (int i13 = 0; i13 < size4; i13++) {
                                g2.k0 k0Var5 = list.get(i13);
                                if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var5), AnnotatedPrivateKey.LABEL)) {
                                    g1VarP2 = k0Var5.P(jB);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        g1VarP2 = null;
                        qg.a0 a0Var = qg.a0.f22708a;
                        if (pVar == null) {
                            int i14 = f3.b.i(j10);
                            int iF = f3.c.f(o0Var.b1(s8.f26944a), j10);
                            return o0Var.i0(i14, iF, a0Var, new q8(g1VarP, g1VarP3, (i14 - g1VarP3.f11382a) / 2, (iF - g1VarP3.f11383b) / 2, g1VarP4, (i14 - g1VarP4.f11382a) / 2, (iF - g1VarP4.f11383b) / 2, i14, iF));
                        }
                        kotlin.jvm.internal.r.b(g1VarP2);
                        float f12 = g1VarP3.f11383b;
                        float f13 = s8.f26948e;
                        float fN0 = o0Var.N0(f13) + f12;
                        float f14 = s8.f26946c;
                        float fN02 = o0Var.N0(f14) + fN0 + g1VarP2.f11383b;
                        float fJ = (f3.b.j(j10) - fN02) / f10;
                        float fN03 = o0Var.N0(f13);
                        if (fJ < fN03) {
                            fJ = fN03;
                        }
                        float f15 = (fJ * f10) + fN02;
                        boolean z10 = o8Var.f26609c;
                        float f16 = (1 - f11) * ((z10 ? fJ : (f15 - g1VarP3.f11383b) / f10) - fJ);
                        float fN04 = o0Var.N0(f14) + o0Var.N0(f13) + g1VarP3.f11383b + fJ;
                        int i15 = f3.b.i(j10);
                        return o0Var.i0(i15, gh.a.b(f15), a0Var, new r8(g1VarP, z10, f11, g1VarP2, (i15 - g1VarP2.f11382a) / 2, fN04, f16, g1VarP3, (i15 - g1VarP3.f11382a) / 2, fJ, g1VarP4, (i15 - g1VarP4.f11382a) / 2, fJ - o0Var.N0(f13), i15, o0Var));
                    }
                    i11++;
                    o8Var = this;
                    c10 = c11;
                    fFloatValue = f11;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i10++;
            o8Var = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
