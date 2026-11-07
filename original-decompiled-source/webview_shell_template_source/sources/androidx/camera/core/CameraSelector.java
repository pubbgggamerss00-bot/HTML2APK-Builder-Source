package androidx.camera.core;

import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.LensFacingCameraFilter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CameraSelector {
    public static final int LENS_FACING_BACK = 1;

    @ExperimentalLensFacing
    public static final int LENS_FACING_EXTERNAL = 2;
    public static final int LENS_FACING_FRONT = 0;
    public static final int LENS_FACING_UNKNOWN = -1;
    private final LinkedHashSet<CameraFilter> mCameraFilterSet;
    private final String mPhysicalCameraId;
    public static final CameraSelector DEFAULT_FRONT_CAMERA = new Builder().requireLensFacing(0).build();
    public static final CameraSelector DEFAULT_BACK_CAMERA = new Builder().requireLensFacing(1).build();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Target({ElementType.TYPE, ElementType.TYPE_USE, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LensFacing {
    }

    public CameraSelector(LinkedHashSet<CameraFilter> linkedHashSet, String str) {
        this.mCameraFilterSet = linkedHashSet;
        this.mPhysicalCameraId = str;
    }

    public List<CameraInfo> filter(List<CameraInfo> list) {
        List<CameraInfo> arrayList = new ArrayList<>(list);
        Iterator<CameraFilter> it = this.mCameraFilterSet.iterator();
        while (it.hasNext()) {
            arrayList = it.next().filter(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet<CameraFilter> getCameraFilterSet() {
        return this.mCameraFilterSet;
    }

    public Integer getLensFacing() {
        Iterator<CameraFilter> it = this.mCameraFilterSet.iterator();
        Integer num = null;
        while (it.hasNext()) {
            CameraFilter next = it.next();
            if (next instanceof LensFacingCameraFilter) {
                Integer numValueOf = Integer.valueOf(((LensFacingCameraFilter) next).getLensFacing());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public String getPhysicalCameraId() {
        return this.mPhysicalCameraId;
    }

    public CameraInternal select(LinkedHashSet<CameraInternal> linkedHashSet) {
        Iterator<CameraInternal> it = filter(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Builder {
        private final LinkedHashSet<CameraFilter> mCameraFilterSet;
        private String mPhysicalCameraId;

        public Builder() {
            this.mCameraFilterSet = new LinkedHashSet<>();
        }

        public static Builder fromSelector(CameraSelector cameraSelector) {
            return new Builder(cameraSelector.getCameraFilterSet());
        }

        public Builder addCameraFilter(CameraFilter cameraFilter) {
            this.mCameraFilterSet.add(cameraFilter);
            return this;
        }

        public CameraSelector build() {
            return new CameraSelector(this.mCameraFilterSet, this.mPhysicalCameraId);
        }

        public Builder requireLensFacing(int i6) {
            androidx.work.j.f("The specified lens facing is invalid.", i6 != -1);
            this.mCameraFilterSet.add(new LensFacingCameraFilter(i6));
            return this;
        }

        public Builder setPhysicalCameraId(String str) {
            this.mPhysicalCameraId = str;
            return this;
        }

        private Builder(LinkedHashSet<CameraFilter> linkedHashSet) {
            this.mCameraFilterSet = new LinkedHashSet<>(linkedHashSet);
        }
    }

    public LinkedHashSet<CameraInternal> filter(LinkedHashSet<CameraInternal> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<CameraInternal> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCameraInfo());
        }
        List<CameraInfo> listFilter = filter(arrayList);
        LinkedHashSet<CameraInternal> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<CameraInternal> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            CameraInternal next = it2.next();
            if (listFilter.contains(next.getCameraInfo())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }
}
