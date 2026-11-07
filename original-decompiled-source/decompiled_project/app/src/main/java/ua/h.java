package ua;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ua.a;

/* loaded from: classes2.dex */
public final class h extends qa.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final int f29687a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f29688b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29689c;

    public h(int i10, String str, ArrayList arrayList) {
        this.f29687a = i10;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) arrayList.get(i11);
            String str2 = fVar.f29682b;
            ArrayList arrayList2 = fVar.f29683c;
            HashMap map2 = new HashMap();
            p.f(arrayList2);
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) arrayList2.get(i12);
                map2.put(gVar.f29685b, gVar.f29686c);
            }
            map.put(str2, map2);
        }
        this.f29688b = map;
        p.f(str);
        this.f29689c = str;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Map map3 = (Map) map.get((String) it.next());
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                ((a.C0303a) map3.get((String) it2.next())).f29672k = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap map = this.f29688b;
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map2 = (Map) map.get(str);
            for (String str2 : map2.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map2.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f29687a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f29688b;
        for (String str : map.keySet()) {
            arrayList.add(new f(str, (Map) map.get(str)));
        }
        c1.p(parcel, 2, arrayList, false);
        c1.m(parcel, 3, this.f29689c, false);
        c1.r(iQ, parcel);
    }
}
