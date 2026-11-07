package t0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class pb extends kotlin.jvm.internal.s implements eh.l<s1.e, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hc f26722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26724c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f26727f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f26728g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eh.p<s1.e, p1.c, pg.f0> f26729h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ eh.q<s1.e, p1.c, q1.b1, pg.f0> f26730j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pb(hc hcVar, long j10, long j11, long j12, long j13, float f10, float f11, eh.p<? super s1.e, ? super p1.c, pg.f0> pVar, eh.q<? super s1.e, ? super p1.c, ? super q1.b1, pg.f0> qVar) {
        super(1);
        this.f26722a = hcVar;
        this.f26723b = j10;
        this.f26724c = j11;
        this.f26725d = j12;
        this.f26726e = j13;
        this.f26727f = f10;
        this.f26728g = f11;
        this.f26729h = pVar;
        this.f26730j = qVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(s1.e eVar) {
        float fN0;
        float f10;
        float f11;
        eh.p<s1.e, p1.c, pg.f0> pVar;
        long j10;
        s1.e eVar2 = eVar;
        rb rbVar = rb.f26896a;
        hc hcVar = this.f26722a;
        float[] fArr = hcVar.f26020e;
        float fC = hcVar.c();
        float fV = eVar2.v(hcVar.f26023h.getFloatValue());
        float fU = eVar2.u(0);
        float fV2 = eVar2.v(hcVar.f26024i.getFloatValue());
        long jA = p1.d.a(CropImageView.DEFAULT_ASPECT_RATIO, p1.c.e(eVar2.h1()));
        long jA2 = p1.d.a(p1.h.d(eVar2.i()), p1.c.e(eVar2.h1()));
        float fN02 = eVar2.N0(fV);
        long jA3 = p1.d.a(((p1.c.d(jA2) - p1.c.d(jA)) * fC) + p1.c.d(jA), p1.c.e(eVar2.h1()));
        long jA4 = p1.d.a(((p1.c.d(jA2) - p1.c.d(jA)) * CropImageView.DEFAULT_ASPECT_RATIO) + p1.c.d(jA), p1.c.e(eVar2.h1()));
        float f12 = 2;
        float f13 = fN02 / f12;
        float fN03 = eVar2.N0(this.f26728g);
        float f14 = this.f26727f;
        if (Float.compare(f14, 0) > 0) {
            eVar2.N0(fU);
            eVar2.N0(f14);
            fN0 = eVar2.N0(f14) + (eVar2.N0(fV2) / f12);
        } else {
            fN0 = 0.0f;
        }
        float fD = p1.c.d(jA3);
        float fD2 = (p1.c.d(jA2) - fN0) - f13;
        eh.p<s1.e, p1.c, pg.f0> pVar2 = this.f26729h;
        if (fD < fD2) {
            float fD3 = p1.c.d(jA3) + fN0;
            float fD4 = p1.c.d(jA2);
            f10 = fN02;
            pVar = pVar2;
            f11 = 0.0f;
            rb.e(eVar2, p1.d.a(fD3, CropImageView.DEFAULT_ASPECT_RATIO), d0.h.a(fD4 - fD3, fN02), this.f26723b, fN03, f13);
            fN03 = fN03;
            f13 = f13;
            if (pVar != null) {
                pVar.invoke(eVar2, new p1.c(p1.d.a(fD4 - f13, p1.c.e(eVar2.h1()))));
            }
        } else {
            f10 = fN02;
            f11 = 0.0f;
            pVar = pVar2;
        }
        float fD5 = (p1.c.d(jA3) - fN0) - f11;
        if (fD5 > f13) {
            float f15 = f11;
            rb.e(eVar2, p1.d.a(f15, f15), d0.h.a(fD5, f10), this.f26724c, f13, fN03);
        }
        long jA5 = p1.d.a(p1.c.d(jA) + f13, p1.c.e(jA));
        long jA6 = p1.d.a(p1.c.d(jA2) - f13, p1.c.e(jA2));
        p1.c.d(jA4);
        p1.c.d(jA4);
        float fD6 = p1.c.d(jA3) - fN0;
        float fD7 = p1.c.d(jA3) + fN0;
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            float f16 = fArr[i10];
            int i12 = i11 + 1;
            boolean z10 = true;
            float f17 = fD6;
            if (pVar == null || i11 != fArr.length - 1) {
                if (f16 <= fC && f16 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    z10 = false;
                }
                j10 = jA5;
                long jA7 = p1.d.a(p1.c.d(p1.d.c(jA5, jA6, f16)), p1.c.e(eVar2.h1()));
                float fD8 = p1.c.d(jA7);
                if (fD8 < f17 || fD8 > fD7) {
                    this.f26730j.b(eVar2, new p1.c(jA7), new q1.b1(z10 ? this.f26725d : this.f26726e));
                }
            } else {
                j10 = jA5;
            }
            i10++;
            i11 = i12;
            fD6 = f17;
            jA5 = j10;
        }
        return pg.f0.f21461a;
    }
}
