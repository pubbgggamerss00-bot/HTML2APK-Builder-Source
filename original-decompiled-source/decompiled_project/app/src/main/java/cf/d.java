package cf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class d extends b implements v {

    /* renamed from: b, reason: collision with root package name */
    public Map<l, b> f5423b = new wf.e();

    public static String E0(b bVar, ArrayList arrayList) throws IOException {
        if (bVar == null) {
            return "null";
        }
        if (arrayList.contains(bVar)) {
            return String.valueOf(bVar.hashCode());
        }
        arrayList.add(bVar);
        if (!(bVar instanceof d)) {
            if (!(bVar instanceof a)) {
                if (!(bVar instanceof o)) {
                    return bVar.toString();
                }
                return "COSObject{" + E0(((o) bVar).f5549b, arrayList) + "}";
            }
            StringBuilder sb = new StringBuilder("COSArray{");
            ArrayList arrayList2 = ((a) bVar).f5416b;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                sb.append(E0((b) obj, arrayList));
                sb.append(";");
            }
            sb.append("}");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("COSDictionary{");
        for (Map.Entry<l, b> entry : ((d) bVar).f5423b.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(":");
            sb2.append(E0(entry.getValue(), arrayList));
            sb2.append(";");
        }
        sb2.append("}");
        if (bVar instanceof t) {
            ef.d dVarW0 = ((t) bVar).W0();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ef.a.c(dVarW0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            sb2.append("COSStream{");
            sb2.append(Arrays.hashCode(byteArray));
            sb2.append("}");
            dVarW0.close();
        }
        return sb2.toString();
    }

    public final b D0(String str) {
        return v0(l.g0(str));
    }

    public final float F0(l lVar, float f10) {
        b bVarV0 = v0(lVar);
        return bVarV0 instanceof n ? ((n) bVarV0).g0() : f10;
    }

    public final int G0(l lVar, l lVar2, int i10) {
        b bVarY0 = y0(lVar, lVar2);
        return bVarY0 instanceof n ? ((n) bVarY0).k0() : i10;
    }

    public final b H0(l lVar) {
        return this.f5423b.get(lVar);
    }

    public final long I0(l lVar) {
        b bVarV0 = v0(lVar);
        if (bVarV0 instanceof n) {
            return ((n) bVarV0).l0();
        }
        return -1L;
    }

    public final String J0(l lVar) {
        b bVarV0 = v0(lVar);
        if (bVarV0 instanceof l) {
            return ((l) bVarV0).f5545b;
        }
        if (bVarV0 instanceof u) {
            return ((u) bVarV0).getString();
        }
        return null;
    }

    public final String K0(l lVar) {
        b bVarV0 = v0(lVar);
        if (bVarV0 instanceof u) {
            return ((u) bVarV0).getString();
        }
        return null;
    }

    public final void L0(l lVar) {
        this.f5423b.remove(lVar);
    }

    public final void M0(l lVar, float f10) {
        O0(lVar, new f(f10));
    }

    public final void N0(l lVar, int i10) {
        O0(lVar, i.q0(i10));
    }

    public final void O0(l lVar, b bVar) {
        if (bVar == null) {
            L0(lVar);
            return;
        }
        Map<l, b> map = this.f5423b;
        if ((map instanceof wf.e) && map.size() >= 1000) {
            this.f5423b = new LinkedHashMap(this.f5423b);
        }
        this.f5423b.put(lVar, bVar);
    }

    public final void P0(l lVar, jf.c cVar) {
        O0(lVar, cVar != null ? cVar.Z() : null);
    }

    public final void Q0(l lVar, long j10) {
        O0(lVar, i.q0(j10));
    }

    public final void R0(l lVar, String str) {
        O0(lVar, str != null ? l.g0(str) : null);
    }

    public final void S0(l lVar, String str) {
        O0(lVar, str != null ? new u(str) : null);
    }

    @Override // cf.b
    public Object f0(gf.b bVar) throws IOException {
        bVar.M(this);
        return null;
    }

    public final void g0(d dVar) {
        Map<l, b> map = this.f5423b;
        if (map instanceof wf.e) {
            if (dVar.f5423b.size() + map.size() >= 1000) {
                this.f5423b = new LinkedHashMap(this.f5423b);
            }
        }
        this.f5423b.putAll(dVar.f5423b);
    }

    public final boolean i0(l lVar) {
        b bVarY0 = y0(lVar, null);
        return (bVarY0 instanceof c) && bVarY0 == c.f5420e;
    }

    public final a k0(l lVar) {
        b bVarV0 = v0(lVar);
        if (bVarV0 instanceof a) {
            return (a) bVarV0;
        }
        return null;
    }

    public final d l0(l lVar) {
        b bVarV0 = v0(lVar);
        if (bVarV0 instanceof d) {
            return (d) bVarV0;
        }
        return null;
    }

    public final l q0(l lVar) {
        b bVarV0 = v0(lVar);
        if (bVarV0 instanceof l) {
            return (l) bVarV0;
        }
        return null;
    }

    public final String toString() {
        try {
            return E0(this, new ArrayList());
        } catch (IOException e10) {
            return "COSDictionary{" + e10.getMessage() + "}";
        }
    }

    public final b v0(l lVar) {
        b bVar = this.f5423b.get(lVar);
        if (bVar instanceof o) {
            bVar = ((o) bVar).f5549b;
        }
        if (bVar instanceof m) {
            return null;
        }
        return bVar;
    }

    public final b y0(l lVar, l lVar2) {
        b bVarV0 = v0(lVar);
        return (bVarV0 != null || lVar2 == null) ? bVarV0 : v0(lVar2);
    }
}
