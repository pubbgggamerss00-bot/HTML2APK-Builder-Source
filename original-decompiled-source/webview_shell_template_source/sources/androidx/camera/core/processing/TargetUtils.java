package androidx.camera.core.processing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class TargetUtils {
    private TargetUtils() {
    }

    public static void checkSupportedTargets(Collection<Integer> collection, int i6) {
        boolean zContains = collection.contains(Integer.valueOf(i6));
        Locale locale = Locale.US;
        androidx.work.j.a("Effects target " + getHumanReadableName(i6) + " is not in the supported list " + getHumanReadableNames(collection) + ".", zContains);
    }

    public static String getHumanReadableName(int i6) {
        ArrayList arrayList = new ArrayList();
        if ((i6 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i6 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i6 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "|");
            }
        }
        return sb.toString();
    }

    private static String getHumanReadableNames(Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(getHumanReadableName(it.next().intValue()));
        }
        StringBuilder sb = new StringBuilder("[");
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) ", ");
            }
        }
        sb.append(sb2.toString());
        sb.append("]");
        return sb.toString();
    }

    public static int getNumberOfTargets(int i6) {
        int i7 = 0;
        while (i6 != 0) {
            i7 += i6 & 1;
            i6 >>= 1;
        }
        return i7;
    }

    public static boolean isSuperset(int i6, int i7) {
        return (i6 & i7) == i7;
    }
}
