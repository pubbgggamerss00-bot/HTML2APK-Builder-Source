package v;

import com.yalantis.ucrop.view.CropImageView;
import j1.i;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s.p2;
import s.q2;
import v.f;

/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: f, reason: collision with root package name */
    public static final s.o f29974f = new s.o(CropImageView.DEFAULT_ASPECT_RATIO);

    /* renamed from: a, reason: collision with root package name */
    public final q2<s.o> f29975a;

    /* renamed from: b, reason: collision with root package name */
    public long f29976b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public s.o f29977c = f29974f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29978d;

    /* renamed from: e, reason: collision with root package name */
    public float f29979e;

    public k2(s.l<Float> lVar) {
        this.f29975a = lVar.a(p2.f23868a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
    
        if (x0.f1.a(r2.getContext()).f0(r0, r2) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: all -> 0x00ed, PHI: r0 r2 r13 r14 r15
      0x0081: PHI (r0v9 eh.a) = (r0v3 eh.a), (r0v10 eh.a) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r2v4 v.h2) = (r2v2 v.h2), (r2v5 v.h2) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r13v6 float) = (r13v3 float), (r13v7 float) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r14v6 v.f$b$a$a) = (r14v3 v.f$b$a$a), (r14v7 v.f$b$a$a) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r15v17 v.k2) = (r15v8 v.k2), (r15v18 v.k2) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ed, blocks: (B:38:0x00b1, B:32:0x0081, B:35:0x0093), top: B:59:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[PHI: r0 r2 r14 r15
      0x008e: PHI (r0v4 eh.a) = (r0v9 eh.a), (r0v10 eh.a) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r2v3 v.h2) = (r2v4 v.h2), (r2v5 v.h2) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r14v4 v.f$b$a$a) = (r14v6 v.f$b$a$a), (r14v7 v.f$b$a$a) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r15v11 v.k2) = (r15v17 v.k2), (r15v18 v.k2) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[Catch: all -> 0x00ed, TryCatch #2 {all -> 0x00ed, blocks: (B:38:0x00b1, B:32:0x0081, B:35:0x0093), top: B:59:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v0, types: [v.f$b$a$b] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2, types: [v.k2] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r2v7, types: [eh.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ae -> B:59:0x00b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f.b.a.C0305a c0305a, f.b.a.C0306b c0306b, vg.c cVar) throws Throwable {
        h2 h2Var;
        h2 h2Var2;
        eh.a aVar;
        f.b.a.C0305a c0305a2;
        float f10;
        k2 k2Var;
        eh.a aVar2;
        k2 k2Var2;
        if (cVar instanceof h2) {
            h2Var = (h2) cVar;
            int i10 = h2Var.f29906g;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                h2Var.f29906g = i10 - PKIFailureInfo.systemUnavail;
            } else {
                h2Var = new h2(this, cVar);
            }
        }
        Object obj = h2Var.f29904e;
        ug.a aVar3 = ug.a.f29706a;
        int i11 = h2Var.f29906g;
        s.o oVar = f29974f;
        try {
            if (i11 == 0) {
                pg.q.b(obj);
                if (this.f29978d) {
                    y.c.c("animateToZero called while previous animation is running");
                }
                j1.i iVar = (j1.i) h2Var.getContext().get(i.a.f14624a);
                float fP = iVar != null ? iVar.p() : 1.0f;
                this.f29978d = true;
                h2Var2 = h2Var;
                aVar = c0306b;
                c0305a2 = c0305a;
                f10 = fP;
                k2Var = this;
                if (Math.abs(k2Var.f29979e) < 0.01f) {
                }
                return aVar3;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (eh.a) h2Var.f29901b;
                k2 k2Var3 = h2Var.f29900a;
                pg.q.b(obj);
                c0306b = k2Var3;
                aVar2.invoke();
                k2Var2 = c0306b;
                k2Var2.f29976b = Long.MIN_VALUE;
                k2Var2.f29977c = oVar;
                k2Var2.f29978d = false;
                return pg.f0.f21461a;
            }
            f10 = h2Var.f29903d;
            eh.a aVar4 = h2Var.f29902c;
            ?? r22 = (eh.l) h2Var.f29901b;
            k2 k2Var4 = h2Var.f29900a;
            try {
                pg.q.b(obj);
                h2 h2Var3 = h2Var;
                aVar = aVar4;
                c0305a2 = r22;
                h2Var2 = h2Var3;
                k2Var = k2Var4;
            } catch (Throwable th2) {
                th = th2;
                c0306b = k2Var4;
                c0306b.f29976b = Long.MIN_VALUE;
                c0306b.f29977c = oVar;
                c0306b.f29978d = false;
                throw th;
            }
            try {
                aVar.invoke();
                if (f10 == CropImageView.DEFAULT_ASPECT_RATIO) {
                    if (Math.abs(k2Var.f29979e) < 0.01f) {
                        i2 i2Var = new i2(k2Var, f10, c0305a2);
                        h2Var2.f29900a = k2Var;
                        h2Var2.f29901b = c0305a2;
                        h2Var2.f29902c = aVar;
                        h2Var2.f29903d = f10;
                        h2Var2.f29906g = 1;
                        if (x0.f1.a(h2Var2.getContext()).f0(i2Var, h2Var2) == aVar3) {
                        }
                        aVar.invoke();
                        if (f10 == CropImageView.DEFAULT_ASPECT_RATIO) {
                        }
                    }
                    return aVar3;
                }
                k2 k2Var5 = k2Var;
                f.b.a.C0305a c0305a3 = c0305a2;
                k2 k2Var6 = k2Var5;
                aVar2 = aVar;
                if (Math.abs(k2Var6.f29979e) == CropImageView.DEFAULT_ASPECT_RATIO) {
                    k2Var2 = k2Var6;
                } else {
                    j2 j2Var = new j2(k2Var6, c0305a3);
                    h2Var2.f29900a = k2Var6;
                    h2Var2.f29901b = aVar2;
                    h2Var2.f29902c = null;
                    h2Var2.f29906g = 2;
                    c0306b = k2Var6;
                }
                k2Var2.f29976b = Long.MIN_VALUE;
                k2Var2.f29977c = oVar;
                k2Var2.f29978d = false;
                return pg.f0.f21461a;
            } catch (Throwable th3) {
                th = th3;
                c0306b = k2Var;
                c0306b.f29976b = Long.MIN_VALUE;
                c0306b.f29977c = oVar;
                c0306b.f29978d = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
