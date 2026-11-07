package com.google.android.gms.dynamite;

import ab.d;
import ab.e;
import ab.f;
import ab.g;
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
import com.google.android.gms.common.internal.o;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class DynamiteModule {

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f6217c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f6218d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f6219e = false;

    /* renamed from: f, reason: collision with root package name */
    public static int f6220f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f6221g;

    /* renamed from: k, reason: collision with root package name */
    public static f f6225k;

    /* renamed from: l, reason: collision with root package name */
    public static g f6226l;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6227a;

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal f6222h = new ThreadLocal();

    /* renamed from: i, reason: collision with root package name */
    public static final d f6223i = new d();

    /* renamed from: j, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.a f6224j = new com.google.android.gms.dynamite.a();

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.b f6216b = new com.google.android.gms.dynamite.b();

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
    }

    public interface b {

        public interface a {
            int a(Context context);

            int b(Context context, boolean z10) throws a;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0066b {

            /* renamed from: a, reason: collision with root package name */
            public int f6228a;

            /* renamed from: b, reason: collision with root package name */
            public int f6229b;

            /* renamed from: c, reason: collision with root package name */
            public int f6230c;
        }

        C0066b a(Context context, a aVar) throws a;
    }

    public DynamiteModule(Context context) {
        this.f6227a = context;
    }

    public static int a(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (o.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:7:0x004b, B:11:0x006d, B:18:0x0079, B:21:0x007f, B:24:0x0095, B:102:0x01ec, B:103:0x01f3, B:106:0x01f6, B:107:0x01f7, B:108:0x01fe, B:125:0x0260, B:126:0x0271, B:109:0x01ff, B:111:0x021d, B:113:0x022a, B:123:0x0258, B:124:0x025f, B:127:0x0272, B:128:0x0296), top: B:143:0x004b, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DynamiteModule b(Context context, b bVar) throws Throwable {
        long j10;
        DynamiteModule dynamiteModule;
        Boolean bool;
        za.a aVarB;
        DynamiteModule dynamiteModule2;
        g gVar;
        za.a aVarB2;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context");
        }
        ThreadLocal threadLocal = f6222h;
        e eVar = (e) threadLocal.get();
        e eVar2 = new e();
        threadLocal.set(eVar2);
        d dVar = f6223i;
        Long l10 = (Long) dVar.get();
        long jLongValue = l10.longValue();
        try {
            dVar.set(Long.valueOf(SystemClock.uptimeMillis()));
            b.C0066b c0066bA = bVar.a(context, f6224j);
            j10 = jLongValue;
            try {
                Log.i("DynamiteModule", "Considering local module com.google.android.gms.providerinstaller.dynamite:" + c0066bA.f6228a + " and remote module com.google.android.gms.providerinstaller.dynamite:" + c0066bA.f6229b);
                int i10 = c0066bA.f6230c;
                if (i10 != 0) {
                    if (i10 != -1) {
                        boolean z10 = true;
                        if (i10 == 1 || c0066bA.f6229b != 0) {
                            if (i10 != -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.providerinstaller.dynamite"));
                                dynamiteModule = new DynamiteModule(applicationContext);
                            } else {
                                if (i10 != 1) {
                                    throw new a("VersionPolicy returned invalid code:" + i10);
                                }
                                try {
                                    int i11 = c0066bA.f6229b;
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (!e(context)) {
                                                throw new a("Remote loading disabled");
                                            }
                                            bool = f6217c;
                                        }
                                        if (bool == null) {
                                            throw new a("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.providerinstaller.dynamite, version >= " + i11);
                                            synchronized (DynamiteModule.class) {
                                                gVar = f6226l;
                                            }
                                            if (gVar == null) {
                                                throw new a("DynamiteLoaderV2 was not cached.");
                                            }
                                            e eVar3 = (e) threadLocal.get();
                                            if (eVar3 == null || eVar3.f392a == null) {
                                                throw new a("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = eVar3.f392a;
                                            new za.b(null);
                                            synchronized (DynamiteModule.class) {
                                                if (f6220f < 2) {
                                                    z10 = false;
                                                }
                                            }
                                            if (z10) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                aVarB2 = gVar.c(new za.b(applicationContext2), i11, new za.b(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                aVarB2 = gVar.b(new za.b(applicationContext2), i11, new za.b(cursor2));
                                            }
                                            Context context2 = (Context) za.b.c(aVarB2);
                                            if (context2 == null) {
                                                throw new a("Failed to get module context");
                                            }
                                            dynamiteModule2 = new DynamiteModule(context2);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.providerinstaller.dynamite, version >= " + i11);
                                            f fVarF = f(context);
                                            if (fVarF == null) {
                                                throw new a("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel parcelZzB = fVarF.zzB(6, fVarF.zza());
                                            int i12 = parcelZzB.readInt();
                                            parcelZzB.recycle();
                                            if (i12 >= 3) {
                                                e eVar4 = (e) threadLocal.get();
                                                if (eVar4 == null) {
                                                    throw new a("No cached result cursor holder");
                                                }
                                                aVarB = fVarF.c(new za.b(context), i11, new za.b(eVar4.f392a));
                                            } else if (i12 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                aVarB = fVarF.A(new za.b(context), i11);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                aVarB = fVarF.b(new za.b(context), i11);
                                            }
                                            Object objC = za.b.c(aVarB);
                                            if (objC == null) {
                                                throw new a("Failed to load remote module.");
                                            }
                                            dynamiteModule2 = new DynamiteModule((Context) objC);
                                        }
                                        dynamiteModule = dynamiteModule2;
                                    } catch (RemoteException e10) {
                                        throw new a("Failed to load remote module.", e10);
                                    } catch (a e11) {
                                        throw e11;
                                    } catch (Throwable th2) {
                                        throw new a("Failed to load remote module.", th2);
                                    }
                                } catch (a e12) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                                    int i13 = c0066bA.f6228a;
                                    if (i13 == 0 || bVar.a(context, new c(i13)).f6230c != -1) {
                                        throw new a("Remote load failed. No local fallback found.", e12);
                                    }
                                    Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.providerinstaller.dynamite"));
                                    dynamiteModule = new DynamiteModule(applicationContext);
                                }
                            }
                            if (j10 != 0) {
                                f6223i.remove();
                            } else {
                                f6223i.set(l10);
                            }
                            cursor = eVar2.f392a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            f6222h.set(eVar);
                            return dynamiteModule;
                        }
                    } else if (c0066bA.f6228a != 0) {
                        i10 = -1;
                        boolean z102 = true;
                        if (i10 == 1) {
                        }
                        if (i10 != -1) {
                        }
                        if (j10 != 0) {
                        }
                        cursor = eVar2.f392a;
                        if (cursor != null) {
                        }
                        f6222h.set(eVar);
                        return dynamiteModule;
                    }
                }
                throw new a("No acceptable module com.google.android.gms.providerinstaller.dynamite found. Local version is " + c0066bA.f6228a + " and remote version is " + c0066bA.f6229b + ".");
            } catch (Throwable th3) {
                th = th3;
                if (j10 == 0) {
                    f6223i.remove();
                } else {
                    f6223i.set(l10);
                }
                Cursor cursor3 = eVar2.f392a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f6222h.set(eVar);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            j10 = jLongValue;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138 A[PHI: r14
      0x0138: PHI (r14v10 boolean) = (r14v9 boolean), (r14v13 boolean) binds: [B:58:0x00ef, B:83:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(Context context, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        Exception exc;
        Cursor cursorQuery;
        MatrixCursor matrixCursor;
        boolean z12;
        try {
            try {
                boolean z13 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath("com.google.android.gms.providerinstaller.dynamite").appendQueryParameter("requestStartUptime", String.valueOf(((Long) f6223i.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z14 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th3) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th3;
                    }
                    if (cursorQuery != null) {
                        try {
                            int count = cursorQuery.getCount();
                            int columnCount = cursorQuery.getColumnCount();
                            matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                            for (int i10 = 0; i10 < count; i10++) {
                                if (!cursorQuery.moveToPosition(i10)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i11 = 0; i11 < columnCount; i11++) {
                                    int type = cursorQuery.getType(i11);
                                    if (type == 0) {
                                        objArr[i11] = null;
                                    } else if (type == 1) {
                                        objArr[i11] = Long.valueOf(cursorQuery.getLong(i11));
                                    } else if (type == 2) {
                                        objArr[i11] = Double.valueOf(cursorQuery.getDouble(i11));
                                    } else if (type == 3) {
                                        objArr[i11] = cursorQuery.getString(i11);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i11] = cursorQuery.getBlob(i11);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            cursorQuery.close();
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i12 = matrixCursor.getInt(0);
                                        if (i12 > 0) {
                                            synchronized (DynamiteModule.class) {
                                                try {
                                                    f6218d = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        f6220f = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z12 = matrixCursor.getInt(columnIndex2) != 0;
                                                        f6219e = z12;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            e eVar = (e) f6222h.get();
                                            if (eVar == null || eVar.f392a != null) {
                                                z13 = false;
                                            } else {
                                                eVar.f392a = matrixCursor;
                                            }
                                            z14 = z12;
                                            matrixCursor = z13 ? null : matrixCursor;
                                        }
                                        if (z11 && z14) {
                                            throw new a("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor != null) {
                                            matrixCursor.close();
                                        }
                                        return i12;
                                    }
                                } catch (Exception e10) {
                                    exc = e10;
                                    if (exc instanceof a) {
                                        throw exc;
                                    }
                                    throw new a("V2 version check failed: " + exc.getMessage(), exc);
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    matrixCursor = matrixCursor;
                                    if (matrixCursor == null) {
                                        throw th2;
                                    }
                                    matrixCursor.close();
                                    throw th2;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new a("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th5) {
                            try {
                                cursorQuery.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
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
            } catch (Exception e11) {
                exc = e11;
            }
        } catch (Throwable th7) {
            th2 = th7;
        }
    }

    public static void d(ClassLoader classLoader) throws a {
        try {
            g gVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                gVar = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f6226l = gVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10);
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f6221g)) {
            return true;
        }
        boolean z10 = false;
        if (f6221g == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (pa.e.f21389b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z10 = true;
            }
            f6221g = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f6219e = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    public static f f(Context context) {
        f fVar;
        synchronized (DynamiteModule.class) {
            f fVar2 = f6225k;
            if (fVar2 != null) {
                return fVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    fVar = iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new f(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (fVar != null) {
                    f6225k = fVar;
                    return fVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }
}
