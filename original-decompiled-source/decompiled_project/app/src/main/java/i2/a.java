package i2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final g2.g1 f13761a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13763c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13764d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13765e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13766f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13767g;

    /* renamed from: h, reason: collision with root package name */
    public b f13768h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13762b = true;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f13769i = new HashMap();

    /* renamed from: i2.a$a, reason: collision with other inner class name */
    public static final class C0126a extends kotlin.jvm.internal.s implements eh.l<b, pg.f0> {
        public C0126a() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [g2.g1, i2.b] */
        @Override // eh.l
        public final pg.f0 invoke(b bVar) {
            a aVar;
            b bVar2 = bVar;
            if (bVar2.x()) {
                if (bVar2.r().f13762b) {
                    bVar2.X();
                }
                Iterator it = bVar2.r().f13769i.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    aVar = a.this;
                    if (!zHasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    a.a(aVar, (g2.a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar2.F());
                }
                g1 g1Var = bVar2.F().f13878s;
                kotlin.jvm.internal.r.b(g1Var);
                while (!g1Var.equals(aVar.f13761a.F())) {
                    for (g2.a aVar2 : aVar.c(g1Var).keySet()) {
                        a.a(aVar, aVar2, aVar.d(g1Var, aVar2), g1Var);
                    }
                    g1Var = g1Var.f13878s;
                    kotlin.jvm.internal.r.b(g1Var);
                }
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(b bVar) {
        this.f13761a = (g2.g1) bVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [g2.g1, i2.b] */
    public static final void a(a aVar, g2.a aVar2, int i10, g1 g1Var) {
        long jB;
        HashMap map = aVar.f13769i;
        float f10 = i10;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f10) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f10) & BodyPartID.bodyIdMax;
        loop0: while (true) {
            jB = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jB = aVar.b(g1Var, jB);
                g1Var = g1Var.f13878s;
                kotlin.jvm.internal.r.b(g1Var);
                if (g1Var.equals(aVar.f13761a.F())) {
                    break loop0;
                }
            } while (!aVar.c(g1Var).containsKey(aVar2));
            float fD = aVar.d(g1Var, aVar2);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fD);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fD);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & BodyPartID.bodyIdMax;
        }
        int iRound = Math.round(aVar2 instanceof g2.o ? Float.intBitsToFloat((int) (jB & BodyPartID.bodyIdMax)) : Float.intBitsToFloat((int) (jB >> 32)));
        if (map.containsKey(aVar2)) {
            int iIntValue = ((Number) qg.k0.c(aVar2, map)).intValue();
            g2.o oVar = g2.b.f11314a;
            iRound = aVar2.f11312a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound)).intValue();
        }
        map.put(aVar2, Integer.valueOf(iRound));
    }

    public abstract long b(g1 g1Var, long j10);

    public abstract Map<g2.a, Integer> c(g1 g1Var);

    public abstract int d(g1 g1Var, g2.a aVar);

    public final boolean e() {
        return this.f13763c || this.f13765e || this.f13766f || this.f13767g;
    }

    public final boolean f() {
        i();
        return this.f13768h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [g2.g1, i2.b] */
    public final void g() {
        this.f13762b = true;
        ?? r02 = this.f13761a;
        b bVarH = r02.H();
        if (bVarH == null) {
            return;
        }
        if (this.f13763c) {
            bVarH.a0();
        } else if (this.f13765e || this.f13764d) {
            bVarH.requestLayout();
        }
        if (this.f13766f) {
            r02.a0();
        }
        if (this.f13767g) {
            r02.requestLayout();
        }
        bVarH.r().g();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [g2.g1, i2.b] */
    public final void h() {
        HashMap map = this.f13769i;
        map.clear();
        C0126a c0126a = new C0126a();
        ?? r22 = this.f13761a;
        r22.V(c0126a);
        map.putAll(c(r22.F()));
        this.f13762b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [g2.g1, i2.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        a aVarR;
        a aVarR2;
        boolean zE = e();
        ?? r12 = this.f13761a;
        b bVar = r12;
        if (!zE) {
            b bVarH = r12.H();
            if (bVarH == null) {
                return;
            }
            b bVar2 = bVarH.r().f13768h;
            if (bVar2 != null) {
                boolean zE2 = bVar2.r().e();
                bVar = bVar2;
                if (!zE2) {
                    b bVar3 = this.f13768h;
                    if (bVar3 == null || bVar3.r().e()) {
                        return;
                    }
                    b bVarH2 = bVar3.H();
                    if (bVarH2 != null && (aVarR2 = bVarH2.r()) != null) {
                        aVarR2.i();
                    }
                    b bVarH3 = bVar3.H();
                    bVar = (bVarH3 == null || (aVarR = bVarH3.r()) == null) ? null : aVarR.f13768h;
                }
            }
        }
        this.f13768h = bVar;
    }
}
