package q8;

import com.yalantis.ucrop.view.CropImageView;
import f9.dd;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f22094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22096c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f22097d;

    public /* synthetic */ a1(float f10, boolean z10, long j10, float f11) {
        this.f22094a = f10;
        this.f22095b = z10;
        this.f22096c = j10;
        this.f22097d = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final Object invoke(Object obj) {
        boolean z10;
        float fL;
        n1.g drawWithCache = (n1.g) obj;
        kotlin.jvm.internal.r.e(drawWithCache, "$this$drawWithCache");
        float fL2 = jh.j.l(this.f22094a, CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (drawWithCache.f18310a.i() & BodyPartID.bodyIdMax)));
        pg.n[] nVarArr = new pg.n[17];
        int i10 = 0;
        while (true) {
            z10 = this.f22095b;
            if (i10 >= 17) {
                break;
            }
            float f10 = i10 / 16.0f;
            float f11 = z10 ? 1.0f - f10 : f10;
            nVarArr[i10] = new pg.n(Float.valueOf(f10), new q1.b1(q1.b1.c(f11 * f11, this.f22096c)));
            i10++;
        }
        pg.n[] nVarArr2 = (pg.n[]) Arrays.copyOf(nVarArr, 17);
        if (z10) {
            float f12 = fL2 - 1.0f;
            if (f12 < CropImageView.DEFAULT_ASPECT_RATIO) {
                f12 = 0.0f;
            }
            fL = jh.j.l(this.f22097d, CropImageView.DEFAULT_ASPECT_RATIO, f12);
        } else {
            fL = fL2;
        }
        if (!z10) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithCache.f18310a.i() & BodyPartID.bodyIdMax));
            fL2 += 1.0f;
            if (fIntBitsToFloat >= fL2) {
                fL2 = fIntBitsToFloat;
            }
        } else if (fL2 < 1.0f) {
            fL2 = 1.0f;
        }
        pg.n[] nVarArr3 = (pg.n[]) Arrays.copyOf(nVarArr2, nVarArr2.length);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32) | (Float.floatToRawIntBits(fL) & BodyPartID.bodyIdMax);
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(fL2));
        ArrayList arrayList = new ArrayList(nVarArr3.length);
        for (pg.n nVar : nVarArr3) {
            arrayList.add(new q1.b1(((q1.b1) nVar.f21470b).f21656a));
        }
        ArrayList arrayList2 = new ArrayList(nVarArr3.length);
        for (pg.n nVar2 : nVarArr3) {
            arrayList2.add(Float.valueOf(((Number) nVar2.f21469a).floatValue()));
        }
        return drawWithCache.m(new n1.f(new dd(new q1.q1(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2), 1)));
    }
}
