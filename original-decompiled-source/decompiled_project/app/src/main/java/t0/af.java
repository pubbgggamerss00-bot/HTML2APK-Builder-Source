package t0;

import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public static final s.m2 f25499a;

    static {
        s.w wVar = s.d0.f23703a;
        s.m.d(250, 0, wVar, 2);
        f25499a = s.m.d(250, 0, wVar, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i10, androidx.compose.ui.d dVar, long j10, long j11, eh.q qVar, eh.p pVar, f1.b bVar, x0.j jVar, int i11, int i12) {
        long jE;
        long jE2;
        int i13;
        long j12;
        long j13;
        eh.q qVarB;
        eh.p pVar2;
        x0.k kVar;
        eh.q qVar2;
        eh.p pVar3;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(-1884787284);
        int i14 = (kVarP.i(i10) ? 4 : 2) | i11;
        if ((i11 & 384) == 0) {
            if ((i12 & 4) == 0) {
                jE = j10;
                int i15 = kVarP.j(jE) ? 256 : 128;
                i14 |= i15;
            } else {
                jE = j10;
            }
            i14 |= i15;
        } else {
            jE = j10;
        }
        if ((i12 & 8) == 0) {
            jE2 = j11;
            int i16 = kVarP.j(jE2) ? 2048 : 1024;
            i13 = i14 | i16 | 221184;
            if ((599187 & i13) == 599186 || !kVarP.s()) {
                kVarP.r0();
                if ((i11 & 1) != 0 || kVarP.a0()) {
                    if ((i12 & 4) != 0) {
                        jE = f2.e(v0.z.f30528c, kVarP);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jE2 = f2.e(v0.z.f30530e, kVarP);
                        i13 &= -7169;
                    }
                    j12 = jE;
                    j13 = jE2;
                    qVarB = f1.c.b(-2021049253, new ne(i10), kVarP);
                    pVar2 = o2.f26573a;
                } else {
                    kVarP.v();
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    qVarB = qVar;
                    pVar2 = pVar;
                    j12 = jE;
                    j13 = jE2;
                }
                kVarP.U();
                kVar = kVarP;
                c(dVar, j12, j13, qVarB, pVar2, bVar, kVar, (i13 >> 3) & 524286);
                jE = j12;
                jE2 = j13;
                qVar2 = qVarB;
                pVar3 = pVar2;
            } else {
                kVarP.v();
                qVar2 = qVar;
                pVar3 = pVar;
                kVar = kVarP;
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new oe(i10, dVar, jE, jE2, qVar2, pVar3, bVar, i11, i12);
                return;
            }
            return;
        }
        jE2 = j11;
        i13 = i14 | i16 | 221184;
        if ((599187 & i13) == 599186) {
            kVarP.r0();
            if ((i11 & 1) != 0) {
                if ((i12 & 4) != 0) {
                }
                if ((i12 & 8) != 0) {
                }
                j12 = jE;
                j13 = jE2;
                qVarB = f1.c.b(-2021049253, new ne(i10), kVarP);
                pVar2 = o2.f26573a;
                kVarP.U();
                kVar = kVarP;
                c(dVar, j12, j13, qVarB, pVar2, bVar, kVar, (i13 >> 3) & 524286);
                jE = j12;
                jE2 = j13;
                qVar2 = qVarB;
                pVar3 = pVar2;
            }
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    public static final void b(int i10, androidx.compose.ui.d dVar, long j10, long j11, f1.b bVar, eh.p pVar, f1.b bVar2, x0.j jVar, int i11, int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        long j12;
        eh.p pVar2;
        x0.k kVar;
        androidx.compose.ui.d dVar3;
        eh.p pVar3;
        x0.k kVarP = jVar.p(-1199178586);
        int i14 = (kVarP.i(i10) ? 4 : 2) | i11;
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 = i14 | 48;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i13 = i14 | (kVarP.K(dVar2) ? 32 : 16);
        }
        if ((i11 & 384) == 0) {
            i13 |= kVarP.j(j10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            j12 = j11;
            i13 |= kVarP.j(j12) ? 2048 : 1024;
        } else {
            j12 = j11;
        }
        int i16 = i13 | 196608;
        if ((599187 & i16) == 599186 && kVarP.s()) {
            kVarP.v();
            pVar3 = pVar;
            kVar = kVarP;
            dVar3 = dVar2;
        } else {
            kVarP.r0();
            if ((i11 & 1) == 0 || kVarP.a0()) {
                if (i15 != 0) {
                    dVar2 = d.a.f1143b;
                }
                pVar2 = o2.f26574b;
            } else {
                kVarP.v();
                pVar2 = pVar;
            }
            androidx.compose.ui.d dVar4 = dVar2;
            kVarP.U();
            kVar = kVarP;
            d(dVar4, j10, j12, bVar, pVar2, bVar2, kVar, (i16 >> 3) & 524286);
            dVar3 = dVar4;
            pVar3 = pVar2;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new pe(i10, dVar3, j10, j11, bVar, pVar3, bVar2, i11, i12);
        }
    }

    public static final void c(androidx.compose.ui.d dVar, long j10, long j11, eh.q qVar, eh.p pVar, f1.b bVar, x0.j jVar, int i10) {
        int i11;
        x0.k kVar;
        x0.k kVarP = jVar.p(1757425411);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.j(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.j(j11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.l(qVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.l(pVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.l(bVar) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            int i12 = i11 << 3;
            kVar = kVarP;
            md.a(q2.q.a(dVar, false, g0.a.f11258a), null, j10, j11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-65106680, new te(bVar, pVar, qVar), kVarP), kVar, (i12 & 896) | 12582912 | (i12 & V4Signature.MAX_SIGNING_INFOS_SIZE), 114);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new ue(dVar, j10, j11, qVar, pVar, bVar, i10);
        }
    }

    public static final void d(androidx.compose.ui.d dVar, long j10, long j11, f1.b bVar, eh.p pVar, f1.b bVar2, x0.j jVar, int i10) {
        int i11;
        x0.k kVar;
        x0.k kVarP = jVar.p(-160898917);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.j(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.j(j11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.l(bVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.l(pVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.l(bVar2) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            int i12 = i11 << 3;
            kVar = kVarP;
            md.a(q2.q.a(dVar, false, g0.a.f11258a), null, j10, j11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-1617702432, new ye(bVar2, pVar, bVar), kVarP), kVar, (i12 & 896) | 12582912 | (i12 & V4Signature.MAX_SIGNING_INFOS_SIZE), 114);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new ze(dVar, j10, j11, bVar, pVar, bVar2, i10);
        }
    }
}
