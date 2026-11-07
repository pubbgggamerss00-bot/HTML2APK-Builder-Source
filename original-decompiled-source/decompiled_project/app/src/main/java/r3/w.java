package r3;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import q3.e;

/* loaded from: classes.dex */
public class w extends v {

    /* renamed from: f, reason: collision with root package name */
    public final Class<?> f23178f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor<?> f23179g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f23180h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f23181i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f23182j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f23183k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f23184l;

    public w() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodK;
        Constructor<?> constructor;
        Method methodJ;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodJ = j(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodK = k(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            methodK = null;
            constructor = null;
            methodJ = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f23178f = cls;
        this.f23179g = constructor;
        this.f23180h = methodJ;
        this.f23181i = method;
        this.f23182j = method2;
        this.f23183k = method3;
        this.f23184l = methodK;
    }

    public static Method j(Class cls) throws NoSuchMethodException {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // r3.v, r3.a0
    public final Typeface a(Context context, e.b bVar, Resources resources, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f23180h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.a(context, bVar, resources, i10);
        }
        try {
            objNewInstance = this.f23179g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            e.c[] cVarArr = bVar.f21877a;
            int length = cVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    e.c cVar = cVarArr[i11];
                    Context context2 = context;
                    if (g(context2, objNewInstance, cVar.f21878a, cVar.f21882e, cVar.f21879b, cVar.f21880c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f21881d))) {
                        i11++;
                        context = context2;
                    } else {
                        try {
                            this.f23183k.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (i(objNewInstance)) {
                    return h(objNewInstance);
                }
            }
        }
        return null;
    }

    @Override // r3.a0
    public final Typeface b(Context context, v3.l[] lVarArr, int i10) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Typeface typefaceH;
        boolean zBooleanValue;
        if (lVarArr.length >= 1) {
            Method method = this.f23180h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (v3.l lVar : lVarArr) {
                        if (lVar.f30598f == 0) {
                            Uri uri = lVar.f30593a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, b0.d(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f23179g.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = lVarArr.length;
                        int i11 = 0;
                        boolean z10 = false;
                        while (true) {
                            Method method2 = this.f23183k;
                            if (i11 < length) {
                                v3.l lVar2 = lVarArr[i11];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(lVar2.f30593a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f23181i.invoke(objNewInstance, byteBuffer, Integer.valueOf(lVar2.f30594b), null, Integer.valueOf(lVar2.f30595c), Integer.valueOf(lVar2.f30596d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z10 = true;
                                }
                                i11++;
                                z10 = z10;
                            } else if (!z10) {
                                method2.invoke(objNewInstance, null);
                            } else if (i(objNewInstance) && (typefaceH = h(objNewInstance)) != null) {
                                return Typeface.create(typefaceH, i10);
                            }
                        }
                    }
                } else {
                    int i12 = (i10 & 1) == 0 ? 400 : 700;
                    boolean z11 = (i10 & 2) != 0;
                    v3.l lVar3 = null;
                    int i13 = Integer.MAX_VALUE;
                    for (v3.l lVar4 : lVarArr) {
                        int iAbs = (Math.abs(lVar4.f30595c - i12) * 2) + (lVar4.f30596d == z11 ? 0 : 1);
                        if (lVar3 == null || i13 > iAbs) {
                            lVar3 = lVar4;
                            i13 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(lVar3.f30593a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(lVar3.f30595c).setItalic(lVar3.f30596d).build();
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

    @Override // r3.a0
    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f23180h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.d(context, resources, i10, str, i11);
        }
        try {
            objNewInstance = this.f23179g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!g(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f23183k.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (i(objNewInstance)) {
                return h(objNewInstance);
            }
        }
        return null;
    }

    public final boolean g(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f23180h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface h(Object obj) {
        throw null;
    }

    public final boolean i(Object obj) {
        try {
            return ((Boolean) this.f23182j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method k(Class<?> cls) throws NoSuchMethodException {
        throw null;
    }
}
