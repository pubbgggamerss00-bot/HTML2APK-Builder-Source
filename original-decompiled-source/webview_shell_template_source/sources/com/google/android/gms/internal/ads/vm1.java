package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class vm1 extends nm1 implements SortedMap {

    /* renamed from: w, reason: collision with root package name */
    public SortedSet f9898w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ an1 f9899x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm1(an1 an1Var, SortedMap sortedMap) {
        super(an1Var, sortedMap);
        this.f9899x = an1Var;
    }

    public SortedMap b() {
        return (SortedMap) this.f7469u;
    }

    public SortedSet c() {
        return new wm1(this.f9899x, b());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // com.google.android.gms.internal.ads.nm1, java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f9898w;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetC = c();
        this.f9898w = sortedSetC;
        return sortedSetC;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return b().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new vm1(this.f9899x, b().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return b().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new vm1(this.f9899x, b().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new vm1(this.f9899x, b().tailMap(obj));
    }
}
