package t0;

import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import g2.j;
import j2.c3;
import x0.j;

/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.d f27044a = androidx.compose.foundation.layout.g.n(d.a.f1143b, v0.q.f30455a);

    public static final class a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w1.d f27045a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27046b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f27047c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f27048d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27049e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f27050f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w1.d dVar, String str, androidx.compose.ui.d dVar2, long j10, int i10, int i11) {
            super(2);
            this.f27045a = dVar;
            this.f27046b = str;
            this.f27047c = dVar2;
            this.f27048d = j10;
            this.f27049e = i10;
            this.f27050f = i11;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            t4.b(this.f27045a, this.f27046b, this.f27047c, this.f27048d, jVar, f3.i.n(this.f27049e | 1), this.f27050f);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(v1.c cVar, String str, androidx.compose.ui.d dVar, long j10, x0.j jVar, int i10) {
        v1.c cVar2;
        int i11;
        boolean z10;
        androidx.compose.ui.d dVarA;
        x0.k kVarP = jVar.p(-2142239481);
        if ((i10 & 6) == 0) {
            cVar2 = cVar;
            i11 = (kVarP.l(cVar2) ? 4 : 2) | i10;
        } else {
            cVar2 = cVar;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.K(dVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.j(j10) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.r0();
            if ((i10 & 1) != 0 && !kVarP.a0()) {
                kVarP.v();
            }
            kVarP.U();
            boolean z11 = (((i11 & V4Signature.MAX_SIGNING_INFOS_SIZE) ^ 3072) > 2048 && kVarP.j(j10)) || (i11 & 3072) == 2048;
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (z11 || objG == c0321a) {
                objG = q1.b1.d(j10, q1.b1.f21654h) ? null : new q1.p0(5, j10);
                kVarP.C(objG);
            }
            q1.c1 c1Var = (q1.c1) objG;
            kVarP.L(-2144891392);
            androidx.compose.ui.d dVar2 = d.a.f1143b;
            if (str != null) {
                boolean z12 = (i11 & 112) == 32;
                Object objG2 = kVarP.g();
                if (z12 || objG2 == c0321a) {
                    objG2 = new v4(str);
                    kVarP.C(objG2);
                }
                z10 = false;
                dVarA = q2.q.a(dVar2, false, (eh.l) objG2);
            } else {
                z10 = false;
                dVarA = dVar2;
            }
            kVarP.T(z10);
            c3.a aVar = j2.c3.f14686a;
            if (!p1.h.a(cVar2.h(), 9205357640488583168L)) {
                long jH = cVar.h();
                if (Float.isInfinite(p1.h.d(jH)) && Float.isInfinite(p1.h.b(jH))) {
                    dVar2 = f27044a;
                }
                z.g.a(androidx.compose.ui.draw.b.a(dVar.h(dVar2), cVar, null, j.a.f11398b, CropImageView.DEFAULT_ASPECT_RATIO, c1Var, 22).h(dVarA), kVarP, 0);
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new u4(cVar, str, dVar, j10, i10);
        }
    }

    public static final void b(w1.d dVar, String str, androidx.compose.ui.d dVar2, long j10, x0.j jVar, int i10, int i11) {
        int i12;
        String str2;
        androidx.compose.ui.d dVar3;
        long j11;
        x0.k kVarP = jVar.p(-126890956);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= kVarP.K(str) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= kVarP.K(dVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= ((i11 & 8) == 0 && kVarP.j(j10)) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            j11 = j10;
            dVar3 = dVar2;
            str2 = str;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                if (i13 != 0) {
                    dVar2 = d.a.f1143b;
                }
                if ((i11 & 8) != 0) {
                    j10 = ((q1.b1) kVarP.f(p2.f26666a)).f21656a;
                    i12 &= -7169;
                }
                androidx.compose.ui.d dVar4 = dVar2;
                long j12 = j10;
                kVarP.U();
                a(w1.p.b(dVar, kVarP), str, dVar4, j12, kVarP, (i12 & 112) | 8 | (i12 & 896) | (i12 & V4Signature.MAX_SIGNING_INFOS_SIZE));
                str2 = str;
                dVar3 = dVar4;
                j11 = j12;
            } else {
                kVarP.v();
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
                androidx.compose.ui.d dVar42 = dVar2;
                long j122 = j10;
                kVarP.U();
                a(w1.p.b(dVar, kVarP), str, dVar42, j122, kVarP, (i12 & 112) | 8 | (i12 & 896) | (i12 & V4Signature.MAX_SIGNING_INFOS_SIZE));
                str2 = str;
                dVar3 = dVar42;
                j11 = j122;
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new a(dVar, str2, dVar3, j11, i10, i11);
        }
    }
}
