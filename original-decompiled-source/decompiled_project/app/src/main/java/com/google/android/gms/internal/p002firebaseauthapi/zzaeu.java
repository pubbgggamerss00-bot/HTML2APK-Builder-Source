package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.p;
import com.google.protobuf.DescriptorProtos;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import m3.a;

/* loaded from: classes2.dex */
public final class zzaeu {
    private final int zza;

    private zzaeu(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> listZza = zzv.zza("[.-]").zza((CharSequence) str);
            if (listZza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (listZza.size() < 3) {
                return -1;
            }
            return (Integer.parseInt(listZza.get(1)) * DescriptorProtos.Edition.EDITION_2023_VALUE) + (Integer.parseInt(listZza.get(0)) * 1000000) + Integer.parseInt(listZza.get(2));
        } catch (IllegalArgumentException e10) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e10));
            return -1;
        }
    }

    public final String zzb() {
        return a.a("X", Integer.toString(this.zza));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaeu zza() throws Throwable {
        String str;
        InputStream resourceAsStream;
        String str2;
        String strConcat = "Failed to get app version for libraryName: firebase-auth";
        m mVar = m.f6166c;
        mVar.getClass();
        i iVar = m.f6165b;
        p.e("firebase-auth", "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = mVar.f6167a;
        if (concurrentHashMap.containsKey("firebase-auth")) {
            str2 = (String) concurrentHashMap.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            InputStream inputStream = null;
            property = null;
            String property = null;
            InputStream inputStream2 = null;
            try {
                try {
                    resourceAsStream = m.class.getResourceAsStream("/firebase-auth.properties");
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e10) {
                e = e10;
                str = null;
            }
            try {
                if (resourceAsStream != null) {
                    properties.load(resourceAsStream);
                    property = properties.getProperty("version", null);
                    String strConcat2 = "firebase-auth version is " + property;
                    if (Log.isLoggable(iVar.f6151a, 2)) {
                        String str3 = iVar.f6152b;
                        if (str3 != null) {
                            strConcat2 = str3.concat(strConcat2);
                        }
                        Log.v("LibraryVersion", strConcat2);
                    }
                } else if (Log.isLoggable(iVar.f6151a, 5)) {
                    String str4 = iVar.f6152b;
                    Log.w("LibraryVersion", str4 == null ? "Failed to get app version for libraryName: firebase-auth" : str4.concat("Failed to get app version for libraryName: firebase-auth"));
                }
            } catch (IOException e11) {
                e = e11;
                str = null;
                inputStream = resourceAsStream;
                if (Log.isLoggable(iVar.f6151a, 6)) {
                    String str5 = iVar.f6152b;
                    if (str5 != null) {
                        strConcat = str5.concat("Failed to get app version for libraryName: firebase-auth");
                    }
                    Log.e("LibraryVersion", strConcat, e);
                }
                resourceAsStream = inputStream;
                property = str;
                if (resourceAsStream != null) {
                }
                if (property != null) {
                }
                concurrentHashMap.put("firebase-auth", str2);
                if (!TextUtils.isEmpty(str2)) {
                    str2 = "-1";
                }
                return new zzaeu(str2);
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = resourceAsStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (IOException unused2) {
                }
            }
            if (property != null) {
                if (Log.isLoggable(iVar.f6151a, 3)) {
                    String str6 = iVar.f6152b;
                    Log.d("LibraryVersion", str6 != null ? str6.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                }
                str2 = "UNKNOWN";
            } else {
                str2 = property;
            }
            concurrentHashMap.put("firebase-auth", str2);
        }
        if (!TextUtils.isEmpty(str2) || str2.equals("UNKNOWN")) {
            str2 = "-1";
        }
        return new zzaeu(str2);
    }
}
