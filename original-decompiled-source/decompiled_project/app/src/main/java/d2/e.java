package d2;

import c2.b0;
import c2.s;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import qg.m;
import qg.z;

/* loaded from: classes.dex */
public final class e {
    public static final void a(d dVar, b0 b0Var) {
        c cVar = dVar.f7335b;
        c cVar2 = dVar.f7334a;
        boolean zA = s.a(b0Var);
        long j10 = b0Var.f4594b;
        if (zA) {
            a[] aVarArr = cVar2.f7326d;
            m.m(aVarArr, 0, aVarArr.length, null);
            cVar2.f7327e = 0;
            a[] aVarArr2 = cVar.f7326d;
            m.m(aVarArr2, 0, aVarArr2.length, null);
            cVar.f7327e = 0;
            dVar.f7336c = 0L;
        }
        if (!s.c(b0Var)) {
            List list = b0Var.f4603k;
            if (list == null) {
                list = z.f22752a;
            }
            int i10 = 0;
            for (int size = list.size(); i10 < size; size = size) {
                c2.e eVar = (c2.e) list.get(i10);
                long j11 = eVar.f4615a;
                long j12 = eVar.f4617c;
                cVar2.a(Float.intBitsToFloat((int) (j12 >> 32)), j11);
                cVar.a(Float.intBitsToFloat((int) (j12 & BodyPartID.bodyIdMax)), j11);
                i10++;
            }
            long j13 = b0Var.f4604l;
            cVar2.a(Float.intBitsToFloat((int) (j13 >> 32)), j10);
            cVar.a(Float.intBitsToFloat((int) (j13 & BodyPartID.bodyIdMax)), j10);
        }
        if (s.c(b0Var) && j10 - dVar.f7336c > 40) {
            a[] aVarArr3 = cVar2.f7326d;
            m.m(aVarArr3, 0, aVarArr3.length, null);
            cVar2.f7327e = 0;
            a[] aVarArr4 = cVar.f7326d;
            m.m(aVarArr4, 0, aVarArr4.length, null);
            cVar.f7327e = 0;
            dVar.f7336c = 0L;
        }
        dVar.f7336c = j10;
    }

    public static final float b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    public static final void c(float[] fArr, float[] fArr2, int i10, float[] fArr3) {
        if (i10 == 0) {
            f2.a.a("At least one point must be provided");
        }
        int i11 = 2 >= i10 ? i10 - 1 : 2;
        int i12 = i11 + 1;
        float[][] fArr4 = new float[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            fArr4[i13] = new float[i10];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            fArr4[0][i14] = 1.0f;
            for (int i15 = 1; i15 < i12; i15++) {
                fArr4[i15][i14] = fArr4[i15 - 1][i14] * fArr[i14];
            }
        }
        float[][] fArr5 = new float[i12][];
        for (int i16 = 0; i16 < i12; i16++) {
            fArr5[i16] = new float[i10];
        }
        float[][] fArr6 = new float[i12][];
        for (int i17 = 0; i17 < i12; i17++) {
            fArr6[i17] = new float[i12];
        }
        int i18 = 0;
        while (i18 < i12) {
            float[] destination = fArr5[i18];
            float[] fArr7 = fArr4[i18];
            r.e(fArr7, "<this>");
            r.e(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i10);
            for (int i19 = 0; i19 < i18; i19++) {
                float[] fArr8 = fArr5[i19];
                float fB = b(destination, fArr8);
                for (int i20 = 0; i20 < i10; i20++) {
                    destination[i20] = destination[i20] - (fArr8[i20] * fB);
                }
            }
            float fSqrt = (float) Math.sqrt(b(destination, destination));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f10 = 1.0f / fSqrt;
            for (int i21 = 0; i21 < i10; i21++) {
                destination[i21] = destination[i21] * f10;
            }
            float[] fArr9 = fArr6[i18];
            int i22 = 0;
            while (i22 < i12) {
                fArr9[i22] = i22 < i18 ? CropImageView.DEFAULT_ASPECT_RATIO : b(destination, fArr4[i22]);
                i22++;
            }
            i18++;
        }
        for (int i23 = i11; -1 < i23; i23--) {
            float fB2 = b(fArr5[i23], fArr2);
            float[] fArr10 = fArr6[i23];
            int i24 = i23 + 1;
            if (i24 <= i11) {
                int i25 = i11;
                while (true) {
                    fB2 -= fArr10[i25] * fArr3[i25];
                    if (i25 != i24) {
                        i25--;
                    }
                }
            }
            fArr3[i23] = fB2 / fArr10[i23];
        }
    }
}
