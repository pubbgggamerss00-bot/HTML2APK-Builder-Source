package com.google.android.gms.internal.auth;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import ua.b;

/* loaded from: classes2.dex */
public abstract class zzbz extends b {
    @Override // ua.b
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            Log.e("AUTH", "Error serializing object.", e10);
            return null;
        }
    }
}
