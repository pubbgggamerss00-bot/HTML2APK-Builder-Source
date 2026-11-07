package androidx.camera.core.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface EncoderProfilesProvider {
    public static final EncoderProfilesProvider EMPTY = new EncoderProfilesProvider() { // from class: androidx.camera.core.impl.EncoderProfilesProvider.1
        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        public EncoderProfilesProxy getAll(int i6) {
            return null;
        }

        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        public boolean hasProfile(int i6) {
            return false;
        }
    };
    public static final List<Integer> QUALITY_HIGH_TO_LOW = Collections.unmodifiableList(Arrays.asList(13, 10, 8, 11, 6, 5, 4, 9, 3, 7, 2));

    EncoderProfilesProxy getAll(int i6);

    boolean hasProfile(int i6);
}
