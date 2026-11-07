package g3;

import com.yalantis.ucrop.view.CropImageView;
import f3.l;
import p.c1;
import p.d1;
import pg.f0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f11461a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile c1<a> f11462b = new c1<>(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f11463c;

    static {
        Object[] objArr = new Object[0];
        f11463c = objArr;
        synchronized (objArr) {
            f11462b.e((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f11462b.e((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f11462b.e((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f11462b.e((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f11462b.e((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            f0 f0Var = f0.f21461a;
        }
        if ((f11462b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        l.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f10) {
        float fD;
        a aVarG;
        float[] fArr = f11461a;
        if (f10 < 1.03f) {
            return null;
        }
        int i10 = (int) (f10 * 100.0f);
        a aVarC = f11462b.c(i10);
        if (aVarC != null) {
            return aVarC;
        }
        c1<a> c1Var = f11462b;
        if (c1Var.f20582a) {
            d1.a(c1Var);
        }
        int iA = q.a.a(c1Var.f20585d, i10, c1Var.f20583b);
        if (iA >= 0) {
            return f11462b.g(iA);
        }
        int i11 = -(iA + 1);
        int i12 = i11 - 1;
        if (i11 >= f11462b.f()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f10});
            b(f10, cVar);
            return cVar;
        }
        if (i12 < 0) {
            aVarG = new c(fArr, fArr);
            fD = 1.0f;
        } else {
            fD = f11462b.d(i12) / 100.0f;
            aVarG = f11462b.g(i12);
        }
        float fD2 = f11462b.d(i11) / 100.0f;
        float fMax = (Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(1.0f, fD == fD2 ? 0.0f : (f10 - fD) / (fD2 - fD))) * 1.0f) + CropImageView.DEFAULT_ASPECT_RATIO;
        a aVarG2 = f11462b.g(i11);
        float[] fArr2 = new float[9];
        for (int i13 = 0; i13 < 9; i13++) {
            float f11 = fArr[i13];
            float fB = aVarG.b(f11);
            fArr2[i13] = ((aVarG2.b(f11) - fB) * fMax) + fB;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f10, cVar2);
        return cVar2;
    }

    public static void b(float f10, c cVar) {
        synchronized (f11463c) {
            c1<a> c1VarClone = f11462b.clone();
            c1VarClone.e((int) (f10 * 100.0f), cVar);
            f11462b = c1VarClone;
            f0 f0Var = f0.f21461a;
        }
    }
}
