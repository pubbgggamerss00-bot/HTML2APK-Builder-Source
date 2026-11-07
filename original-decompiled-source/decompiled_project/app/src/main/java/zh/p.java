package zh;

import a9.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.internal.k0;
import kotlinx.serialization.internal.l0;
import kotlinx.serialization.internal.w0;
import pg.p;
import qg.z;

/* loaded from: classes2.dex */
public final /* synthetic */ class p {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final b<Object> a(ei.b bVar, kh.j jVar, boolean z10) {
        b<? extends Object> bVarA;
        b<? extends Object> bVarB;
        PolymorphicSerializer polymorphicSerializer;
        kh.c<Object> cVarC = l0.c(jVar);
        boolean zC = jVar.c();
        List<kh.k> listG = jVar.g();
        ArrayList arrayList = new ArrayList(qg.p.h(listG, 10));
        Iterator<T> it = listG.iterator();
        if (it.hasNext()) {
            r.e((kh.k) it.next(), "<this>");
            throw new IllegalArgumentException("Star projections in type arguments are not allowed, but had null".toString());
        }
        boolean zIsEmpty = arrayList.isEmpty();
        z zVar = z.f22752a;
        if (zIsEmpty) {
            if (!k0.c(cVarC) || bVar.b(cVarC, zVar) == null) {
                w0<? extends Object> w0Var = m.f35078a;
                if (zC) {
                    bVarA = m.f35079b.a(cVarC);
                } else {
                    bVarA = m.f35078a.a(cVarC);
                    if (bVarA == null) {
                        bVarA = null;
                    }
                }
            }
        } else if (!bVar.c()) {
            w0<? extends Object> w0Var2 = m.f35078a;
            Object objA = !zC ? m.f35080c.a(cVarC, arrayList) : m.f35081d.a(cVarC, arrayList);
            if (objA instanceof p.a) {
                objA = null;
            }
            bVarA = (b) objA;
        }
        if (bVarA != null) {
            return bVarA;
        }
        if (arrayList.isEmpty()) {
            bVarB = n.c(cVarC);
            if (bVarB == null && (bVarB = bVar.b(cVarC, zVar)) == null) {
                if (k0.c(cVarC)) {
                    polymorphicSerializer = new PolymorphicSerializer(cVarC);
                    bVarB = polymorphicSerializer;
                }
                bVarB = null;
            }
            if (bVarB != null) {
                return zC ? ai.a.d(bVarB) : bVarB;
            }
        } else {
            ArrayList arrayListD = n.d(bVar, arrayList, z10);
            if (arrayListD != null) {
                b<? extends Object> bVarA2 = n.a(cVarC, arrayListD, new o0(arrayList, 3));
                if (bVarA2 == null) {
                    bVarB = bVar.b(cVarC, arrayListD);
                    if (bVarB == null) {
                        if (k0.c(cVarC)) {
                            polymorphicSerializer = new PolymorphicSerializer(cVarC);
                            bVarB = polymorphicSerializer;
                        }
                        bVarB = null;
                    }
                } else {
                    bVarB = bVarA2;
                }
                if (bVarB != null) {
                }
            }
        }
        return null;
    }

    public static final b<Object> serializer(kh.c<?> kClass, List<? extends b<?>> typeArgumentsSerializers, boolean z10) {
        r.e(kClass, "kClass");
        r.e(typeArgumentsSerializers, "typeArgumentsSerializers");
        return n.serializer(ei.c.f8743a, kClass, typeArgumentsSerializers, z10);
    }

    public static final b<Object> serializer(kh.j type) {
        r.e(type, "type");
        return n.serializer(ei.c.f8743a, type);
    }

    public static final b<Object> serializer(ei.b bVar, kh.j type) {
        r.e(bVar, "<this>");
        r.e(type, "type");
        b<Object> bVarA = a(bVar, type, true);
        if (bVarA != null) {
            return bVarA;
        }
        throw new h(l0.d(l0.c(type)));
    }

    public static final <T> b<T> serializer() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final <T> b<T> serializer(ei.b bVar) {
        r.e(bVar, "<this>");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final b<Object> serializer(ei.b bVar, kh.c<?> kClass, List<? extends b<?>> typeArgumentsSerializers, boolean z10) {
        b<? extends Object> bVarB;
        r.e(bVar, "<this>");
        r.e(kClass, "kClass");
        r.e(typeArgumentsSerializers, "typeArgumentsSerializers");
        if (typeArgumentsSerializers.isEmpty()) {
            bVarB = n.c(kClass);
            if (bVarB == null) {
                bVarB = bVar.b(kClass, z.f22752a);
            }
        } else {
            try {
                b<? extends Object> bVarA = n.a(kClass, typeArgumentsSerializers, new k5.a(1));
                bVarB = bVarA == null ? bVar.b(kClass, typeArgumentsSerializers) : bVarA;
            } catch (IndexOutOfBoundsException e10) {
                throw new h("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e10);
            }
        }
        if (bVarB == null) {
            bVarB = null;
        } else if (z10) {
            bVarB = ai.a.d(bVarB);
        }
        if (bVarB != null) {
            return bVarB;
        }
        throw new h(l0.d(kClass));
    }

    public static final <T> b<T> serializer(kh.c<T> cVar) {
        r.e(cVar, "<this>");
        b<T> bVarC = n.c(cVar);
        if (bVarC != null) {
            return bVarC;
        }
        throw new h(l0.d(cVar));
    }
}
