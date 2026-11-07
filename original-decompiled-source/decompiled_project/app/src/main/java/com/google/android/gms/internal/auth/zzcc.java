package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes2.dex */
public final class zzcc {
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzcc() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, NullPointerException -> 0x0045, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:35:0x0058, B:36:0x005a, B:24:0x0031, B:26:0x0037, B:33:0x0054, B:31:0x0046), top: B:42:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(Context context) {
        int i10;
        boolean z10;
        if (zzb() && !zzb) {
            synchronized (zzcc.class) {
                try {
                    if (!zzb) {
                        i10 = 1;
                        while (true) {
                            if (i10 <= 2) {
                                if (zza == null) {
                                    zza = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = zza;
                                if (userManager != null) {
                                    if (userManager.isUserUnlocked()) {
                                        break;
                                    }
                                    if (!userManager.isUserRunning(Process.myUserHandle())) {
                                        break;
                                    }
                                    if (z10) {
                                        zza = null;
                                    }
                                } else {
                                    z10 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        z10 = false;
                        if (z10) {
                        }
                        if (z10) {
                            zzb = true;
                        }
                        if (!z10) {
                            return true;
                        }
                    }
                } catch (NullPointerException e10) {
                    Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                    zza = null;
                    i10++;
                } finally {
                }
            }
        }
        return false;
    }

    public static boolean zzb() {
        return true;
    }
}
