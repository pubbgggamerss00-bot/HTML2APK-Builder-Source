package w1;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import q1.u1;
import w1.g;

/* loaded from: classes.dex */
public final class i {
    public static final void a(u1 u1Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = d14;
        double d20 = (d16 / 180) * 3.141592653589793d;
        double dCos = Math.cos(d20);
        double dSin = Math.sin(d20);
        double d21 = ((d11 * dSin) + (d10 * dCos)) / d19;
        double d22 = ((d11 * dCos) + ((-d10) * dSin)) / d15;
        double d23 = ((d13 * dSin) + (d12 * dCos)) / d19;
        double d24 = ((d13 * dCos) + ((-d12) * dSin)) / d15;
        double d25 = d21 - d23;
        double d26 = d22 - d24;
        double d27 = 2;
        double d28 = (d21 + d23) / d27;
        double d29 = (d22 + d24) / d27;
        double d30 = (d26 * d26) + (d25 * d25);
        if (d30 == 0.0d) {
            return;
        }
        double d31 = (1.0d / d30) - 0.25d;
        if (d31 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d30) / 1.99999d);
            a(u1Var, d10, d11, d12, d13, d19 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d31);
        double d32 = d25 * dSqrt2;
        double d33 = dSqrt2 * d26;
        if (z10 == z11) {
            d17 = d28 - d33;
            d18 = d29 + d32;
        } else {
            d17 = d28 + d33;
            d18 = d29 - d32;
        }
        double dAtan2 = Math.atan2(d22 - d18, d21 - d17);
        double dAtan22 = Math.atan2(d24 - d18, d23 - d17) - dAtan2;
        if (z11 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d34 = d17 * d19;
        double d35 = d18 * d15;
        double d36 = (d34 * dCos) - (d35 * dSin);
        double d37 = (d35 * dCos) + (d34 * dSin);
        double d38 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * d38) / 3.141592653589793d));
        double dCos2 = Math.cos(d20);
        double dSin2 = Math.sin(d20);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d39 = dAtan22;
        double d40 = -d19;
        double d41 = d40 * dCos2;
        double d42 = d15 * dSin2;
        double d43 = (d41 * dSin3) - (d42 * dCos3);
        double d44 = d40 * dSin2;
        double d45 = d15 * dCos2;
        double d46 = (dCos3 * d45) + (dSin3 * d44);
        double d47 = d39 / iCeil;
        double d48 = dAtan2;
        double d49 = d43;
        int i10 = 0;
        double d50 = d10;
        double d51 = d46;
        double d52 = d11;
        while (i10 < iCeil) {
            double d53 = d48 + d47;
            double dSin4 = Math.sin(d53);
            double dCos4 = Math.cos(d53);
            int i11 = i10;
            double d54 = (((d19 * dCos2) * dCos4) + d36) - (d42 * dSin4);
            int i12 = iCeil;
            double d55 = (d45 * dSin4) + (d19 * dSin2 * dCos4) + d37;
            double d56 = (d41 * dSin4) - (d42 * dCos4);
            double d57 = (dCos4 * d45) + (dSin4 * d44);
            double d58 = d53 - d48;
            double dTan = Math.tan(d58 / d27);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d38) - 1) * Math.sin(d58)) / 3;
            u1Var.m((float) ((d49 * dSqrt3) + d50), (float) ((d51 * dSqrt3) + d52), (float) (d54 - (dSqrt3 * d56)), (float) (d55 - (dSqrt3 * d57)), (float) d54, (float) d55);
            d50 = d54;
            i10 = i11 + 1;
            d36 = d36;
            dSin2 = dSin2;
            d38 = d38;
            d48 = d53;
            d51 = d57;
            d49 = d56;
            d52 = d55;
            d19 = d14;
            iCeil = i12;
        }
    }

    public static final void b(List list, u1 u1Var) {
        int i10;
        float f10;
        int i11;
        g gVar;
        g gVar2;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        List list2 = list;
        u1 u1Var2 = u1Var;
        int iJ = u1Var2.j();
        u1Var2.n();
        u1Var2.h(iJ);
        g gVar3 = list2.isEmpty() ? g.b.f31130c : (g) list2.get(0);
        int size = list2.size();
        float f19 = CropImageView.DEFAULT_ASPECT_RATIO;
        int i12 = 0;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        float f23 = 0.0f;
        float f24 = 0.0f;
        float f25 = 0.0f;
        while (i12 < size) {
            g gVar4 = (g) list2.get(i12);
            if (gVar4 instanceof g.b) {
                u1Var2.close();
                i10 = size;
                f10 = f19;
                i11 = i12;
                gVar2 = gVar4;
                f20 = f24;
                f22 = f20;
                f21 = f25;
                f23 = f21;
            } else {
                if (gVar4 instanceof g.n) {
                    g.n nVar = (g.n) gVar4;
                    float f26 = nVar.f31168c;
                    f22 += f26;
                    float f27 = nVar.f31169d;
                    f23 += f27;
                    u1Var2.c(f26, f27);
                    i10 = size;
                    f10 = f19;
                    i11 = i12;
                    f24 = f22;
                    f25 = f23;
                } else {
                    if (gVar4 instanceof g.f) {
                        g.f fVar = (g.f) gVar4;
                        float f28 = fVar.f31140c;
                        float f29 = fVar.f31141d;
                        u1Var2.l(f28, f29);
                        f23 = f29;
                        f25 = f23;
                        f22 = f28;
                        f24 = f22;
                    } else if (gVar4 instanceof g.m) {
                        g.m mVar = (g.m) gVar4;
                        float f30 = mVar.f31167d;
                        float f31 = mVar.f31166c;
                        u1Var2.o(f31, f30);
                        f22 += f31;
                        f23 += f30;
                    } else if (gVar4 instanceof g.e) {
                        g.e eVar = (g.e) gVar4;
                        float f32 = eVar.f31139d;
                        float f33 = eVar.f31138c;
                        u1Var2.p(f33, f32);
                        f22 = f33;
                        f23 = f32;
                    } else if (gVar4 instanceof g.l) {
                        float f34 = ((g.l) gVar4).f31165c;
                        u1Var2.o(f34, f19);
                        f22 += f34;
                    } else if (gVar4 instanceof g.d) {
                        float f35 = ((g.d) gVar4).f31137c;
                        u1Var2.p(f35, f23);
                        f22 = f35;
                    } else if (gVar4 instanceof g.r) {
                        float f36 = ((g.r) gVar4).f31180c;
                        u1Var2.o(f19, f36);
                        f23 += f36;
                    } else if (gVar4 instanceof g.s) {
                        float f37 = ((g.s) gVar4).f31181c;
                        u1Var2.p(f22, f37);
                        f23 = f37;
                    } else {
                        if (gVar4 instanceof g.k) {
                            g.k kVar = (g.k) gVar4;
                            u1Var2.d(kVar.f31159c, kVar.f31160d, kVar.f31161e, kVar.f31162f, kVar.f31163g, kVar.f31164h);
                            f16 = kVar.f31161e + f22;
                            f17 = kVar.f31162f + f23;
                            f22 += kVar.f31163g;
                            f18 = kVar.f31164h;
                        } else if (gVar4 instanceof g.c) {
                            g.c cVar = (g.c) gVar4;
                            u1Var.m(cVar.f31131c, cVar.f31132d, cVar.f31133e, cVar.f31134f, cVar.f31135g, cVar.f31136h);
                            float f38 = cVar.f31133e;
                            float f39 = cVar.f31134f;
                            float f40 = cVar.f31135g;
                            float f41 = cVar.f31136h;
                            f22 = f40;
                            f23 = f41;
                            i10 = size;
                            f10 = f19;
                            i11 = i12;
                            gVar2 = gVar4;
                            f20 = f38;
                            f21 = f39;
                        } else if (gVar4 instanceof g.p) {
                            if (gVar3.f31121a) {
                                float f42 = f22 - f20;
                                f15 = f23 - f21;
                                f14 = f42;
                            } else {
                                f14 = f19;
                                f15 = f14;
                            }
                            g.p pVar = (g.p) gVar4;
                            u1Var.d(f14, f15, pVar.f31174c, pVar.f31175d, pVar.f31176e, pVar.f31177f);
                            f16 = pVar.f31174c + f22;
                            f17 = pVar.f31175d + f23;
                            f22 += pVar.f31176e;
                            f18 = pVar.f31177f;
                        } else {
                            if (gVar4 instanceof g.h) {
                                if (gVar3.f31121a) {
                                    float f43 = 2;
                                    f22 = (f22 * f43) - f20;
                                    f23 = (f43 * f23) - f21;
                                }
                                g.h hVar = (g.h) gVar4;
                                u1Var.m(f22, f23, hVar.f31146c, hVar.f31147d, hVar.f31148e, hVar.f31149f);
                                f13 = hVar.f31146c;
                                float f44 = hVar.f31147d;
                                float f45 = hVar.f31148e;
                                float f46 = hVar.f31149f;
                                f22 = f45;
                                f23 = f46;
                                i10 = size;
                                f10 = f19;
                                i11 = i12;
                                gVar2 = gVar4;
                                f21 = f44;
                            } else if (gVar4 instanceof g.o) {
                                g.o oVar = (g.o) gVar4;
                                float f47 = oVar.f31173f;
                                float f48 = oVar.f31172e;
                                float f49 = oVar.f31171d;
                                float f50 = oVar.f31170c;
                                u1Var.a(f50, f49, f48, f47);
                                float f51 = f50 + f22;
                                float f52 = f49 + f23;
                                f22 += f48;
                                f23 += f47;
                                f20 = f51;
                                f21 = f52;
                            } else {
                                if (gVar4 instanceof g.C0315g) {
                                    g.C0315g c0315g = (g.C0315g) gVar4;
                                    float f53 = c0315g.f31145f;
                                    float f54 = c0315g.f31144e;
                                    float f55 = c0315g.f31143d;
                                    f13 = c0315g.f31142c;
                                    u1Var.i(f13, f55, f54, f53);
                                    f23 = f53;
                                    f22 = f54;
                                    f21 = f55;
                                } else if (gVar4 instanceof g.q) {
                                    if (gVar3.f31122b) {
                                        f11 = f22 - f20;
                                        f12 = f23 - f21;
                                    } else {
                                        f11 = f19;
                                        f12 = f11;
                                    }
                                    g.q qVar = (g.q) gVar4;
                                    float f56 = qVar.f31179d;
                                    float f57 = qVar.f31178c;
                                    u1Var.a(f11, f12, f57, f56);
                                    f13 = f11 + f22;
                                    float f58 = f12 + f23;
                                    f22 += f57;
                                    f23 += f56;
                                    f21 = f58;
                                } else if (gVar4 instanceof g.i) {
                                    if (gVar3.f31122b) {
                                        float f59 = 2;
                                        f22 = (f22 * f59) - f20;
                                        f23 = (f59 * f23) - f21;
                                    }
                                    g.i iVar = (g.i) gVar4;
                                    float f60 = iVar.f31151d;
                                    float f61 = iVar.f31150c;
                                    u1Var.i(f22, f23, f61, f60);
                                    i10 = size;
                                    f10 = f19;
                                    i11 = i12;
                                    f21 = f23;
                                    gVar2 = gVar4;
                                    f23 = f60;
                                    f20 = f22;
                                    f22 = f61;
                                } else {
                                    if (gVar4 instanceof g.j) {
                                        g.j jVar = (g.j) gVar4;
                                        float f62 = jVar.f31157h + f22;
                                        float f63 = jVar.f31158i + f23;
                                        gVar = gVar4;
                                        f10 = f19;
                                        i10 = size;
                                        i11 = i12;
                                        a(u1Var, f22, f23, f62, f63, jVar.f31152c, jVar.f31153d, jVar.f31154e, jVar.f31155f, jVar.f31156g);
                                        f20 = f62;
                                        f22 = f20;
                                        f21 = f63;
                                        f23 = f21;
                                    } else {
                                        i10 = size;
                                        f10 = f19;
                                        i11 = i12;
                                        gVar = gVar4;
                                        if (gVar instanceof g.a) {
                                            g.a aVar = (g.a) gVar;
                                            float f64 = aVar.f31129i;
                                            float f65 = aVar.f31128h;
                                            gVar2 = gVar;
                                            a(u1Var, f22, f23, f65, f64, aVar.f31123c, aVar.f31124d, aVar.f31125e, aVar.f31126f, aVar.f31127g);
                                            f21 = f64;
                                            f23 = f21;
                                            f20 = f65;
                                            f22 = f20;
                                        }
                                    }
                                    gVar2 = gVar;
                                }
                                i10 = size;
                                f10 = f19;
                                i11 = i12;
                                gVar2 = gVar4;
                            }
                            f20 = f13;
                        }
                        f23 += f18;
                        f20 = f16;
                        f21 = f17;
                    }
                    i10 = size;
                    f10 = f19;
                    i11 = i12;
                }
                gVar2 = gVar4;
            }
            i12 = i11 + 1;
            list2 = list;
            u1Var2 = u1Var;
            size = i10;
            gVar3 = gVar2;
            f19 = f10;
        }
    }
}
