package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class wm1 extends qm1 implements SortedSet {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ an1 f10233u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm1(an1 an1Var, SortedMap sortedMap) {
        super(an1Var, sortedMap);
        this.f10233u = an1Var;
    }

    public SortedMap c() {
        return (SortedMap) this.s;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return c().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return c().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new wm1(this.f10233u, c().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return c().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new wm1(this.f10233u, c().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new wm1(this.f10233u, c().tailMap(obj));
    }
}
