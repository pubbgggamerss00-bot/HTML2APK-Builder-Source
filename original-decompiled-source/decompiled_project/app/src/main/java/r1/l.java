package r1;

import c2.n0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.b1;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final c f23100a;

    /* renamed from: b, reason: collision with root package name */
    public final c f23101b;

    /* renamed from: c, reason: collision with root package name */
    public final c f23102c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f23103d;

    public static final class a extends l {

        /* renamed from: e, reason: collision with root package name */
        public final z f23104e;

        /* renamed from: f, reason: collision with root package name */
        public final z f23105f;

        /* renamed from: g, reason: collision with root package name */
        public final float[] f23106g;

        public a(z zVar, z zVar2) {
            float[] fArrF;
            super(zVar2, zVar, zVar2, null);
            this.f23104e = zVar;
            this.f23105f = zVar2;
            float[] fArr = r1.a.f23056b.f23057a;
            b0 b0Var = zVar.f23126d;
            float[] fArr2 = zVar.f23131i;
            b0 b0Var2 = zVar2.f23126d;
            float[] fArr3 = zVar2.f23132j;
            if (d.c(b0Var, b0Var2)) {
                fArrF = d.f(fArr3, fArr2);
            } else {
                float[] fArrA = b0Var.a();
                float[] fArrA2 = b0Var2.a();
                b0 b0Var3 = o.f23109b;
                fArrF = d.f(d.c(b0Var2, b0Var3) ? fArr3 : d.e(d.f(d.b(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), zVar2.f23131i)), d.c(b0Var, b0Var3) ? fArr2 : d.f(d.b(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
            }
            this.f23106g = fArrF;
        }

        @Override // r1.l
        public final long a(long j10) {
            float fI = b1.i(j10);
            float fH = b1.h(j10);
            float f10 = b1.f(j10);
            float fE = b1.e(j10);
            r rVar = this.f23104e.f23138p;
            float fB = (float) rVar.b(fI);
            float fB2 = (float) rVar.b(fH);
            float fB3 = (float) rVar.b(f10);
            float[] fArr = this.f23106g;
            float f11 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
            float f12 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
            float f13 = (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
            z zVar = this.f23105f;
            float fB4 = (float) zVar.f23135m.b(f11);
            ld.d dVar = zVar.f23135m;
            return n0.a(fB4, (float) dVar.b(f12), (float) dVar.b(f13), fE, zVar);
        }
    }

    public l(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f23100a = cVar;
        this.f23101b = cVar2;
        this.f23102c = cVar3;
        this.f23103d = fArr;
    }

    public long a(long j10) {
        float fI = b1.i(j10);
        float fH = b1.h(j10);
        float f10 = b1.f(j10);
        float fE = b1.e(j10);
        c cVar = this.f23101b;
        long jE = cVar.e(fI, fH, f10);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & BodyPartID.bodyIdMax));
        float fG = cVar.g(fI, fH, f10);
        float[] fArr = this.f23103d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fG *= fArr[2];
        }
        float f11 = fIntBitsToFloat;
        float f12 = fIntBitsToFloat2;
        return this.f23102c.h(f11, f12, fG, fE, this.f23100a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(c cVar, c cVar2, int i10) {
        float[] fArr;
        long j10 = cVar.f23073b;
        long j11 = b.f23065a;
        c cVarA = b.a(j10, j11) ? d.a(cVar) : cVar;
        c cVarA2 = b.a(cVar2.f23073b, j11) ? d.a(cVar2) : cVar2;
        if (i10 == 3) {
            boolean zA = b.a(cVar.f23073b, j11);
            boolean zA2 = b.a(cVar2.f23073b, j11);
            if (!(zA && zA2) && (zA || zA2)) {
                b0 b0Var = ((z) (zA ? cVar : cVar2)).f23126d;
                float[] fArrA = o.f23112e;
                float[] fArrA2 = zA ? b0Var.a() : fArrA;
                fArrA = zA2 ? b0Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        }
        this(cVar2, cVarA, cVarA2, fArr);
    }
}
