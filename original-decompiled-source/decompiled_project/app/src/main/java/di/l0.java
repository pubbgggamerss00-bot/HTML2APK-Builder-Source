package di;

import bi.m;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.JsonElementSerializer;

/* loaded from: classes2.dex */
public final class l0 extends c5.p implements kotlinx.serialization.json.n {

    /* renamed from: a, reason: collision with root package name */
    public final k f8044a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.json.b f8045b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f8046c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.serialization.json.n[] f8047d;

    /* renamed from: e, reason: collision with root package name */
    public final ei.b f8048e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.f f8049f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8050g;

    /* renamed from: h, reason: collision with root package name */
    public String f8051h;

    /* renamed from: j, reason: collision with root package name */
    public String f8052j;

    public l0(k composer, kotlinx.serialization.json.b bVar, r0 r0Var, kotlinx.serialization.json.n[] nVarArr) {
        kotlin.jvm.internal.r.e(composer, "composer");
        this.f8044a = composer;
        this.f8045b = bVar;
        this.f8046c = r0Var;
        this.f8047d = nVarArr;
        this.f8048e = bVar.f16437b;
        this.f8049f = bVar.f16436a;
        int iOrdinal = r0Var.ordinal();
        if (nVarArr != null) {
            kotlinx.serialization.json.n nVar = nVarArr[iOrdinal];
            if (nVar == null && nVar == this) {
                return;
            }
            nVarArr[iOrdinal] = this;
        }
    }

    @Override // c5.p, ci.e
    public final void C(bi.f enumDescriptor, int i10) {
        kotlin.jvm.internal.r.e(enumDescriptor, "enumDescriptor");
        N(enumDescriptor.f(i10));
    }

    @Override // kotlinx.serialization.json.n
    public final void G(kotlinx.serialization.json.h element) {
        kotlin.jvm.internal.r.e(element, "element");
        if (this.f8051h == null || (element instanceof kotlinx.serialization.json.v)) {
            J(JsonElementSerializer.INSTANCE, element);
        } else {
            j0.d(this.f8052j, element);
            throw null;
        }
    }

    @Override // c5.p, ci.e
    public final void H(int i10) {
        if (this.f8050g) {
            N(String.valueOf(i10));
        } else {
            this.f8044a.d(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    @Override // ci.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void J(zh.i<? super T> serializer, T t3) {
        String strC;
        kotlin.jvm.internal.r.e(serializer, "serializer");
        kotlinx.serialization.json.b bVar = this.f8045b;
        kotlinx.serialization.json.f fVar = bVar.f16436a;
        boolean z10 = serializer instanceof AbstractPolymorphicSerializer;
        if (z10) {
            strC = fVar.f16448g != kotlinx.serialization.json.a.f16432a ? j0.c(serializer.getDescriptor(), bVar) : null;
        } else {
            int iOrdinal = fVar.f16448g.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    bi.l kind = serializer.getDescriptor().getKind();
                    if (kotlin.jvm.internal.r.a(kind, m.a.f4278a) || kotlin.jvm.internal.r.a(kind, m.d.f4281a)) {
                    }
                } else if (iOrdinal != 2) {
                    throw new pg.l();
                }
            }
        }
        if (z10) {
            AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializer;
            if (t3 == 0) {
                throw new IllegalArgumentException(("Value for serializer " + abstractPolymorphicSerializer.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            zh.i<? super T> iVarB = zh.e.b(abstractPolymorphicSerializer, this, t3);
            if (strC != null) {
                j0.a(serializer, iVarB, strC);
                j0.b(iVarB.getDescriptor().getKind());
            }
            serializer = iVarB;
        }
        if (strC != null) {
            String strA = serializer.getDescriptor().a();
            this.f8051h = strC;
            this.f8052j = strA;
        }
        serializer.serialize(this, t3);
    }

    @Override // c5.p, ci.e
    public final void K(long j10) {
        if (this.f8050g) {
            N(String.valueOf(j10));
        } else {
            this.f8044a.e(j10);
        }
    }

    @Override // c5.p, ci.e
    public final void N(String value) {
        kotlin.jvm.internal.r.e(value, "value");
        this.f8044a.h(value);
    }

    @Override // c5.p
    public final boolean S(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        int iOrdinal = this.f8046c.ordinal();
        k kVar = this.f8044a;
        if (iOrdinal == 1) {
            if (!kVar.f8033b) {
                kVar.c(',');
            }
            kVar.a();
            return true;
        }
        boolean z10 = false;
        if (iOrdinal == 2) {
            if (kVar.f8033b) {
                this.f8050g = true;
                kVar.a();
                return true;
            }
            if (i10 % 2 == 0) {
                kVar.c(',');
                kVar.a();
                z10 = true;
            } else {
                kVar.c(':');
                kVar.i();
            }
            this.f8050g = z10;
            return true;
        }
        if (iOrdinal == 3) {
            if (i10 == 0) {
                this.f8050g = true;
            }
            if (i10 == 1) {
                kVar.c(',');
                kVar.i();
                this.f8050g = false;
            }
            return true;
        }
        if (!kVar.f8033b) {
            kVar.c(',');
        }
        kVar.a();
        u.d(descriptor, this.f8045b);
        N(descriptor.f(i10));
        kVar.c(':');
        kVar.i();
        return true;
    }

    @Override // ci.e
    public final ei.b a() {
        return this.f8048e;
    }

    @Override // c5.p, ci.c
    public final void b(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        k kVar = this.f8044a;
        kVar.getClass();
        kVar.f8033b = false;
        kVar.c(this.f8046c.f8075b);
    }

    @Override // c5.p, ci.e
    public final ci.c c(bi.f descriptor) {
        kotlinx.serialization.json.n nVar;
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlinx.serialization.json.b bVar = this.f8045b;
        r0 r0VarB = s0.b(descriptor, bVar);
        char c10 = r0VarB.f8074a;
        k kVar = this.f8044a;
        kVar.c(c10);
        kVar.f8033b = true;
        String str = this.f8051h;
        if (str != null) {
            String strA = this.f8052j;
            if (strA == null) {
                strA = descriptor.a();
            }
            kVar.a();
            N(str);
            kVar.c(':');
            N(strA);
            this.f8051h = null;
            this.f8052j = null;
        }
        if (this.f8046c == r0VarB) {
            return this;
        }
        kotlinx.serialization.json.n[] nVarArr = this.f8047d;
        return (nVarArr == null || (nVar = nVarArr[r0VarB.ordinal()]) == null) ? new l0(kVar, bVar, r0VarB, nVarArr) : nVar;
    }

    @Override // kotlinx.serialization.json.n
    public final kotlinx.serialization.json.b d() {
        return this.f8045b;
    }

    @Override // c5.p, ci.e
    public final ci.e f(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        boolean zA = m0.a(descriptor);
        r0 r0Var = this.f8046c;
        kotlinx.serialization.json.b bVar = this.f8045b;
        k lVar = this.f8044a;
        if (zA) {
            if (!(lVar instanceof m)) {
                lVar = new m(lVar.f8032a, this.f8050g);
            }
            return new l0(lVar, bVar, r0Var, null);
        }
        if (descriptor.isInline() && descriptor.equals(kotlinx.serialization.json.i.f16449a)) {
            if (!(lVar instanceof l)) {
                lVar = new l(lVar.f8032a, this.f8050g);
            }
            return new l0(lVar, bVar, r0Var, null);
        }
        if (this.f8051h != null) {
            this.f8052j = descriptor.a();
        }
        return this;
    }

    @Override // c5.p, ci.c
    public final <T> void g(bi.f descriptor, int i10, zh.i<? super T> serializer, T t3) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlin.jvm.internal.r.e(serializer, "serializer");
        if (t3 != null || this.f8049f.f16444c) {
            super.g(descriptor, i10, serializer, t3);
        }
    }

    @Override // c5.p, ci.e
    public final void h() {
        this.f8044a.f("null");
    }

    @Override // ci.c
    public final boolean i(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return false;
    }

    @Override // c5.p, ci.e
    public final void k(double d10) {
        boolean z10 = this.f8050g;
        k kVar = this.f8044a;
        if (z10) {
            N(String.valueOf(d10));
        } else {
            kVar.f8032a.c(String.valueOf(d10));
        }
        if (Math.abs(d10) > Double.MAX_VALUE) {
            throw t.a(Double.valueOf(d10), kVar.f8032a.toString());
        }
    }

    @Override // c5.p, ci.e
    public final void l(short s10) {
        if (this.f8050g) {
            N(String.valueOf((int) s10));
        } else {
            this.f8044a.g(s10);
        }
    }

    @Override // c5.p, ci.e
    public final void n(byte b10) {
        if (this.f8050g) {
            N(String.valueOf((int) b10));
        } else {
            this.f8044a.b(b10);
        }
    }

    @Override // c5.p, ci.e
    public final void o(boolean z10) {
        if (this.f8050g) {
            N(String.valueOf(z10));
        } else {
            this.f8044a.f8032a.c(String.valueOf(z10));
        }
    }

    @Override // c5.p, ci.e
    public final void r(float f10) {
        boolean z10 = this.f8050g;
        k kVar = this.f8044a;
        if (z10) {
            N(String.valueOf(f10));
        } else {
            kVar.f8032a.c(String.valueOf(f10));
        }
        if (Math.abs(f10) > Float.MAX_VALUE) {
            throw t.a(Float.valueOf(f10), kVar.f8032a.toString());
        }
    }

    @Override // c5.p, ci.e
    public final void t(char c10) {
        N(String.valueOf(c10));
    }
}
