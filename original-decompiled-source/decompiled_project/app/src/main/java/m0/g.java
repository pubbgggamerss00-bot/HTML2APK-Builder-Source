package m0;

import android.graphics.Bitmap;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import j2.k5;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import s1.a;
import x0.j;

/* loaded from: classes.dex */
public final class g {

    public static final class a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f17327a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<Boolean> f17328b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f17329c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f17330d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.d dVar, eh.a<Boolean> aVar, boolean z10, int i10) {
            super(2);
            this.f17327a = dVar;
            this.f17328b = aVar;
            this.f17329c = z10;
            this.f17330d = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f17330d | 1);
            g.c(this.f17327a, this.f17328b, this.f17329c, jVar, iN);
            return pg.f0.f21461a;
        }
    }

    public static final void a(w wVar, j1.d dVar, f1.b bVar, x0.j jVar, int i10) {
        int i11;
        f1.b bVar2;
        x0.k kVarP = jVar.p(476043083);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? kVarP.K(wVar) : kVarP.l(wVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(bVar) ? 256 : 128;
        }
        boolean z10 = true;
        if (kVarP.A(i11 & 1, (i11 & 147) != 146)) {
            boolean z11 = (i11 & 112) == 32;
            if ((i11 & 14) != 4 && ((i11 & 8) == 0 || !kVarP.K(wVar))) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object objG = kVarP.g();
            if (z12 || objG == j.a.f31715a) {
                objG = new p(dVar, wVar);
                kVarP.C(objG);
            }
            bVar2 = bVar;
            j3.k.a((p) objG, null, new j3.p0(false, j3.q0.f15111a, false), bVar2, kVarP, ((i11 << 3) & V4Signature.MAX_SIGNING_INFOS_SIZE) | 384, 2);
        } else {
            bVar2 = bVar;
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new m0.a(wVar, dVar, bVar2, i10);
        }
    }

    public static final void b(w wVar, boolean z10, e3.g gVar, boolean z11, long j10, float f10, androidx.compose.ui.d dVar, x0.j jVar, int i10) {
        int i11;
        long j11;
        int i12;
        long j12;
        boolean z12;
        x0.k kVarP = jVar.p(-466280168);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? kVarP.K(wVar) : kVarP.l(wVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.c(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.K(gVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.c(z11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= 8192;
        }
        if ((1572864 & i10) == 0) {
            i11 |= kVarP.K(dVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (kVarP.A(i11 & 1, (533651 & i11) != 533650)) {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                i12 = i11 & (-57345);
                j12 = 9205357640488583168L;
            } else {
                kVarP.v();
                i12 = i11 & (-57345);
                j12 = j10;
            }
            kVarP.U();
            if (z10) {
                float f11 = h1.f17345a;
                z12 = (gVar == e3.g.f8360a && !z11) || (gVar == e3.g.f8361b && z11);
            } else {
                float f12 = h1.f17345a;
                z12 = !((gVar == e3.g.f8360a && !z11) || (gVar == e3.g.f8361b && z11));
            }
            j1.e eVar = z12 ? j1.a.f14597b : j1.a.f14596a;
            int i13 = i12 & 14;
            boolean zC = ((i12 & 112) == 32) | (i13 == 4 || ((i12 & 8) != 0 && kVarP.l(wVar))) | kVarP.c(z12);
            Object objG = kVarP.g();
            if (zC || objG == j.a.f31715a) {
                objG = new f(wVar, z10, z12);
                kVarP.C(objG);
            }
            long j13 = j12;
            j1.e eVar2 = eVar;
            j11 = j13;
            a(wVar, eVar2, f1.c.b(1365123137, new d((k5) kVarP.f(j2.j2.f14790s), j11, z12, q2.q.a(dVar, false, (eh.l) objG), wVar), kVarP), kVarP, i13 | 384);
        } else {
            kVarP.v();
            j11 = j10;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new e(wVar, z10, gVar, z11, j11, f10, dVar, i10);
        }
    }

    public static final void c(androidx.compose.ui.d dVar, eh.a<Boolean> aVar, boolean z10, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(2111672474);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | (kVarP.l(aVar) ? 32 : 16) | (kVarP.c(z10) ? 256 : 128);
        if (kVarP.A(i12 & 1, (i12 & 147) != 146)) {
            p1.d.b(androidx.compose.ui.c.a(androidx.compose.foundation.layout.g.o(dVar, h1.f17345a, h1.f17346b), j2.c3.f14686a, new j(aVar, z10)), kVarP);
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new a(dVar, aVar, z10, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final q1.n1 d(n1.g gVar, float f10) {
        int iCeil = ((int) Math.ceil(f10)) * 2;
        q1.e0 e0VarA = gd.m.f11980a;
        q1.b0 b0VarA = gd.m.f11981b;
        s1.a aVar = gd.m.f11982c;
        if (e0VarA != null) {
            Bitmap bitmap = e0VarA.f21686a;
            if (b0VarA == null || iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                e0VarA = ya.b.a(iCeil, iCeil, 1, 24);
                gd.m.f11980a = e0VarA;
                b0VarA = com.google.android.gms.common.api.internal.a.a(e0VarA);
                gd.m.f11981b = b0VarA;
            }
        }
        q1.e0 e0Var = e0VarA;
        q1.b0 b0Var = b0VarA;
        Bitmap bitmap2 = e0Var.f21686a;
        if (aVar == null) {
            aVar = new s1.a();
            gd.m.f11982c = aVar;
        }
        s1.a aVar2 = aVar;
        a.C0270a c0270a = aVar2.f24172a;
        f3.r layoutDirection = gVar.f18310a.getLayoutDirection();
        float width = bitmap2.getWidth();
        float height = bitmap2.getHeight();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & BodyPartID.bodyIdMax);
        f3.d dVar = c0270a.f24176a;
        f3.r rVar = c0270a.f24177b;
        q1.w0 w0Var = c0270a.f24178c;
        long j10 = c0270a.f24179d;
        c0270a.f24176a = gVar;
        c0270a.f24177b = layoutDirection;
        c0270a.f24178c = b0Var;
        c0270a.f24179d = jFloatToRawIntBits;
        b0Var.d();
        s1.e.X0(aVar2, q1.b1.f21648b, 0L, aVar2.i(), CropImageView.DEFAULT_ASPECT_RATIO, null, 58);
        s1.e.X0(aVar2, c2.n0.c(4278190080L), 0L, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & BodyPartID.bodyIdMax), CropImageView.DEFAULT_ASPECT_RATIO, null, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        s1.e.f0(aVar2, c2.n0.c(4278190080L), f10, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & BodyPartID.bodyIdMax), null, 0, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        b0Var.o();
        c0270a.f24176a = dVar;
        c0270a.f24177b = rVar;
        c0270a.f24178c = w0Var;
        c0270a.f24179d = j10;
        return e0Var;
    }
}
