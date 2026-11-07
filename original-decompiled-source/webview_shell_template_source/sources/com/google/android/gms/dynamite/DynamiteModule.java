package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.activity.m;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.ads.qy1;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import l3.e;
import l3.f;
import l3.g;
import l3.h;
import p3.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f2511d = null;

    /* renamed from: e, reason: collision with root package name */
    public static String f2512e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2513f = false;

    /* renamed from: g, reason: collision with root package name */
    public static int f2514g = -1;
    public static Boolean h;

    /* renamed from: l, reason: collision with root package name */
    public static g f2518l;

    /* renamed from: m, reason: collision with root package name */
    public static h f2519m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2520a;

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f2515i = new ThreadLocal();

    /* renamed from: j, reason: collision with root package name */
    public static final qy1 f2516j = new qy1(2);

    /* renamed from: k, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.a f2517k = new com.google.android.gms.dynamite.a();

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.b f2509b = new com.google.android.gms.dynamite.b();

    /* renamed from: c, reason: collision with root package name */
    public static final c f2510c = new c();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends Exception {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public interface a {
            int a(Context context, String str, boolean z6);

            int b(Context context, String str);
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0031b {

            /* renamed from: a, reason: collision with root package name */
            public int f2521a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f2522b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f2523c = 0;
        }

        C0031b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        this.f2520a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (k.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e6) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e6.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02fd A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0303 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #11 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0299, B:120:0x02a3, B:128:0x02b2, B:130:0x02da, B:132:0x02e9, B:142:0x0315, B:143:0x031c, B:123:0x02a6, B:124:0x02a7, B:125:0x02ae, B:144:0x031d, B:145:0x033d, B:146:0x033e, B:147:0x038b), top: B:167:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.qy1, java.lang.ThreadLocal] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DynamiteModule c(Context context, b bVar, String str) throws a {
        Context context2;
        int i6;
        DynamiteModule dynamiteModule;
        int i7;
        Context context3;
        k3.a aVarI1;
        h hVar;
        boolean z6;
        k3.a aVarI12;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context");
        }
        ThreadLocal threadLocal = f2515i;
        f fVar = (f) threadLocal.get();
        f fVar2 = new f();
        threadLocal.set(fVar2);
        ?? r7 = f2516j;
        Long l4 = (Long) r7.get();
        long jLongValue = l4.longValue();
        try {
            r7.set(Long.valueOf(SystemClock.uptimeMillis()));
            b.C0031b c0031bA = bVar.a(context, str, f2517k);
            int i8 = c0031bA.f2521a;
            int i9 = c0031bA.f2522b;
            StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(i8).length() + 19 + str.length() + 1 + String.valueOf(i9).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i8);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i9);
            Log.i("DynamiteModule", sb.toString());
            int i10 = c0031bA.f2523c;
            if (i10 != 0) {
                if (i10 != -1) {
                    if (i10 == 1 || c0031bA.f2522b != 0) {
                        if (i10 != -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            DynamiteModule dynamiteModule2 = new DynamiteModule(applicationContext);
                            if (jLongValue == 0) {
                                r7.remove();
                            } else {
                                r7.set(l4);
                            }
                            Cursor cursor = fVar2.f13845a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            threadLocal.set(fVar);
                            return dynamiteModule2;
                        }
                        if (i10 != 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i10);
                            throw new a(sb2.toString());
                        }
                        try {
                            try {
                                i7 = c0031bA.f2522b;
                            } catch (a e6) {
                                e = e6;
                                context2 = r7;
                                String message = e.getMessage();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb3.append("Failed to load remote module: ");
                                sb3.append(message);
                                Log.w("DynamiteModule", sb3.toString());
                                i6 = c0031bA.f2521a;
                                if (i6 != 0 || bVar.a(context2, str, new d(i6)).f2523c != -1) {
                                    throw new a("Remote load failed. No local fallback found.", e);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                dynamiteModule = new DynamiteModule(applicationContext);
                                return dynamiteModule;
                            }
                        } catch (a e7) {
                            e = e7;
                            context2 = context;
                            String message2 = e.getMessage();
                            StringBuilder sb32 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb32.append("Failed to load remote module: ");
                            sb32.append(message2);
                            Log.w("DynamiteModule", sb32.toString());
                            i6 = c0031bA.f2521a;
                            if (i6 != 0) {
                            }
                            throw new a("Remote load failed. No local fallback found.", e);
                        }
                        try {
                            try {
                                try {
                                    synchronized (DynamiteModule.class) {
                                        try {
                                            if (!e(context)) {
                                                throw new a("Remote loading disabled");
                                            }
                                            Boolean bool = f2511d;
                                            if (bool == null) {
                                                throw new a("Failed to determine which loading route to use.");
                                            }
                                            if (bool.booleanValue()) {
                                                StringBuilder sb4 = new StringBuilder(str.length() + 40 + String.valueOf(i7).length());
                                                sb4.append("Selected remote version of ");
                                                sb4.append(str);
                                                sb4.append(", version >= ");
                                                sb4.append(i7);
                                                Log.i("DynamiteModule", sb4.toString());
                                                synchronized (DynamiteModule.class) {
                                                    hVar = f2519m;
                                                }
                                                if (hVar == null) {
                                                    throw new a("DynamiteLoaderV2 was not cached.");
                                                }
                                                f fVar3 = (f) threadLocal.get();
                                                if (fVar3 == null || fVar3.f13845a == null) {
                                                    throw new a("No result cursor");
                                                }
                                                Context applicationContext2 = context.getApplicationContext();
                                                Cursor cursor2 = fVar3.f13845a;
                                                new k3.b(null);
                                                synchronized (DynamiteModule.class) {
                                                    z6 = f2514g >= 2;
                                                }
                                                if (z6) {
                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    aVarI12 = hVar.e2(new k3.b(applicationContext2), str, i7, new k3.b(cursor2));
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    aVarI12 = hVar.i1(new k3.b(applicationContext2), str, i7, new k3.b(cursor2));
                                                }
                                                Context context4 = (Context) k3.b.i1(aVarI12);
                                                if (context4 == null) {
                                                    throw new a("Failed to get module context");
                                                }
                                                dynamiteModule = new DynamiteModule(context4);
                                            } else {
                                                StringBuilder sb5 = new StringBuilder(str.length() + 40 + String.valueOf(i7).length());
                                                sb5.append("Selected remote version of ");
                                                sb5.append(str);
                                                sb5.append(", version >= ");
                                                sb5.append(i7);
                                                Log.i("DynamiteModule", sb5.toString());
                                                g gVarH = h(context);
                                                if (gVarH == null) {
                                                    throw new a("Failed to create IDynamiteLoader.");
                                                }
                                                Parcel parcelN = gVarH.n(6, gVarH.r());
                                                int i11 = parcelN.readInt();
                                                parcelN.recycle();
                                                if (i11 >= 3) {
                                                    f fVar4 = (f) threadLocal.get();
                                                    if (fVar4 == null) {
                                                        throw new a("No cached result cursor holder");
                                                    }
                                                    aVarI1 = gVarH.f2(new k3.b(context), str, i7, new k3.b(fVar4.f13845a));
                                                } else if (i11 == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    aVarI1 = gVarH.e2(new k3.b(context), str, i7);
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    aVarI1 = gVarH.i1(new k3.b(context), str, i7);
                                                }
                                                Object objI1 = k3.b.i1(aVarI1);
                                                if (objI1 == null) {
                                                    throw new a("Failed to load remote module.");
                                                }
                                                dynamiteModule = new DynamiteModule((Context) objI1);
                                            }
                                            return dynamiteModule;
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (RemoteException e8) {
                                e = e8;
                                throw new a("Failed to load remote module.", e);
                            } catch (a e9) {
                                throw e9;
                            } catch (Throwable th3) {
                                th = th3;
                                context3 = r7;
                                i3.b.a(context3, th);
                                throw new a("Failed to load remote module.", th);
                            }
                        } catch (RemoteException e10) {
                            e = e10;
                            throw new a("Failed to load remote module.", e);
                        } catch (a e11) {
                            throw e11;
                        } catch (Throwable th4) {
                            th = th4;
                            context3 = context;
                            i3.b.a(context3, th);
                            throw new a("Failed to load remote module.", th);
                        }
                    }
                } else if (c0031bA.f2521a != 0) {
                    i10 = -1;
                    if (i10 == 1) {
                    }
                    if (i10 != -1) {
                    }
                }
            }
            int i12 = c0031bA.f2521a;
            int i13 = c0031bA.f2522b;
            StringBuilder sb6 = new StringBuilder(str.length() + 46 + String.valueOf(i12).length() + 23 + String.valueOf(i13).length() + 1);
            sb6.append("No acceptable module ");
            sb6.append(str);
            sb6.append(" found. Local version is ");
            sb6.append(i12);
            sb6.append(" and remote version is ");
            sb6.append(i13);
            sb6.append(".");
            throw new a(sb6.toString());
        } finally {
            if (jLongValue == 0) {
                f2516j.remove();
            } else {
                f2516j.set(l4);
            }
            Cursor cursor3 = fVar2.f13845a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f2515i.set(fVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a4 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00f4, blocks: (B:4:0x0006, B:64:0x00e9, B:66:0x00ef, B:73:0x011b, B:103:0x01a4, B:111:0x01b7, B:129:0x023e, B:130:0x0241, B:124:0x0236, B:71:0x00f8, B:132:0x0243, B:5:0x0007, B:8:0x000e, B:9:0x002a, B:62:0x00e6, B:22:0x004e, B:45:0x00a4, B:48:0x00a7, B:55:0x00bf, B:63:0x00e8, B:61:0x00c5), top: B:143:0x0006, inners: #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3 A[Catch: all -> 0x003b, TryCatch #12 {, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bc, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0053, B:28:0x0057, B:31:0x0060, B:33:0x0068, B:36:0x006f, B:43:0x009b, B:44:0x00a3, B:39:0x0076, B:41:0x007c, B:42:0x008d, B:47:0x00a6, B:50:0x00a9, B:51:0x00b3, B:18:0x0043), top: B:146:0x002b, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z6) {
        Field declaredField;
        Throwable th;
        RemoteException e6;
        int i6;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f2511d;
                boolean z7 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e7) {
                        String string = e7.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                g(classLoader);
                            } catch (a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!e(context)) {
                                return 0;
                            }
                            if (!f2513f) {
                                Boolean bool2 = Boolean.TRUE;
                                if (bool2.equals(null)) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        int iF = f(context, str, z6, true);
                                        String str2 = f2512e;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader classLoaderA = l3.d.a();
                                            if (classLoaderA == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    l3.b.a();
                                                    String str3 = f2512e;
                                                    l.f(str3);
                                                    classLoaderA = l3.a.a(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = f2512e;
                                                    l.f(str4);
                                                    classLoaderA = new e(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            g(classLoaderA);
                                            declaredField.set(null, classLoaderA);
                                            f2511d = bool2;
                                            return iF;
                                        }
                                        return iF;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        }
                        f2511d = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z6, false);
                    } catch (a e8) {
                        String message = e8.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                g gVarH = h(context);
                try {
                    if (gVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelN = gVarH.n(6, gVarH.r());
                        int i7 = parcelN.readInt();
                        parcelN.recycle();
                        if (i7 >= 3) {
                            ThreadLocal threadLocal = f2515i;
                            f fVar = (f) threadLocal.get();
                            if (fVar != null && (cursor = fVar.f13845a) != null) {
                                return cursor.getInt(0);
                            }
                            k3.b bVar = new k3.b(context);
                            long jLongValue = ((Long) f2516j.get()).longValue();
                            Parcel parcelR = gVarH.r();
                            j.b(parcelR, bVar);
                            parcelR.writeString(str);
                            parcelR.writeInt(z6 ? 1 : 0);
                            parcelR.writeLong(jLongValue);
                            Cursor cursor3 = (Cursor) k3.b.i1(m.f(gVarH.n(7, parcelR)));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i6 = cursor3.getInt(0);
                                        if (i6 <= 0) {
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } else {
                                            f fVar2 = (f) threadLocal.get();
                                            if (fVar2 == null || fVar2.f13845a != null) {
                                                z7 = false;
                                            } else {
                                                fVar2.f13845a = cursor3;
                                            }
                                            if (!z7) {
                                            }
                                            if (cursor2 != null) {
                                            }
                                        }
                                    }
                                } catch (RemoteException e9) {
                                    e6 = e9;
                                    cursor2 = cursor3;
                                    String message2 = e6.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i7 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            k3.b bVar2 = new k3.b(context);
                            Parcel parcelR2 = gVarH.r();
                            j.b(parcelR2, bVar2);
                            parcelR2.writeString(str);
                            parcelR2.writeInt(z6 ? 1 : 0);
                            Parcel parcelN2 = gVarH.n(5, parcelR2);
                            i6 = parcelN2.readInt();
                            parcelN2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            k3.b bVar3 = new k3.b(context);
                            Parcel parcelR3 = gVarH.r();
                            j.b(parcelR3, bVar3);
                            parcelR3.writeString(str);
                            parcelR3.writeInt(z6 ? 1 : 0);
                            Parcel parcelN3 = gVarH.n(3, parcelR3);
                            i6 = parcelN3.readInt();
                            parcelN3.recycle();
                        }
                        return i6;
                    } catch (RemoteException e10) {
                        e6 = e10;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            i3.b.a(context, th4);
            throw th4;
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z6 = false;
        if (h == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (c3.h.f2184b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z6 = true;
            }
            h = Boolean.valueOf(z6);
            if (z6 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f2513f = true;
            }
        }
        if (!z6) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z6;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a A[PHI: r3
      0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(Context context, String str, boolean z6, boolean z7) throws Throwable {
        Exception exc;
        Throwable th;
        Cursor cursorQuery;
        MatrixCursor matrixCursor;
        boolean z8;
        try {
            try {
                boolean z9 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z6 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f2516j.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z10 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                    if (cursorQuery != null) {
                        try {
                            int count = cursorQuery.getCount();
                            int columnCount = cursorQuery.getColumnCount();
                            matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                            for (int i6 = 0; i6 < count; i6++) {
                                if (!cursorQuery.moveToPosition(i6)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i7 = 0; i7 < columnCount; i7++) {
                                    int type = cursorQuery.getType(i7);
                                    if (type == 0) {
                                        objArr[i7] = null;
                                    } else if (type == 1) {
                                        objArr[i7] = Long.valueOf(cursorQuery.getLong(i7));
                                    } else if (type == 2) {
                                        objArr[i7] = Double.valueOf(cursorQuery.getDouble(i7));
                                    } else if (type == 3) {
                                        objArr[i7] = cursorQuery.getString(i7);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i7] = cursorQuery.getBlob(i7);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            cursorQuery.close();
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i8 = matrixCursor.getInt(0);
                                        if (i8 > 0) {
                                            synchronized (DynamiteModule.class) {
                                                try {
                                                    f2512e = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        f2514g = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z8 = matrixCursor.getInt(columnIndex2) != 0;
                                                        f2513f = z8;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            f fVar = (f) f2515i.get();
                                            if (fVar == null || fVar.f13845a != null) {
                                                z9 = false;
                                            } else {
                                                fVar.f13845a = matrixCursor;
                                            }
                                            z10 = z8;
                                            matrixCursor = z9 ? null : matrixCursor;
                                        }
                                        if (z7 && z10) {
                                            throw new a("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor != null) {
                                            matrixCursor.close();
                                        }
                                        return i8;
                                    }
                                } catch (Exception e6) {
                                    exc = e6;
                                    if (exc instanceof a) {
                                        throw exc;
                                    }
                                    String message = exc.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                                    sb.append("V2 version check failed: ");
                                    sb.append(message);
                                    throw new a(sb.toString(), exc);
                                } catch (Throwable th3) {
                                    th = th3;
                                    matrixCursor = matrixCursor;
                                    if (matrixCursor == null) {
                                        throw th;
                                    }
                                    matrixCursor.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new a("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th4) {
                            try {
                                cursorQuery.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    }
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e7) {
            exc = e7;
        }
    }

    public static void g(ClassLoader classLoader) throws a {
        try {
            h hVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                hVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f2519m = hVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
            throw new a("Failed to instantiate dynamite loader", e6);
        }
    }

    public static g h(Context context) {
        g gVar;
        synchronized (DynamiteModule.class) {
            g gVar2 = f2518l;
            if (gVar2 != null) {
                return gVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    gVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    gVar = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (gVar != null) {
                    f2518l = gVar;
                    return gVar;
                }
            } catch (Exception e6) {
                String message = e6.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws a {
        try {
            return (IBinder) this.f2520a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e6) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e6);
        }
    }
}
