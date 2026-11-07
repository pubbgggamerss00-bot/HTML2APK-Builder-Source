package t2;

import android.text.Layout;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.s implements eh.l<o, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f27833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float[] f27834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f27835c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.d0 f27836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j10, float[] fArr, kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.d0 d0Var) {
        super(1);
        this.f27833a = j10;
        this.f27834b = fArr;
        this.f27835c = e0Var;
        this.f27836d = d0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(o oVar) {
        long j10;
        a aVar;
        boolean z10;
        float fA;
        float fA2;
        o oVar2 = oVar;
        int i10 = oVar2.f27865b;
        a aVar2 = oVar2.f27864a;
        int iD = oVar2.f27866c;
        long j11 = this.f27833a;
        int iE = i10 > j0.e(j11) ? oVar2.f27865b : j0.e(j11);
        if (iD >= j0.d(j11)) {
            iD = j0.d(j11);
        }
        long jA = k0.a(oVar2.d(iE), oVar2.d(iD));
        kotlin.jvm.internal.e0 e0Var = this.f27835c;
        int i11 = e0Var.f16324a;
        u2.j0 j0Var = aVar2.f27747d;
        int iE2 = j0.e(jA);
        int iD2 = j0.d(jA);
        Layout layout = j0Var.f29206f;
        int length = layout.getText().length();
        if (iE2 < 0) {
            z2.a.a("startOffset must be > 0");
        }
        if (iE2 >= length) {
            z2.a.a("startOffset must be less than text length");
        }
        if (iD2 <= iE2) {
            z2.a.a("endOffset must be greater than startOffset");
        }
        if (iD2 > length) {
            z2.a.a("endOffset must be smaller or equal to text length");
        }
        int i12 = (iD2 - iE2) * 4;
        float[] fArr = this.f27834b;
        if (fArr.length - i11 < i12) {
            z2.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = layout.getLineForOffset(iE2);
        int lineForOffset2 = layout.getLineForOffset(iD2 - 1);
        u2.r rVar = new u2.r(j0Var);
        if (lineForOffset <= lineForOffset2) {
            while (true) {
                int lineStart = layout.getLineStart(lineForOffset);
                int iF = j0Var.f(lineForOffset);
                int iMax = Math.max(iE2, lineStart);
                int iMin = Math.min(iD2, iF);
                float fG = j0Var.g(lineForOffset);
                float fE = j0Var.e(lineForOffset);
                j10 = jA;
                aVar = aVar2;
                boolean z11 = false;
                boolean z12 = layout.getParagraphDirection(lineForOffset) == 1;
                while (iMax < iMin) {
                    boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                    if (!z12 || zIsRtlCharAt) {
                        if (z12 && zIsRtlCharAt) {
                            z11 = false;
                            float fA3 = rVar.a(iMax, false, false, false);
                            z10 = z12;
                            fA = rVar.a(iMax + 1, true, true, false);
                            fA2 = fA3;
                        } else {
                            z10 = z12;
                            z11 = false;
                            if (z10 || !zIsRtlCharAt) {
                                fA = rVar.a(iMax, false, false, false);
                                fA2 = rVar.a(iMax + 1, true, true, false);
                            } else {
                                fA2 = rVar.a(iMax, false, false, true);
                                fA = rVar.a(iMax + 1, true, true, true);
                            }
                        }
                        fArr[i11] = fA;
                        fArr[i11 + 1] = fG;
                        fArr[i11 + 2] = fA2;
                        fArr[i11 + 3] = fE;
                        i11 += 4;
                        iMax++;
                        z12 = z10;
                    } else {
                        fA = rVar.a(iMax, z11, z11, true);
                        z10 = z12;
                        fA2 = rVar.a(iMax + 1, true, true, true);
                    }
                    z11 = false;
                    fArr[i11] = fA;
                    fArr[i11 + 1] = fG;
                    fArr[i11 + 2] = fA2;
                    fArr[i11 + 3] = fE;
                    i11 += 4;
                    iMax++;
                    z12 = z10;
                }
                if (lineForOffset == lineForOffset2) {
                    break;
                }
                lineForOffset++;
                aVar2 = aVar;
                jA = j10;
            }
        } else {
            j10 = jA;
            aVar = aVar2;
        }
        int iC = (j0.c(j10) * 4) + e0Var.f16324a;
        int i13 = e0Var.f16324a;
        while (true) {
            kotlin.jvm.internal.d0 d0Var = this.f27836d;
            if (i13 >= iC) {
                e0Var.f16324a = iC;
                d0Var.f16322a = aVar.d() + d0Var.f16322a;
                return pg.f0.f21461a;
            }
            int i14 = i13 + 1;
            float f10 = fArr[i14];
            float f11 = d0Var.f16322a;
            fArr[i14] = f10 + f11;
            int i15 = i13 + 3;
            fArr[i15] = fArr[i15] + f11;
            i13 += 4;
        }
    }
}
