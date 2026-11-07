package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ea2 implements x92 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4188c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f4189a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4190b;

    static {
        y92.a(Collections.EMPTY_SET);
    }

    public /* synthetic */ ea2(List list, List list2) {
        this.f4189a = list;
        this.f4190b = list2;
    }

    public static com.google.android.gms.ads.mediation.customevent.a a(int i6, int i7) {
        return new com.google.android.gms.ads.mediation.customevent.a(i6, i7);
    }

    @Override // com.google.android.gms.internal.ads.ga2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.f4189a;
        int size = list.size();
        List list2 = this.f4190b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Collection collection = (Collection) ((ca2) list2.get(i6)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            Object objZzb = ((ca2) list.get(i7)).zzb();
            objZzb.getClass();
            hashSet.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i8 = 0; i8 < size4; i8++) {
            for (Object obj : (Collection) arrayList.get(i8)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
