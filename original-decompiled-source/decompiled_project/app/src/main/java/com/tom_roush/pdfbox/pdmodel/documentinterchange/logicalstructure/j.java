package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class j extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f6922c = "UserProperties";

    public j() {
        k(f6922c);
    }

    public void m(k kVar) {
        ((cf.a) Z().v0(cf.l.G1)).f5416b.add(kVar.Z());
        i();
    }

    public List<k> n() {
        cf.a aVar = (cf.a) Z().v0(cf.l.G1);
        ArrayList arrayList = new ArrayList(aVar.f5416b.size());
        for (int i10 = 0; i10 < aVar.f5416b.size(); i10++) {
            arrayList.add(new k((cf.d) aVar.l0(i10), this));
        }
        return arrayList;
    }

    public void o(k kVar) {
        if (kVar == null) {
            return;
        }
        ((cf.a) Z().v0(cf.l.G1)).v0(kVar.Z());
        i();
    }

    public void p(List<k> list) {
        cf.a aVar = new cf.a();
        Iterator<k> it = list.iterator();
        while (it.hasNext()) {
            aVar.f5416b.add(it.next().Z());
        }
        Z().O0(cf.l.G1, aVar);
    }

    public void q(k kVar) {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        return super.toString() + ", userProperties=" + n();
    }

    public j(cf.d dVar) {
        super(dVar);
    }
}
