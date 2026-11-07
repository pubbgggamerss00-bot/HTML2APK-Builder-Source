package m0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l0.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class f extends k {

    /* renamed from: a, reason: collision with root package name */
    public static Class<?> f13864a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor<?> f13865b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f13866c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f13867d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f13868e = false;

    public static boolean g(Object obj, String str, int i6, boolean z6) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        h();
        try {
            return ((Boolean) f13866c.invoke(obj, str, Integer.valueOf(i6), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void h() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f13868e) {
            return;
        }
        f13868e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi21Impl", e6.getClass().getName(), e6);
            method = null;
            cls = null;
            method2 = null;
        }
        f13865b = constructor;
        f13864a = cls;
        f13866c = method2;
        f13867d = method;
    }

    @Override // m0.k
    public Typeface a(Context context, e.b bVar, Resources resources, int i6) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        h();
        try {
            Object objNewInstance = f13865b.newInstance(null);
            for (e.c cVar : bVar.f13783a) {
                File fileD = l.d(context);
                if (fileD == null) {
                    return null;
                }
                try {
                    if (!l.b(fileD, resources, cVar.f13789f)) {
                        return null;
                    }
                    if (!g(objNewInstance, fileD.getPath(), cVar.f13785b, cVar.f13786c)) {
                        return null;
                    }
                    fileD.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileD.delete();
                }
            }
            h();
            try {
                Object objNewInstance2 = Array.newInstance(f13864a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f13867d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // m0.k
    public Typeface b(Context context, r0.l[] lVarArr, int i6) throws IOException {
        String str;
        if (lVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(f(lVarArr, i6).f14248a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceD = d(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceD;
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
