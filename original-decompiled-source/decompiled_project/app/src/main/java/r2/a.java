package r2;

import java.util.Arrays;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long[] f23142a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f23143b;

    /* renamed from: c, reason: collision with root package name */
    public int f23144c;

    public static void a(a aVar, int i10, int i11, int i12, int i13, int i14, int i15) {
        long[] jArr = aVar.f23142a;
        int i16 = aVar.f23144c;
        int i17 = i16 + 3;
        aVar.f23144c = i17;
        int length = jArr.length;
        if (length <= i17) {
            int iMax = Math.max(length * 2, i17);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            r.d(jArrCopyOf, "copyOf(...)");
            aVar.f23142a = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf(aVar.f23143b, iMax);
            r.d(jArrCopyOf2, "copyOf(...)");
            aVar.f23143b = jArrCopyOf2;
        }
        long[] jArr2 = aVar.f23142a;
        jArr2[i16] = (i11 << 32) | (i12 & BodyPartID.bodyIdMax);
        jArr2[i16 + 1] = (i14 & BodyPartID.bodyIdMax) | (i13 << 32);
        int i18 = i15 & 67108863;
        jArr2[i16 + 2] = (0 << 63) | (0 << 62) | (1 << 61) | (0 << 52) | (i18 << 26) | (i10 & 67108863);
        if (i15 < 0) {
            return;
        }
        for (int i19 = i16 - 3; i19 >= 0; i19 -= 3) {
            int i20 = i19 + 2;
            long j10 = jArr2[i20];
            if ((((int) j10) & 67108863) == i18) {
                jArr2[i20] = (j10 & (-2301339409586323457L)) | (((i16 - i19) & 511) << 52);
                return;
            }
        }
    }

    public final void b(int i10, eh.r rVar) {
        int i11 = i10 & 67108863;
        long[] jArr = this.f23142a;
        int i12 = this.f23144c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & 67108863) == i11) {
                long j10 = jArr[i13];
                long j11 = jArr[i13 + 1];
                rVar.f(Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
                return;
            }
        }
    }
}
