package di;

import bi.l;
import bi.m;
import java.util.ArrayList;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.JsonElementSerializer;

/* loaded from: classes2.dex */
public abstract class f extends c2.g0 implements kotlinx.serialization.json.n {

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.json.b f8006b;

    /* renamed from: c, reason: collision with root package name */
    public final eh.l<kotlinx.serialization.json.h, pg.f0> f8007c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.serialization.json.f f8008d;

    /* renamed from: e, reason: collision with root package name */
    public String f8009e;

    /* renamed from: f, reason: collision with root package name */
    public String f8010f;

    public f(kotlinx.serialization.json.b bVar, eh.l lVar) {
        super(1);
        this.f8006b = bVar;
        this.f8007c = lVar;
        this.f8008d = bVar.f16436a;
    }

    @Override // c2.g0
    public final void E(Object obj, bi.f enumDescriptor, int i10) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlin.jvm.internal.r.e(enumDescriptor, "enumDescriptor");
        d0(tag, kotlinx.serialization.json.i.b(enumDescriptor.f(i10)));
    }

    @Override // c2.g0
    public final void F(Object obj, float f10) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        d0(tag, kotlinx.serialization.json.i.a(Float.valueOf(f10)));
        this.f8008d.getClass();
        if (Math.abs(f10) <= Float.MAX_VALUE) {
            return;
        }
        Float fValueOf = Float.valueOf(f10);
        String output = c0().toString();
        kotlin.jvm.internal.r.e(output, "output");
        throw new r(t.j(fValueOf, tag, output));
    }

    @Override // kotlinx.serialization.json.n
    public final void G(kotlinx.serialization.json.h element) {
        kotlin.jvm.internal.r.e(element, "element");
        if (this.f8009e == null || (element instanceof kotlinx.serialization.json.v)) {
            J(JsonElementSerializer.INSTANCE, element);
        } else {
            j0.d(this.f8010f, element);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    @Override // ci.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void J(zh.i<? super T> serializer, T t3) {
        String strC;
        kotlin.jvm.internal.r.e(serializer, "serializer");
        Object objK = qg.x.K((ArrayList) this.f4646a);
        kotlinx.serialization.json.b bVar = this.f8006b;
        if (objK == null) {
            bi.f fVarA = s0.a(serializer.getDescriptor(), bVar.f16437b);
            if ((fVarA.getKind() instanceof bi.e) || fVarA.getKind() == l.b.f4277a) {
                new x(bVar, this.f8007c).J(serializer, t3);
                return;
            }
        }
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
            this.f8009e = strC;
            this.f8010f = strA;
        }
        serializer.serialize(this, t3);
    }

    @Override // c2.g0
    public final ci.e P(Object obj, bi.f inlineDescriptor) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlin.jvm.internal.r.e(inlineDescriptor, "inlineDescriptor");
        if (m0.a(inlineDescriptor)) {
            return new e(this, tag);
        }
        if (inlineDescriptor.isInline() && inlineDescriptor.equals(kotlinx.serialization.json.i.f16449a)) {
            return new d(this, tag, inlineDescriptor);
        }
        ((ArrayList) this.f4646a).add(tag);
        return this;
    }

    @Override // c2.g0
    public final void Q(int i10, Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        d0(tag, kotlinx.serialization.json.i.a(Integer.valueOf(i10)));
    }

    @Override // c2.g0
    public final void R(Object obj, long j10) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        d0(tag, kotlinx.serialization.json.i.a(Long.valueOf(j10)));
    }

    @Override // c2.g0
    public final void S(Object obj, short s10) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        d0(tag, kotlinx.serialization.json.i.a(Short.valueOf(s10)));
    }

    @Override // c2.g0
    public final void T(Object obj, String value) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlin.jvm.internal.r.e(value, "value");
        d0(tag, kotlinx.serialization.json.i.b(value));
    }

    @Override // c2.g0
    public final void U(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        this.f8007c.invoke(c0());
    }

    @Override // ci.e
    public final ei.b a() {
        return this.f8006b.f16437b;
    }

    @Override // ci.e
    public final ci.c c(bi.f descriptor) {
        f d0Var;
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        eh.l nodeConsumer = qg.x.K((ArrayList) this.f4646a) == null ? this.f8007c : new c(this);
        bi.l kind = descriptor.getKind();
        boolean zA = kotlin.jvm.internal.r.a(kind, m.b.f4279a);
        kotlinx.serialization.json.b bVar = this.f8006b;
        if (zA || (kind instanceof bi.d)) {
            d0Var = new d0(bVar, nodeConsumer);
        } else if (kotlin.jvm.internal.r.a(kind, m.c.f4280a)) {
            bi.f fVarA = s0.a(descriptor.h(0), bVar.f16437b);
            bi.l kind2 = fVarA.getKind();
            if (!(kind2 instanceof bi.e) && !kotlin.jvm.internal.r.a(kind2, l.b.f4277a)) {
                throw t.b(fVarA);
            }
            kotlin.jvm.internal.r.e(nodeConsumer, "nodeConsumer");
            f0 f0Var = new f0(bVar, nodeConsumer);
            f0Var.f8012j = true;
            d0Var = f0Var;
        } else {
            d0Var = new b0(bVar, nodeConsumer);
        }
        String str = this.f8009e;
        if (str != null) {
            if (d0Var instanceof f0) {
                f0 f0Var2 = (f0) d0Var;
                f0Var2.d0("key", kotlinx.serialization.json.i.b(str));
                String strA = this.f8010f;
                if (strA == null) {
                    strA = descriptor.a();
                }
                f0Var2.d0("value", kotlinx.serialization.json.i.b(strA));
            } else {
                String strA2 = this.f8010f;
                if (strA2 == null) {
                    strA2 = descriptor.a();
                }
                d0Var.d0(str, kotlinx.serialization.json.i.b(strA2));
            }
            this.f8009e = null;
            this.f8010f = null;
        }
        return d0Var;
    }

    public abstract kotlinx.serialization.json.h c0();

    @Override // kotlinx.serialization.json.n
    public final kotlinx.serialization.json.b d() {
        return this.f8006b;
    }

    public abstract void d0(String str, kotlinx.serialization.json.h hVar);

    @Override // c2.g0, ci.e
    public final ci.e f(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        if (qg.x.K((ArrayList) this.f4646a) == null) {
            return new x(this.f8006b, this.f8007c).f(descriptor);
        }
        if (this.f8009e != null) {
            this.f8010f = descriptor.a();
        }
        return super.f(descriptor);
    }

    @Override // ci.e
    public final void h() {
        String str = (String) qg.x.K((ArrayList) this.f4646a);
        if (str == null) {
            this.f8007c.invoke(kotlinx.serialization.json.t.INSTANCE);
        } else {
            d0(str, kotlinx.serialization.json.t.INSTANCE);
        }
    }

    @Override // ci.c
    public final boolean i(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        this.f8008d.getClass();
        return false;
    }

    @Override // c2.g0
    public String j(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlinx.serialization.json.b json = this.f8006b;
        kotlin.jvm.internal.r.e(json, "json");
        u.d(descriptor, json);
        return descriptor.f(i10);
    }

    @Override // c2.g0
    public final void s(Object obj, boolean z10) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        Boolean boolValueOf = Boolean.valueOf(z10);
        kotlinx.serialization.internal.u uVar = kotlinx.serialization.json.i.f16449a;
        d0(tag, new kotlinx.serialization.json.r(boolValueOf, false, null));
    }

    @Override // c2.g0
    public final void u(Object obj, byte b10) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        d0(tag, kotlinx.serialization.json.i.a(Byte.valueOf(b10)));
    }

    @Override // ci.e
    public final void v() {
    }

    @Override // c2.g0
    public final void w(Object obj, char c10) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        d0(tag, kotlinx.serialization.json.i.b(String.valueOf(c10)));
    }

    @Override // c2.g0
    public final void x(Object obj, double d10) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        d0(tag, kotlinx.serialization.json.i.a(Double.valueOf(d10)));
        this.f8008d.getClass();
        if (Math.abs(d10) <= Double.MAX_VALUE) {
            return;
        }
        Double dValueOf = Double.valueOf(d10);
        String output = c0().toString();
        kotlin.jvm.internal.r.e(output, "output");
        throw new r(t.j(dValueOf, tag, output));
    }
}
