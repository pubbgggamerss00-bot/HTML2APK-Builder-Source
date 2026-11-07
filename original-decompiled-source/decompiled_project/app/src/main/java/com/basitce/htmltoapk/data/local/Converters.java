package com.basitce.htmltoapk.data.local;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.u;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.h;
import kotlinx.serialization.json.i;
import mh.x;
import qg.p;
import qg.z;

/* loaded from: classes.dex */
public final class Converters {
    public static final int $stable = 0;

    public final String fromStringList(List<String> value) {
        r.e(value, "value");
        ArrayList arrayList = new ArrayList(p.h(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(i.b((String) it.next()));
        }
        return b.f16435d.c(c.Companion.serializer(), new c(arrayList));
    }

    public final List<String> toStringList(String value) {
        r.e(value, "value");
        if (!x.A(value)) {
            try {
                h hVar = (h) b.f16435d.b(c.Companion.serializer(), value);
                u uVar = i.f16449a;
                r.e(hVar, "<this>");
                c cVar = hVar instanceof c ? (c) hVar : null;
                if (cVar == null) {
                    i.c("JsonArray", hVar);
                    throw null;
                }
                ArrayList arrayList = new ArrayList(p.h(cVar, 10));
                Iterator<h> it = cVar.f16439a.iterator();
                while (it.hasNext()) {
                    arrayList.add(i.f(it.next()).c());
                }
                return arrayList;
            } catch (Exception unused) {
            }
        }
        return z.f22752a;
    }
}
