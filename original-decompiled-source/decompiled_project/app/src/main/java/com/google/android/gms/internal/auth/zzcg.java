package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.a;

/* loaded from: classes2.dex */
public final class zzcg implements zzcl {
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map zzh;
    private final List zzi;
    private static final Map zzb = new a();
    public static final String[] zza = {"key", "value"};

    private zzcg(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzcf zzcfVar = new zzcf(this, null);
        this.zzf = zzcfVar;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzcfVar);
    }

    public static zzcg zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzcg zzcgVar;
        synchronized (zzcg.class) {
            Map map = zzb;
            zzcgVar = (zzcg) map.get(uri);
            if (zzcgVar == null) {
                try {
                    zzcg zzcgVar2 = new zzcg(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzcgVar2);
                    } catch (SecurityException unused) {
                    }
                    zzcgVar = zzcgVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzcgVar;
    }

    public static synchronized void zzd() {
        try {
            for (zzcg zzcgVar : zzb.values()) {
                zzcgVar.zzc.unregisterContentObserver(zzcgVar.zzf);
            }
            zzb.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzcl
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        Map map;
        Map map2;
        Map map3 = this.zzh;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.zzg) {
                Map map5 = this.zzh;
                if (map5 != null) {
                    map2 = map5;
                } else {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) zzcj.zza(new zzck() { // from class: com.google.android.gms.internal.auth.zzce
                                @Override // com.google.android.gms.internal.auth.zzck
                                public final Object zza() {
                                    return this.zza.zzc();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        }
                        this.zzh = map;
                        threadPolicyAllowThreadDiskReads = map;
                        map2 = threadPolicyAllowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
            }
            map4 = map2;
        }
        if (map4 == null) {
            map4 = Collections.EMPTY_MAP;
        }
        return (String) map4.get(str);
    }

    public final Map zzc() {
        Cursor cursorQuery = this.zzc.query(this.zzd, zza, null, null, null);
        if (cursorQuery == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.EMPTY_MAP;
            }
            Map aVar = count <= 256 ? new a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                aVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return aVar;
        } finally {
            cursorQuery.close();
        }
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzh = null;
            zzdc.zzc();
        }
        synchronized (this) {
            try {
                Iterator it = this.zzi.iterator();
                while (it.hasNext()) {
                    ((zzch) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
