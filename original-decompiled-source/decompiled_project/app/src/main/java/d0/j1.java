package d0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class j1 extends kotlin.jvm.internal.s implements eh.l<s.k<Float, s.o>, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1 f7157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7159c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.d0 f7160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b0 f7161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f7162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f7163g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f7164h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7165j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7166k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<s.n<Float, s.o>> f7167l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(h1 h1Var, int i10, float f10, kotlin.jvm.internal.d0 d0Var, kotlin.jvm.internal.b0 b0Var, boolean z10, float f11, kotlin.jvm.internal.e0 e0Var, int i11, int i12, kotlin.jvm.internal.g0<s.n<Float, s.o>> g0Var) {
        super(1);
        this.f7157a = h1Var;
        this.f7158b = i10;
        this.f7159c = f10;
        this.f7160d = d0Var;
        this.f7161e = b0Var;
        this.f7162f = z10;
        this.f7163g = f11;
        this.f7164h = e0Var;
        this.f7165j = i11;
        this.f7166k = i12;
        this.f7167l = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r2
      0x002b: PHI (r2v16 float) = (r2v7 float), (r2v20 float) binds: [B:11:0x003b, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // eh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 invoke(s.k<Float, s.o> kVar) {
        float fFloatValue;
        float f10;
        float fE;
        s.k<Float, s.o> kVar2 = kVar;
        h1 h1Var = this.f7157a;
        int i10 = this.f7158b;
        boolean zC = l1.c(h1Var, i10);
        kotlin.jvm.internal.b0 b0Var = this.f7161e;
        int i11 = this.f7166k;
        boolean z10 = this.f7162f;
        if (!zC) {
            float f11 = this.f7159c;
            if (f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
                fFloatValue = ((Number) kVar2.f23791e.getValue()).floatValue();
                if (fFloatValue <= f11) {
                    f11 = fFloatValue;
                }
                kotlin.jvm.internal.d0 d0Var = this.f7160d;
                f10 = f11 - d0Var.f16322a;
                fE = h1Var.e(f10);
                if (!l1.c(h1Var, i10) && !l1.a(z10, h1Var, i10, i11)) {
                    if (f10 != fE) {
                        d0Var.f16322a += f10;
                        float f12 = this.f7163g;
                        if (z10) {
                            if (((Number) kVar2.f23791e.getValue()).floatValue() > f12) {
                                kVar2.a();
                            }
                        } else if (((Number) kVar2.f23791e.getValue()).floatValue() < (-f12)) {
                            kVar2.a();
                        }
                        int i12 = this.f7165j;
                        kotlin.jvm.internal.e0 e0Var = this.f7164h;
                        if (z10) {
                            if (e0Var.f16324a >= 2 && i10 - h1Var.a() > i12) {
                                h1Var.b(i10 - i12, 0);
                            }
                        } else if (e0Var.f16324a >= 2 && h1Var.f() - i10 > i12) {
                            h1Var.b(i12 + i10, 0);
                        }
                        if (!l1.a(z10, h1Var, i10, i11)) {
                            h1Var.b(i10, i11);
                            b0Var.f16318a = false;
                            kVar2.a();
                        } else if (l1.c(h1Var, i10)) {
                            throw new i(h1Var.d(i10), this.f7167l.f16327a);
                        }
                    } else {
                        kVar2.a();
                        b0Var.f16318a = false;
                    }
                } else if (!l1.a(z10, h1Var, i10, i11)) {
                }
            } else {
                fFloatValue = ((Number) kVar2.f23791e.getValue()).floatValue();
                if (fFloatValue >= f11) {
                }
                kotlin.jvm.internal.d0 d0Var2 = this.f7160d;
                f10 = f11 - d0Var2.f16322a;
                fE = h1Var.e(f10);
                if (!l1.c(h1Var, i10)) {
                    if (f10 != fE) {
                    }
                }
            }
        }
        return pg.f0.f21461a;
    }
}
