package p3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import o3.n;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q3.g;
import u3.h;

/* loaded from: classes.dex */
public class b {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";

    public static class a {
        public static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }

        public static Display c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w(b.TAG, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new n(context).f18957a.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? a.a(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.b(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return context.getCodeCacheDir();
    }

    public static int getColor(Context context, int i10) {
        return context.getColor(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.f21895c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList getColorStateList(Context context, int i10) throws Resources.NotFoundException {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        g.a aVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        g.b bVar = new g.b(resources, theme);
        synchronized (g.f21892c) {
            try {
                SparseArray<g.a> sparseArray = g.f21891b.get(bVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i10)) == null) {
                    colorStateList = null;
                } else {
                    if (aVar.f21894b.equals(resources.getConfiguration())) {
                        if (theme != null || aVar.f21895c != 0) {
                            if (theme != null) {
                            }
                        }
                        colorStateList = aVar.f21893a;
                    }
                    sparseArray.remove(i10);
                    colorStateList = null;
                }
            } finally {
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal = g.f21890a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            try {
                colorStateListA = q3.c.a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i10, theme);
        }
        synchronized (g.f21892c) {
            try {
                WeakHashMap<g.b, SparseArray<g.a>> weakHashMap = g.f21891b;
                SparseArray<g.a> sparseArray2 = weakHashMap.get(bVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(bVar, sparseArray2);
                }
                sparseArray2.append(i10, new g.a(colorStateListA, bVar.f21896a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateListA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Context getContextForLanguage(Context context) {
        String attributeValue;
        u3.f fVar;
        if (Build.VERSION.SDK_INT >= 33) {
            Object systemService = context.getSystemService("locale");
            fVar = systemService != null ? new u3.f(new h(o3.e.a(systemService))) : u3.f.f29245b;
        } else {
            synchronized (o3.b.f18926a) {
                attributeValue = "";
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        try {
                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                            int depth = xmlPullParserNewPullParser.getDepth();
                            while (true) {
                                int next = xmlPullParserNewPullParser.next();
                                if (next == 1 || (next == 3 && xmlPullParserNewPullParser.getDepth() <= depth)) {
                                    break;
                                }
                                if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                    break;
                                }
                            }
                        } catch (IOException | XmlPullParserException unused) {
                            Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                            if (fileInputStreamOpenFileInput != null) {
                            }
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (attributeValue.isEmpty()) {
                            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        }
                    } catch (Throwable th2) {
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th2;
                    }
                } catch (FileNotFoundException unused4) {
                }
            }
            u3.f fVar2 = u3.f.f29245b;
            if (attributeValue.isEmpty()) {
                fVar = u3.f.f29245b;
            } else {
                String[] strArrSplit = attributeValue.split(",", -1);
                int length = strArrSplit.length;
                Locale[] localeArr = new Locale[length];
                for (int i10 = 0; i10 < length; i10++) {
                    localeArr[i10] = Locale.forLanguageTag(strArrSplit[i10]);
                }
                fVar = new u3.f(new h(new LocaleList(localeArr)));
            }
        }
        if (Build.VERSION.SDK_INT > 32 || fVar.f29246a.f29247a.isEmpty()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocales(fVar.f29246a.f29247a);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(Context context) {
        return context.getDataDir();
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? a.c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i10) {
        return context.getDrawable(i10);
    }

    @Deprecated
    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        return context.getMainExecutor();
    }

    public static File getNoBackupFilesDir(Context context) {
        return context.getNoBackupFilesDir();
    }

    @Deprecated
    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i10) {
        return getContextForLanguage(context).getString(i10);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getApplicationContext().getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (f.a(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
            if (f.a(context, str) == 0) {
                return str;
            }
        }
        throw new RuntimeException(i8.n.d("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i10);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    @Deprecated
    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i11 != 0) {
            i10 |= 2;
        }
        int i12 = i10;
        int i13 = i12 & 2;
        if (i13 == 0 && (i12 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i13 == 0 || (i12 & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i12) : ((i12 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i12 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
