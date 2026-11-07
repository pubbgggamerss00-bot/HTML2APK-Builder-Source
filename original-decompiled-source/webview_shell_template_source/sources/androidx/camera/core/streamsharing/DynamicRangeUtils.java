package androidx.camera.core.streamsharing;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class DynamicRangeUtils {
    private DynamicRangeUtils() {
    }

    private static DynamicRange intersectDynamicRange(List<DynamicRange> list) {
        if (list.isEmpty()) {
            return null;
        }
        DynamicRange dynamicRange = list.get(0);
        Integer numValueOf = Integer.valueOf(dynamicRange.getEncoding());
        Integer numValueOf2 = Integer.valueOf(dynamicRange.getBitDepth());
        for (int i6 = 1; i6 < list.size(); i6++) {
            DynamicRange dynamicRange2 = list.get(i6);
            numValueOf = intersectDynamicRangeEncoding(numValueOf, Integer.valueOf(dynamicRange2.getEncoding()));
            numValueOf2 = intersectDynamicRangeBitDepth(numValueOf2, Integer.valueOf(dynamicRange2.getBitDepth()));
            if (numValueOf == null || numValueOf2 == null) {
                return null;
            }
        }
        return new DynamicRange(numValueOf.intValue(), numValueOf2.intValue());
    }

    private static Integer intersectDynamicRangeBitDepth(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    private static Integer intersectDynamicRangeEncoding(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (!num2.equals(0)) {
            if (num.equals(2) && !num2.equals(1)) {
                return num2;
            }
            if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
                return null;
            }
        }
        return num;
    }

    public static DynamicRange resolveDynamicRange(Set<UseCaseConfig<?>> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<UseCaseConfig<?>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getDynamicRange());
        }
        return intersectDynamicRange(arrayList);
    }
}
