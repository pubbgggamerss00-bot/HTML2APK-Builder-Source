package t;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.f2;
import q1.i2;
import q1.s1;
import q1.u1;
import s1.a;

/* loaded from: classes.dex */
public final class u extends i2.m {

    /* renamed from: s, reason: collision with root package name */
    public l f25369s;

    /* renamed from: t, reason: collision with root package name */
    public float f25370t;

    /* renamed from: v, reason: collision with root package name */
    public q1.u0 f25371v;

    /* renamed from: w, reason: collision with root package name */
    public f2 f25372w;

    /* renamed from: x, reason: collision with root package name */
    public final n1.c f25373x;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<n1.g, n1.k> {
        public a() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01f4  */
        /* JADX WARN: Type inference failed for: r45v0, types: [T, q1.e0] */
        @Override // eh.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final n1.k invoke(n1.g gVar) {
            int i10;
            int i11;
            q1.p0 p0Var;
            boolean z10;
            long j10;
            n1.g gVar2 = gVar;
            u uVar = u.this;
            if (gVar2.getDensity() * uVar.f25370t < CropImageView.DEFAULT_ASPECT_RATIO || p1.h.c(gVar2.f18310a.i()) <= CropImageView.DEFAULT_ASPECT_RATIO) {
                return gVar2.m(m.f25295a);
            }
            float f10 = 2;
            float fMin = Math.min(f3.h.a(uVar.f25370t, CropImageView.DEFAULT_ASPECT_RATIO) ? 1.0f : (float) Math.ceil(gVar2.getDensity() * uVar.f25370t), (float) Math.ceil(p1.h.c(gVar2.f18310a.i()) / f10));
            float f11 = fMin / f10;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (gVar2.f18310a.i() & BodyPartID.bodyIdMax)) - fMin) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (gVar2.f18310a.i() >> 32)) - fMin) << 32);
            float f12 = fMin * f10;
            boolean z11 = f12 > p1.h.c(gVar2.f18310a.i());
            q1.s1 s1VarA = uVar.f25372w.a(gVar2.f18310a.i(), gVar2.f18310a.getLayoutDirection(), gVar2);
            if (!(s1VarA instanceof s1.a)) {
                if (!(s1VarA instanceof s1.c)) {
                    boolean z12 = z11;
                    if (s1VarA instanceof s1.b) {
                        return gVar2.m(new n(uVar.f25371v, z12 ? 0L : jFloatToRawIntBits, z12 ? gVar2.f18310a.i() : jFloatToRawIntBits2, z12 ? s1.h.f24186a : new s1.i(fMin, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 30)));
                    }
                    throw new pg.l();
                }
                q1.u0 u0Var = uVar.f25371v;
                p1.g gVar3 = ((s1.c) s1VarA).f21735a;
                if (j1.l.b(gVar3)) {
                    return gVar2.m(new s(z11, u0Var, gVar3.f21139e, f11, fMin, jFloatToRawIntBits, jFloatToRawIntBits2, new s1.i(fMin, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 30)));
                }
                boolean z13 = z11;
                if (uVar.f25369s == null) {
                    i10 = 0;
                    uVar.f25369s = new l(0);
                } else {
                    i10 = 0;
                }
                l lVar = uVar.f25369s;
                kotlin.jvm.internal.r.b(lVar);
                q1.j0 j0Var = lVar.f25292d;
                q1.j0 j0Var2 = j0Var;
                if (j0Var == null) {
                    q1.j0 j0VarA = q1.l0.a();
                    lVar.f25292d = j0VarA;
                    j0Var2 = j0VarA;
                }
                j0Var2.reset();
                q1.u1.f(j0Var2, gVar3);
                if (!z13) {
                    q1.u1 u1VarA = q1.l0.a();
                    q1.u1.f(u1VarA, new p1.g(fMin, fMin, gVar3.b() - fMin, gVar3.a() - fMin, o.c(fMin, gVar3.f21139e), o.c(fMin, gVar3.f21140f), o.c(fMin, gVar3.f21141g), o.c(fMin, gVar3.f21142h)));
                    j0Var2.q(j0Var2, u1VarA, i10);
                }
                return gVar2.m(new t(j0Var2, u0Var));
            }
            q1.u0 u0Var2 = uVar.f25371v;
            s1.a aVar = (s1.a) s1VarA;
            q1.u1 u1Var = aVar.f21733a;
            if (z11) {
                return gVar2.m(new p(aVar, u0Var2));
            }
            if (u0Var2 instanceof i2) {
                p0Var = new q1.p0(5, q1.b1.c(1.0f, ((i2) u0Var2).f21711a));
                i11 = 1;
            } else {
                i11 = 0;
                p0Var = null;
            }
            p1.e bounds = u1Var.getBounds();
            if (uVar.f25369s == null) {
                uVar.f25369s = new l(0);
            }
            l lVar2 = uVar.f25369s;
            kotlin.jvm.internal.r.b(lVar2);
            q1.j0 j0Var3 = lVar2.f25292d;
            q1.j0 j0Var4 = j0Var3;
            if (j0Var3 == null) {
                q1.j0 j0VarA2 = q1.l0.a();
                lVar2.f25292d = j0VarA2;
                j0Var4 = j0VarA2;
            }
            j0Var4.reset();
            u1.a aVar2 = u1.a.f21740a;
            j0Var4.getClass();
            u1.a aVar3 = u1.a.f21740a;
            float f13 = bounds.f21131a;
            float f14 = bounds.f21134d;
            float f15 = bounds.f21133c;
            float f16 = bounds.f21132b;
            if (Float.isNaN(f13) || Float.isNaN(f16) || Float.isNaN(f15) || Float.isNaN(f14)) {
                q1.l0.c("Invalid rectangle, make sure no value is NaN");
            }
            if (j0Var4.f21713b == null) {
                j0Var4.f21713b = new RectF();
            }
            RectF rectF = j0Var4.f21713b;
            kotlin.jvm.internal.r.b(rectF);
            rectF.set(bounds.f21131a, f16, f15, f14);
            Path path = j0Var4.f21712a;
            RectF rectF2 = j0Var4.f21713b;
            kotlin.jvm.internal.r.b(rectF2);
            path.addRect(rectF2, q1.l0.b(aVar3));
            j0Var4.q(j0Var4, u1Var, 0);
            kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
            float f17 = bounds.f21133c;
            float f18 = bounds.f21132b;
            float f19 = bounds.f21131a;
            long jCeil = ((int) Math.ceil(f17 - f19)) << 32;
            q1.p0 p0Var2 = p0Var;
            long jCeil2 = (((int) Math.ceil(bounds.f21134d - f18)) & BodyPartID.bodyIdMax) | jCeil;
            l lVar3 = uVar.f25369s;
            kotlin.jvm.internal.r.b(lVar3);
            q1.e0 e0VarA = lVar3.f25289a;
            q1.b0 b0VarA = lVar3.f25290b;
            q1.o1 o1Var = e0VarA != null ? new q1.o1(e0VarA.b()) : null;
            if (o1Var != null && o1Var.f21722a == 0) {
                z10 = true;
            } else {
                q1.o1 o1Var2 = e0VarA != null ? new q1.o1(e0VarA.b()) : null;
                if (o1Var2 == null || i11 != o1Var2.f21722a) {
                    z10 = false;
                }
            }
            if (e0VarA != null) {
                Bitmap bitmap = e0VarA.f21686a;
                if (b0VarA != null) {
                    j10 = jCeil2;
                    if (Float.intBitsToFloat((int) (gVar2.f18310a.i() >> 32)) > bitmap.getWidth() || Float.intBitsToFloat((int) (gVar2.f18310a.i() & BodyPartID.bodyIdMax)) > bitmap.getHeight() || !z10) {
                    }
                } else {
                    j10 = jCeil2;
                }
                e0VarA = ya.b.a((int) (j10 >> 32), (int) (j10 & BodyPartID.bodyIdMax), i11, 24);
                lVar3.f25289a = e0VarA;
                b0VarA = com.google.android.gms.common.api.internal.a.a(e0VarA);
                lVar3.f25290b = b0VarA;
            }
            s1.a aVar4 = lVar3.f25291c;
            if (aVar4 == null) {
                aVar4 = new s1.a();
                lVar3.f25291c = aVar4;
            }
            a.b bVar = aVar4.f24173b;
            a.C0270a c0270a = aVar4.f24172a;
            long jE = f3.q.e(j10);
            f3.r layoutDirection = gVar2.f18310a.getLayoutDirection();
            s1.a aVar5 = aVar4;
            f3.d dVar = c0270a.f24176a;
            f3.r rVar = c0270a.f24177b;
            q1.w0 w0Var = c0270a.f24178c;
            ?? r45 = e0VarA;
            long j11 = c0270a.f24179d;
            c0270a.f24176a = gVar2;
            c0270a.f24177b = layoutDirection;
            c0270a.f24178c = b0VarA;
            c0270a.f24179d = jE;
            b0VarA.d();
            s1.e.X0(aVar5, q1.b1.f21648b, 0L, jE, CropImageView.DEFAULT_ASPECT_RATIO, null, 58);
            float f20 = -f19;
            float f21 = -f18;
            bVar.f24180a.f(f20, f21);
            try {
                s1.e.W(aVar5, aVar.f21733a, u0Var2, CropImageView.DEFAULT_ASPECT_RATIO, new s1.i(f12, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 30), 52);
                float f22 = 1;
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (aVar5.i() >> 32)) + f22) / Float.intBitsToFloat((int) (aVar5.i() >> 32));
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (aVar5.i() & BodyPartID.bodyIdMax)) + f22) / Float.intBitsToFloat((int) (aVar5.i() & BodyPartID.bodyIdMax));
                q1.j0 j0Var5 = j0Var4;
                q1.b0 b0Var = b0VarA;
                long jH1 = aVar5.h1();
                long jD = bVar.d();
                bVar.a().d();
                try {
                    bVar.f24180a.e(fIntBitsToFloat, fIntBitsToFloat2, jH1);
                    s1.e.W(aVar5, j0Var5, u0Var2, CropImageView.DEFAULT_ASPECT_RATIO, null, 28);
                    bVar.f24180a.f(-f20, -f21);
                    b0Var.o();
                    c0270a.f24176a = dVar;
                    c0270a.f24177b = rVar;
                    c0270a.f24178c = w0Var;
                    c0270a.f24179d = j11;
                    r45.c();
                    g0Var.f16327a = r45;
                    return gVar2.m(new q(bounds, g0Var, j10, p0Var2));
                } finally {
                    bVar.a().o();
                    bVar.h(jD);
                }
            } catch (Throwable th2) {
                bVar.f24180a.f(-f20, -f21);
                throw th2;
            }
        }
    }

    public u(float f10, q1.u0 u0Var, f2 f2Var) {
        this.f25370t = f10;
        this.f25371v = u0Var;
        this.f25372w = f2Var;
        n1.d dVar = new n1.d(new n1.g(), new a());
        T1(dVar);
        this.f25373x = dVar;
    }
}
