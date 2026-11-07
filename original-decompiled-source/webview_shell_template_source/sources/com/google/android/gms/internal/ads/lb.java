package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lb {

    /* renamed from: a, reason: collision with root package name */
    public final int f6645a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6646b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f6647c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6648d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6649e;

    public lb(int i6, byte[] bArr, Map map, List list, boolean z6) {
        this.f6645a = i6;
        this.f6646b = bArr;
        this.f6647c = map;
        this.f6648d = list == null ? null : Collections.unmodifiableList(list);
        this.f6649e = z6;
    }

    public static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new hb((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public lb(int i6, byte[] bArr, boolean z6, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hb hbVar = (hb) it.next();
                treeMap.put(hbVar.f5314a, hbVar.f5315b);
            }
        }
        this(i6, bArr, treeMap, list, z6);
    }
}
