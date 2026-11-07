package t0;

import com.yalantis.ucrop.view.CropImageView;
import s1.a;

/* loaded from: classes.dex */
public final class v9 extends kotlin.jvm.internal.s implements eh.l<s1.c, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0.x0 f27232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.f1 f27233b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27234a;

        static {
            int[] iArr = new int[f3.r.values().length];
            try {
                f3.r rVar = f3.r.f8828a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f27234a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(u0.x0 x0Var, z.f1 f1Var) {
        super(1);
        this.f27232a = x0Var;
        this.f27233b = f1Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(s1.c cVar) {
        s1.c cVar2 = cVar;
        long j10 = ((p1.h) this.f27232a.get()).f21143a;
        float fD = p1.h.d(j10);
        float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (fD > CropImageView.DEFAULT_ASPECT_RATIO) {
            float fN0 = cVar2.N0(w9.f27292a);
            float fN02 = cVar2.N0(this.f27233b.b(cVar2.getLayoutDirection())) - fN0;
            float f11 = 2;
            float f12 = (fN0 * f11) + fD + fN02;
            f3.r layoutDirection = cVar2.getLayoutDirection();
            int[] iArr = a.f27234a;
            float fD2 = iArr[layoutDirection.ordinal()] == 1 ? p1.h.d(cVar2.i()) - f12 : fN02 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : fN02;
            if (iArr[cVar2.getLayoutDirection().ordinal()] == 1) {
                float fD3 = p1.h.d(cVar2.i());
                if (fN02 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    f10 = fN02;
                }
                f12 = fD3 - f10;
            }
            float f13 = f12;
            float fB = p1.h.b(j10);
            float f14 = (-fB) / f11;
            float f15 = fB / f11;
            a.b bVarQ0 = cVar2.Q0();
            long jD = bVarQ0.d();
            bVarQ0.a().d();
            try {
                bVarQ0.f24180a.b(fD2, f14, f13, f15, 0);
                cVar2.z1();
            } finally {
                t.r.a(bVarQ0, jD);
            }
        } else {
            cVar2.z1();
        }
        return pg.f0.f21461a;
    }
}
