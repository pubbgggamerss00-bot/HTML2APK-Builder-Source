package sc;

import ed.e0;
import ed.f0;
import ed.i0;
import ed.o0;
import ed.z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import sc.o;
import zc.v;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f24809a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a> f24810b;

    /* renamed from: c, reason: collision with root package name */
    public final cd.a f24811c = cd.a.f5394b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ci.a f24812a;

        public a(ci.a aVar) {
            this.f24812a = aVar;
        }
    }

    public j(i0 i0Var, List<a> list) {
        this.f24809a = i0Var;
        this.f24810b = list;
    }

    public static final j a(i0 i0Var) throws GeneralSecurityException {
        if (i0Var.z() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(i0Var.z());
        for (i0.b bVar : i0Var.A()) {
            bVar.getClass();
            try {
                try {
                    ci.a aVarA = zc.j.f35015b.a(zc.s.a(bVar.A().B(), bVar.A().C(), bVar.A().A(), bVar.C(), bVar.C() == o0.RAW ? null : Integer.valueOf(bVar.B())));
                    int iOrdinal = bVar.D().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new a(aVarA));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e10) {
                throw new v("Creating a protokey serialization failed", e10);
            }
        }
        return new j(i0Var, Collections.unmodifiableList(arrayList));
    }

    public static final j c(d4.p pVar, yc.b bVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) pVar.f7355a;
        try {
            z zVarA = z.A(byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.o.a());
            byteArrayInputStream.close();
            if (zVarA.y().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                i0 i0VarE = i0.E(bVar.decrypt(zVarA.y().k(), bArr), com.google.crypto.tink.shaded.protobuf.o.a());
                if (i0VarE.z() > 0) {
                    return a(i0VarE);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (com.google.crypto.tink.shaded.protobuf.z unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th2) {
            byteArrayInputStream.close();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <P> P b(Class<P> cls) throws GeneralSecurityException {
        Class clsA;
        Object objC;
        Object objB;
        HashMap map;
        AtomicReference<f> atomicReference = r.f24831a;
        try {
            map = zc.i.f35013b.f35014a.get().f35026b;
        } catch (GeneralSecurityException unused) {
            clsA = null;
        }
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException(ae.e.a(cls, "No input primitive class for ", " available"));
        }
        clsA = ((p) map.get(cls)).a();
        if (clsA == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i10 = t.f24835a;
        i0 i0Var = this.f24809a;
        int iB = i0Var.B();
        Iterator<i0.b> it = i0Var.A().iterator();
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            f0 f0Var = f0.ENABLED;
            if (!zHasNext) {
                if (i11 == 0) {
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z10 && !z11) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                o.a aVar = new o.a(clsA);
                if (aVar.f24819b == null) {
                    throw new IllegalStateException("setAnnotations cannot be called after build");
                }
                aVar.f24821d = this.f24811c;
                for (int i12 = 0; i12 < i0Var.z(); i12++) {
                    i0.b bVarY = i0Var.y(i12);
                    if (bVarY.D().equals(f0Var)) {
                        try {
                            e0 e0VarA = bVarY.A();
                            AtomicReference<f> atomicReference2 = r.f24831a;
                            objC = r.c(e0VarA.B(), e0VarA.C(), clsA);
                        } catch (GeneralSecurityException e10) {
                            if (!e10.getMessage().contains("No key manager found for key type ") && !e10.getMessage().contains(" not supported by key manager of type ")) {
                                throw e10;
                            }
                            objC = null;
                        }
                        List<a> list = this.f24810b;
                        if (list.get(i12) != null) {
                            try {
                                objB = r.b(list.get(i12).f24812a, clsA);
                            } catch (GeneralSecurityException unused2) {
                            }
                            if (bVarY.B() != i0Var.B()) {
                                aVar.a(objB, objC, bVarY, true);
                            } else {
                                aVar.a(objB, objC, bVarY, false);
                            }
                        } else {
                            objB = null;
                            if (bVarY.B() != i0Var.B()) {
                            }
                        }
                    }
                }
                ConcurrentHashMap concurrentHashMap = aVar.f24819b;
                if (concurrentHashMap == null) {
                    throw new IllegalStateException("build cannot be called twice");
                }
                o.b<P> bVar = aVar.f24820c;
                cd.a aVar2 = aVar.f24821d;
                Class<P> cls2 = aVar.f24818a;
                o oVar = new o(concurrentHashMap, bVar, aVar2, cls2);
                aVar.f24819b = null;
                AtomicReference<f> atomicReference3 = r.f24831a;
                HashMap map2 = zc.i.f35013b.f35014a.get().f35026b;
                if (!map2.containsKey(cls)) {
                    throw new GeneralSecurityException("No wrapper found for " + cls);
                }
                p pVar = (p) map2.get(cls);
                if (cls2.equals(pVar.a()) && pVar.a().equals(cls2)) {
                    return (P) pVar.b(oVar);
                }
                throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
            }
            i0.b next = it.next();
            if (next.D() == f0Var) {
                if (!next.E()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(next.B())));
                }
                if (next.C() == o0.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(next.B())));
                }
                if (next.D() == f0.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(next.B())));
                }
                if (next.B() == iB) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (next.A().A() != e0.b.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i11++;
            }
        }
    }

    public final String toString() {
        return t.a(this.f24809a).toString();
    }
}
