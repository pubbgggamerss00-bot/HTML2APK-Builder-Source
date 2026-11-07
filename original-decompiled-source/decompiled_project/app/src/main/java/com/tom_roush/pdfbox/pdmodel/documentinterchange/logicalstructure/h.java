package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import cf.m;
import cf.o;
import cf.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class h implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    private final cf.d f6920a;

    public h(String str) {
        cf.d dVar = new cf.d();
        this.f6920a = dVar;
        dVar.R0(cf.l.f5532w2, str);
    }

    public static h d(cf.d dVar) {
        String strJ0 = dVar.J0(cf.l.f5532w2);
        if ("StructTreeRoot".equals(strJ0)) {
            return new i(dVar);
        }
        if (strJ0 == null || g.f6919b.equals(strJ0)) {
            return new g(dVar);
        }
        throw new IllegalArgumentException("Dictionary must not include a Type entry with a value that is neither StructTreeRoot nor StructElem.");
    }

    private jf.c f(cf.d dVar) {
        String strJ0 = dVar.J0(cf.l.f5532w2);
        if (strJ0 == null || g.f6919b.equals(strJ0)) {
            return new g(dVar);
        }
        if (e.f6916b.equals(strJ0)) {
            return new e(dVar);
        }
        if (d.f6914b.equals(strJ0)) {
            return new d(dVar);
        }
        return null;
    }

    public void a(cf.b bVar) {
        if (bVar == null) {
            return;
        }
        cf.d dVarZ = Z();
        cf.l lVar = cf.l.f5470g1;
        cf.b bVarV0 = dVarZ.v0(lVar);
        if (bVarV0 == null) {
            Z().O0(lVar, bVar);
            return;
        }
        if (bVarV0 instanceof cf.a) {
            ((cf.a) bVarV0).g0(bVar);
            return;
        }
        cf.a aVar = new cf.a();
        aVar.g0(bVarV0);
        aVar.g0(bVar);
        Z().O0(lVar, aVar);
    }

    public void b(g gVar) {
        c(gVar);
        gVar.d0(this);
    }

    public void c(jf.c cVar) {
        if (cVar == null) {
            return;
        }
        a(cVar.Z());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(cf.b bVar) {
        cf.d dVar;
        if (bVar instanceof cf.d) {
            dVar = (cf.d) bVar;
        } else if (bVar instanceof o) {
            cf.b bVar2 = ((o) bVar).f5549b;
            dVar = bVar2 instanceof cf.d ? (cf.d) bVar2 : null;
        }
        if (dVar != null) {
            return f(dVar);
        }
        if (bVar instanceof cf.i) {
            return Integer.valueOf((int) ((cf.i) bVar).f5445b);
        }
        return null;
    }

    @Override // jf.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public cf.d Z() {
        return this.f6920a;
    }

    public List<Object> h() {
        ArrayList arrayList = new ArrayList();
        cf.b bVarV0 = Z().v0(cf.l.f5470g1);
        if (bVarV0 instanceof cf.a) {
            ArrayList arrayList2 = ((cf.a) bVarV0).f5416b;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                Object objE = e((cf.b) obj);
                if (objE != null) {
                    arrayList.add(objE);
                }
            }
        } else {
            Object objE2 = e(bVarV0);
            if (objE2 != null) {
                arrayList.add(objE2);
            }
        }
        return arrayList;
    }

    public String i() {
        return Z().J0(cf.l.f5532w2);
    }

    public void j(cf.b bVar, Object obj) {
        if (bVar == null || obj == null) {
            return;
        }
        cf.d dVarZ = Z();
        cf.l lVar = cf.l.f5470g1;
        cf.b bVarV0 = dVarZ.v0(lVar);
        if (bVarV0 == null) {
            return;
        }
        cf.b bVarZ = obj instanceof jf.c ? ((jf.c) obj).Z() : null;
        if (!(bVarV0 instanceof cf.a)) {
            boolean zEquals = bVarV0.equals(bVarZ);
            if (!zEquals && (bVarV0 instanceof o)) {
                zEquals = ((o) bVarV0).f5549b.equals(bVarZ);
            }
            if (zEquals) {
                cf.a aVar = new cf.a();
                aVar.g0(bVar);
                aVar.g0(bVarZ);
                Z().O0(lVar, aVar);
                return;
            }
            return;
        }
        cf.a aVar2 = (cf.a) bVarV0;
        ArrayList arrayList = aVar2.f5416b;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            cf.b bVarI0 = aVar2.i0(i10);
            if (bVarI0 == null) {
                if (bVarI0 == bVarZ) {
                    break;
                } else {
                    i10++;
                }
            } else if (bVarI0.equals(bVarZ) || ((bVarI0 instanceof o) && ((o) bVarI0).f5549b.equals(bVarZ))) {
                break;
            } else {
                i10++;
            }
        }
        arrayList.add(i10, bVar);
    }

    public void k(g gVar, Object obj) {
        l(gVar, obj);
    }

    public void l(jf.c cVar, Object obj) {
        if (cVar == null) {
            return;
        }
        j(cVar.Z(), obj);
    }

    public boolean m(cf.b bVar) {
        if (bVar != null) {
            cf.d dVarZ = Z();
            cf.l lVar = cf.l.f5470g1;
            cf.b bVarV0 = dVarZ.v0(lVar);
            if (bVarV0 != null) {
                if (bVarV0 instanceof cf.a) {
                    cf.a aVar = (cf.a) bVarV0;
                    ArrayList arrayList = aVar.f5416b;
                    boolean zRemove = arrayList.remove(bVar);
                    if (!zRemove) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            cf.b bVarI0 = aVar.i0(i10);
                            if ((bVarI0 instanceof o) && ((o) bVarI0).f5549b.equals(bVar)) {
                                zRemove = arrayList.remove(bVarI0);
                                break;
                            }
                            i10++;
                        }
                    }
                    if (arrayList.size() == 1) {
                        Z().O0(cf.l.f5470g1, aVar.l0(0));
                    }
                    return zRemove;
                }
                boolean zEquals = bVarV0.equals(bVar);
                if (!zEquals && (bVarV0 instanceof o)) {
                    zEquals = ((o) bVarV0).f5549b.equals(bVar);
                }
                if (zEquals) {
                    Z().L0(lVar);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean n(g gVar) {
        boolean zO = o(gVar);
        if (zO) {
            gVar.d0(null);
        }
        return zO;
    }

    public boolean o(jf.c cVar) {
        if (cVar == null) {
            return false;
        }
        return m(cVar.Z());
    }

    public void p(List<Object> list) {
        cf.a aVar;
        cf.d dVarZ = Z();
        cf.l lVar = cf.l.f5470g1;
        if (list == null) {
            aVar = null;
        } else if (list instanceof jf.a) {
            aVar = ((jf.a) list).f15708a;
        } else {
            cf.a aVar2 = new cf.a();
            for (Object obj : list) {
                if (obj instanceof String) {
                    aVar2.g0(new u((String) obj));
                } else if ((obj instanceof Integer) || (obj instanceof Long)) {
                    aVar2.g0(cf.i.q0(((Number) obj).longValue()));
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    aVar2.g0(new cf.f(((Number) obj).floatValue()));
                } else if (obj instanceof jf.c) {
                    aVar2.g0(((jf.c) obj).Z());
                } else {
                    if (obj != null) {
                        throw new IllegalArgumentException("Error: Don't know how to convert type to COSBase '" + obj.getClass().getName() + "'");
                    }
                    aVar2.g0(m.f5548c);
                }
            }
            aVar = aVar2;
        }
        dVarZ.O0(lVar, aVar);
    }

    public h(cf.d dVar) {
        this.f6920a = dVar;
    }
}
