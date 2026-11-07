package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public final class co {

    /* renamed from: d, reason: collision with root package name */
    public String f3622d;

    /* renamed from: e, reason: collision with root package name */
    public Context f3623e;

    /* renamed from: f, reason: collision with root package name */
    public String f3624f;
    public AtomicBoolean h;

    /* renamed from: i, reason: collision with root package name */
    public File f3626i;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayBlockingQueue f3619a = new ArrayBlockingQueue(100);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3620b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3621c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f3625g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public final LinkedHashMap a(LinkedHashMap linkedHashMap, Map map) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap2.get(str);
            jo joVar = (jo) this.f3621c.get(str);
            if (joVar == null) {
                joVar = jo.f6111a;
            }
            linkedHashMap2.put(str, joVar.a(str3, str2));
        }
        return linkedHashMap2;
    }

    public final void b(LinkedHashMap linkedHashMap, mo moVar) {
        FileOutputStream fileOutputStream;
        Uri.Builder builderBuildUpon = Uri.parse(this.f3622d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (moVar != null) {
            String str = moVar.f7195b;
            String str2 = moVar.f7194a;
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&it=");
                sb.append(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append("&blat=");
                sb.append(str);
            }
            string = sb.toString();
        }
        if (!this.h.get()) {
            zzv.zzq();
            zzs.zzM(this.f3623e, this.f3624f, string);
            return;
        }
        File file = this.f3626i;
        if (file == null) {
            zzo.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e6) {
            e = e6;
        }
        try {
            fileOutputStream.write(string.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e7) {
                zzo.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e7);
            }
        } catch (IOException e8) {
            e = e8;
            fileOutputStream2 = fileOutputStream;
            zzo.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e9) {
                    zzo.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e9);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e10) {
                    zzo.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                }
            }
            throw th;
        }
    }
}
