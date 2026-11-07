package sc;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.z;
import ed.e0;
import ed.g0;
import ed.o0;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import sc.f;
import sc.h;
import zc.e;
import zc.r;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference<f> f24831a;

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f24832b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f24833c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f24834d;

    static {
        Logger.getLogger(r.class.getName());
        f24831a = new AtomicReference<>(new f());
        f24832b = new ConcurrentHashMap();
        f24833c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f24834d = new ConcurrentHashMap();
    }

    public static synchronized <KeyProtoT extends p0, KeyFormatProtoT extends p0> void a(String str, Map<String, e.a.C0358a<KeyFormatProtoT>> map, boolean z10) throws GeneralSecurityException {
        if (z10) {
            try {
                ConcurrentHashMap concurrentHashMap = f24833c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } finally {
            }
        }
        if (z10) {
            if (f24831a.get().f24800a.containsKey(str)) {
                for (Map.Entry<String, e.a.C0358a<KeyFormatProtoT>> entry : map.entrySet()) {
                    if (!f24834d.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + entry.getKey() + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry<String, e.a.C0358a<KeyFormatProtoT>> entry2 : map.entrySet()) {
                    if (f24834d.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + entry2.getKey());
                    }
                }
            }
        }
    }

    public static <KeyT extends ci.a, P> P b(KeyT keyt, Class<P> cls) throws GeneralSecurityException {
        zc.r rVar = zc.i.f35013b.f35014a.get();
        rVar.getClass();
        r.b bVar = new r.b(keyt.getClass(), cls);
        HashMap map = rVar.f35025a;
        if (map.containsKey(bVar)) {
            return (P) ((zc.p) map.get(bVar)).a(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + bVar + " available");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <P> P c(String str, com.google.crypto.tink.shaded.protobuf.h hVar, Class<P> cls) throws GeneralSecurityException {
        f fVar = f24831a.get();
        fVar.getClass();
        f.a aVarA = fVar.a(str);
        if (aVarA.d().contains(cls)) {
            d dVarA = aVarA.a(cls);
            zc.e<KeyProtoT> eVar = dVarA.f24796a;
            try {
                p0 p0VarF = eVar.f(hVar);
                GenericDeclaration genericDeclaration = dVarA.f24797b;
                if (Void.class.equals(genericDeclaration)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                eVar.g(p0VarF);
                return (P) eVar.c(p0VarF, genericDeclaration);
            } catch (z e10) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(eVar.f35003a.getName()), e10);
            }
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(aVarA.c());
        sb.append(", supported primitives: ");
        Set<Class<?>> setD = aVarA.d();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class<?> cls2 : setD) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z10 = false;
        }
        sb.append(sb2.toString());
        throw new GeneralSecurityException(sb.toString());
    }

    public static synchronized e0 d(g0 g0Var) throws GeneralSecurityException {
        d dVarB;
        dVarB = f24831a.get().a(g0Var.B()).b();
        if (!((Boolean) f24833c.get(g0Var.B())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + g0Var.B());
        }
        return dVarB.a(g0Var.C());
    }

    public static synchronized <KeyProtoT extends p0> void e(zc.e<KeyProtoT> eVar, boolean z10) throws GeneralSecurityException {
        try {
            AtomicReference<f> atomicReference = f24831a;
            f fVar = new f(atomicReference.get());
            fVar.b(eVar);
            String strB = eVar.b();
            a(strB, z10 ? eVar.d().b() : Collections.EMPTY_MAP, z10);
            if (!atomicReference.get().f24800a.containsKey(strB)) {
                f24832b.put(strB, new q());
                if (z10) {
                    f(strB, eVar.d().b());
                }
            }
            f24833c.put(strB, Boolean.valueOf(z10));
            atomicReference.set(fVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static <KeyFormatProtoT extends p0> void f(String str, Map<String, e.a.C0358a<KeyFormatProtoT>> map) {
        o0 o0Var;
        for (Map.Entry<String, e.a.C0358a<KeyFormatProtoT>> entry : map.entrySet()) {
            String key = entry.getKey();
            byte[] byteArray = entry.getValue().f35007a.toByteArray();
            h.a aVar = entry.getValue().f35008b;
            g0.a aVarD = g0.D();
            aVarD.e();
            g0.w((g0) aVarD.f6808b, str);
            h.f fVarC = com.google.crypto.tink.shaded.protobuf.h.c(0, byteArray.length, byteArray);
            aVarD.e();
            g0.x((g0) aVarD.f6808b, fVarC);
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                o0Var = o0.TINK;
            } else if (iOrdinal == 1) {
                o0Var = o0.LEGACY;
            } else if (iOrdinal == 2) {
                o0Var = o0.RAW;
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                o0Var = o0.CRUNCHY;
            }
            aVarD.e();
            g0.y((g0) aVarD.f6808b, o0Var);
            f24834d.put(key, new h(aVarD.b()));
        }
    }

    public static synchronized <B, P> void g(p<B, P> pVar) throws GeneralSecurityException {
        zc.i iVar = zc.i.f35013b;
        synchronized (iVar) {
            r.a aVar = new r.a(iVar.f35014a.get());
            aVar.b(pVar);
            iVar.f35014a.set(new zc.r(aVar));
        }
    }
}
