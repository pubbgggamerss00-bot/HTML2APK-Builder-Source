package di;

import di.q;
import di.v;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

/* loaded from: classes2.dex */
public final class k0 extends ci.a implements kotlinx.serialization.json.g {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.json.b f8034a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f8035b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f8036c;

    /* renamed from: d, reason: collision with root package name */
    public final ei.b f8037d;

    /* renamed from: e, reason: collision with root package name */
    public int f8038e;

    /* renamed from: f, reason: collision with root package name */
    public a f8039f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.serialization.json.f f8040g;

    /* renamed from: h, reason: collision with root package name */
    public final q f8041h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f8042a;
    }

    public k0(kotlinx.serialization.json.b bVar, r0 r0Var, n0 n0Var, bi.f descriptor, a aVar) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        this.f8034a = bVar;
        this.f8035b = r0Var;
        this.f8036c = n0Var;
        this.f8037d = bVar.f16437b;
        this.f8038e = -1;
        this.f8039f = aVar;
        kotlinx.serialization.json.f fVar = bVar.f16436a;
        this.f8040g = fVar;
        this.f8041h = fVar.f16444c ? null : new q(descriptor);
    }

    @Override // ci.a, ci.d
    public final byte B() {
        n0 n0Var = this.f8036c;
        long jH = n0Var.h();
        byte b10 = (byte) jH;
        if (jH == b10) {
            return b10;
        }
        n0.n(n0Var, "Failed to parse byte for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // ci.a, ci.d
    public final short C() {
        n0 n0Var = this.f8036c;
        long jH = n0Var.h();
        short s10 = (short) jH;
        if (jH == s10) {
            return s10;
        }
        n0.n(n0Var, "Failed to parse short for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // ci.a, ci.d
    public final float D() throws NumberFormatException {
        n0 n0Var = this.f8036c;
        String strJ = n0Var.j();
        try {
            float f10 = Float.parseFloat(strJ);
            if (Math.abs(f10) <= Float.MAX_VALUE) {
                return f10;
            }
            t.i(n0Var, Float.valueOf(f10));
            throw null;
        } catch (IllegalArgumentException unused) {
            n0.n(n0Var, "Failed to parse type 'float' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // ci.a, ci.d
    public final double E() throws NumberFormatException {
        n0 n0Var = this.f8036c;
        String strJ = n0Var.j();
        try {
            double d10 = Double.parseDouble(strJ);
            if (Math.abs(d10) <= Double.MAX_VALUE) {
                return d10;
            }
            t.i(n0Var, Double.valueOf(d10));
            throw null;
        } catch (IllegalArgumentException unused) {
            n0.n(n0Var, "Failed to parse type 'double' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // ci.d, ci.b
    public final ei.b a() {
        return this.f8037d;
    }

    @Override // ci.a, ci.b
    public final void b(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        if (descriptor.e() == 0 && u.c(descriptor, this.f8034a)) {
            while (g(descriptor) != -1) {
            }
        }
        n0 n0Var = this.f8036c;
        if (n0Var.v()) {
            t.e(n0Var, "");
            throw null;
        }
        n0Var.g(this.f8035b.f8075b);
        v vVar = n0Var.f8057b;
        int i10 = vVar.f8080c;
        int[] iArr = vVar.f8079b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            vVar.f8080c = i10 - 1;
        }
        int i11 = vVar.f8080c;
        if (i11 != -1) {
            vVar.f8080c = i11 - 1;
        }
    }

    @Override // ci.a, ci.d
    public final ci.b c(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlinx.serialization.json.b bVar = this.f8034a;
        r0 r0VarB = s0.b(descriptor, bVar);
        n0 n0Var = this.f8036c;
        v vVar = n0Var.f8057b;
        int i10 = vVar.f8080c + 1;
        vVar.f8080c = i10;
        Object[] objArr = vVar.f8078a;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
            kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
            vVar.f8078a = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(vVar.f8079b, i11);
            kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
            vVar.f8079b = iArrCopyOf;
        }
        vVar.f8078a[i10] = descriptor;
        n0Var.g(r0VarB.f8074a);
        if (n0Var.r() != 4) {
            int iOrdinal = r0VarB.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new k0(bVar, r0VarB, n0Var, descriptor, this.f8039f) : (this.f8035b == r0VarB && bVar.f16436a.f16444c) ? this : new k0(bVar, r0VarB, n0Var, descriptor, this.f8039f);
        }
        n0.n(n0Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.json.g
    public final kotlinx.serialization.json.b d() {
        return this.f8034a;
    }

    @Override // ci.a, ci.d
    public final ci.d e(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return m0.a(descriptor) ? new o(this.f8036c, this.f8034a) : this;
    }

    @Override // ci.a, ci.d
    public final boolean f() {
        boolean z10;
        boolean z11;
        n0 n0Var = this.f8036c;
        int iU = n0Var.u();
        String str = n0Var.f8060e;
        if (iU == str.length()) {
            n0.n(n0Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iU) == '\"') {
            iU++;
            z10 = true;
        } else {
            z10 = false;
        }
        int iT = n0Var.t(iU);
        if (iT >= str.length() || iT == -1) {
            n0.n(n0Var, "EOF", 0, null, 6);
            throw null;
        }
        int i10 = iT + 1;
        int iCharAt = str.charAt(iT) | ' ';
        if (iCharAt == 102) {
            n0Var.c(i10, "alse");
            z11 = false;
        } else {
            if (iCharAt != 116) {
                n0.n(n0Var, "Expected valid boolean literal prefix, but had '" + n0Var.j() + '\'', 0, null, 6);
                throw null;
            }
            n0Var.c(i10, "rue");
            z11 = true;
        }
        if (!z10) {
            return z11;
        }
        if (n0Var.f8056a == str.length()) {
            n0.n(n0Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(n0Var.f8056a) == '\"') {
            n0Var.f8056a++;
            return z11;
        }
        n0.n(n0Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f2, code lost:
    
        r1 = r3.f8080c;
        r5 = r3.f8079b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f9, code lost:
    
        if (r5[r1] != (-2)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fb, code lost:
    
        r5[r1] = -1;
        r3.f8080c = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0100, code lost:
    
        r1 = r3.f8080c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0102, code lost:
    
        if (r1 == (-1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0104, code lost:
    
        r3.f8080c = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        r1 = mh.x.B(6, r2.p().subSequence(0, r2.f8056a).toString(), r6);
        r5 = androidx.datastore.preferences.protobuf.h.a(r1, "Encountered an unknown key '", r6, "' at offset ", " at path: ");
        r5.append(r3.a());
        r5.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
        r5.append((java.lang.Object) di.t.g(r4, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0140, code lost:
    
        throw new di.p(r5.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(bi.f descriptor) {
        char c10;
        n0 n0Var = this.f8036c;
        v vVar = n0Var.f8057b;
        String str = n0Var.f8060e;
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        r0 r0Var = this.f8035b;
        int iOrdinal = r0Var.ordinal();
        char c11 = ':';
        int i10 = 0;
        zV = false;
        boolean zV = false;
        byte b10 = 1;
        int i11 = -1;
        if (iOrdinal == 0) {
            boolean zV2 = n0Var.v();
            while (true) {
                boolean zB = n0Var.b();
                q qVar = this.f8041h;
                if (zB) {
                    boolean z10 = this.f8040g.f16443b;
                    String strK = z10 ? n0Var.k() : n0Var.d();
                    n0Var.g(c11);
                    kotlinx.serialization.json.b bVar = this.f8034a;
                    byte b11 = b10;
                    int iA = u.a(descriptor, bVar, strK);
                    if (iA != -3) {
                        if (qVar != null) {
                            kotlinx.serialization.internal.n nVar = qVar.f8065a;
                            if (iA < 64) {
                                nVar.f16386c |= 1 << iA;
                            } else {
                                int i12 = (iA >>> 6) - 1;
                                long[] jArr = nVar.f16387d;
                                jArr[i12] = jArr[i12] | (1 << (iA & 63));
                            }
                        }
                        i11 = iA;
                    } else {
                        if (!u.c(descriptor, bVar)) {
                            a aVar = this.f8039f;
                            if (aVar == null || !kotlin.jvm.internal.r.a(aVar.f8042a, strK)) {
                                break;
                            }
                            aVar.f8042a = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bR = n0Var.r();
                        if (bR == 8 || bR == 6) {
                            while (true) {
                                byte bR2 = n0Var.r();
                                b10 = b11;
                                if (bR2 != b10) {
                                    c10 = 6;
                                    if (bR2 == 8 || bR2 == 6) {
                                        arrayList.add(Byte.valueOf(bR2));
                                    } else {
                                        if (bR2 == 9) {
                                            if (((Number) qg.x.J(arrayList)).byteValue() != 8) {
                                                throw t.c(n0Var.f8056a, str, "found ] instead of } at path: " + vVar);
                                            }
                                            qg.t.t(arrayList);
                                        } else if (bR2 == 7) {
                                            if (((Number) qg.x.J(arrayList)).byteValue() != 6) {
                                                throw t.c(n0Var.f8056a, str, "found } instead of ] at path: " + vVar);
                                            }
                                            qg.t.t(arrayList);
                                        } else if (bR2 == 10) {
                                            n0.n(n0Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                        c10 = 6;
                                    }
                                    n0Var.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z10) {
                                    n0Var.j();
                                } else {
                                    n0Var.d();
                                }
                                b11 = b10;
                            }
                        } else {
                            n0Var.j();
                            b10 = b11;
                            c10 = 6;
                        }
                        zV2 = n0Var.v();
                        c11 = ':';
                    }
                } else {
                    if (zV2) {
                        t.f(n0Var);
                        throw null;
                    }
                    if (qVar != null) {
                        kotlinx.serialization.internal.n nVar2 = qVar.f8065a;
                        q.a aVar2 = nVar2.f16385b;
                        bi.f fVar = nVar2.f16384a;
                        int iE = fVar.e();
                        while (true) {
                            long j10 = nVar2.f16386c;
                            long j11 = -1;
                            if (j10 != -1) {
                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                                nVar2.f16386c |= 1 << iNumberOfTrailingZeros;
                                if (((Boolean) aVar2.invoke(fVar, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                    i11 = iNumberOfTrailingZeros;
                                    break;
                                }
                            } else if (iE > 64) {
                                long[] jArr2 = nVar2.f16387d;
                                int length = jArr2.length;
                                loop3: while (i10 < length) {
                                    int i13 = i10 + 1;
                                    int i14 = i13 * 64;
                                    long j12 = jArr2[i10];
                                    while (j12 != j11) {
                                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j12);
                                        j12 |= 1 << iNumberOfTrailingZeros2;
                                        i11 = iNumberOfTrailingZeros2 + i14;
                                        if (((Boolean) aVar2.invoke(fVar, Integer.valueOf(i11))).booleanValue()) {
                                            jArr2[i10] = j12;
                                            break loop3;
                                        }
                                        j11 = -1;
                                    }
                                    jArr2[i10] = j12;
                                    i10 = i13;
                                    j11 = -1;
                                }
                            }
                        }
                    } else {
                        i11 = -1;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zV3 = n0Var.v();
            if (n0Var.b()) {
                int i15 = this.f8038e;
                if (i15 != -1 && !zV3) {
                    n0.n(n0Var, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i11 = i15 + 1;
                this.f8038e = i11;
            } else if (zV3) {
                t.e(n0Var, "array");
                throw null;
            }
        } else {
            int i16 = this.f8038e;
            Object[] objArr = i16 % 2 != 0;
            if (objArr != true) {
                n0Var.g(':');
            } else if (i16 != -1) {
                zV = n0Var.v();
            }
            if (n0Var.b()) {
                if (objArr != false) {
                    if (this.f8038e == -1) {
                        int i17 = n0Var.f8056a;
                        if (zV) {
                            n0.n(n0Var, "Unexpected leading comma", i17, null, 4);
                            throw null;
                        }
                    } else {
                        int i18 = n0Var.f8056a;
                        if (!zV) {
                            n0.n(n0Var, "Expected comma after the key-value pair", i18, null, 4);
                            throw null;
                        }
                    }
                }
                i11 = this.f8038e + 1;
                this.f8038e = i11;
            } else if (zV) {
                t.f(n0Var);
                throw null;
            }
        }
        if (r0Var != r0.f8070e) {
            vVar.f8079b[vVar.f8080c] = i11;
        }
        return i11;
    }

    @Override // ci.a, ci.d
    public final char h() {
        n0 n0Var = this.f8036c;
        String strJ = n0Var.j();
        if (strJ.length() == 1) {
            return strJ.charAt(0);
        }
        n0.n(n0Var, "Expected single char, but got '" + strJ + '\'', 0, null, 6);
        throw null;
    }

    @Override // ci.a, ci.d
    public final int i(bi.f enumDescriptor) {
        kotlin.jvm.internal.r.e(enumDescriptor, "enumDescriptor");
        return u.b(enumDescriptor, this.f8034a, r(), " at path " + this.f8036c.f8057b.a());
    }

    @Override // kotlinx.serialization.json.g
    public final kotlinx.serialization.json.h l() {
        return new i0(this.f8034a.f16436a, this.f8036c).b();
    }

    @Override // ci.a, ci.d
    public final int m() {
        n0 n0Var = this.f8036c;
        long jH = n0Var.h();
        int i10 = (int) jH;
        if (jH == i10) {
            return i10;
        }
        n0.n(n0Var, "Failed to parse int for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    @Override // ci.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> T q(zh.a<? extends T> deserializer) {
        String message;
        kotlinx.serialization.json.b bVar = this.f8034a;
        n0 n0Var = this.f8036c;
        v vVar = n0Var.f8057b;
        kotlin.jvm.internal.r.e(deserializer, "deserializer");
        try {
        } catch (zh.c e10) {
            message = e10.getMessage();
            kotlin.jvm.internal.r.b(message);
            if (!mh.x.r(message, "at path", false)) {
            }
        }
        if (!(deserializer instanceof AbstractPolymorphicSerializer)) {
            return deserializer.deserialize(this);
        }
        String strC = j0.c(((AbstractPolymorphicSerializer) deserializer).getDescriptor(), bVar);
        String strQ = n0Var.q(strC, this.f8040g.f16443b);
        String strC2 = null;
        if (strQ != null) {
            try {
                zh.a aVarA = zh.e.a((AbstractPolymorphicSerializer) deserializer, this, strQ);
                a aVar = new a();
                aVar.f8042a = strC;
                this.f8039f = aVar;
                return (T) aVarA.deserialize(this);
            } catch (zh.h e11) {
                String message2 = e11.getMessage();
                kotlin.jvm.internal.r.b(message2);
                String strJ = mh.x.J(mh.x.U(message2, '\n'), ".");
                String message3 = e11.getMessage();
                kotlin.jvm.internal.r.b(message3);
                n0.n(n0Var, strJ, 0, mh.x.R(message3, '\n', ""), 2);
                throw null;
            }
        }
        if (!(deserializer instanceof AbstractPolymorphicSerializer)) {
            return deserializer.deserialize(this);
        }
        String strC3 = j0.c(((AbstractPolymorphicSerializer) deserializer).getDescriptor(), bVar);
        kotlinx.serialization.json.h hVarL = l();
        String strA = ((AbstractPolymorphicSerializer) deserializer).getDescriptor().a();
        if (!(hVarL instanceof kotlinx.serialization.json.v)) {
            throw t.c(-1, hVarL.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.v.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarL.getClass()).e() + " as the serialized body of " + strA + " at element: " + vVar.a());
        }
        kotlinx.serialization.json.v vVar2 = (kotlinx.serialization.json.v) hVarL;
        kotlinx.serialization.json.h hVar = (kotlinx.serialization.json.h) vVar2.get(strC3);
        if (hVar != null) {
            kotlinx.serialization.json.x xVarF = kotlinx.serialization.json.i.f(hVar);
            if (!(xVarF instanceof kotlinx.serialization.json.t)) {
                strC2 = xVarF.c();
            }
        }
        try {
            return (T) p0.c(bVar, strC3, vVar2, zh.e.a((AbstractPolymorphicSerializer) deserializer, this, strC2));
        } catch (zh.h e12) {
            String message4 = e12.getMessage();
            kotlin.jvm.internal.r.b(message4);
            throw t.c(-1, vVar2.toString(), message4);
        }
        message = e10.getMessage();
        kotlin.jvm.internal.r.b(message);
        if (!mh.x.r(message, "at path", false)) {
            throw e10;
        }
        throw new zh.c(e10.f35075a, e10.getMessage() + " at path: " + vVar.a(), e10);
    }

    @Override // ci.a, ci.d
    public final String r() {
        boolean z10 = this.f8040g.f16443b;
        n0 n0Var = this.f8036c;
        return z10 ? n0Var.k() : n0Var.i();
    }

    @Override // ci.a, ci.b
    public final <T> T u(bi.f descriptor, int i10, zh.a<? extends T> deserializer, T t3) {
        v vVar = this.f8036c.f8057b;
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlin.jvm.internal.r.e(deserializer, "deserializer");
        boolean z10 = this.f8035b == r0.f8070e && (i10 & 1) == 0;
        if (z10) {
            int[] iArr = vVar.f8079b;
            int i11 = vVar.f8080c;
            if (iArr[i11] == -2) {
                vVar.f8078a[i11] = v.a.f8081a;
            }
        }
        T t10 = (T) super.u(descriptor, i10, deserializer, t3);
        if (z10) {
            int[] iArr2 = vVar.f8079b;
            int i12 = vVar.f8080c;
            if (iArr2[i12] != -2) {
                int i13 = i12 + 1;
                vVar.f8080c = i13;
                Object[] objArr = vVar.f8078a;
                if (i13 == objArr.length) {
                    int i14 = i13 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i14);
                    kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
                    vVar.f8078a = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf(vVar.f8079b, i14);
                    kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
                    vVar.f8079b = iArrCopyOf;
                }
            }
            Object[] objArr2 = vVar.f8078a;
            int i15 = vVar.f8080c;
            objArr2[i15] = t10;
            vVar.f8079b[i15] = -2;
        }
        return t10;
    }

    @Override // ci.a, ci.d
    public final long v() {
        return this.f8036c.h();
    }

    @Override // ci.a, ci.d
    public final boolean x() {
        q qVar = this.f8041h;
        if (!(qVar != null ? qVar.f8066b : false)) {
            n0 n0Var = this.f8036c;
            int iT = n0Var.t(n0Var.u());
            int length = n0Var.p().length() - iT;
            boolean z10 = false;
            if (length >= 4 && iT != -1) {
                int i10 = 0;
                while (true) {
                    if (i10 < 4) {
                        if ("null".charAt(i10) != n0Var.p().charAt(iT + i10)) {
                            break;
                        }
                        i10++;
                    } else if (length <= 4 || di.a.a(n0Var.p().charAt(iT + 4)) != 0) {
                        z10 = true;
                        n0Var.f8056a = iT + 4;
                    }
                }
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }
}
