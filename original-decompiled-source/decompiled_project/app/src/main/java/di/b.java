package di;

import bi.l;
import bi.m;
import java.util.NoSuchElementException;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

/* loaded from: classes2.dex */
public abstract class b extends kotlinx.serialization.internal.f0 implements kotlinx.serialization.json.g {

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.json.b f7986c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7987d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.serialization.json.f f7988e;

    public b(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.h hVar, String str) {
        this.f7986c = bVar;
        this.f7987d = str;
        this.f7988e = bVar.f16436a;
    }

    @Override // kotlinx.serialization.internal.f0
    public final boolean F(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlinx.serialization.json.h hVarU = U(tag);
        if (hVarU instanceof kotlinx.serialization.json.x) {
            kotlinx.serialization.json.x xVar = (kotlinx.serialization.json.x) hVarU;
            try {
                Boolean boolD = kotlinx.serialization.json.i.d(xVar);
                if (boolD != null) {
                    return boolD.booleanValue();
                }
                Y(xVar, "boolean", tag);
                throw null;
            } catch (IllegalArgumentException unused) {
                Y(xVar, "boolean", tag);
                throw null;
            }
        }
        throw t.c(-1, hVarU.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.x.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarU.getClass()).e() + " as the serialized body of boolean at element: " + X(tag));
    }

    @Override // kotlinx.serialization.internal.f0
    public final byte G(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlinx.serialization.json.h hVarU = U(tag);
        if (!(hVarU instanceof kotlinx.serialization.json.x)) {
            throw t.c(-1, hVarU.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.x.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarU.getClass()).e() + " as the serialized body of byte at element: " + X(tag));
        }
        kotlinx.serialization.json.x xVar = (kotlinx.serialization.json.x) hVarU;
        try {
            long jG = kotlinx.serialization.json.i.g(xVar);
            Byte bValueOf = (-128 > jG || jG > 127) ? null : Byte.valueOf((byte) jG);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            Y(xVar, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            Y(xVar, "byte", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.f0
    public final char H(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlinx.serialization.json.h hVarU = U(tag);
        if (!(hVarU instanceof kotlinx.serialization.json.x)) {
            throw t.c(-1, hVarU.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.x.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarU.getClass()).e() + " as the serialized body of char at element: " + X(tag));
        }
        kotlinx.serialization.json.x xVar = (kotlinx.serialization.json.x) hVarU;
        try {
            String strC = xVar.c();
            kotlin.jvm.internal.r.e(strC, "<this>");
            int length = strC.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strC.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            Y(xVar, "char", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.f0
    public final double I(Object obj) throws NumberFormatException {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlinx.serialization.json.h hVarU = U(tag);
        if (!(hVarU instanceof kotlinx.serialization.json.x)) {
            throw t.c(-1, hVarU.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.x.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarU.getClass()).e() + " as the serialized body of double at element: " + X(tag));
        }
        kotlinx.serialization.json.x xVar = (kotlinx.serialization.json.x) hVarU;
        try {
            kotlinx.serialization.internal.u uVar = kotlinx.serialization.json.i.f16449a;
            double d10 = Double.parseDouble(xVar.c());
            kotlinx.serialization.json.f fVar = this.f7986c.f16436a;
            if (Math.abs(d10) <= Double.MAX_VALUE) {
                return d10;
            }
            Double dValueOf = Double.valueOf(d10);
            String output = V().toString();
            kotlin.jvm.internal.r.e(output, "output");
            throw t.d(-1, t.j(dValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            Y(xVar, "double", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.f0
    public final int J(Object obj, bi.f enumDescriptor) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlin.jvm.internal.r.e(enumDescriptor, "enumDescriptor");
        kotlinx.serialization.json.h hVarU = U(tag);
        String strA = enumDescriptor.a();
        if (hVarU instanceof kotlinx.serialization.json.x) {
            return u.b(enumDescriptor, this.f7986c, ((kotlinx.serialization.json.x) hVarU).c(), "");
        }
        throw t.c(-1, hVarU.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.x.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarU.getClass()).e() + " as the serialized body of " + strA + " at element: " + X(tag));
    }

    @Override // kotlinx.serialization.internal.f0
    public final float K(Object obj) throws NumberFormatException {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlinx.serialization.json.h hVarU = U(tag);
        if (!(hVarU instanceof kotlinx.serialization.json.x)) {
            throw t.c(-1, hVarU.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.x.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarU.getClass()).e() + " as the serialized body of float at element: " + X(tag));
        }
        kotlinx.serialization.json.x xVar = (kotlinx.serialization.json.x) hVarU;
        try {
            kotlinx.serialization.internal.u uVar = kotlinx.serialization.json.i.f16449a;
            float f10 = Float.parseFloat(xVar.c());
            kotlinx.serialization.json.f fVar = this.f7986c.f16436a;
            if (Math.abs(f10) <= Float.MAX_VALUE) {
                return f10;
            }
            Float fValueOf = Float.valueOf(f10);
            String output = V().toString();
            kotlin.jvm.internal.r.e(output, "output");
            throw t.d(-1, t.j(fValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            Y(xVar, "float", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.f0
    public final ci.d L(Object obj, bi.f inlineDescriptor) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlin.jvm.internal.r.e(inlineDescriptor, "inlineDescriptor");
        if (!m0.a(inlineDescriptor)) {
            this.f16364a.add(tag);
            return this;
        }
        kotlinx.serialization.json.h hVarU = U(tag);
        String strA = inlineDescriptor.a();
        if (hVarU instanceof kotlinx.serialization.json.x) {
            String source = ((kotlinx.serialization.json.x) hVarU).c();
            kotlinx.serialization.json.b json = this.f7986c;
            kotlin.jvm.internal.r.e(json, "json");
            kotlin.jvm.internal.r.e(source, "source");
            return new o(new n0(source), json);
        }
        throw t.c(-1, hVarU.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.x.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarU.getClass()).e() + " as the serialized body of " + strA + " at element: " + X(tag));
    }

    @Override // kotlinx.serialization.internal.f0
    public final int M(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlinx.serialization.json.h hVarU = U(tag);
        if (!(hVarU instanceof kotlinx.serialization.json.x)) {
            throw t.c(-1, hVarU.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.x.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarU.getClass()).e() + " as the serialized body of int at element: " + X(tag));
        }
        kotlinx.serialization.json.x xVar = (kotlinx.serialization.json.x) hVarU;
        try {
            long jG = kotlinx.serialization.json.i.g(xVar);
            Integer numValueOf = (-2147483648L > jG || jG > 2147483647L) ? null : Integer.valueOf((int) jG);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            Y(xVar, "int", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            Y(xVar, "int", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.f0
    public final long N(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlinx.serialization.json.h hVarU = U(tag);
        if (hVarU instanceof kotlinx.serialization.json.x) {
            kotlinx.serialization.json.x xVar = (kotlinx.serialization.json.x) hVarU;
            try {
                return kotlinx.serialization.json.i.g(xVar);
            } catch (IllegalArgumentException unused) {
                Y(xVar, "long", tag);
                throw null;
            }
        }
        throw t.c(-1, hVarU.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.x.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarU.getClass()).e() + " as the serialized body of long at element: " + X(tag));
    }

    @Override // kotlinx.serialization.internal.f0
    public final short O(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlinx.serialization.json.h hVarU = U(tag);
        if (!(hVarU instanceof kotlinx.serialization.json.x)) {
            throw t.c(-1, hVarU.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.x.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarU.getClass()).e() + " as the serialized body of short at element: " + X(tag));
        }
        kotlinx.serialization.json.x xVar = (kotlinx.serialization.json.x) hVarU;
        try {
            long jG = kotlinx.serialization.json.i.g(xVar);
            Short shValueOf = (-32768 > jG || jG > 32767) ? null : Short.valueOf((short) jG);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            Y(xVar, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            Y(xVar, "short", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.f0
    public final String P(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.r.e(tag, "tag");
        kotlinx.serialization.json.h hVarU = U(tag);
        if (!(hVarU instanceof kotlinx.serialization.json.x)) {
            throw t.c(-1, hVarU.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.x.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarU.getClass()).e() + " as the serialized body of string at element: " + X(tag));
        }
        kotlinx.serialization.json.x xVar = (kotlinx.serialization.json.x) hVarU;
        if (!(xVar instanceof kotlinx.serialization.json.r)) {
            StringBuilder sbA = e.e.a("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbA.append(X(tag));
            throw t.c(-1, V().toString(), sbA.toString());
        }
        kotlinx.serialization.json.r rVar = (kotlinx.serialization.json.r) xVar;
        if (rVar.f16452a || this.f7986c.f16436a.f16443b) {
            return rVar.f16454c;
        }
        StringBuilder sbA2 = e.e.a("String literal for key '", tag, "' should be quoted at element: ");
        sbA2.append(X(tag));
        sbA2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw t.c(-1, V().toString(), sbA2.toString());
    }

    public abstract kotlinx.serialization.json.h U(String str);

    public final kotlinx.serialization.json.h V() {
        kotlinx.serialization.json.h hVarU;
        String str = (String) qg.x.K(this.f16364a);
        return (str == null || (hVarU = U(str)) == null) ? W() : hVarU;
    }

    public abstract kotlinx.serialization.json.h W();

    public final String X(String currentTag) {
        kotlin.jvm.internal.r.e(currentTag, "currentTag");
        return T() + '.' + currentTag;
    }

    public final void Y(kotlinx.serialization.json.x xVar, String str, String str2) {
        throw t.c(-1, V().toString(), "Failed to parse literal '" + xVar + "' as " + (mh.t.p(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + X(str2));
    }

    @Override // ci.d, ci.b
    public final ei.b a() {
        return this.f7986c.f16437b;
    }

    public void b(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
    }

    @Override // ci.d
    public ci.b c(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlinx.serialization.json.h hVarV = V();
        bi.l kind = descriptor.getKind();
        boolean zA = kotlin.jvm.internal.r.a(kind, m.b.f4279a);
        kotlinx.serialization.json.b bVar = this.f7986c;
        if (zA || (kind instanceof bi.d)) {
            String strA = descriptor.a();
            if (hVarV instanceof kotlinx.serialization.json.c) {
                return new c0(bVar, (kotlinx.serialization.json.c) hVarV);
            }
            throw t.c(-1, hVarV.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.c.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarV.getClass()).e() + " as the serialized body of " + strA + " at element: " + T());
        }
        if (!kotlin.jvm.internal.r.a(kind, m.c.f4280a)) {
            String strA2 = descriptor.a();
            if (hVarV instanceof kotlinx.serialization.json.v) {
                return new a0(bVar, (kotlinx.serialization.json.v) hVarV, this.f7987d, 8);
            }
            throw t.c(-1, hVarV.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.v.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarV.getClass()).e() + " as the serialized body of " + strA2 + " at element: " + T());
        }
        bi.f fVarA = s0.a(descriptor.h(0), bVar.f16437b);
        bi.l kind2 = fVarA.getKind();
        if (!(kind2 instanceof bi.e) && !kotlin.jvm.internal.r.a(kind2, l.b.f4277a)) {
            throw t.b(fVarA);
        }
        String strA3 = descriptor.a();
        if (hVarV instanceof kotlinx.serialization.json.v) {
            return new e0(bVar, (kotlinx.serialization.json.v) hVarV);
        }
        throw t.c(-1, hVarV.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.v.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarV.getClass()).e() + " as the serialized body of " + strA3 + " at element: " + T());
    }

    @Override // kotlinx.serialization.json.g
    public final kotlinx.serialization.json.b d() {
        return this.f7986c;
    }

    @Override // kotlinx.serialization.internal.f0, ci.d
    public final ci.d e(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        if (qg.x.K(this.f16364a) != null) {
            return super.e(descriptor);
        }
        return new w(this.f7986c, W(), this.f7987d).e(descriptor);
    }

    @Override // kotlinx.serialization.json.g
    public final kotlinx.serialization.json.h l() {
        return V();
    }

    @Override // ci.d
    public final <T> T q(zh.a<? extends T> deserializer) {
        kotlin.jvm.internal.r.e(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractPolymorphicSerializer)) {
            return deserializer.deserialize(this);
        }
        kotlinx.serialization.json.b bVar = this.f7986c;
        kotlinx.serialization.json.f fVar = bVar.f16436a;
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) deserializer;
        String strC = j0.c(abstractPolymorphicSerializer.getDescriptor(), bVar);
        kotlinx.serialization.json.h hVarV = V();
        String strA = abstractPolymorphicSerializer.getDescriptor().a();
        if (!(hVarV instanceof kotlinx.serialization.json.v)) {
            throw t.c(-1, hVarV.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.v.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarV.getClass()).e() + " as the serialized body of " + strA + " at element: " + T());
        }
        kotlinx.serialization.json.v vVar = (kotlinx.serialization.json.v) hVarV;
        kotlinx.serialization.json.h hVar = (kotlinx.serialization.json.h) vVar.get(strC);
        String strC2 = null;
        if (hVar != null) {
            kotlinx.serialization.json.x xVarF = kotlinx.serialization.json.i.f(hVar);
            if (!(xVarF instanceof kotlinx.serialization.json.t)) {
                strC2 = xVarF.c();
            }
        }
        try {
            return (T) p0.c(bVar, strC, vVar, zh.e.a((AbstractPolymorphicSerializer) deserializer, this, strC2));
        } catch (zh.h e10) {
            String message = e10.getMessage();
            kotlin.jvm.internal.r.b(message);
            throw t.c(-1, vVar.toString(), message);
        }
    }

    @Override // ci.d
    public boolean x() {
        return !(V() instanceof kotlinx.serialization.json.t);
    }
}
