package com.basitce.htmltoapk.domain.model;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class ProjectLimits {
    public static final int $stable = 0;
    public static final int FREE_PER_KIND = 5;
    public static final ProjectLimits INSTANCE = new ProjectLimits();

    private ProjectLimits() {
    }

    public final boolean canCreate(String kind, boolean z10, int i10) {
        r.e(kind, "kind");
        return z10 || i10 < 5;
    }
}
