package t0;

import java.util.List;
import java.util.NoSuchElementException;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes.dex */
public final class f9 implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<Float> f25876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25877b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25878c;

    /* JADX WARN: Multi-variable type inference failed */
    public f9(eh.a<Float> aVar, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, boolean z10) {
        this.f25876a = aVar;
        this.f25877b = pVar;
        this.f25878c = z10;
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        g2.k0 k0Var;
        g2.g1 g1VarP;
        g2.g1 g1VarP2;
        f9 f9Var = this;
        List<? extends g2.k0> list2 = list;
        float fFloatValue = f9Var.f25876a.invoke().floatValue();
        long jB = f3.b.b(j10, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i10 = 0;
        while (i10 < size) {
            g2.k0 k0Var2 = list2.get(i10);
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var2), "icon")) {
                g2.g1 g1VarP3 = k0Var2.P(jB);
                float f10 = 2;
                int iB1 = o0Var.b1(j9.f26155e * f10) + g1VarP3.f11382a;
                int iB = gh.a.b(iB1 * fFloatValue);
                eh.p<x0.j, Integer, pg.f0> pVar = f9Var.f25877b;
                int iB12 = o0Var.b1((pVar == null ? j9.f26157g : j9.f26156f) * f10) + g1VarP3.f11383b;
                int size2 = list2.size();
                int i11 = 0;
                while (i11 < size2) {
                    int i12 = size2;
                    g2.k0 k0Var3 = list2.get(i11);
                    int i13 = i11;
                    float f11 = f10;
                    if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var3), "indicatorRipple")) {
                        if (!((iB1 >= 0) & (iB12 >= 0))) {
                            f3.l.a("width and height must be >= 0");
                        }
                        g2.g1 g1VarP4 = k0Var3.P(f3.c.h(iB1, iB1, iB12, iB12));
                        int size3 = list2.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size3) {
                                k0Var = null;
                                break;
                            }
                            k0Var = list2.get(i14);
                            int i15 = size3;
                            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var), "indicator")) {
                                break;
                            }
                            i14++;
                            size3 = i15;
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
                        if (pVar != null) {
                            int size4 = list2.size();
                            int i16 = 0;
                            while (i16 < size4) {
                                g2.k0 k0Var5 = list2.get(i16);
                                if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var5), AnnotatedPrivateKey.LABEL)) {
                                    g1VarP2 = k0Var5.P(jB);
                                } else {
                                    i16++;
                                    list2 = list;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        g1VarP2 = null;
                        qg.a0 a0Var = qg.a0.f22708a;
                        if (pVar == null) {
                            int iG = f3.c.g(Math.max(g1VarP3.f11382a, Math.max(g1VarP4.f11382a, g1VarP != null ? g1VarP.f11382a : 0)), j10);
                            int iF = f3.c.f(o0Var.b1(j9.f26153c), j10);
                            return o0Var.i0(iG, iF, a0Var, new h9(g1VarP, g1VarP3, (iG - g1VarP3.f11382a) / 2, (iF - g1VarP3.f11383b) / 2, g1VarP4, (iG - g1VarP4.f11382a) / 2, (iF - g1VarP4.f11383b) / 2, iG, iF));
                        }
                        g2.g1 g1Var = g1VarP;
                        kotlin.jvm.internal.r.b(g1VarP2);
                        float f12 = g1VarP3.f11383b;
                        float f13 = j9.f26156f;
                        float fN0 = o0Var.N0(f13) + f12;
                        float f14 = j9.f26154d;
                        float fN02 = o0Var.N0(f14) + fN0 + g1VarP2.f11383b;
                        float fJ = (f3.b.j(j10) - fN02) / f11;
                        float fN03 = o0Var.N0(f13);
                        if (fJ >= fN03) {
                            fN03 = fJ;
                        }
                        float f15 = (fN03 * f11) + fN02;
                        boolean z10 = f9Var.f25878c;
                        float f16 = (1 - fFloatValue) * ((z10 ? fN03 : (f15 - g1VarP3.f11383b) / f11) - fN03);
                        float fN04 = o0Var.N0(f14) + o0Var.N0(f13) + g1VarP3.f11383b + fN03;
                        int iG2 = f3.c.g(Math.max(g1VarP3.f11382a, Math.max(g1VarP2.f11382a, g1Var != null ? g1Var.f11382a : 0)), j10);
                        return o0Var.i0(iG2, gh.a.b(f15), a0Var, new i9(g1Var, z10, fFloatValue, g1VarP2, (iG2 - g1VarP2.f11382a) / 2, fN04, f16, g1VarP3, (iG2 - g1VarP3.f11382a) / 2, fN03, g1VarP4, (iG2 - g1VarP4.f11382a) / 2, fN03 - o0Var.N0(f13), iG2, o0Var));
                    }
                    i11 = i13 + 1;
                    f9Var = this;
                    list2 = list;
                    size2 = i12;
                    f10 = f11;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i10++;
            f9Var = this;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
