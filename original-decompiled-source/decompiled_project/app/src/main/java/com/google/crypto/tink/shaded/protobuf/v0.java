package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.s;
import com.google.crypto.tink.shaded.protobuf.w;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class v0<T> implements g1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f6803a;

    /* renamed from: b, reason: collision with root package name */
    public final n1<?, ?> f6804b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6805c;

    /* renamed from: d, reason: collision with root package name */
    public final p<?> f6806d;

    public v0(n1<?, ?> n1Var, p<?> pVar, p0 p0Var) {
        this.f6804b = n1Var;
        this.f6805c = pVar.e(p0Var);
        this.f6806d = pVar;
        this.f6803a = p0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final boolean a(w wVar, w wVar2) {
        n1<?, ?> n1Var = this.f6804b;
        if (!n1Var.g(wVar).equals(n1Var.g(wVar2))) {
            return false;
        }
        if (!this.f6805c) {
            return true;
        }
        p<?> pVar = this.f6806d;
        return pVar.c(wVar).equals(pVar.c(wVar2));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final int b(w wVar) {
        int iHashCode = this.f6804b.g(wVar).hashCode();
        if (!this.f6805c) {
            return iHashCode;
        }
        return this.f6806d.c(wVar).f6758a.hashCode() + (iHashCode * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        if (r10 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        r5.c((r1 << 3) | 2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        r7 = r17;
        r1 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(T t3, byte[] bArr, int i10, int i11, e.a aVar) throws Throwable {
        Throwable th2;
        w wVar = (w) t3;
        o1 o1Var = wVar.unknownFields;
        if (o1Var == o1.f6737f) {
            o1Var = new o1();
            wVar.unknownFields = o1Var;
        }
        o1 o1Var2 = o1Var;
        w.c cVar = (w.c) t3;
        s<w.d> sVar = cVar.extensions;
        if (sVar.f6759b) {
            cVar.extensions = sVar.clone();
        }
        Throwable th3 = null;
        int iM = i10;
        w.e eVar = null;
        while (iM < i11) {
            w.e eVarB = eVar;
            int i12 = e.i(bArr, iM, aVar);
            int i13 = aVar.f6647a;
            o oVar = aVar.f6650d;
            p0 p0Var = this.f6803a;
            p<?> pVar = this.f6806d;
            int i14 = 2;
            if (i13 == 11) {
                int i15 = 0;
                Object obj = th3;
                while (true) {
                    if (i12 >= i11) {
                        th2 = th3;
                        break;
                    }
                    i12 = e.i(bArr, i12, aVar);
                    int i16 = aVar.f6647a;
                    int i17 = i16 >>> 3;
                    th2 = th3;
                    int i18 = i16 & 7;
                    if (i17 == i14) {
                        if (i18 == 0) {
                            i12 = e.i(bArr, i12, aVar);
                            i15 = aVar.f6647a;
                            eVarB = pVar.b(oVar, p0Var, i15);
                        }
                        th3 = th2;
                        i14 = 2;
                    } else if (i17 == 3) {
                        if (eVarB != null) {
                            c1 c1Var = c1.f6638c;
                            throw th2;
                        }
                        if (i18 == 2) {
                            i12 = e.a(bArr, i12, aVar);
                            obj = (h) aVar.f6649c;
                        } else if (i16 == 12) {
                            break;
                        } else {
                            i12 = e.m(i16, bArr, i12, i11, aVar);
                        }
                        th3 = th2;
                        i14 = 2;
                    }
                }
            } else if ((i13 & 7) == 2) {
                eVarB = pVar.b(oVar, p0Var, i13 >>> 3);
                if (eVarB != null) {
                    c1 c1Var2 = c1.f6638c;
                    throw th3;
                }
                iM = e.g(i13, bArr, i12, i11, o1Var2, aVar);
            } else {
                iM = e.m(i13, bArr, i12, i11, aVar);
            }
            eVar = eVarB;
        }
        if (iM != i11) {
            throw z.f();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final void d(T t3, v1 v1Var) throws IOException {
        Iterator itF = this.f6806d.c(t3).f();
        if (itF.hasNext()) {
            ((s.a) ((Map.Entry) itF.next()).getKey()).getLiteJavaType();
            throw null;
        }
        n1<?, ?> n1Var = this.f6804b;
        n1Var.q(n1Var.g(t3), v1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final int e(a aVar) {
        n1<?, ?> n1Var = this.f6804b;
        int i10 = n1Var.i(n1Var.g(aVar));
        if (this.f6805c) {
            i1 i1Var = this.f6806d.c(aVar).f6758a;
            if (i1Var.f6705b.size() > 0) {
                s.c(i1Var.f(0));
                throw null;
            }
            Iterator<Map.Entry<Object, Object>> it = i1Var.g().iterator();
            if (it.hasNext()) {
                s.c(it.next());
                throw null;
            }
        }
        return i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final void f(Object obj, j jVar, o oVar) throws IOException {
        n1<?, ?> n1Var = this.f6804b;
        o1 o1VarF = n1Var.f(obj);
        p<?> pVar = this.f6806d;
        s<T> sVarD = pVar.d(obj);
        while (jVar.a() != Integer.MAX_VALUE) {
            try {
                j jVar2 = jVar;
                o oVar2 = oVar;
                if (!g(jVar2, oVar2, pVar, sVarD, n1Var, o1VarF)) {
                    return;
                }
                jVar = jVar2;
                oVar = oVar2;
            } finally {
                n1Var.n(obj, o1VarF);
            }
        }
    }

    public final boolean g(j jVar, o oVar, p pVar, s sVar, n1 n1Var, Object obj) throws IOException {
        int i10 = jVar.f6698b;
        p0 p0Var = this.f6803a;
        if (i10 != 11) {
            if ((i10 & 7) != 2) {
                return jVar.w();
            }
            w.e eVarB = pVar.b(oVar, p0Var, i10 >>> 3);
            if (eVarB == null) {
                return n1Var.l(obj, jVar);
            }
            pVar.h(eVarB);
            throw null;
        }
        int iY = 0;
        w.e eVarB2 = null;
        h hVarE = null;
        while (jVar.a() != Integer.MAX_VALUE) {
            int i11 = jVar.f6698b;
            if (i11 == 16) {
                jVar.v(0);
                iY = jVar.f6697a.y();
                eVarB2 = pVar.b(oVar, p0Var, iY);
            } else if (i11 == 26) {
                if (eVarB2 != null) {
                    pVar.h(eVarB2);
                    throw null;
                }
                hVarE = jVar.e();
            } else if (!jVar.w()) {
                break;
            }
        }
        if (jVar.f6698b != 12) {
            throw new z("Protocol message end-group tag did not match expected tag.");
        }
        if (hVarE == null) {
            return true;
        }
        if (eVarB2 == null) {
            n1Var.d(obj, iY, hVarE);
            return true;
        }
        pVar.i(eVarB2);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final boolean isInitialized(T t3) {
        this.f6806d.c(t3).d();
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final void makeImmutable(T t3) {
        this.f6804b.j(t3);
        this.f6806d.f(t3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final void mergeFrom(T t3, T t10) {
        Class<?> cls = h1.f6674a;
        n1<?, ?> n1Var = this.f6804b;
        n1Var.o(t3, n1Var.k(n1Var.g(t3), n1Var.g(t10)));
        if (this.f6805c) {
            h1.y(this.f6806d, t3, t10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final T newInstance() {
        p0 p0Var = this.f6803a;
        return p0Var instanceof w ? (T) ((w) p0Var).q() : (T) p0Var.newBuilderForType().buildPartial();
    }
}
