package com.google.android.gms.ads.mediation;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public interface MediationAdRequest {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    @Deprecated
    Date getBirthday();

    @Deprecated
    int getGender();

    Set<String> getKeywords();

    Location getLocation();

    @Deprecated
    boolean isDesignedForFamilies();

    boolean isTesting();

    int taggedForChildDirectedTreatment();
}
