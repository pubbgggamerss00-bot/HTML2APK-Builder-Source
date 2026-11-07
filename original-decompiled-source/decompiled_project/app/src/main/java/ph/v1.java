package ph;

import java.util.Arrays;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmc.BodyPartID;
import ph.s1;

/* loaded from: classes2.dex */
public final class v1 {
    public static u1 a() {
        return new u1(null);
    }

    public static final void b(tg.h hVar, CancellationException cancellationException) {
        s1 s1Var = (s1) hVar.get(s1.a.f21589a);
        if (s1Var != null) {
            s1Var.cancel(cancellationException);
        }
    }

    public static final Object c(s1 s1Var, vg.i iVar) {
        s1Var.cancel((CancellationException) null);
        Object objJoin = s1Var.join(iVar);
        return objJoin == ug.a.f29706a ? objJoin : pg.f0.f21461a;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jI = i(0, bArr) & 67108863;
        int i10 = 3;
        long jI2 = (i(3, bArr) >> 2) & 67108611;
        long jI3 = (i(6, bArr) >> 4) & 67092735;
        long jI4 = (i(9, bArr) >> 6) & 66076671;
        long jI5 = (i(12, bArr) >> 8) & 1048575;
        long j10 = jI2 * 5;
        long j11 = jI3 * 5;
        long j12 = jI4 * 5;
        long j13 = jI5 * 5;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        int i11 = 0;
        while (i11 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jI6 = j18 + (i(0, bArr3) & 67108863);
            long jI7 = j14 + ((i(i10, bArr3) >> 2) & 67108863);
            long jI8 = j15 + ((i(6, bArr3) >> 4) & 67108863);
            long jI9 = j16 + ((i(9, bArr3) >> 6) & 67108863);
            long j19 = jI2;
            long jI10 = j17 + (((i(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j20 = (jI10 * j10) + (jI9 * j11) + (jI8 * j12) + (jI7 * j13) + (jI6 * jI);
            long j21 = (jI10 * j11) + (jI9 * j12) + (jI8 * j13) + (jI7 * jI) + (jI6 * j19);
            long j22 = (jI10 * j12) + (jI9 * j13) + (jI8 * jI) + (jI7 * j19) + (jI6 * jI3);
            long j23 = (jI10 * j13) + (jI9 * jI) + (jI8 * j19) + (jI7 * jI3) + (jI6 * jI4);
            long j24 = jI9 * j19;
            long j25 = jI10 * jI;
            long j26 = j21 + (j20 >> 26);
            long j27 = j22 + (j26 >> 26);
            long j28 = j23 + (j27 >> 26);
            long j29 = j25 + j24 + (jI8 * jI3) + (jI7 * jI4) + (jI6 * jI5) + (j28 >> 26);
            long j30 = j29 >> 26;
            j17 = j29 & 67108863;
            long j31 = (j30 * 5) + (j20 & 67108863);
            i11 += 16;
            j15 = j27 & 67108863;
            j16 = j28 & 67108863;
            j18 = j31 & 67108863;
            j14 = (j26 & 67108863) + (j31 >> 26);
            jI2 = j19;
            i10 = 3;
        }
        long j32 = j15 + (j14 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j16 + (j32 >> 26);
        long j35 = j34 & 67108863;
        long j36 = j17 + (j34 >> 26);
        long j37 = j36 & 67108863;
        long j38 = ((j36 >> 26) * 5) + j18;
        long j39 = j38 >> 26;
        long j40 = j38 & 67108863;
        long j41 = (j14 & 67108863) + j39;
        long j42 = j40 + 5;
        long j43 = j42 & 67108863;
        long j44 = j41 + (j42 >> 26);
        long j45 = j33 + (j44 >> 26);
        long j46 = j35 + (j45 >> 26);
        long j47 = j46 & 67108863;
        long j48 = (j37 + (j46 >> 26)) - 67108864;
        long j49 = j48 >> 63;
        long j50 = j40 & j49;
        long j51 = j41 & j49;
        long j52 = j33 & j49;
        long j53 = j35 & j49;
        long j54 = j37 & j49;
        long j55 = ~j49;
        long j56 = j51 | (j44 & 67108863 & j55);
        long j57 = j52 | (j45 & 67108863 & j55);
        long j58 = j53 | (j47 & j55);
        long j59 = (j50 | (j43 & j55) | (j56 << 26)) & BodyPartID.bodyIdMax;
        long j60 = ((j56 >> 6) | (j57 << 20)) & BodyPartID.bodyIdMax;
        long j61 = ((j57 >> 12) | (j58 << 14)) & BodyPartID.bodyIdMax;
        long j62 = ((j58 >> 18) | ((j54 | (j48 & j55)) << 8)) & BodyPartID.bodyIdMax;
        long jI11 = i(16, bArr) + j59;
        long j63 = jI11 & BodyPartID.bodyIdMax;
        long jI12 = i(20, bArr) + j60 + (jI11 >> 32);
        long j64 = jI12 & BodyPartID.bodyIdMax;
        long jI13 = i(24, bArr) + j61 + (jI12 >> 32);
        long j65 = jI13 & BodyPartID.bodyIdMax;
        long jI14 = (i(28, bArr) + j62 + (jI13 >> 32)) & BodyPartID.bodyIdMax;
        byte[] bArr4 = new byte[16];
        k(bArr4, j63, 0);
        k(bArr4, j64, 4);
        k(bArr4, j65, 8);
        k(bArr4, jI14, 12);
        return bArr4;
    }

    public static final void e(tg.h hVar) {
        s1 s1Var = (s1) hVar.get(s1.a.f21589a);
        if (s1Var != null && !s1Var.isActive()) {
            throw s1Var.getCancellationException();
        }
    }

    public static final s1 f(tg.h hVar) {
        s1 s1Var = (s1) hVar.get(s1.a.f21589a);
        if (s1Var != null) {
            return s1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static b1 g(s1 s1Var, x1 x1Var) {
        return s1Var instanceof y1 ? ((y1) s1Var).G(true, x1Var) : s1Var.invokeOnCompletion(x1Var.j(), true, new w1(1, x1Var, x1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final boolean h(tg.h hVar) {
        s1 s1Var = (s1) hVar.get(s1.a.f21589a);
        if (s1Var != null) {
            return s1Var.isActive();
        }
        return true;
    }

    public static long i(int i10, byte[] bArr) {
        return (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16)) & BodyPartID.bodyIdMax;
    }

    public static final void j(eh.p pVar, Object obj, x0.j jVar) {
        if (jVar.m() || !kotlin.jvm.internal.r.a(jVar.g(), obj)) {
            jVar.C(obj);
            jVar.J(obj, pVar);
        }
    }

    public static void k(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }
}
