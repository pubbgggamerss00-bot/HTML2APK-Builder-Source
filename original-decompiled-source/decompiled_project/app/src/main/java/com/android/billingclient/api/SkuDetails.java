package com.android.billingclient.api;

import android.text.TextUtils;

@Deprecated
/* loaded from: classes.dex */
public final class SkuDetails {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(null, null);
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "SkuDetails: ".concat("null");
    }
}
