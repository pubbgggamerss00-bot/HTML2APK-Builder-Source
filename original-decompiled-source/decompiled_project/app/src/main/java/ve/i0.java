package ve;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ve.o;

/* loaded from: classes2.dex */
public final class i0 implements c {

    /* renamed from: a, reason: collision with root package name */
    public final d f30825a;

    /* renamed from: b, reason: collision with root package name */
    public final o f30826b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f30827c;

    public i0(d dVar, o oVar, List<String> list) {
        this.f30825a = dVar;
        this.f30826b = oVar;
        this.f30827c = list;
    }

    @Override // ve.c
    public final ArrayList a(int i10) {
        Integer num = (Integer) this.f30826b.f30861j.get(Integer.valueOf(i10));
        if (num == null) {
            Log.w("PdfBox-Android", "Trying to un-substitute a never-before-seen gid: " + i10);
        } else {
            i10 = num.intValue();
        }
        return this.f30825a.a(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    @Override // ve.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(int i10) {
        String str;
        String str2;
        Collection<o.g> collectionValues;
        List<String> list;
        int iB = this.f30825a.b(i10);
        HashMap map = f0.f30790a;
        if (i10 < 0 || i10 > 1114111) {
            throw new IllegalArgumentException(j2.y.a(i10, "Invalid codepoint: "));
        }
        if (i10 < 0 || i10 > 1114111) {
            throw new IllegalArgumentException(j2.y.a(i10, "Invalid codepoint: "));
        }
        if (Character.getType(i10) == 0) {
            str = "Unknown";
        } else {
            int iBinarySearch = Arrays.binarySearch(f0.f30791b, i10);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            str = f0.f30792c[iBinarySearch];
        }
        String[] strArr = (String[]) f0.f30790a.get(str);
        o oVar = this.f30826b;
        HashMap map2 = oVar.f30860i;
        if (iB == -1) {
            return -1;
        }
        Integer num = (Integer) map2.get(Integer.valueOf(iB));
        if (num != null) {
            return num.intValue();
        }
        int i11 = 1;
        if (strArr.length == 1) {
            String str3 = strArr[0];
            if (!"Inherited".equals(str3) && (!"DFLT".equals(str3) || oVar.f30857f.containsKey(str3))) {
                int length = strArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        str2 = strArr[0];
                        break;
                    }
                    String str4 = strArr[i12];
                    if (oVar.f30857f.containsKey(str4)) {
                        oVar.f30862k = str4;
                        str2 = str4;
                        break;
                    }
                    i12++;
                }
            } else {
                if (oVar.f30862k == null) {
                    oVar.f30862k = oVar.f30857f.keySet().iterator().next();
                }
                str2 = oVar.f30862k;
            }
        }
        ?? arrayList = Collections.EMPTY_LIST;
        o.n nVar = oVar.f30857f.get(str2);
        if (nVar == null) {
            collectionValues = arrayList;
        } else if (nVar.f30886a == null) {
            collectionValues = nVar.f30887b.values();
        } else {
            ArrayList arrayList2 = new ArrayList(nVar.f30887b.values());
            arrayList2.add(nVar.f30886a);
            collectionValues = arrayList2;
        }
        if (!collectionValues.isEmpty()) {
            arrayList = new ArrayList();
            Iterator<o.g> it = collectionValues.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                list = this.f30827c;
                if (!zHasNext) {
                    break;
                }
                o.g next = it.next();
                int i13 = next.f30871a;
                if (i13 != 65535) {
                    o.d[] dVarArr = oVar.f30858g;
                    if (i13 < dVarArr.length) {
                        arrayList.add(dVarArr[i13]);
                    }
                }
                for (int i14 : next.f30872b) {
                    o.d[] dVarArr2 = oVar.f30858g;
                    if (i14 < dVarArr2.length && (list == null || list.contains(dVarArr2[i14].f30866a))) {
                        arrayList.add(oVar.f30858g[i14]);
                    }
                }
            }
            int size = arrayList.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    break;
                }
                Object obj = arrayList.get(i15);
                i15++;
                if (((o.d) obj).f30866a.equals("vrt2")) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((o.d) it2.next()).f30866a.equals("vert")) {
                            it2.remove();
                        }
                    }
                }
            }
            if (list != null && arrayList.size() > 1) {
                Collections.sort(arrayList, new n(list));
            }
        }
        int iA = iB;
        for (o.d dVar : arrayList) {
            int[] iArr = dVar.f30867b.f30868a;
            int length2 = iArr.length;
            int i16 = 0;
            while (i16 < length2) {
                o.i iVar = oVar.f30859h[iArr[i16]];
                if (iVar.f30875a == i11) {
                    o.h[] hVarArr = iVar.f30878d;
                    int length3 = hVarArr.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length3) {
                            break;
                        }
                        o.h hVar = hVarArr[i17];
                        int iA2 = hVar.f30874b.a(iA);
                        if (iA2 >= 0) {
                            iA = hVar.a(iA, iA2);
                            break;
                        }
                        i17++;
                    }
                } else {
                    Log.d("PdfBox-Android", "Skipping GSUB feature '" + dVar.f30866a + "' because it requires unsupported lookup table type " + iVar.f30875a);
                }
                i16++;
                i11 = 1;
            }
        }
        map2.put(Integer.valueOf(iB), Integer.valueOf(iA));
        oVar.f30861j.put(Integer.valueOf(iA), Integer.valueOf(iB));
        return iA;
    }
}
