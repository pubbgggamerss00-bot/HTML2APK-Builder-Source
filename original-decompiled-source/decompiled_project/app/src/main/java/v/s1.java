package v;

import androidx.compose.foundation.gestures.i;
import androidx.compose.foundation.gestures.j;
import com.yalantis.ucrop.view.CropImageView;
import i2.p2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public l1 f30067a;

    /* renamed from: b, reason: collision with root package name */
    public t.i1 f30068b;

    /* renamed from: c, reason: collision with root package name */
    public z f30069c;

    /* renamed from: d, reason: collision with root package name */
    public t0 f30070d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30071e;

    /* renamed from: f, reason: collision with root package name */
    public b2.b f30072f;

    /* renamed from: g, reason: collision with root package name */
    public final j.d f30073g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30074h;

    /* renamed from: i, reason: collision with root package name */
    public int f30075i = 1;

    /* renamed from: j, reason: collision with root package name */
    public b1 f30076j = androidx.compose.foundation.gestures.i.f902b;

    /* renamed from: k, reason: collision with root package name */
    public final p1 f30077k = new p1(this);

    /* renamed from: l, reason: collision with root package name */
    public final b0.j f30078l = new b0.j(this, 1);

    public s1(l1 l1Var, t.i1 i1Var, z zVar, t0 t0Var, boolean z10, b2.b bVar, j.d dVar) {
        this.f30067a = l1Var;
        this.f30068b = i1Var;
        this.f30069c = zVar;
        this.f30070d = t0Var;
        this.f30071e = z10;
        this.f30072f = bVar;
        this.f30073g = dVar;
    }

    public static final long a(s1 s1Var, b1 b1Var, long j10, int i10) {
        b2.e eVar = s1Var.f30072f.f3507a;
        b2.e eVar2 = null;
        b2.e eVar3 = (eVar == null || !eVar.f1157p) ? null : (b2.e) p2.a(eVar);
        long jV0 = eVar3 != null ? eVar3.v0(i10, j10) : 0L;
        long jF = p1.c.f(j10, jV0);
        long jE = s1Var.e(s1Var.h(b1Var.e(s1Var.g(s1Var.e(p1.c.a(jF, CropImageView.DEFAULT_ASPECT_RATIO, s1Var.f30070d == t0.f30084b ? 1 : 2))))));
        long jF2 = p1.c.f(jF, jE);
        b2.e eVar4 = s1Var.f30072f.f3507a;
        if (eVar4 != null && eVar4.f1157p) {
            eVar2 = (b2.e) p2.a(eVar4);
        }
        b2.e eVar5 = eVar2;
        return p1.c.g(p1.c.g(jV0, jE), eVar5 != null ? eVar5.n1(jE, jF2, i10) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j10, vg.c cVar) {
        n1 n1Var;
        s1 s1Var;
        kotlin.jvm.internal.f0 f0Var;
        if (cVar instanceof n1) {
            n1Var = (n1) cVar;
            int i10 = n1Var.f30007e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                n1Var.f30007e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                n1Var = new n1(this, cVar);
            }
        }
        Object obj = n1Var.f30005c;
        ug.a aVar = ug.a.f29706a;
        int i11 = n1Var.f30007e;
        if (i11 == 0) {
            pg.q.b(obj);
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            f0Var2.f16326a = j10;
            this.f30074h = true;
            t.b1 b1Var = t.b1.f25167a;
            o1 o1Var = new o1(this, f0Var2, j10, null);
            n1Var.f30003a = this;
            n1Var.f30004b = f0Var2;
            n1Var.f30007e = 1;
            if (f(b1Var, o1Var, n1Var) == aVar) {
                return aVar;
            }
            s1Var = this;
            f0Var = f0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var = n1Var.f30004b;
            s1Var = n1Var.f30003a;
            pg.q.b(obj);
        }
        s1Var.f30074h = false;
        return new f3.w(f0Var.f16326a);
    }

    public final Object c(long j10, boolean z10, vg.i iVar) {
        if (z10) {
            i.a aVar = androidx.compose.foundation.gestures.i.f901a;
            return pg.f0.f21461a;
        }
        long jA = f3.w.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, this.f30070d == t0.f30084b ? 1 : 2, j10);
        q1 q1Var = new q1(this, null);
        t.i1 i1Var = this.f30068b;
        if (i1Var != null && (this.f30067a.d() || this.f30067a.b())) {
            Object objB = i1Var.b(jA, q1Var, iVar);
            return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
        }
        q1 q1Var2 = new q1(q1Var.f30036d, iVar);
        q1Var2.f30035c = jA;
        Object objInvokeSuspend = q1Var2.invokeSuspend(pg.f0.f21461a);
        return objInvokeSuspend == ug.a.f29706a ? objInvokeSuspend : pg.f0.f21461a;
    }

    public final float d(float f10) {
        return this.f30071e ? f10 * (-1) : f10;
    }

    public final long e(long j10) {
        return this.f30071e ? p1.c.h(-1.0f, j10) : j10;
    }

    public final Object f(t.b1 b1Var, eh.p pVar, vg.c cVar) {
        Object objC = this.f30067a.c(b1Var, new r1(this, pVar, null), cVar);
        return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
    }

    public final float g(long j10) {
        return Float.intBitsToFloat((int) (this.f30070d == t0.f30084b ? j10 >> 32 : j10 & BodyPartID.bodyIdMax));
    }

    public final long h(float f10) {
        long jFloatToRawIntBits;
        long j10;
        if (f10 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return 0L;
        }
        if (this.f30070d == t0.f30084b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f10);
            jFloatToRawIntBits = Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO);
            j10 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO);
            jFloatToRawIntBits = Float.floatToRawIntBits(f10);
            j10 = jFloatToRawIntBits3 << 32;
        }
        return j10 | (jFloatToRawIntBits & BodyPartID.bodyIdMax);
    }
}
