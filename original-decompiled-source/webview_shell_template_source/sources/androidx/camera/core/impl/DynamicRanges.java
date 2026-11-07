package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class DynamicRanges {
    public static final DynamicRanges INSTANCE = new DynamicRanges();

    private DynamicRanges() {
    }

    private final boolean canMatchBitDepth(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        androidx.work.j.f("Fully specified range is not actually fully specified.", dynamicRange2.isFullySpecified());
        return dynamicRange.getBitDepth() == 0 || dynamicRange.getBitDepth() == dynamicRange2.getBitDepth();
    }

    private final boolean canMatchEncoding(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        androidx.work.j.f("Fully specified range is not actually fully specified.", dynamicRange2.isFullySpecified());
        int encoding = dynamicRange.getEncoding();
        if (encoding == 0) {
            return true;
        }
        int encoding2 = dynamicRange2.getEncoding();
        return (encoding == 2 && encoding2 != 1) || encoding == encoding2;
    }

    public static final boolean canResolve(DynamicRange dynamicRange, Set<DynamicRange> set) {
        Object next;
        kotlin.jvm.internal.j.e("dynamicRangeToTest", dynamicRange);
        kotlin.jvm.internal.j.e("fullySpecifiedDynamicRanges", set);
        if (dynamicRange.isFullySpecified()) {
            return set.contains(dynamicRange);
        }
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRange, (DynamicRange) next)) {
                break;
            }
        }
        return next != null;
    }

    private final boolean canResolveUnderSpecifiedTo(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        return canMatchBitDepth(dynamicRange, dynamicRange2) && canMatchEncoding(dynamicRange, dynamicRange2);
    }

    public static final Set<DynamicRange> findAllPossibleMatches(Set<DynamicRange> set, Set<DynamicRange> set2) {
        kotlin.jvm.internal.j.e("dynamicRangesToTest", set);
        kotlin.jvm.internal.j.e("fullySpecifiedDynamicRanges", set2);
        if (set.isEmpty()) {
            throw new IllegalArgumentException("Candidate dynamic range set must contain at least 1 candidate dynamic range.");
        }
        f5.g gVar = new f5.g(new f5.c(8));
        for (DynamicRange dynamicRange : set) {
            if (!dynamicRange.isFullySpecified()) {
                for (DynamicRange dynamicRange2 : set2) {
                    if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRange, dynamicRange2)) {
                        gVar.add(dynamicRange2);
                    }
                }
            } else if (set2.contains(dynamicRange)) {
                gVar.add(dynamicRange);
            }
        }
        f5.c<E, ?> cVar = gVar.s;
        cVar.b();
        cVar.E = true;
        if (cVar.A <= 0) {
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>", f5.c.F);
        }
        return gVar.c() > 0 ? gVar : f5.g.f13074t;
    }
}
