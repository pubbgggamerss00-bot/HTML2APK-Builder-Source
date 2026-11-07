package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class b extends a {
    public b() {
    }

    public List<String> m() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<cf.l, cf.b>> it = Z().f5423b.entrySet().iterator();
        while (it.hasNext()) {
            cf.l key = it.next().getKey();
            if (!cf.l.f5539y1.equals(key)) {
                arrayList.add(key.f5545b);
            }
        }
        return arrayList;
    }

    public cf.b n(String str) {
        return Z().D0(str);
    }

    public cf.b o(String str, cf.b bVar) {
        cf.b bVarD0 = Z().D0(str);
        return bVarD0 == null ? bVar : bVarD0;
    }

    public void p(String str, cf.b bVar) {
        cf.b bVarN = n(str);
        Z().O0(cf.l.g0(str), bVar);
        j(bVarN, bVar);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", attributes={");
        Iterator<String> it = m().iterator();
        while (it.hasNext()) {
            String next = it.next();
            sb.append(next);
            sb.append('=');
            sb.append(n(next));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(cf.d dVar) {
        super(dVar);
    }
}
