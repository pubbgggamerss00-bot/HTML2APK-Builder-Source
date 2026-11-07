package l9;

import i0.x1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<String> f16861a = qg.o.C(new String[]{"__MACOSX", "Thumbs.db", "desktop.ini"});

    public static String a(List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String str = (String) obj2;
            String strT = mh.x.T(str, '/', str);
            if (mh.t.i(strT, ".html", true) || mh.t.i(strT, ".htm", true)) {
                arrayList.add(obj2);
            }
        }
        Object next = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
            if (kotlin.jvm.internal.r.a((String) obj, "index.html")) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return str2;
        }
        sg.a aVarA = x1.a(new k0(), new l0(), new m0(i10));
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj3 = arrayList.get(i10);
            i10++;
            String str3 = (String) obj3;
            String lowerCase = mh.x.T(str3, '/', str3).toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
            if (lowerCase.equals("index.html") || lowerCase.equals("index.htm")) {
                arrayList2.add(obj3);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (aVarA.compare(next, next2) > 0) {
                    next = next2;
                }
            }
        }
        return (String) next;
    }
}
