package androidx.camera.core.impl.utils;

import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.impl.SessionProcessor;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class SessionProcessorUtil {
    private SessionProcessorUtil() {
    }

    public static FocusMeteringAction getModifiedFocusMeteringAction(SessionProcessor sessionProcessor, FocusMeteringAction focusMeteringAction) {
        boolean z6;
        if (sessionProcessor == null) {
            return focusMeteringAction;
        }
        FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(focusMeteringAction);
        boolean z7 = true;
        if (focusMeteringAction.getMeteringPointsAf().isEmpty() || isOperationSupported(sessionProcessor, 1, 2)) {
            z6 = false;
        } else {
            builder.removePoints(1);
            z6 = true;
        }
        if (!focusMeteringAction.getMeteringPointsAe().isEmpty() && !isOperationSupported(sessionProcessor, 3)) {
            builder.removePoints(2);
            z6 = true;
        }
        if (focusMeteringAction.getMeteringPointsAwb().isEmpty() || isOperationSupported(sessionProcessor, 4)) {
            z7 = z6;
        } else {
            builder.removePoints(4);
        }
        if (!z7) {
            return focusMeteringAction;
        }
        FocusMeteringAction focusMeteringActionBuild = builder.build();
        if (focusMeteringActionBuild.getMeteringPointsAf().isEmpty() && focusMeteringActionBuild.getMeteringPointsAe().isEmpty() && focusMeteringActionBuild.getMeteringPointsAwb().isEmpty()) {
            return null;
        }
        return builder.build();
    }

    public static boolean isOperationSupported(SessionProcessor sessionProcessor, int... iArr) {
        if (sessionProcessor == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i6 : iArr) {
            arrayList.add(Integer.valueOf(i6));
        }
        return sessionProcessor.getSupportedCameraOperations().containsAll(arrayList);
    }
}
