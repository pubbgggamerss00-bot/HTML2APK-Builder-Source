package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rm1 extends vm1 implements NavigableMap {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ an1 f8671y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm1(an1 an1Var, NavigableMap navigableMap) {
        super(an1Var, navigableMap);
        this.f8671y = an1Var;
    }

    @Override // com.google.android.gms.internal.ads.vm1
    public final /* synthetic */ SortedMap b() {
        return (NavigableMap) ((SortedMap) this.f7469u);
    }

    @Override // com.google.android.gms.internal.ads.vm1
    public final SortedSet c() {
        return new sm1(this.f8671y, (NavigableMap) ((SortedMap) this.f7469u));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) this.f7469u)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f7469u)).ceilingKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.vm1
    /* renamed from: d */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new rm1(this.f8671y, ((NavigableMap) ((SortedMap) this.f7469u)).descendingMap());
    }

    public final xn1 e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) ((xo1) this.f8671y).f10653x.mo7zza();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new xn1(entry.getKey(), Collections.unmodifiableList(list));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) this.f7469u)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) this.f7469u)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f7469u)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.vm1, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) this.f7469u)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f7469u)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.vm1, com.google.android.gms.internal.ads.nm1, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) this.f7469u)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) this.f7469u)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f7469u)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return e(((lm1) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return e(((lm1) ((to1) descendingMap()).entrySet()).iterator());
    }

    @Override // com.google.android.gms.internal.ads.vm1, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.vm1, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z6) {
        return new rm1(this.f8671y, ((NavigableMap) ((SortedMap) this.f7469u)).headMap(obj, z6));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z6, Object obj2, boolean z7) {
        return new rm1(this.f8671y, ((NavigableMap) ((SortedMap) this.f7469u)).subMap(obj, z6, obj2, z7));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z6) {
        return new rm1(this.f8671y, ((NavigableMap) ((SortedMap) this.f7469u)).tailMap(obj, z6));
    }
}
