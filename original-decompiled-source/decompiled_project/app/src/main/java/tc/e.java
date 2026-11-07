package tc;

import ad.l;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p0;
import ed.b0;
import ed.c0;
import ed.d;
import ed.d0;
import ed.e;
import ed.e0;
import ed.i;
import ed.j;
import ed.k;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sc.h;
import wc.a;
import zc.e;

/* loaded from: classes2.dex */
public final class e extends zc.e<ed.d> {

    public class a extends e.a<ed.e, ed.d> {
        @Override // zc.e.a
        public final p0 a(p0 p0Var) throws GeneralSecurityException {
            ed.e eVar = (ed.e) p0Var;
            zc.q[] qVarArr = {new f(gd.o.class)};
            HashMap map = new HashMap();
            for (zc.q qVar : qVarArr) {
                Class<PrimitiveT> cls = qVar.f35024a;
                if (map.containsKey(cls)) {
                    throw new IllegalArgumentException(androidx.room.f0.b(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map.put(cls, qVar);
            }
            if (qVarArr.length > 0) {
                GenericDeclaration genericDeclaration = qVarArr[0].f35024a;
            }
            Collections.unmodifiableMap(map);
            ed.j jVarY = eVar.y();
            i.a aVarD = ed.i.D();
            ed.k kVarA = jVarY.A();
            aVarD.e();
            ed.i.x((ed.i) aVarD.f6808b, kVarA);
            byte[] bArrA = gd.t.a(jVarY.z());
            h.f fVarC = com.google.crypto.tink.shaded.protobuf.h.c(0, bArrA.length, bArrA);
            aVarD.e();
            ed.i.y((ed.i) aVarD.f6808b, fVarC);
            aVarD.e();
            ed.i.w((ed.i) aVarD.f6808b);
            ed.i iVarB = aVarD.b();
            zc.q[] qVarArr2 = {new l.a(sc.n.class)};
            HashMap map2 = new HashMap();
            for (zc.q qVar2 : qVarArr2) {
                Class<PrimitiveT> cls2 = qVar2.f35024a;
                if (map2.containsKey(cls2)) {
                    throw new IllegalArgumentException(androidx.room.f0.b(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map2.put(cls2, qVar2);
            }
            if (qVarArr2.length > 0) {
                GenericDeclaration genericDeclaration2 = qVarArr2[0].f35024a;
            }
            Collections.unmodifiableMap(map2);
            ed.c0 c0VarZ = eVar.z();
            b0.a aVarD2 = ed.b0.D();
            aVarD2.e();
            ed.b0.w((ed.b0) aVarD2.f6808b);
            ed.d0 d0VarA = c0VarZ.A();
            aVarD2.e();
            ed.b0.x((ed.b0) aVarD2.f6808b, d0VarA);
            byte[] bArrA2 = gd.t.a(c0VarZ.z());
            h.f fVarC2 = com.google.crypto.tink.shaded.protobuf.h.c(0, bArrA2.length, bArrA2);
            aVarD2.e();
            ed.b0.y((ed.b0) aVarD2.f6808b, fVarC2);
            ed.b0 b0VarB = aVarD2.b();
            d.a aVarC = ed.d.C();
            aVarC.e();
            ed.d.x((ed.d) aVarC.f6808b, iVarB);
            aVarC.e();
            ed.d.y((ed.d) aVarC.f6808b, b0VarB);
            aVarC.e();
            ed.d.w((ed.d) aVarC.f6808b);
            return aVarC.b();
        }

        @Override // zc.e.a
        public final Map<String, e.a.C0358a<ed.e>> b() throws GeneralSecurityException {
            HashMap map = new HashMap();
            h.a aVar = h.a.f24806a;
            map.put("AES128_CTR_HMAC_SHA256", e.h(16, 16, aVar));
            h.a aVar2 = h.a.f24807b;
            map.put("AES128_CTR_HMAC_SHA256_RAW", e.h(16, 16, aVar2));
            map.put("AES256_CTR_HMAC_SHA256", e.h(32, 32, aVar));
            map.put("AES256_CTR_HMAC_SHA256_RAW", e.h(32, 32, aVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // zc.e.a
        public final p0 c(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
            return ed.e.B(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }

        @Override // zc.e.a
        public final void d(p0 p0Var) throws GeneralSecurityException {
            ed.e eVar = (ed.e) p0Var;
            zc.q[] qVarArr = {new f(gd.o.class)};
            HashMap map = new HashMap();
            for (zc.q qVar : qVarArr) {
                Class<PrimitiveT> cls = qVar.f35024a;
                if (map.containsKey(cls)) {
                    throw new IllegalArgumentException(androidx.room.f0.b(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map.put(cls, qVar);
            }
            if (qVarArr.length > 0) {
                GenericDeclaration genericDeclaration = qVarArr[0].f35024a;
            }
            Collections.unmodifiableMap(map);
            ed.j jVarY = eVar.y();
            gd.y.a(jVarY.z());
            ed.k kVarA = jVarY.A();
            if (kVarA.y() < 12 || kVarA.y() > 16) {
                throw new GeneralSecurityException("invalid IV size");
            }
            zc.q[] qVarArr2 = {new l.a(sc.n.class)};
            HashMap map2 = new HashMap();
            for (zc.q qVar2 : qVarArr2) {
                Class<PrimitiveT> cls2 = qVar2.f35024a;
                if (map2.containsKey(cls2)) {
                    throw new IllegalArgumentException(androidx.room.f0.b(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map2.put(cls2, qVar2);
            }
            if (qVarArr2.length > 0) {
                GenericDeclaration genericDeclaration2 = qVarArr2[0].f35024a;
            }
            Collections.unmodifiableMap(map2);
            ed.c0 c0VarZ = eVar.z();
            if (c0VarZ.z() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            ad.l.i(c0VarZ.A());
            gd.y.a(eVar.y().z());
        }
    }

    public static e.a.C0358a h(int i10, int i11, h.a aVar) {
        j.a aVarB = ed.j.B();
        k.a aVarZ = ed.k.z();
        aVarZ.e();
        ed.k.w((ed.k) aVarZ.f6808b);
        ed.k kVarB = aVarZ.b();
        aVarB.e();
        ed.j.w((ed.j) aVarB.f6808b, kVarB);
        aVarB.e();
        ed.j.x((ed.j) aVarB.f6808b, i10);
        ed.j jVarB = aVarB.b();
        c0.a aVarB2 = ed.c0.B();
        d0.a aVarB3 = ed.d0.B();
        aVarB3.e();
        ed.d0.w((ed.d0) aVarB3.f6808b, ed.a0.SHA256);
        aVarB3.e();
        ed.d0.x((ed.d0) aVarB3.f6808b, i11);
        ed.d0 d0VarB = aVarB3.b();
        aVarB2.e();
        ed.c0.w((ed.c0) aVarB2.f6808b, d0VarB);
        aVarB2.e();
        ed.c0.x((ed.c0) aVarB2.f6808b, 32);
        ed.c0 c0VarB = aVarB2.b();
        e.a aVarA = ed.e.A();
        aVarA.e();
        ed.e.w((ed.e) aVarA.f6808b, jVarB);
        aVarA.e();
        ed.e.x((ed.e) aVarA.f6808b, c0VarB);
        return new e.a.C0358a(aVarA.b(), aVar);
    }

    @Override // zc.e
    public final a.EnumC0318a a() {
        return a.EnumC0318a.f31491b;
    }

    @Override // zc.e
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // zc.e
    public final e.a<ed.e, ed.d> d() {
        return new a(ed.e.class);
    }

    @Override // zc.e
    public final e0.b e() {
        return e0.b.SYMMETRIC;
    }

    @Override // zc.e
    public final p0 f(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
        return ed.d.D(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
    }

    @Override // zc.e
    public final void g(p0 p0Var) throws GeneralSecurityException {
        ed.d dVar = (ed.d) p0Var;
        gd.y.c(dVar.B());
        zc.q[] qVarArr = {new f(gd.o.class)};
        HashMap map = new HashMap();
        zc.q qVar = qVarArr[0];
        Class<PrimitiveT> cls = qVar.f35024a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(androidx.room.f0.b(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, qVar);
        GenericDeclaration genericDeclaration = qVarArr[0].f35024a;
        Collections.unmodifiableMap(map);
        ed.i iVarZ = dVar.z();
        gd.y.c(iVarZ.C());
        gd.y.a(iVarZ.A().size());
        ed.k kVarB = iVarZ.B();
        if (kVarB.y() < 12 || kVarB.y() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
        zc.q[] qVarArr2 = {new l.a(sc.n.class)};
        HashMap map2 = new HashMap();
        zc.q qVar2 = qVarArr2[0];
        Class<PrimitiveT> cls2 = qVar2.f35024a;
        if (map2.containsKey(cls2)) {
            throw new IllegalArgumentException(androidx.room.f0.b(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map2.put(cls2, qVar2);
        GenericDeclaration genericDeclaration2 = qVarArr2[0].f35024a;
        Collections.unmodifiableMap(map2);
        ed.b0 b0VarA = dVar.A();
        gd.y.c(b0VarA.C());
        if (b0VarA.A().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        ad.l.i(b0VarA.B());
    }
}
