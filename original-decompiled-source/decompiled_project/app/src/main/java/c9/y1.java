package c9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Iterator;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.p;
import s1.a;
import x0.h2;
import x0.j;

/* loaded from: classes.dex */
public final class y1 {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final b page, final Bitmap bitmap, final androidx.compose.ui.d dVar, e eVar, int i10, x0.j jVar, final int i11, final int i12) {
        int i13;
        final e eVar2;
        int i14;
        final e eVar3;
        Object objG;
        Object obj;
        Object objA;
        final Typeface typeface;
        boolean zK;
        Object objG2;
        final q1.n1 n1Var;
        boolean zL;
        Object objG3;
        final int i15;
        final int i16;
        h2 h2VarV;
        kotlin.jvm.internal.r.e(page, "page");
        x0.k kVarP = jVar.p(71971604);
        if ((i11 & 6) == 0) {
            i13 = (kVarP.l(page) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= kVarP.l(bitmap) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= kVarP.K(dVar) ? 256 : 128;
        }
        int i17 = i12 & 8;
        if (i17 == 0) {
            if ((i11 & 3072) == 0) {
                eVar2 = eVar;
                i13 |= kVarP.l(eVar2) ? 2048 : 1024;
            }
            i14 = i13 | 24576;
            if ((i14 & 9363) == 9362 || !kVarP.s()) {
                eVar3 = i17 == 0 ? null : eVar2;
                Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
                kVarP.L(1722220358);
                objG = kVarP.g();
                obj = j.a.f31715a;
                if (objG == obj) {
                    try {
                        objA = Typeface.createFromAsset(context.getAssets(), "com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf");
                    } catch (Throwable th2) {
                        objA = pg.q.a(th2);
                    }
                    Object obj2 = Typeface.SANS_SERIF;
                    if (objA instanceof p.a) {
                        objA = obj2;
                    }
                    objG = (Typeface) objA;
                    kVarP.C(objG);
                }
                typeface = (Typeface) objG;
                kVarP.T(false);
                kVarP.L(1722229750);
                zK = kVarP.K(bitmap);
                objG2 = kVarP.g();
                if (!zK || objG2 == obj) {
                    Object e0Var = bitmap != null ? new q1.e0(bitmap) : null;
                    kVarP.C(e0Var);
                    objG2 = e0Var;
                }
                n1Var = (q1.n1) objG2;
                kVarP.T(false);
                kVarP.L(1722232493);
                zL = kVarP.l(page) | kVarP.l(n1Var) | ((57344 & i14) != 16384) | kVarP.l(typeface) | kVarP.l(eVar3);
                objG3 = kVarP.g();
                i15 = -1;
                if (!zL || objG3 == obj) {
                    Object obj3 = new eh.l() { // from class: c9.w1
                        /* JADX WARN: Code restructure failed: missing block: B:54:0x0143, code lost:
                        
                            r15 = r26;
                            r6 = r27;
                            r0 = r3;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:55:0x0149, code lost:
                        
                            if (r0 == null) goto L82;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:56:0x014b, code lost:
                        
                            kotlin.jvm.internal.r.b(r5);
                            c9.y1.b(r2, r0, r15, r6, r5);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:57:0x0151, code lost:
                        
                            r2.Q0().f24180a.f(-r7, -r31);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:58:0x0160, code lost:
                        
                            t.r.a(r28, r29);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:59:0x0169, code lost:
                        
                            return pg.f0.f21461a;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:60:0x016a, code lost:
                        
                            r0 = th;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
                        
                            r9 = r28;
                            r14 = r29;
                         */
                        @Override // eh.l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj4) throws Throwable {
                            long j10;
                            a.b bVar;
                            float f10;
                            float f11;
                            float f12;
                            long j11;
                            float f13;
                            a.b bVar2;
                            float f14;
                            float f15;
                            s1.e Canvas = (s1.e) obj4;
                            kotlin.jvm.internal.r.e(Canvas, "$this$Canvas");
                            b bVar3 = page;
                            int i18 = bVar3.f5062f;
                            int i19 = 0;
                            boolean z10 = i18 % 180 != 0;
                            long jI = Canvas.i();
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (z10 ? jI & BodyPartID.bodyIdMax : jI >> 32));
                            long jI2 = Canvas.i();
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (z10 ? jI2 >> 32 : jI2 & BodyPartID.bodyIdMax));
                            float f16 = i18;
                            long jH1 = Canvas.h1();
                            a.b bVarQ0 = Canvas.Q0();
                            long jD = bVarQ0.d();
                            bVarQ0.a().d();
                            try {
                                bVarQ0.f24180a.d(f16, jH1);
                                float f17 = 2;
                                float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (Canvas.i() >> 32)) - fIntBitsToFloat) / f17;
                                float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (Canvas.i() & BodyPartID.bodyIdMax)) - fIntBitsToFloat2) / f17;
                                Canvas.Q0().f24180a.f(fIntBitsToFloat3, fIntBitsToFloat4);
                                float f18 = fIntBitsToFloat3;
                                try {
                                    j10 = jD;
                                    try {
                                        s1.e.X0(Canvas, q1.b1.f21650d, 0L, (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), CropImageView.DEFAULT_ASPECT_RATIO, null, 122);
                                        q1.n1 n1Var2 = n1Var;
                                        if (n1Var2 != null) {
                                            int i20 = (int) fIntBitsToFloat;
                                            if (i20 < 1) {
                                                i20 = 1;
                                            }
                                            f13 = fIntBitsToFloat4;
                                            f11 = fIntBitsToFloat;
                                            f12 = fIntBitsToFloat2;
                                            bVar2 = bVarQ0;
                                            j11 = j10;
                                            try {
                                                s1.e.e1(Canvas, n1Var2, 0L, 0L, 0L, (i20 << 32) | ((((int) fIntBitsToFloat2) >= 1 ? r6 : 1) & BodyPartID.bodyIdMax), CropImageView.DEFAULT_ASPECT_RATIO, null, null, 0, 0, DescriptorProtos.Edition.EDITION_PROTO2_VALUE);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                bVar = bVar2;
                                                j10 = j11;
                                                f10 = f13;
                                                f18 = f18;
                                                try {
                                                    Canvas.Q0().f24180a.f(-f18, -f10);
                                                    throw th;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    t.r.a(bVar, j10);
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            f11 = fIntBitsToFloat;
                                            f12 = fIntBitsToFloat2;
                                            j11 = j10;
                                            f13 = fIntBitsToFloat4;
                                            bVar2 = bVarQ0;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        f10 = fIntBitsToFloat4;
                                        bVar = bVarQ0;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    j10 = jD;
                                    bVar = bVarQ0;
                                    f10 = fIntBitsToFloat4;
                                }
                                try {
                                    Iterator<T> it = bVar3.f5063g.iterator();
                                    while (true) {
                                        int i21 = i19;
                                        boolean zHasNext = it.hasNext();
                                        Typeface typeface2 = typeface;
                                        if (!zHasNext) {
                                            break;
                                        }
                                        Object next = it.next();
                                        i19 = i21 + 1;
                                        if (i21 < 0) {
                                            qg.p.o();
                                            throw null;
                                        }
                                        v1 v1Var = (v1) next;
                                        if (i21 != i15) {
                                            kotlin.jvm.internal.r.b(typeface2);
                                            f14 = f11;
                                            f15 = f12;
                                            y1.b(Canvas, v1Var, f14, f15, typeface2);
                                        } else {
                                            f14 = f11;
                                            f15 = f12;
                                        }
                                        f12 = f15;
                                        f11 = f14;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    f18 = f18;
                                    bVar = bVar2;
                                    j10 = j11;
                                    f10 = f13;
                                    Canvas.Q0().f24180a.f(-f18, -f10);
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                j10 = jD;
                                bVar = bVarQ0;
                            }
                        }
                    };
                    kVarP.C(obj3);
                    objG3 = obj3;
                }
                kVarP.T(false);
                t.w.a(dVar, (eh.l) objG3, kVarP, (i14 >> 6) & 14);
                eVar2 = eVar3;
                i16 = -1;
            } else {
                kVarP.v();
                i16 = i10;
            }
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new eh.p() { // from class: c9.x1
                    @Override // eh.p
                    public final Object invoke(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        y1.a(page, bitmap, dVar, eVar2, i16, (x0.j) obj4, f3.i.n(i11 | 1), i12);
                        return pg.f0.f21461a;
                    }
                };
                return;
            }
            return;
        }
        i13 |= 3072;
        eVar2 = eVar;
        i14 = i13 | 24576;
        if ((i14 & 9363) == 9362) {
            if (i17 == 0) {
            }
            Context context2 = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(1722220358);
            objG = kVarP.g();
            obj = j.a.f31715a;
            if (objG == obj) {
            }
            typeface = (Typeface) objG;
            kVarP.T(false);
            kVarP.L(1722229750);
            zK = kVarP.K(bitmap);
            objG2 = kVarP.g();
            if (!zK) {
                if (bitmap != null) {
                }
                kVarP.C(e0Var);
                objG2 = e0Var;
                n1Var = (q1.n1) objG2;
                kVarP.T(false);
                kVarP.L(1722232493);
                zL = kVarP.l(page) | kVarP.l(n1Var) | ((57344 & i14) != 16384) | kVarP.l(typeface) | kVarP.l(eVar3);
                objG3 = kVarP.g();
                i15 = -1;
                if (!zL) {
                    Object obj32 = new eh.l() { // from class: c9.w1
                        /* JADX WARN: Code restructure failed: missing block: B:54:0x0143, code lost:
                        
                            r15 = r26;
                            r6 = r27;
                            r0 = r3;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:55:0x0149, code lost:
                        
                            if (r0 == null) goto L82;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:56:0x014b, code lost:
                        
                            kotlin.jvm.internal.r.b(r5);
                            c9.y1.b(r2, r0, r15, r6, r5);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:57:0x0151, code lost:
                        
                            r2.Q0().f24180a.f(-r7, -r31);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:58:0x0160, code lost:
                        
                            t.r.a(r28, r29);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:59:0x0169, code lost:
                        
                            return pg.f0.f21461a;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:60:0x016a, code lost:
                        
                            r0 = th;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
                        
                            r9 = r28;
                            r14 = r29;
                         */
                        @Override // eh.l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj4) throws Throwable {
                            long j10;
                            a.b bVar;
                            float f10;
                            float f11;
                            float f12;
                            long j11;
                            float f13;
                            a.b bVar2;
                            float f14;
                            float f15;
                            s1.e Canvas = (s1.e) obj4;
                            kotlin.jvm.internal.r.e(Canvas, "$this$Canvas");
                            b bVar3 = page;
                            int i18 = bVar3.f5062f;
                            int i19 = 0;
                            boolean z10 = i18 % 180 != 0;
                            long jI = Canvas.i();
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (z10 ? jI & BodyPartID.bodyIdMax : jI >> 32));
                            long jI2 = Canvas.i();
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (z10 ? jI2 >> 32 : jI2 & BodyPartID.bodyIdMax));
                            float f16 = i18;
                            long jH1 = Canvas.h1();
                            a.b bVarQ0 = Canvas.Q0();
                            long jD = bVarQ0.d();
                            bVarQ0.a().d();
                            try {
                                bVarQ0.f24180a.d(f16, jH1);
                                float f17 = 2;
                                float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (Canvas.i() >> 32)) - fIntBitsToFloat) / f17;
                                float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (Canvas.i() & BodyPartID.bodyIdMax)) - fIntBitsToFloat2) / f17;
                                Canvas.Q0().f24180a.f(fIntBitsToFloat3, fIntBitsToFloat4);
                                float f18 = fIntBitsToFloat3;
                                try {
                                    j10 = jD;
                                    try {
                                        s1.e.X0(Canvas, q1.b1.f21650d, 0L, (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), CropImageView.DEFAULT_ASPECT_RATIO, null, 122);
                                        q1.n1 n1Var2 = n1Var;
                                        if (n1Var2 != null) {
                                            int i20 = (int) fIntBitsToFloat;
                                            if (i20 < 1) {
                                                i20 = 1;
                                            }
                                            f13 = fIntBitsToFloat4;
                                            f11 = fIntBitsToFloat;
                                            f12 = fIntBitsToFloat2;
                                            bVar2 = bVarQ0;
                                            j11 = j10;
                                            try {
                                                s1.e.e1(Canvas, n1Var2, 0L, 0L, 0L, (i20 << 32) | ((((int) fIntBitsToFloat2) >= 1 ? r6 : 1) & BodyPartID.bodyIdMax), CropImageView.DEFAULT_ASPECT_RATIO, null, null, 0, 0, DescriptorProtos.Edition.EDITION_PROTO2_VALUE);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                bVar = bVar2;
                                                j10 = j11;
                                                f10 = f13;
                                                f18 = f18;
                                                try {
                                                    Canvas.Q0().f24180a.f(-f18, -f10);
                                                    throw th;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    t.r.a(bVar, j10);
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            f11 = fIntBitsToFloat;
                                            f12 = fIntBitsToFloat2;
                                            j11 = j10;
                                            f13 = fIntBitsToFloat4;
                                            bVar2 = bVarQ0;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        f10 = fIntBitsToFloat4;
                                        bVar = bVarQ0;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    j10 = jD;
                                    bVar = bVarQ0;
                                    f10 = fIntBitsToFloat4;
                                }
                                try {
                                    Iterator<T> it = bVar3.f5063g.iterator();
                                    while (true) {
                                        int i21 = i19;
                                        boolean zHasNext = it.hasNext();
                                        Typeface typeface2 = typeface;
                                        if (!zHasNext) {
                                            break;
                                        }
                                        Object next = it.next();
                                        i19 = i21 + 1;
                                        if (i21 < 0) {
                                            qg.p.o();
                                            throw null;
                                        }
                                        v1 v1Var = (v1) next;
                                        if (i21 != i15) {
                                            kotlin.jvm.internal.r.b(typeface2);
                                            f14 = f11;
                                            f15 = f12;
                                            y1.b(Canvas, v1Var, f14, f15, typeface2);
                                        } else {
                                            f14 = f11;
                                            f15 = f12;
                                        }
                                        f12 = f15;
                                        f11 = f14;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    f18 = f18;
                                    bVar = bVar2;
                                    j10 = j11;
                                    f10 = f13;
                                    Canvas.Q0().f24180a.f(-f18, -f10);
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                j10 = jD;
                                bVar = bVarQ0;
                            }
                        }
                    };
                    kVarP.C(obj32);
                    objG3 = obj32;
                    kVarP.T(false);
                    t.w.a(dVar, (eh.l) objG3, kVarP, (i14 >> 6) & 14);
                    eVar2 = eVar3;
                    i16 = -1;
                }
            }
        }
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    public static final void b(s1.e eVar, v1 v1Var, float f10, float f11, Typeface typeface) {
        int i10 = 0;
        if (!(v1Var instanceof e)) {
            if (!(v1Var instanceof z1)) {
                throw new pg.l();
            }
            z1 z1Var = (z1) v1Var;
            float f12 = z1Var.f5336e * f10;
            Paint paint = new Paint(1);
            paint.setTypeface(typeface);
            paint.setTextSize(f12);
            paint.setColor(z1Var.f5335d);
            Canvas canvasA = q1.c0.a(eVar.Q0().a());
            canvasA.save();
            canvasA.translate(z1Var.f5332a * f10, z1Var.f5333b * f11);
            canvasA.rotate(z1Var.f5337f);
            for (Object obj : mh.x.E(z1Var.f5334c)) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    qg.p.o();
                    throw null;
                }
                canvasA.drawText((String) obj, CropImageView.DEFAULT_ASPECT_RATIO, ((i10 * 1.2f) + 0.905f) * f12, paint);
                i10 = i11;
            }
            canvasA.restore();
            return;
        }
        e eVar2 = (e) v1Var;
        boolean z10 = eVar2.f5087d;
        float[] fArr = eVar2.f5084a;
        int length = fArr.length / 2;
        if (length == 0) {
            return;
        }
        long jB = c2.n0.b(eVar2.f5085b);
        if (z10) {
            jB = q1.b1.c(0.38f, jB);
        }
        long j10 = jB;
        float f13 = eVar2.f5086c * f10;
        float f14 = f13 < 1.0f ? 1.0f : f13;
        if (length == 1) {
            float f15 = f14 / 2;
            float f16 = fArr[0] * f10;
            s1.e.f0(eVar, j10, f15, (Float.floatToRawIntBits(fArr[1] * f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f16) << 32), null, z10 ? 24 : 3, 56);
            return;
        }
        q1.j0 j0VarA = q1.l0.a();
        j0VarA.l(fArr[0] * f10, fArr[1] * f11);
        int i12 = length - 1;
        for (int i13 = 1; i13 < i12; i13++) {
            int i14 = i13 * 2;
            float f17 = fArr[i14];
            float f18 = fArr[i14 + 1];
            float f19 = 2;
            j0VarA.i(f17 * f10, f18 * f11, ((f17 + fArr[i14 + 2]) / f19) * f10, ((f18 + fArr[i14 + 3]) / f19) * f11);
        }
        int i15 = length * 2;
        j0VarA.p(fArr[i15 - 2] * f10, fArr[i15 - 1] * f11);
        s1.e.P0(eVar, j0VarA, j10, new s1.i(f14, CropImageView.DEFAULT_ASPECT_RATIO, 1, 1, 18), z10 ? 24 : 3, 20);
    }
}
