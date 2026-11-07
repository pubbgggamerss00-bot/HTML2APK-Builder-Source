package s;

import com.yalantis.ucrop.view.CropImageView;
import r.a2;
import s.s;

/* loaded from: classes.dex */
public final class w2<V extends s> {

    /* renamed from: a, reason: collision with root package name */
    public final r.m2 f23972a;

    /* renamed from: b, reason: collision with root package name */
    public V f23973b;

    /* renamed from: c, reason: collision with root package name */
    public V f23974c;

    /* renamed from: d, reason: collision with root package name */
    public V f23975d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23976e = CropImageView.DEFAULT_ASPECT_RATIO;

    public w2(r.m2 m2Var) {
        this.f23972a = m2Var;
    }

    public final float a() {
        return this.f23976e;
    }

    public final V b(V v10, V v11) {
        if (this.f23975d == null) {
            this.f23975d = (V) v10.c();
        }
        V v12 = this.f23975d;
        if (v12 == null) {
            kotlin.jvm.internal.r.h("targetVector");
            throw null;
        }
        int i10 = 0;
        for (int iB = v12.b(); i10 < iB; iB = iB) {
            V v13 = this.f23975d;
            if (v13 == null) {
                kotlin.jvm.internal.r.h("targetVector");
                throw null;
            }
            float fA = v10.a(i10);
            float fA2 = v11.a(i10);
            r.a2 a2Var = this.f23972a.f22887a;
            double dB = a2Var.b(fA2);
            double d10 = r.b2.f22787a;
            float f10 = a2Var.f22777a * a2Var.f22779c;
            v13.e((Math.signum(fA2) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * dB) * f10))) + fA, i10);
            i10++;
        }
        V v14 = this.f23975d;
        if (v14 != null) {
            return v14;
        }
        kotlin.jvm.internal.r.h("targetVector");
        throw null;
    }

    public final V c(long j10, V v10, V v11) {
        if (this.f23974c == null) {
            this.f23974c = (V) v10.c();
        }
        V v12 = this.f23974c;
        if (v12 == null) {
            kotlin.jvm.internal.r.h("velocityVector");
            throw null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = this.f23974c;
            if (v13 == null) {
                kotlin.jvm.internal.r.h("velocityVector");
                throw null;
            }
            v10.getClass();
            long j11 = j10 / 1000000;
            a2.a aVarA = this.f23972a.f22887a.a(v11.a(i10));
            long j12 = aVarA.f22782c;
            v13.e((((Math.signum(aVarA.f22780a) * r.a.a(j12 > 0 ? j11 / j12 : 1.0f).f22766b) * aVarA.f22781b) / j12) * 1000.0f, i10);
        }
        V v14 = this.f23974c;
        if (v14 != null) {
            return v14;
        }
        kotlin.jvm.internal.r.h("velocityVector");
        throw null;
    }
}
