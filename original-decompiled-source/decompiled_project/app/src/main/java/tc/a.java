package tc;

import ed.p0;
import ed.q0;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes2.dex */
public final class a {
    static {
        zc.q[] qVarArr = {new d(sc.a.class)};
        HashMap map = new HashMap();
        zc.q qVar = qVarArr[0];
        Class<PrimitiveT> cls = qVar.f35024a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(androidx.room.f0.b(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, qVar);
        GenericDeclaration genericDeclaration = qVarArr[0].f35024a;
        Collections.unmodifiableMap(map);
        zc.q[] qVarArr2 = {new n(sc.a.class)};
        HashMap map2 = new HashMap();
        zc.q qVar2 = qVarArr2[0];
        Class<PrimitiveT> cls2 = qVar2.f35024a;
        if (map2.containsKey(cls2)) {
            throw new IllegalArgumentException(androidx.room.f0.b(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map2.put(cls2, qVar2);
        GenericDeclaration genericDeclaration2 = qVarArr2[0].f35024a;
        Collections.unmodifiableMap(map2);
        zc.q[] qVarArr3 = {new t(sc.a.class)};
        HashMap map3 = new HashMap();
        zc.q qVar3 = qVarArr3[0];
        Class<PrimitiveT> cls3 = qVar3.f35024a;
        if (map3.containsKey(cls3)) {
            throw new IllegalArgumentException(androidx.room.f0.b(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map3.put(cls3, qVar3);
        GenericDeclaration genericDeclaration3 = qVarArr3[0].f35024a;
        Collections.unmodifiableMap(map3);
        zc.q[] qVarArr4 = {new h(sc.a.class)};
        HashMap map4 = new HashMap();
        zc.q qVar4 = qVarArr4[0];
        Class<PrimitiveT> cls4 = qVar4.f35024a;
        if (map4.containsKey(cls4)) {
            throw new IllegalArgumentException(androidx.room.f0.b(cls4, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map4.put(cls4, qVar4);
        GenericDeclaration genericDeclaration4 = qVarArr4[0].f35024a;
        Collections.unmodifiableMap(map4);
        zc.q[] qVarArr5 = {new e0(sc.a.class)};
        HashMap map5 = new HashMap();
        zc.q qVar5 = qVarArr5[0];
        Class<PrimitiveT> cls5 = qVar5.f35024a;
        if (map5.containsKey(cls5)) {
            throw new IllegalArgumentException(androidx.room.f0.b(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map5.put(cls5, qVar5);
        GenericDeclaration genericDeclaration5 = qVarArr5[0].f35024a;
        Collections.unmodifiableMap(map5);
        zc.q[] qVarArr6 = {new h0(sc.a.class)};
        HashMap map6 = new HashMap();
        zc.q qVar6 = qVarArr6[0];
        Class<PrimitiveT> cls6 = qVar6.f35024a;
        if (map6.containsKey(cls6)) {
            throw new IllegalArgumentException(androidx.room.f0.b(cls6, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map6.put(cls6, qVar6);
        GenericDeclaration genericDeclaration6 = qVarArr6[0].f35024a;
        Collections.unmodifiableMap(map6);
        zc.q[] qVarArr7 = {new z(sc.a.class)};
        HashMap map7 = new HashMap();
        zc.q qVar7 = qVarArr7[0];
        Class<PrimitiveT> cls7 = qVar7.f35024a;
        if (map7.containsKey(cls7)) {
            throw new IllegalArgumentException(androidx.room.f0.b(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map7.put(cls7, qVar7);
        GenericDeclaration genericDeclaration7 = qVarArr7[0].f35024a;
        Collections.unmodifiableMap(map7);
        zc.q[] qVarArr8 = {new k0(sc.a.class)};
        HashMap map8 = new HashMap();
        zc.q qVar8 = qVarArr8[0];
        Class<PrimitiveT> cls8 = qVar8.f35024a;
        if (map8.containsKey(cls8)) {
            throw new IllegalArgumentException(androidx.room.f0.b(cls8, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map8.put(cls8, qVar8);
        GenericDeclaration genericDeclaration8 = qVarArr8[0].f35024a;
        Collections.unmodifiableMap(map8);
        int i10 = p0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        sc.r.g(c.f28631b);
        ad.p.a();
        sc.r.e(new e(ed.d.class, new d(sc.a.class)), true);
        sc.r.e(new o(ed.r.class, new n(sc.a.class)), true);
        zc.m mVar = r.f28676a;
        zc.j jVar = zc.j.f35015b;
        jVar.e(r.f28676a);
        jVar.d(r.f28677b);
        jVar.c(r.f28678c);
        jVar.b(r.f28679d);
        if (wc.a.a()) {
            return;
        }
        sc.r.e(new i(ed.l.class, new h(sc.a.class)), true);
        jVar.e(l.f28653a);
        jVar.d(l.f28654b);
        jVar.c(l.f28655c);
        jVar.b(l.f28656d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            sc.r.e(new u(ed.t.class, new t(sc.a.class)), true);
            jVar.e(x.f28689a);
            jVar.d(x.f28690b);
            jVar.c(x.f28691c);
            jVar.b(x.f28692d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        sc.r.e(new a0(ed.x.class, new z(sc.a.class)), true);
        zc.m mVar2 = d0.f28635a;
        zc.j jVar2 = zc.j.f35015b;
        jVar2.e(d0.f28635a);
        jVar2.d(d0.f28636b);
        jVar2.c(d0.f28637c);
        jVar2.b(d0.f28638d);
        sc.r.e(new f0(ed.k0.class, new e0(sc.a.class)), true);
        sc.r.e(new i0(ed.m0.class, new h0(sc.a.class)), true);
        sc.r.e(new l0(q0.class, new k0(sc.a.class)), true);
        jVar2.e(o0.f28664a);
        jVar2.d(o0.f28665b);
        jVar2.c(o0.f28666c);
        jVar2.b(o0.f28667d);
    }
}
