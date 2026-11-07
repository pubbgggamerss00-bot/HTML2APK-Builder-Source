package com.google.android.gms.dynamite;

import ab.e;
import ab.f;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzc;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class a implements DynamiteModule.b.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context) {
        return DynamiteModule.a(context, "com.google.android.gms.providerinstaller.dynamite");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af A[Catch: all -> 0x0039, TryCatch #11 {, blocks: (B:10:0x0029, B:12:0x0035, B:52:0x00b8, B:17:0x003e, B:19:0x0045, B:21:0x004b, B:26:0x0051, B:28:0x0055, B:31:0x005e, B:33:0x0066, B:36:0x006d, B:43:0x0097, B:44:0x009f, B:39:0x0074, B:41:0x007a, B:42:0x0089, B:47:0x00a2, B:50:0x00a5, B:51:0x00af, B:18:0x0041), top: B:148:0x0029, inners: #1 }] */
    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(Context context, boolean z10) throws DynamiteModule.a {
        Field declaredField;
        Throwable th2;
        RemoteException e10;
        int i10;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = DynamiteModule.f6217c;
                boolean z11 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule.DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e11.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                DynamiteModule.d(classLoader);
                            } catch (DynamiteModule.a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!DynamiteModule.e(context)) {
                                return 0;
                            }
                            if (!DynamiteModule.f6219e) {
                                Boolean bool2 = Boolean.TRUE;
                                if (bool2.equals(null)) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        int iC = DynamiteModule.c(context, z10, true);
                                        String str = DynamiteModule.f6218d;
                                        if (str != null && !str.isEmpty()) {
                                            ClassLoader classLoaderA = ab.b.a();
                                            if (classLoaderA == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str2 = DynamiteModule.f6218d;
                                                    p.f(str2);
                                                    classLoaderA = new DelegateLastClassLoader(str2, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str3 = DynamiteModule.f6218d;
                                                    p.f(str3);
                                                    classLoaderA = new ab.c(str3, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            DynamiteModule.d(classLoaderA);
                                            declaredField.set(null, classLoaderA);
                                            DynamiteModule.f6217c = bool2;
                                            return iC;
                                        }
                                        return iC;
                                    } catch (DynamiteModule.a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        }
                        DynamiteModule.f6217c = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return DynamiteModule.c(context, z10, false);
                    } catch (DynamiteModule.a e12) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e12.getMessage());
                        return 0;
                    }
                }
                f fVarF = DynamiteModule.f(context);
                try {
                    if (fVarF == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelZzB = fVarF.zzB(6, fVarF.zza());
                        int i11 = parcelZzB.readInt();
                        parcelZzB.recycle();
                        if (i11 < 3) {
                            if (i11 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                za.b bVar = new za.b(context);
                                Parcel parcelZza = fVarF.zza();
                                zzc.zze(parcelZza, bVar);
                                parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
                                parcelZza.writeInt(z10 ? 1 : 0);
                                Parcel parcelZzB2 = fVarF.zzB(5, parcelZza);
                                i10 = parcelZzB2.readInt();
                                parcelZzB2.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                za.b bVar2 = new za.b(context);
                                Parcel parcelZza2 = fVarF.zza();
                                zzc.zze(parcelZza2, bVar2);
                                parcelZza2.writeString("com.google.android.gms.providerinstaller.dynamite");
                                parcelZza2.writeInt(z10 ? 1 : 0);
                                Parcel parcelZzB3 = fVarF.zzB(3, parcelZza2);
                                i10 = parcelZzB3.readInt();
                                parcelZzB3.recycle();
                            }
                            return i10;
                        }
                        ThreadLocal threadLocal = DynamiteModule.f6222h;
                        e eVar = (e) threadLocal.get();
                        if (eVar != null && (cursor = eVar.f392a) != null) {
                            return cursor.getInt(0);
                        }
                        Cursor cursor3 = (Cursor) za.b.c(fVarF.H(new za.b(context), z10, ((Long) DynamiteModule.f6223i.get()).longValue()));
                        if (cursor3 != null) {
                            try {
                                if (cursor3.moveToFirst()) {
                                    int i12 = cursor3.getInt(0);
                                    if (i12 <= 0) {
                                        cursor2 = cursor3;
                                    } else {
                                        e eVar2 = (e) threadLocal.get();
                                        if (eVar2 == null || eVar2.f392a != null) {
                                            z11 = false;
                                        } else {
                                            eVar2.f392a = cursor3;
                                        }
                                        if (!z11) {
                                        }
                                    }
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    return i12;
                                }
                            } catch (RemoteException e13) {
                                e10 = e13;
                                cursor2 = cursor3;
                                Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                                if (cursor2 == null) {
                                    return 0;
                                }
                                cursor2.close();
                                return 0;
                            } catch (Throwable th3) {
                                th2 = th3;
                                cursor2 = cursor3;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th2;
                            }
                        }
                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                        if (cursor3 == null) {
                            return 0;
                        }
                        cursor3.close();
                        return 0;
                    } catch (RemoteException e14) {
                        e10 = e14;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                p.f(context);
            } catch (Exception e15) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e15);
            }
            throw th5;
        }
    }
}
