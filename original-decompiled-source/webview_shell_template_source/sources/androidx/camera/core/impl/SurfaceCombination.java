package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class SurfaceCombination {
    private final List<SurfaceConfig> mSurfaceConfigList = new ArrayList();

    private static void generateArrangements(List<int[]> list, int i6, int[] iArr, int i7) {
        if (i7 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = 0;
            while (true) {
                if (i9 >= i7) {
                    iArr[i7] = i8;
                    generateArrangements(list, i6, iArr, i7 + 1);
                    break;
                } else if (i8 == iArr[i9]) {
                    break;
                } else {
                    i9++;
                }
            }
        }
    }

    private List<int[]> getElementsArrangements(int i6) {
        ArrayList arrayList = new ArrayList();
        generateArrangements(arrayList, i6, new int[i6], 0);
        return arrayList;
    }

    public boolean addSurfaceConfig(SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    public List<SurfaceConfig> getOrderedSupportedSurfaceConfigList(List<SurfaceConfig> list) {
        int i6;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.mSurfaceConfigList.size()) {
            return null;
        }
        List<int[]> elementsArrangements = getElementsArrangements(this.mSurfaceConfigList.size());
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        Iterator<int[]> it = elementsArrangements.iterator();
        while (true) {
            i6 = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            boolean zIsSupported = true;
            while (i6 < this.mSurfaceConfigList.size()) {
                if (next[i6] < list.size()) {
                    zIsSupported &= this.mSurfaceConfigList.get(i6).isSupported(list.get(next[i6]));
                    if (!zIsSupported) {
                        break;
                    }
                    surfaceConfigArr[next[i6]] = this.mSurfaceConfigList.get(i6);
                }
                i6++;
            }
            if (zIsSupported) {
                i6 = 1;
                break;
            }
        }
        if (i6 != 0) {
            return Arrays.asList(surfaceConfigArr);
        }
        return null;
    }

    public List<SurfaceConfig> getSurfaceConfigList() {
        return this.mSurfaceConfigList;
    }

    public boolean removeSurfaceConfig(SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.remove(surfaceConfig);
    }
}
