package ve;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class z extends n0 {

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f30973f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f30974g;

    /* renamed from: h, reason: collision with root package name */
    public String f30975h;

    @Override // ve.n0
    public final void a(p0 p0Var, k0 k0Var) throws IOException {
        int i10;
        k0Var.i0();
        int iI0 = k0Var.i0();
        k0Var.i0();
        this.f30973f = new ArrayList(iI0);
        for (int i11 = 0; i11 < iI0; i11++) {
            y yVar = new y();
            yVar.f30966a = k0Var.i0();
            yVar.f30967b = k0Var.i0();
            yVar.f30968c = k0Var.i0();
            yVar.f30969d = k0Var.i0();
            yVar.f30970e = k0Var.i0();
            yVar.f30971f = k0Var.i0();
            this.f30973f.add(yVar);
        }
        ArrayList arrayList = this.f30973f;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            y yVar2 = (y) obj;
            long j10 = yVar2.f30971f;
            if (j10 > this.f30854c) {
                yVar2.f30972g = null;
            } else {
                ArrayList arrayList2 = arrayList;
                k0Var.seek(this.f30853b + 6 + (iI0 * 12) + j10);
                int i13 = yVar2.f30966a;
                int i14 = yVar2.f30967b;
                Charset charset = xe.a.f33561a;
                if ((i13 == 3 && (i14 == 0 || i14 == 1)) || i13 == 0) {
                    charset = xe.a.f33562b;
                } else if (i13 == 2) {
                    if (i14 == 0) {
                        charset = xe.a.f33564d;
                    } else if (i14 == 1) {
                        charset = xe.a.f33565e;
                    }
                }
                yVar2.f30972g = k0Var.d0(yVar2.f30970e, charset);
                arrayList = arrayList2;
            }
        }
        this.f30974g = new HashMap(this.f30973f.size());
        ArrayList arrayList3 = this.f30973f;
        int size2 = arrayList3.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList3.get(i15);
            i15++;
            y yVar3 = (y) obj2;
            Map map = (Map) this.f30974g.get(Integer.valueOf(yVar3.f30969d));
            if (map == null) {
                map = new HashMap();
                this.f30974g.put(Integer.valueOf(yVar3.f30969d), map);
            }
            Map map2 = (Map) map.get(Integer.valueOf(yVar3.f30966a));
            if (map2 == null) {
                map2 = new HashMap();
                map.put(Integer.valueOf(yVar3.f30966a), map2);
            }
            Map map3 = (Map) map2.get(Integer.valueOf(yVar3.f30967b));
            if (map3 == null) {
                map3 = new HashMap();
                map2.put(Integer.valueOf(yVar3.f30967b), map3);
            }
            map3.put(Integer.valueOf(yVar3.f30968c), yVar3.f30972g);
        }
        int i16 = 4;
        int i17 = 4;
        while (true) {
            if (i17 >= 0) {
                i10 = 0;
                if (b(1, 0, i17, 0) != null) {
                    break;
                } else {
                    i17--;
                }
            } else {
                i10 = 0;
                if (b(1, 3, 1, 1033) == null) {
                    b(1, 1, 0, 0);
                }
            }
        }
        while (true) {
            if (i16 >= 0) {
                if (b(2, i10, i16, i10) != null) {
                    break;
                } else {
                    i16--;
                }
            } else if (b(2, 3, 1, 1033) == null) {
                b(2, 1, i10, i10);
            }
        }
        String strB = b(6, 1, i10, i10);
        this.f30975h = strB;
        if (strB == null) {
            this.f30975h = b(6, 3, 1, 1033);
        }
        String str = this.f30975h;
        if (str != null) {
            this.f30975h = str.trim();
        }
        this.f30855d = true;
    }

    public final String b(int i10, int i11, int i12, int i13) {
        Map map;
        Map map2;
        Map map3 = (Map) this.f30974g.get(Integer.valueOf(i10));
        if (map3 == null || (map = (Map) map3.get(Integer.valueOf(i11))) == null || (map2 = (Map) map.get(Integer.valueOf(i12))) == null) {
            return null;
        }
        return (String) map2.get(Integer.valueOf(i13));
    }
}
