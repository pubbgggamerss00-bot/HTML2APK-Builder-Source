package t1;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p.m0;
import p.y0;
import q1.j0;
import q1.s1;
import q1.u1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f27634a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f27639f;

    /* renamed from: j, reason: collision with root package name */
    public float f27643j;

    /* renamed from: k, reason: collision with root package name */
    public s1 f27644k;

    /* renamed from: l, reason: collision with root package name */
    public u1 f27645l;

    /* renamed from: m, reason: collision with root package name */
    public j0 f27646m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27647n;

    /* renamed from: o, reason: collision with root package name */
    public s1.a f27648o;

    /* renamed from: p, reason: collision with root package name */
    public q1.h0 f27649p;

    /* renamed from: q, reason: collision with root package name */
    public int f27650q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f27652s;

    /* renamed from: t, reason: collision with root package name */
    public long f27653t;

    /* renamed from: u, reason: collision with root package name */
    public long f27654u;

    /* renamed from: v, reason: collision with root package name */
    public long f27655v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27656w;

    /* renamed from: x, reason: collision with root package name */
    public RectF f27657x;

    /* renamed from: b, reason: collision with root package name */
    public f3.d f27635b = s1.d.f24184a;

    /* renamed from: c, reason: collision with root package name */
    public f3.r f27636c = f3.r.f8828a;

    /* renamed from: d, reason: collision with root package name */
    public eh.l<? super s1.e, pg.f0> f27637d = c.f27632a;

    /* renamed from: e, reason: collision with root package name */
    public final b f27638e = new b(this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f27640g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f27641h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f27642i = 9205357640488583168L;

    /* renamed from: r, reason: collision with root package name */
    public final a f27651r = new a();

    static {
        boolean z10 = a0.f27629a;
        boolean z11 = a0.f27629a;
    }

    public d(e eVar) {
        this.f27634a = eVar;
        eVar.C(false);
        this.f27653t = 0L;
        this.f27654u = 0L;
        this.f27655v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f27640g) {
            boolean z10 = this.f27656w;
            Outline outline2 = null;
            e eVar = this.f27634a;
            if (z10 || eVar.J() > CropImageView.DEFAULT_ASPECT_RATIO) {
                u1 u1Var = this.f27645l;
                if (u1Var != null) {
                    RectF rectF = this.f27657x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f27657x = rectF;
                    }
                    boolean z11 = u1Var instanceof j0;
                    if (!z11) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((j0) u1Var).f21712a.computeBounds(rectF, false);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 > 28 || u1Var.b()) {
                        outline = this.f27639f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f27639f = outline;
                        }
                        if (i10 >= 30) {
                            if (!z11) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(((j0) u1Var).f21712a);
                        } else {
                            if (!z11) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(((j0) u1Var).f21712a);
                        }
                        this.f27647n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f27639f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f27647n = true;
                        outline = null;
                    }
                    this.f27645l = u1Var;
                    if (outline != null) {
                        outline.setAlpha(eVar.i());
                        outline2 = outline;
                    }
                    eVar.p(outline2, (BodyPartID.bodyIdMax & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.f27647n && this.f27656w) {
                        eVar.C(false);
                        eVar.m();
                    } else {
                        eVar.C(this.f27656w);
                    }
                } else {
                    eVar.C(this.f27656w);
                    Outline outline4 = this.f27639f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f27639f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jE = f3.q.e(this.f27654u);
                    long j10 = this.f27641h;
                    long j11 = this.f27642i;
                    if (j11 != 9205357640488583168L) {
                        jE = j11;
                    }
                    int i11 = (int) (j10 >> 32);
                    int iRound = Math.round(Float.intBitsToFloat(i11));
                    int i12 = (int) (j10 & BodyPartID.bodyIdMax);
                    int i13 = (int) (jE >> 32);
                    outline5.setRoundRect(iRound, Math.round(Float.intBitsToFloat(i12)), Math.round(Float.intBitsToFloat(i13) + Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat((int) (jE & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i12)), this.f27643j);
                    outline5.setAlpha(eVar.i());
                    eVar.p(outline5, (BodyPartID.bodyIdMax & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i13)) << 32));
                }
            } else {
                eVar.C(false);
                eVar.p(null, 0L);
            }
        }
        this.f27640g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        if (this.f27652s && this.f27650q == 0) {
            a aVar = this.f27651r;
            d dVar = aVar.f27624a;
            if (dVar != null) {
                dVar.e();
                aVar.f27624a = null;
            }
            m0<d> m0Var = aVar.f27626c;
            if (m0Var != null) {
                Object[] objArr = m0Var.f20753b;
                long[] jArr = m0Var.f20752a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    ((d) objArr[(i10 << 3) + i12]).e();
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            } else if (i10 == length) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                m0Var.e();
            }
            this.f27634a.m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(s1.e eVar) {
        a aVar = this.f27651r;
        aVar.f27625b = aVar.f27624a;
        m0<d> m0Var = aVar.f27626c;
        if (m0Var != null && m0Var.c()) {
            m0<d> m0VarA = aVar.f27627d;
            if (m0VarA == null) {
                m0VarA = y0.a();
                aVar.f27627d = m0VarA;
            }
            m0VarA.k(m0Var);
            m0Var.e();
        }
        aVar.f27628e = true;
        this.f27637d.invoke(eVar);
        aVar.f27628e = false;
        d dVar = aVar.f27625b;
        if (dVar != null) {
            dVar.e();
        }
        m0<d> m0Var2 = aVar.f27627d;
        if (m0Var2 == null || !m0Var2.c()) {
            return;
        }
        Object[] objArr = m0Var2.f20753b;
        long[] jArr = m0Var2.f20752a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            ((d) objArr[(i10 << 3) + i12]).e();
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 == length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        m0Var2.e();
    }

    public final s1 d() {
        s1 bVar;
        s1 s1Var = this.f27644k;
        u1 u1Var = this.f27645l;
        if (s1Var != null) {
            return s1Var;
        }
        if (u1Var != null) {
            s1.a aVar = new s1.a(u1Var);
            this.f27644k = aVar;
            return aVar;
        }
        long jE = f3.q.e(this.f27654u);
        long j10 = this.f27641h;
        long j11 = this.f27642i;
        if (j11 != 9205357640488583168L) {
            jE = j11;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jE >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jE & BodyPartID.bodyIdMax)) + fIntBitsToFloat2;
        if (this.f27643j > CropImageView.DEFAULT_ASPECT_RATIO) {
            bVar = new s1.c(j1.l.a(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(r0))));
        } else {
            bVar = new s1.b(new p1.e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f27644k = bVar;
        return bVar;
    }

    public final void e() {
        this.f27650q--;
        b();
    }

    public final void f(float f10) {
        e eVar = this.f27634a;
        if (eVar.i() == f10) {
            return;
        }
        eVar.f(f10);
    }

    public final void g(long j10, long j11, float f10) {
        if (p1.c.b(this.f27641h, j10) && p1.h.a(this.f27642i, j11) && this.f27643j == f10 && this.f27645l == null) {
            return;
        }
        this.f27644k = null;
        this.f27645l = null;
        this.f27640g = true;
        this.f27647n = false;
        this.f27641h = j10;
        this.f27642i = j11;
        this.f27643j = f10;
        a();
    }
}
