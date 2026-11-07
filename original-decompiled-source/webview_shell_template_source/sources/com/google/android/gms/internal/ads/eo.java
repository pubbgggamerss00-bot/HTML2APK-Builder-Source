package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public final class eo {
    public static final void a(co coVar, bo boVar) {
        File externalStorageDirectory;
        Context context = boVar.f3232c;
        String str = boVar.f3233d;
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        String str2 = boVar.f3230a;
        LinkedHashMap linkedHashMap = boVar.f3231b;
        HashMap map = coVar.f3621c;
        coVar.f3623e = context;
        coVar.f3624f = str;
        coVar.f3622d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        coVar.h = atomicBoolean;
        atomicBoolean.set(((Boolean) np.f7487c.c()).booleanValue());
        if (coVar.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            int i6 = pj1.f8098a;
            coVar.f3626i = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            coVar.f3620b.put((String) entry.getKey(), (String) entry.getValue());
        }
        i70.f5586a.execute(new x(2, coVar));
        ho hoVar = jo.f6112b;
        map.put("action", hoVar);
        map.put("ad_format", hoVar);
        map.put("e", jo.f6113c);
    }
}
