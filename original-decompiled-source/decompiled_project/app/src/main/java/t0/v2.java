package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import x0.j;

/* loaded from: classes.dex */
public final class v2 {

    public static final class a extends kotlin.jvm.internal.s implements eh.l<s1.e, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f27214a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f27215b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, long j10) {
            super(1);
            this.f27214a = f10;
            this.f27215b = j10;
        }

        @Override // eh.l
        public final pg.f0 invoke(s1.e eVar) {
            s1.e eVar2 = eVar;
            float f10 = this.f27214a;
            float f11 = 2;
            eVar2.k0(this.f27215b, p1.d.a(CropImageView.DEFAULT_ASPECT_RATIO, eVar2.N0(f10) / f11), p1.d.a(p1.h.d(eVar2.i()), eVar2.N0(f10) / f11), eVar2.N0(f10), (496 & 16) != 0 ? 0 : 0);
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f27216a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f27217b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f27218c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f27219d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27220e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.d dVar, float f10, long j10, int i10, int i11) {
            super(2);
            this.f27216a = dVar;
            this.f27217b = f10;
            this.f27218c = j10;
            this.f27219d = i10;
            this.f27220e = i11;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            v2.a(this.f27216a, this.f27217b, this.f27218c, jVar, f3.i.n(this.f27219d | 1), this.f27220e);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.d dVar, float f10, long j10, x0.j jVar, int i10, int i11) {
        androidx.compose.ui.d dVar2;
        int i12;
        float f11;
        long jE;
        int i13;
        androidx.compose.ui.d dVar3;
        float f12;
        boolean z10;
        boolean z11;
        Object objG;
        androidx.compose.ui.d dVar4;
        float f13;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(75144485);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            dVar2 = dVar;
        } else if ((i10 & 6) == 0) {
            dVar2 = dVar;
            i12 = i10 | (kVarP.K(dVar2) ? 4 : 2);
        } else {
            dVar2 = dVar;
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                f11 = f10;
                i12 |= kVarP.h(f11) ? 32 : 16;
            }
            jE = j10;
            i13 = i12 | (((i11 & 4) == 0 || !kVarP.j(jE)) ? 128 : 256);
            if ((i13 & 147) == 146 || !kVarP.s()) {
                kVarP.r0();
                if ((i10 & 1) != 0 || kVarP.a0()) {
                    dVar3 = i14 == 0 ? d.a.f1143b : dVar2;
                    f12 = i15 == 0 ? u2.f27116a : f11;
                    if ((i11 & 4) != 0) {
                        float f14 = u2.f27116a;
                        float f15 = v0.f.f30273a;
                        i13 &= -897;
                        jE = f2.e(v0.d.f30247l, kVarP);
                    }
                } else {
                    kVarP.v();
                    if ((i11 & 4) != 0) {
                        i13 &= -897;
                    }
                    dVar3 = dVar2;
                    f12 = f11;
                }
                kVarP.U();
                androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(dVar3, 1.0f), f12);
                z10 = true;
                boolean z12 = (i13 & 112) != 32;
                if ((((i13 & 896) ^ 384) > 256 || !kVarP.j(jE)) && (i13 & 384) != 256) {
                    z10 = false;
                }
                z11 = z12 | z10;
                objG = kVarP.g();
                if (z11 || objG == j.a.f31715a) {
                    objG = new a(f12, jE);
                    kVarP.C(objG);
                }
                t.w.a(dVarF, (eh.l) objG, kVarP, 0);
                dVar4 = dVar3;
                f13 = f12;
            } else {
                kVarP.v();
                dVar4 = dVar2;
                f13 = f11;
            }
            long j11 = jE;
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new b(dVar4, f13, j11, i10, i11);
                return;
            }
            return;
        }
        i12 |= 48;
        f11 = f10;
        jE = j10;
        i13 = i12 | (((i11 & 4) == 0 || !kVarP.j(jE)) ? 128 : 256);
        if ((i13 & 147) == 146) {
            kVarP.r0();
            if ((i10 & 1) != 0) {
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if ((i11 & 4) != 0) {
                }
                kVarP.U();
                androidx.compose.ui.d dVarF2 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(dVar3, 1.0f), f12);
                z10 = true;
                if ((i13 & 112) != 32) {
                }
                if (((i13 & 896) ^ 384) > 256) {
                    z10 = false;
                    z11 = z12 | z10;
                    objG = kVarP.g();
                    if (z11) {
                        objG = new a(f12, jE);
                        kVarP.C(objG);
                        t.w.a(dVarF2, (eh.l) objG, kVarP, 0);
                        dVar4 = dVar3;
                        f13 = f12;
                    }
                } else {
                    z10 = false;
                    z11 = z12 | z10;
                    objG = kVarP.g();
                    if (z11) {
                    }
                }
            }
        }
        long j112 = jE;
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }
}
