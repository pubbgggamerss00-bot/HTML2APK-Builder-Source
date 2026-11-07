package x8;

import f9.x8;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class n8 {

    /* renamed from: a, reason: collision with root package name */
    public final c0.w0 f32988a;

    /* renamed from: b, reason: collision with root package name */
    public final o8 f32989b;

    /* renamed from: c, reason: collision with root package name */
    public final x8 f32990c;

    /* renamed from: d, reason: collision with root package name */
    public final p8 f32991d;

    /* renamed from: e, reason: collision with root package name */
    public final w f32992e;

    /* renamed from: f, reason: collision with root package name */
    public final q8 f32993f;

    /* renamed from: g, reason: collision with root package name */
    public final x0.x1 f32994g;

    /* renamed from: h, reason: collision with root package name */
    public final x0.x1 f32995h;

    /* renamed from: i, reason: collision with root package name */
    public final x0.x1 f32996i;

    /* renamed from: j, reason: collision with root package name */
    public final x0.x1 f32997j;

    /* renamed from: k, reason: collision with root package name */
    public final x0.x1 f32998k;

    /* renamed from: l, reason: collision with root package name */
    public Long f32999l;

    public n8(c0.w0 grid, o8 o8Var, x8 x8Var, p8 p8Var, w wVar, q8 q8Var) {
        kotlin.jvm.internal.r.e(grid, "grid");
        this.f32988a = grid;
        this.f32989b = o8Var;
        this.f32990c = x8Var;
        this.f32991d = p8Var;
        this.f32992e = wVar;
        this.f32993f = q8Var;
        this.f32994g = bg.b.h(null);
        this.f32995h = bg.b.h(null);
        this.f32996i = bg.b.h(null);
        this.f32997j = bg.b.h(new p1.c(0L));
        this.f32998k = bg.b.h(new p1.c(0L));
    }

    public static long a(c0.o oVar) {
        float fA = (((int) (oVar.a() >> 32)) / 2.0f) + ((int) (oVar.l() >> 32));
        float fA2 = (((int) (oVar.a() & BodyPartID.bodyIdMax)) / 2.0f) + ((int) (oVar.l() & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fA2) & BodyPartID.bodyIdMax);
    }

    public static boolean b(c0.o oVar, long j10) {
        int i10 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i10) < ((int) (oVar.l() >> 32)) || Float.intBitsToFloat(i10) > ((int) (oVar.l() >> 32)) + ((int) (oVar.a() >> 32))) {
            return false;
        }
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        return Float.intBitsToFloat(i11) >= ((float) ((int) (oVar.l() & BodyPartID.bodyIdMax))) && Float.intBitsToFloat(i11) <= ((float) (((int) (oVar.l() & BodyPartID.bodyIdMax)) + ((int) (BodyPartID.bodyIdMax & oVar.a()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(long j10) {
        Object next;
        Long lF = f();
        if (lF != null) {
            long jLongValue = lF.longValue();
            this.f32998k.setValue(new p1.c(p1.c.g(e(), j10)));
            Long l10 = (Long) this.f32992e.invoke(new p1.c(e()));
            x0.x1 x1Var = this.f32994g;
            x1Var.setValue(l10);
            if (((Long) x1Var.getValue()) != null) {
                return;
            }
            List<c0.o> listI = this.f32988a.i().i();
            Iterator<T> it = listI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                c0.o oVar = (c0.o) next;
                if (!kotlin.jvm.internal.r.a(oVar.getKey(), lF) && b(oVar, e())) {
                    break;
                }
            }
            c0.o oVar2 = (c0.o) next;
            if (oVar2 == null) {
                if (listI.isEmpty()) {
                    return;
                }
                for (c0.o oVar3 : listI) {
                    if (kotlin.jvm.internal.r.a(oVar3.getKey(), lF) && b(oVar3, e())) {
                        this.f32999l = null;
                        return;
                    }
                }
                return;
            }
            Object key = oVar2.getKey();
            Long l11 = key instanceof Long ? (Long) key : null;
            if (l11 != null) {
                long jLongValue2 = l11.longValue();
                Long l12 = this.f32999l;
                if (l12 != null && jLongValue2 == l12.longValue()) {
                    return;
                }
                List list = (List) this.f32989b.invoke();
                List<Long> listA = w7.a(list, jLongValue, jLongValue2);
                if (listA.equals(list)) {
                    return;
                }
                this.f32999l = l11;
                this.f32990c.invoke(listA);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(boolean z10) {
        Long lF = f();
        if (lF != null) {
            long jLongValue = lF.longValue();
            x0.x1 x1Var = this.f32994g;
            Long l10 = (Long) x1Var.getValue();
            x1Var.setValue(null);
            x0.x1 x1Var2 = this.f32995h;
            p8 p8Var = this.f32991d;
            if (!z10 && l10 != null) {
                x1Var2.setValue(null);
                this.f32999l = null;
                p8Var.invoke(Boolean.TRUE);
                this.f32993f.invoke(lF, l10);
                return;
            }
            if (!z10) {
                this.f32997j.setValue(new p1.c(i(jLongValue)));
                this.f32996i.setValue(lF);
            }
            x1Var2.setValue(null);
            this.f32999l = null;
            p8Var.invoke(Boolean.valueOf(z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e() {
        return ((p1.c) this.f32998k.getValue()).f21129a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long f() {
        return (Long) this.f32995h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long g() {
        return (Long) this.f32996i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(vg.c cVar) {
        m8 m8Var;
        n8 n8Var;
        long j10;
        if (cVar instanceof m8) {
            m8Var = (m8) cVar;
            int i10 = m8Var.f32943e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                m8Var.f32943e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                m8Var = new m8(this, cVar);
            }
        }
        m8 m8Var2 = m8Var;
        Object obj = m8Var2.f32941c;
        ug.a aVar = ug.a.f29706a;
        int i11 = m8Var2.f32943e;
        if (i11 == 0) {
            pg.q.b(obj);
            Long lG = g();
            if (lG == null) {
                return pg.f0.f21461a;
            }
            long jLongValue = lG.longValue();
            s.b bVar = new s.b(new p1.c(((p1.c) this.f32997j.getValue()).f21129a), s.p2.f23873f, null, 12);
            p1.c cVar2 = new p1.c(0L);
            s.l1 l1VarC = s.m.c(0.85f, 450.0f, null, 4);
            f9.v8 v8Var = new f9.v8(this, 1);
            m8Var2.f32939a = this;
            m8Var2.f32940b = jLongValue;
            m8Var2.f32943e = 1;
            if (s.b.c(bVar, cVar2, l1VarC, v8Var, m8Var2, 4) == aVar) {
                return aVar;
            }
            n8Var = this;
            j10 = jLongValue;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = m8Var2.f32940b;
            n8Var = m8Var2.f32939a;
            pg.q.b(obj);
        }
        Long lG2 = n8Var.g();
        if (lG2 != null && lG2.longValue() == j10) {
            n8Var.f32996i.setValue(null);
        }
        return pg.f0.f21461a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long i(long j10) {
        Object next;
        Long lF = f();
        if (lF == null || lF.longValue() != j10) {
            Long lG = g();
            if (lG != null && lG.longValue() == j10) {
                return ((p1.c) this.f32997j.getValue()).f21129a;
            }
            return 0L;
        }
        Iterator<T> it = this.f32988a.i().i().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.r.a(((c0.o) next).getKey(), Long.valueOf(j10))) {
                break;
            }
        }
        c0.o oVar = (c0.o) next;
        if (oVar == null) {
            return 0L;
        }
        return p1.c.f(e(), a(oVar));
    }
}
