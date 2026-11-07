package ah;

import c9.u1;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;
import s4.u0;

/* loaded from: classes2.dex */
public class p {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, u0 u0Var, vg.c cVar) throws Throwable {
        s4.g gVar;
        List list2;
        g0 g0Var;
        Iterator it;
        Throwable th2;
        if (cVar instanceof s4.g) {
            gVar = (s4.g) cVar;
            int i10 = gVar.f24236d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f24236d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new s4.g(cVar);
            }
        }
        Object obj = gVar.f24235c;
        Object obj2 = ug.a.f29706a;
        int i11 = gVar.f24236d;
        if (i11 == 0) {
            q.b(obj);
            ArrayList arrayList = new ArrayList();
            s4.h hVar = new s4.h(list, arrayList, null);
            gVar.f24233a = arrayList;
            gVar.f24236d = 1;
            if (u0Var.a(hVar, gVar) == obj2) {
                return obj2;
            }
            list2 = arrayList;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = gVar.f24234b;
                g0Var = (g0) gVar.f24233a;
                try {
                    q.b(obj);
                } catch (Throwable th3) {
                    T t3 = g0Var.f16327a;
                    if (t3 == 0) {
                        g0Var.f16327a = th3;
                    } else {
                        u1.b((Throwable) t3, th3);
                    }
                }
                while (it.hasNext()) {
                    eh.l lVar = (eh.l) it.next();
                    gVar.f24233a = g0Var;
                    gVar.f24234b = it;
                    gVar.f24236d = 2;
                    if (lVar.invoke(gVar) == obj2) {
                        return obj2;
                    }
                }
                th2 = (Throwable) g0Var.f16327a;
                if (th2 != null) {
                    return f0.f21461a;
                }
                throw th2;
            }
            list2 = (List) gVar.f24233a;
            q.b(obj);
        }
        g0Var = new g0();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th2 = (Throwable) g0Var.f16327a;
        if (th2 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static tg.e b(eh.p pVar, tg.e eVar, tg.e eVar2) {
        r.e(pVar, "<this>");
        if (pVar instanceof vg.a) {
            return ((vg.a) pVar).create(eVar, eVar2);
        }
        tg.h context = eVar2.getContext();
        return context == tg.i.f28768a ? new ug.b(pVar, eVar2, eVar) : new ug.c(eVar2, context, pVar, eVar);
    }

    public static tg.e c(tg.e eVar) {
        tg.e<Object> eVarIntercepted;
        r.e(eVar, "<this>");
        vg.c cVar = eVar instanceof vg.c ? (vg.c) eVar : null;
        return (cVar == null || (eVarIntercepted = cVar.intercepted()) == null) ? eVar : eVarIntercepted;
    }

    public static final String d(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i10 = reader.read(cArr);
        while (i10 >= 0) {
            stringWriter.write(cArr, 0, i10);
            i10 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        r.d(string, "toString(...)");
        return string;
    }

    public static final void e(int i10, int i11, bi.f descriptor) {
        r.e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.f(i13));
            }
            i12 >>>= 1;
        }
        throw new zh.c(descriptor.a(), arrayList);
    }

    public static Object f(eh.p pVar, Object obj, tg.e eVar) {
        r.e(pVar, "<this>");
        tg.h context = eVar.getContext();
        vg.d dVar = context == tg.i.f28768a ? new ug.d(eVar) : new ug.e(eVar, context);
        m0.b(2, pVar);
        return pVar.invoke(obj, dVar);
    }
}
