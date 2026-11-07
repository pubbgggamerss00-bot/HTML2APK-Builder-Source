package j2;

import android.graphics.Outline;
import android.os.Build;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.s1;

/* loaded from: classes.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14846a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Outline f14847b;

    /* renamed from: c, reason: collision with root package name */
    public q1.s1 f14848c;

    /* renamed from: d, reason: collision with root package name */
    public q1.j0 f14849d;

    /* renamed from: e, reason: collision with root package name */
    public q1.u1 f14850e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14851f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14852g;

    /* renamed from: h, reason: collision with root package name */
    public q1.u1 f14853h;

    /* renamed from: i, reason: collision with root package name */
    public p1.g f14854i;

    /* renamed from: j, reason: collision with root package name */
    public float f14855j;

    /* renamed from: k, reason: collision with root package name */
    public long f14856k;

    /* renamed from: l, reason: collision with root package name */
    public long f14857l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14858m;

    public p3() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f14847b = outline;
        this.f14856k = 0L;
        this.f14857l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(q1.w0 w0Var) {
        e();
        q1.u1 u1Var = this.f14850e;
        if (u1Var != null) {
            w0Var.i(u1Var);
            return;
        }
        float f10 = this.f14855j;
        if (f10 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            w0Var.m(Float.intBitsToFloat((int) (this.f14856k >> 32)), Float.intBitsToFloat((int) (this.f14856k & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (this.f14857l >> 32)) + Float.intBitsToFloat((int) (this.f14856k >> 32)), Float.intBitsToFloat((int) (this.f14857l & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (this.f14856k & BodyPartID.bodyIdMax)), 1);
            return;
        }
        q1.u1 u1VarA = this.f14853h;
        p1.g gVar = this.f14854i;
        if (u1VarA != null) {
            long j10 = this.f14856k;
            long j11 = this.f14857l;
            if (gVar == null || !j1.l.b(gVar)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f14856k >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f14856k & BodyPartID.bodyIdMax));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f14857l >> 32)) + Float.intBitsToFloat((int) (this.f14856k >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.f14857l & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (this.f14856k & BodyPartID.bodyIdMax));
                float f11 = this.f14855j;
                p1.g gVarA = j1.l.a(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax));
                if (u1VarA == null) {
                    u1VarA = q1.l0.a();
                } else {
                    u1VarA.reset();
                }
                q1.u1.f(u1VarA, gVarA);
                this.f14854i = gVarA;
                this.f14853h = u1VarA;
            } else {
                int i10 = (int) (j10 >> 32);
                if (gVar.f21135a == Float.intBitsToFloat(i10)) {
                    float f12 = gVar.f21136b;
                    int i11 = (int) (j10 & BodyPartID.bodyIdMax);
                    if (f12 == Float.intBitsToFloat(i11)) {
                        if (gVar.f21137c == Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10)) {
                            if (gVar.f21138d != Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i11) || Float.intBitsToFloat((int) (gVar.f21139e >> 32)) != f10) {
                            }
                        }
                    }
                }
            }
        }
        w0Var.i(u1VarA);
    }

    public final Outline b() {
        e();
        if (this.f14858m && this.f14846a) {
            return this.f14847b;
        }
        return null;
    }

    public final boolean c(long j10) {
        q1.s1 s1Var;
        if (this.f14858m && (s1Var = this.f14848c) != null) {
            return y4.a(s1Var, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)));
        }
        return true;
    }

    public final boolean d(q1.s1 s1Var, float f10, boolean z10, float f11, long j10) {
        this.f14847b.setAlpha(f10);
        boolean zA = kotlin.jvm.internal.r.a(this.f14848c, s1Var);
        boolean z11 = !zA;
        if (!zA) {
            this.f14848c = s1Var;
            this.f14851f = true;
        }
        this.f14857l = j10;
        boolean z12 = s1Var != null && (z10 || f11 > CropImageView.DEFAULT_ASPECT_RATIO);
        if (this.f14858m != z12) {
            this.f14858m = z12;
            this.f14851f = true;
        }
        return z11;
    }

    public final void e() {
        if (this.f14851f) {
            this.f14856k = 0L;
            this.f14855j = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f14850e = null;
            this.f14851f = false;
            this.f14852g = false;
            q1.s1 s1Var = this.f14848c;
            Outline outline = this.f14847b;
            if (s1Var == null || !this.f14858m || Float.intBitsToFloat((int) (this.f14857l >> 32)) <= CropImageView.DEFAULT_ASPECT_RATIO || Float.intBitsToFloat((int) (this.f14857l & BodyPartID.bodyIdMax)) <= CropImageView.DEFAULT_ASPECT_RATIO) {
                outline.setEmpty();
                return;
            }
            this.f14846a = true;
            if (s1Var instanceof s1.b) {
                p1.e eVar = ((s1.b) s1Var).f21734a;
                float f10 = eVar.f21131a;
                float f11 = eVar.f21132b;
                this.f14856k = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax);
                float f12 = eVar.f21133c;
                float f13 = eVar.f21131a;
                float f14 = eVar.f21134d;
                this.f14857l = (Float.floatToRawIntBits(f14 - f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f12 - f13) << 32);
                outline.setRect(Math.round(f13), Math.round(f11), Math.round(f12), Math.round(f14));
                return;
            }
            if (!(s1Var instanceof s1.c)) {
                if (s1Var instanceof s1.a) {
                    f(((s1.a) s1Var).f21733a);
                    return;
                }
                return;
            }
            p1.g gVar = ((s1.c) s1Var).f21735a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar.f21139e >> 32));
            float f15 = gVar.f21135a;
            float f16 = gVar.f21136b;
            this.f14856k = (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f16) & BodyPartID.bodyIdMax);
            float fB = gVar.b();
            float fA = gVar.a();
            this.f14857l = (Float.floatToRawIntBits(fA) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fB) << 32);
            if (j1.l.b(gVar)) {
                this.f14847b.setRoundRect(Math.round(f15), Math.round(f16), Math.round(gVar.f21137c), Math.round(gVar.f21138d), fIntBitsToFloat);
                this.f14855j = fIntBitsToFloat;
                return;
            }
            q1.j0 j0VarA = this.f14849d;
            if (j0VarA == null) {
                j0VarA = q1.l0.a();
                this.f14849d = j0VarA;
            }
            j0VarA.reset();
            q1.u1.f(j0VarA, gVar);
            f(j0VarA);
        }
    }

    public final void f(q1.u1 u1Var) {
        int i10 = Build.VERSION.SDK_INT;
        Outline outline = this.f14847b;
        if (i10 > 28 || u1Var.b()) {
            if (i10 >= 30) {
                q3.f14867a.a(outline, u1Var);
            } else {
                if (!(u1Var instanceof q1.j0)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((q1.j0) u1Var).f21712a);
            }
            this.f14852g = !outline.canClip();
        } else {
            this.f14846a = false;
            outline.setEmpty();
            this.f14852g = true;
        }
        this.f14850e = u1Var;
    }
}
