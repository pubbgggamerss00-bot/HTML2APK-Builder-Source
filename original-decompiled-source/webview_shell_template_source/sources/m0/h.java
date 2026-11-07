package m0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l0.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: f, reason: collision with root package name */
    public final Class<?> f13873f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor<?> f13874g;
    public final Method h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f13875i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f13876j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f13877k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f13878l;

    public h() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodM;
        Constructor<?> constructor;
        Method methodL;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodL = l(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodM = m(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e6.getClass().getName()), e6);
            methodM = null;
            constructor = null;
            methodL = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f13873f = cls;
        this.f13874g = constructor;
        this.h = methodL;
        this.f13875i = method;
        this.f13876j = method2;
        this.f13877k = method3;
        this.f13878l = methodM;
    }

    public static Method l(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // m0.f, m0.k
    public final Typeface a(Context context, e.b bVar, Resources resources, int i6) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.a(context, bVar, resources, i6);
        }
        try {
            objNewInstance = this.f13874g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            e.c[] cVarArr = bVar.f13783a;
            int length = cVarArr.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    e.c cVar = cVarArr[i7];
                    Context context2 = context;
                    if (i(context2, objNewInstance, cVar.f13784a, cVar.f13788e, cVar.f13785b, cVar.f13786c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f13787d))) {
                        i7++;
                        context = context2;
                    } else {
                        try {
                            this.f13877k.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (k(objNewInstance)) {
                    return j(objNewInstance);
                }
            }
        }
        return null;
    }

    @Override // m0.f, m0.k
    public final Typeface b(Context context, r0.l[] lVarArr, int i6) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Typeface typefaceJ;
        boolean zBooleanValue;
        if (lVarArr.length >= 1) {
            Method method = this.h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (r0.l lVar : lVarArr) {
                        if (lVar.f14252e == 0) {
                            Uri uri = lVar.f14248a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, l.e(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f13874g.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = lVarArr.length;
                        int i7 = 0;
                        boolean z6 = false;
                        while (true) {
                            Method method2 = this.f13877k;
                            if (i7 < length) {
                                r0.l lVar2 = lVarArr[i7];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(lVar2.f14248a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f13875i.invoke(objNewInstance, byteBuffer, Integer.valueOf(lVar2.f14249b), null, Integer.valueOf(lVar2.f14250c), Integer.valueOf(lVar2.f14251d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z6 = true;
                                }
                                i7++;
                                z6 = z6;
                            } else if (!z6) {
                                method2.invoke(objNewInstance, null);
                            } else if (k(objNewInstance) && (typefaceJ = j(objNewInstance)) != null) {
                                return Typeface.create(typefaceJ, i6);
                            }
                        }
                    }
                } else {
                    r0.l lVarF = f(lVarArr, i6);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(lVarF.f14248a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(lVarF.f14250c).setItalic(lVarF.f14251d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // m0.k
    public final Typeface e(Context context, Resources resources, int i6, String str, int i7) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.e(context, resources, i6, str, i7);
        }
        try {
            objNewInstance = this.f13874g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!i(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f13877k.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (k(objNewInstance)) {
                return j(objNewInstance);
            }
        }
        return null;
    }

    public final boolean i(Context context, Object obj, String str, int i6, int i7, int i8, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f13873f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f13878l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f13876j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method m(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
